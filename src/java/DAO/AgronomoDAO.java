/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Configuraciones.Conexion;
import Modelo.Agronomo;
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
public class AgronomoDAO {

    Connection cn;

    public AgronomoDAO() {
        Conexion con = new Conexion();
        cn = con.getConexion();
    }

    public List<Agronomo> listarAgronomos() {
        PreparedStatement ps;
        ResultSet rs;

        List<Agronomo> lista = new ArrayList<>();
        try {
            ps = cn.prepareStatement("SELECT * FROM AGRONOMO ORDER BY 1 DESC");
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("ID");
                int id_usuario = rs.getInt("ID_USUARIO");
                String nombres = rs.getString("NOMBRES");
                String apellidos = rs.getString("APELLIDOS");
                String nroDocumento = rs.getString("NRO_DOCUMENTO");
                String ciudad = rs.getString("CIUDAD");
                String celular = rs.getString("CELULAR");
                String correo = rs.getString("CORREO");
                String colegiatura = rs.getString("COLEGIATURA");

                Agronomo agronomo = new Agronomo(id, id_usuario, nombres, apellidos, nroDocumento, ciudad, celular, correo, colegiatura);
                lista.add(agronomo);
                System.out.println("ok agronomos: " + agronomo);
            }
        } catch (SQLException e) {
            System.out.println("error agronomos: " + e.toString());
            return null;
        }
        return lista;
    }

}
