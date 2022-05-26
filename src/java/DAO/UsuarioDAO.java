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
