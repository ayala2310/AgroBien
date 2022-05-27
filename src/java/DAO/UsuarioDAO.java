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

    public String registrarUsuario(String nombres, String apellidos, String dni, String celular, String correo, String ciudad, String tipo, String colegiatura, String usuario, String password) {
        PreparedStatement ps;
        ResultSet rs;

        String validado = "";
        if (cn == null) {
            validado = "ERROR EN LA CONEXIÓN CON LA BASE DE DATOS.";
        } else {
            try {
                // validar existencia de usuario
                ps = cn.prepareStatement("SELECT * FROM USUARIO WHERE USUARIO = ?");
                ps.setString(1, usuario);
                rs = ps.executeQuery();

                int id = 0;
                while (rs.next()) {
                    id = rs.getInt("ID");
                }
                if (id > 0) {
                    validado = "Este nombre de usuario ya existe.";
                } else {
                    validado = "";
                    int id3 = 0;
                    try {
                        // registrar
                        ps = cn.prepareStatement("INSERT INTO USUARIO VALUES(NULL,?, ?,'ACTIVO')");
                        ps.setString(1, usuario);
                        ps.setString(2, password);
                        ps.execute();

                        if (tipo.equalsIgnoreCase("AGRICULTOR")) {
                            try {
                                try {
                                    // obtener ID de usuario
                                    ps = cn.prepareStatement("SELECT * FROM USUARIO WHERE USUARIO = ? AND PASSWORD = ?");
                                    ps.setString(1, usuario);
                                    ps.setString(2, password);
                                    rs = ps.executeQuery();

                                    while (rs.next()) {
                                        id3 = rs.getInt("ID");
                                    }

                                    if (id3 > 0) {

                                    }

                                } catch (SQLException e) {
                                    System.out.println("LOG ERROR: " + e.toString());
                                    validado = "EL USUARIO NO PUDO SER CREADO";
                                }
                                // registrar agricultor
                                ps = cn.prepareStatement("INSERT INTO AGRICULTOR VALUES(NULL, ?,?,?,?,?,?,?)");
                                ps.setInt(1, id3);
                                ps.setString(2, nombres);
                                ps.setString(3, apellidos);
                                ps.setString(4, dni);
                                ps.setString(5, celular);
                                ps.setString(6, correo);
                                ps.setString(7, ciudad);
                                ps.execute();

                            } catch (SQLException e) {
                                System.out.println("LOG ERROR: " + e.toString());
                                validado = "EL USUARIO NO PUDO SER REGISTRADO";
                            }
                        } else {

                        }
                    } catch (SQLException e) {
                        System.out.println("LOG ERROR: " + e.toString());
                        validado = "ERROR AL CREAR EL USUARIO";
                    }

                }
            } catch (SQLException e) {
                System.out.println("LOG ERROR: " + e.toString());
                validado = "ERROR AL VALIDAR LA EXISTENCIA DEL USUARIO.";
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
                while (rs.next()) {
                    id = rs.getInt("ID");
                }
                if (id > 0) {
                    validado = "";
                } else {
                    validado = "Usuario o contarseña incorrecto.";
                }
            } catch (SQLException e) {
                System.out.println("LOG ERROR: " + e.toString());
                validado = "ERROR";
            }
        }
        return validado;
    }
}
