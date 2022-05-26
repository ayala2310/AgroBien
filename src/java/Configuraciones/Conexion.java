/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuraciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amontanez
 */
public class Conexion {

    public Connection getConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_agrobien?zeroDateTimeBehavior=convertToNull&serverTimezone=UTC&characterEncoding=utf-8", "root", "");
            System.out.println("conexion OK");
            return cnx;
        } catch (SQLException e) {
            System.out.println("error cnx: " + e.toString());
            return null;
        } catch (ClassNotFoundException ex) {
            System.out.println("error cnx2: " + ex);
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}