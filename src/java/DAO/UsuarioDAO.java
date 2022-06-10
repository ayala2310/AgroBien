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

    public String validarExistenciaUsuario(String usuario) {
        PreparedStatement ps;
        ResultSet rs;
        String validado = "";
        int id = 0;
        if (cn == null) {
            validado = "ERROR EN LA CONEXIÓN CON LA BASE DE DATOS.";
        } else {
            try {
                ps = cn.prepareStatement("SELECT * FROM USUARIO WHERE USUARIO = ?");
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

    public String registrarAgricultor(String nombres, String apellidos, String dni, String celular, String correo, String ciudad, String tipo, String usuario, String password) {
        PreparedStatement ps;
        ResultSet rs;

        String validado = "";
        int id = 0;

        if (cn == null) {
            validado = "ERROR EN LA CONEXIÓN CON LA BASE DE DATOS.";
        } else {
            try {
                ps = cn.prepareStatement("SELECT * FROM USUARIO WHERE USUARIO = ? AND PASSWORD = ?");
                ps.setString(1, usuario);
                ps.setString(2, password);
                rs = ps.executeQuery();

                while (rs.next()) {
                    id = rs.getInt("ID");
                }
                if (id > 0) {
                    try {
                        // registrar agricultor
                        ps = cn.prepareStatement("INSERT INTO AGRICULTOR VALUES(NULL, ?,?,?,?,?,?,?)");
                        ps.setInt(1, id);
                        ps.setString(2, nombres);
                        ps.setString(3, apellidos);
                        ps.setString(4, dni);
                        ps.setString(5, ciudad);
                        ps.setString(6, celular);
                        ps.setString(7, correo);
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

    public String registrarAgronomo(String nombres, String apellidos, String dni, String celular, String correo, String ciudad, String tipo, String colegiatura, String usuario, String password) {
        PreparedStatement ps;
        ResultSet rs;

        String validado = "";
        int id = 0;

        if (cn == null) {
            validado = "ERROR EN LA CONEXIÓN CON LA BASE DE DATOS.";
        } else {
            try {
                ps = cn.prepareStatement("SELECT * FROM USUARIO WHERE USUARIO = ? AND PASSWORD = ?");
                ps.setString(1, usuario);
                ps.setString(2, password);
                rs = ps.executeQuery();

                while (rs.next()) {
                    id = rs.getInt("ID");
                }
                if (id > 0) {
                    try {
                        // registrar agricultor
                        ps = cn.prepareStatement("INSERT INTO AGRONOMO VALUES(NULL, ?,?,?,?,?,?,?,?)");
                        ps.setInt(1, id);
                        ps.setString(2, nombres);
                        ps.setString(3, apellidos);
                        ps.setString(4, dni);
                        ps.setString(5, ciudad);
                        ps.setString(6, celular);
                        ps.setString(7, correo);
                        ps.setString(8, colegiatura);
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
                ps = cn.prepareStatement("SELECT * FROM USUARIO WHERE USUARIO = ? AND PASSWORD = ?");
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
                validado = "ERROR";
            }
        }
        return validado;
    }


}
