/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Configuraciones.Conexion;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amontanez
 */
public class UsuarioDAO {

    Connection cn;

    public UsuarioDAO() {
        Conexion con = new Conexion();
        cn = con.getConexion();
    }

    public boolean cambiarPassword(String usuario, String newPassword) {
        PreparedStatement ps;
        ResultSet rs;

        try {
            // registrar
            ps = cn.prepareStatement("UPDATE USUARIO U \n"
                    + "   SET U.PASSWORD = ? \n"
                    + " WHERE U.ID = (SELECT X.ID \n"
                    + "                 FROM USUARIO X \n"
                    + "                WHERE X.USUARIO = ? \n"
                    + "                  AND X.ESTADO = 'ACTIVO')");
            ps.setString(1, newPassword);
            ps.setString(2, usuario);
            ps.execute();

        } catch (SQLException e) {
            System.out.println("LOG ERROR: " + e.toString());
            return false;
        }
        return true;
    }

    public String validarExistenciaUsuario(String usuario) {
        PreparedStatement ps;
        ResultSet rs;
        String validado = "";
        int id = 0;
        if (cn == null) {
            validado = "ERROR EN LA CONEXIÓN CON LA BASE DE DATOS.";
        } else {
            try {
                ps = cn.prepareStatement("SELECT * FROM USUARIO WHERE UPPER(USUARIO) = ?");
                ps.setString(1, usuario);
                rs = ps.executeQuery();
                while (rs.next()) {
                    id = rs.getInt("ID");
                }
                if (id > 0) {
                    validado = "El usuario ingresado ya existe.";
                }
            } catch (SQLException e) {
                System.out.println("LOG ERROR: " + e.toString());
                validado = "ERROR AL VALIDAR LA EXISTENCIA DEL USUARIO.";
            }
        }
        return validado;
    }

    public String registrarUsuario(String usuario, String password, String tipoUsuario) {
        PreparedStatement ps;
        ResultSet rs;

        String validado = "";
        if (cn == null) {
            validado = "ERROR EN LA CONEXIÓN CON LA BASE DE DATOS.";
        } else {
            try {
                // registrar
                ps = cn.prepareStatement("INSERT INTO USUARIO VALUES(NULL,?, ?, ?,'ACTIVO')");
                ps.setString(1, usuario);
                ps.setString(2, password);
                ps.setString(3, tipoUsuario);
                ps.execute();

            } catch (SQLException e) {
                System.out.println("LOG ERROR: " + e.toString());
                validado = "ERROR AL CREAR EL USUARIO";
            }

        }
        return validado;
    }

    public String registrarAgricultor(String nombres, String apellidos, String correo, String ciudad, String tipo, String usuario, String password) {
        PreparedStatement ps;
        ResultSet rs;

        String validado = "";
        int id = 0;

        if (cn == null) {
            validado = "ERROR EN LA CONEXIÓN CON LA BASE DE DATOS.";
        } else {
            try {
                ps = cn.prepareStatement("SELECT * FROM USUARIO WHERE UPPER(USUARIO) = ? AND PASSWORD = ?");
                ps.setString(1, usuario);
                ps.setString(2, password);
                rs = ps.executeQuery();

                while (rs.next()) {
                    id = rs.getInt("ID");
                }
                if (id > 0) {
                    try {
                        // registrar agricultor
                        ps = cn.prepareStatement("INSERT INTO AGRICULTOR VALUES(NULL, ?,?,?,?,?)");
                        ps.setInt(1, id);
                        ps.setString(2, nombres);
                        ps.setString(3, apellidos);
                        ps.setString(4, ciudad);
                        ps.setString(5, correo);
                        ps.execute();

                    } catch (SQLException e) {
                        System.out.println("LOG ERROR: " + e.toString());
                        validado = "EL USUARIO NO PUDO SER REGISTRADO";
                    }
                } else {
                    validado = "El usuario no ha sido creado";
                }

            } catch (SQLException e) {
                System.out.println("LOG ERROR: " + e.toString());
                validado = "EL USUARIO NO PUDO SER CREADO";
            }
        }
        return validado;
    }

    public String registrarAgronomo(String nombres, String apellidos, String correo, String ciudad, String tipo, String colegiatura, String usuario, String password) {
        PreparedStatement ps;
        ResultSet rs;

        String validado = "";
        int id = 0;

        if (cn == null) {
            validado = "ERROR EN LA CONEXIÓN CON LA BASE DE DATOS.";
        } else {
            try {
                ps = cn.prepareStatement("SELECT * FROM USUARIO WHERE UPPER(USUARIO) = ? AND PASSWORD = ?");
                ps.setString(1, usuario);
                ps.setString(2, password);
                rs = ps.executeQuery();

                while (rs.next()) {
                    id = rs.getInt("ID");
                }
                if (id > 0) {
                    try {
                        // registrar agricultor
                        ps = cn.prepareStatement("INSERT INTO AGRONOMO VALUES(NULL, ?,?,?,?,?,?)");
                        ps.setInt(1, id);
                        ps.setString(2, nombres);
                        ps.setString(3, apellidos);
                        ps.setString(4, ciudad);
                        ps.setString(5, correo);
                        ps.setString(6, colegiatura);
                        ps.execute();

                    } catch (SQLException e) {
                        System.out.println("LOG ERROR: " + e.toString());
                        validado = "EL USUARIO NO PUDO SER REGISTRADO";
                    }
                } else {
                    validado = "El usuario no ha sido creado";
                }

            } catch (SQLException e) {
                System.out.println("LOG ERROR: " + e.toString());
                validado = "EL USUARIO NO PUDO SER CREADO";
            }
        }
        return validado;
    }

    public String validarUsuario(String user, String pass) {
        PreparedStatement ps;
        ResultSet rs;

        String validado = "";
        if (cn == null) {
            validado = "ERROR EN LA CONEXIÓN CON LA BASE DE DATOS.";
        } else {
            try {
                ps = cn.prepareStatement("SELECT * FROM USUARIO WHERE UPPER(USUARIO) = ? AND PASSWORD = ?");
                ps.setString(1, user);
                ps.setString(2, pass);
                rs = ps.executeQuery();
                int id = 0;
                String tipoUsu = "";
                while (rs.next()) {
                    id = rs.getInt("ID");
                    tipoUsu = rs.getString("TIPO_USUARIO");
                }
                if (id > 0) {
                    validado = tipoUsu;
                } else {
                    validado = "";
                }
            } catch (SQLException e) {
                System.out.println("LOG ERROR: " + e.toString());
                validado = "";
            }
        }
        return validado;
    }

    public ResultSet recuperarContraseña(String usuarioCorreo) {
        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = cn.prepareStatement("SELECT U.USUARIO, A1.CORREO\n"
                    + "  FROM USUARIO U, AGRICULTOR A1 \n"
                    + " WHERE U.ID = A1.ID_USUARIO \n"
                    + "   AND (UPPER(USUARIO) = ? OR UPPER(A1.CORREO) = ?) \n"
                    + "UNION ALL \n"
                    + "SELECT U.USUARIO, A2.CORREO \n"
                    + "  FROM USUARIO U, AGRONOMO A2 \n"
                    + " WHERE U.ID = A2.ID_USUARIO \n"
                    + "   AND (UPPER(U.USUARIO) = ? OR UPPER(A2.CORREO) = ?)");
            ps.setString(1, usuarioCorreo);
            ps.setString(2, usuarioCorreo);
            ps.setString(3, usuarioCorreo);
            ps.setString(4, usuarioCorreo);
            rs = ps.executeQuery();
        } catch (SQLException e) {
            System.out.println("LOG ERROR: " + e.toString());
            return null;
        }

        return rs;
    }

    public List<String> obtenerPerfil(String usuarioSesion) {
        PreparedStatement ps;
        ResultSet rs;
        List<String> lista = new ArrayList<>();
        Integer id;
        String usuario;
        String password;
        String tipoUsuario;
        String nombres;
        String apellidos;
        String ciudad;
        String correo;
        String colegiatura;

        try {
            ps = cn.prepareStatement("SELECT U.ID, U.USUARIO, U.PASSWORD, U.TIPO_USUARIO, A1.NOMBRES, A1.APELLIDOS, A1.CIUDAD, A1.CORREO, '' AS COLEGIATURA\n"
                    + "  FROM USUARIO U, AGRICULTOR A1\n"
                    + " WHERE U.ID = A1.ID_USUARIO\n"
                    + "   AND UPPER(USUARIO) = ? \n"
                    + "UNION ALL\n"
                    + "SELECT U.ID, U.USUARIO, U.PASSWORD, U.TIPO_USUARIO, A2.NOMBRES, A2.APELLIDOS, A2.CIUDAD, A2.CORREO, A2.COLEGIATURA\n"
                    + "  FROM USUARIO U, AGRONOMO A2\n"
                    + " WHERE U.ID = A2.ID_USUARIO\n"
                    + "   AND UPPER(U.USUARIO) = ? ");
            ps.setString(1, usuarioSesion);
            ps.setString(2, usuarioSesion);
            rs = ps.executeQuery();

            while (rs.next()) {
                id = rs.getInt("ID");
                lista.add(id.toString());
                usuario = rs.getString("USUARIO");
                lista.add(usuario);
                password = rs.getString("PASSWORD");
                lista.add(password);
                tipoUsuario = rs.getString("TIPO_USUARIO");
                lista.add(tipoUsuario);
                nombres = rs.getString("NOMBRES");
                lista.add(nombres);
                apellidos = rs.getString("APELLIDOS");
                lista.add(apellidos);
                ciudad = rs.getString("CIUDAD");
                lista.add(ciudad);
                correo = rs.getString("CORREO");
                lista.add(correo);
                colegiatura = rs.getString("COLEGIATURA");
                lista.add(colegiatura);
            }

        } catch (SQLException e) {
            System.out.println("LOG ERROR: " + e.toString());
            return null;
        }

        return lista;
    }

    public boolean actualizarPerfil(int idUsuario, String nombres, String apellidos, String correo, String ciudad, String tipo, String colegiatura, String usuario, String password) {
        PreparedStatement ps;
        ResultSet rs;
        String validado = "";
        
        try {
            // registrar agricultor
            ps = cn.prepareStatement("UPDATE USUARIO SET USUARIO = ?, PASSWORD = ?, TIPO_USUARIO = ? WHERE ID = ?");
            ps.setString(1, usuario);
            ps.setString(2, password);
            ps.setString(3, tipo);
            ps.setInt(4, idUsuario);
            ps.execute();

        } catch (SQLException e) {
            System.out.println("LOG ERROR: " + e.toString());
            validado = "ERROR";
             return false;
        }

        if (validado.equals("")) {
            if (tipo.equals("Agricultor")) {
                try {
                    // registrar agricultor
                    ps = cn.prepareStatement("UPDATE AGRICULTOR SET NOMBRES = ?, APELLIDOS = ?, CORREO = ?, CIUDAD = ? WHERE ID_USUARIO = ?");
                    ps.setString(1, nombres);
                    ps.setString(2, apellidos);
                    ps.setString(3, correo);
                    ps.setString(4, ciudad);
                    ps.setInt(5, idUsuario);
                    ps.execute();

                } catch (SQLException e) {
                    System.out.println("LOG ERROR: " + e.toString());
                    validado = "ERROR";
                     return false;
                }
            } else {
                try {
                    // registrar agricultor
                    ps = cn.prepareStatement("UPDATE AGRONOMO SET NOMBRES = ?, APELLIDOS = ?, CORREO = ?, CIUDAD = ?, COLEGIATURA = ? WHERE ID_USUARIO = ?");
                    ps.setString(1, nombres);
                    ps.setString(2, apellidos);
                    ps.setString(3, correo);
                    ps.setString(4, ciudad);
                    ps.setString(5, colegiatura);
                    ps.setInt(6, idUsuario);
                    ps.execute();

                } catch (SQLException e) {
                    System.out.println("LOG ERROR: " + e.toString());
                    validado = "ERROR";
                    return false;
                }
            }

        }

        return true;
    }
}
