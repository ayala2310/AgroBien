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
import java.util.logging.Level;
import java.util.logging.Logger;

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
            ps = cn.prepareStatement("SELECT * FROM AGRONOMO");
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("ID");
                int idUsuario = rs.getInt("ID_USUARIO");
                String nombres = rs.getString("NOMBRES");
                String apellidos = rs.getString("APELLIDOS");
                String ciudad = rs.getString("CIUDAD");
                String correo = rs.getString("CORREO");
                String colegiatura = rs.getString("COLEGIATURA");

                Agronomo agronomo = new Agronomo(id, idUsuario, nombres, apellidos, ciudad, correo, colegiatura);
                lista.add(agronomo);
                System.out.println("ok agronomos: " + agronomo);
            }
        } catch (SQLException e) {
            System.out.println("error agronomos: " + e.toString());
            return null;
        }
        return lista;
    }

    public ResultSet buscarAgronomo(String buscar, int pag, int numPag) {
        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = cn.prepareStatement("SELECT * FROM AGRONOMO WHERE UPPER(NOMBRES) LIKE ? OR UPPER(APELLIDOS) LIKE ? ORDER BY 1 ASC LIMIT ?,?");
            ps.setString(1, "%" + buscar + "%");
            ps.setString(2, "%" + buscar + "%");
            ps.setInt(3, (pag - 1) * numPag);
            ps.setInt(4, numPag);
            rs = ps.executeQuery();

            /*while (rs.next()) {
                String nombres = rs.getString("NOMBRES");
               
                System.out.println("ok nombres: " + nombres);
            }*/
            
        } catch (SQLException e) {
            System.out.println("error agronomos: " + e.toString());
            return null;
        }
        return rs;
    }

    public ResultSet paginacionAgronomo(int pag, int numPag) {
        PreparedStatement ps;
        ResultSet rs;
        System.out.println("agronomos param: " + pag + " - " + numPag);
        try {
            //ps = cn.prepareStatement("SELECT * FROM AGRONOMO  LIMIT ?,?");
            ps = cn.prepareStatement("SELECT * FROM AGRONOMO LIMIT ?,?");
            ps.setInt(1, (pag - 1) * numPag);
            ps.setInt(2, numPag);
            rs = ps.executeQuery();
        } catch (SQLException e) {
            System.out.println("error agronomos2: " + e.toString());
            return null;
        }
        System.out.println("error agronomos3: ");
        return rs;
    }

    public Integer cantidadAgronomos(String valorBuscado) {
        PreparedStatement ps;
        ResultSet rs;
        int cant = 0;
        try {
            ps = cn.prepareStatement("SELECT COUNT(1) AS CANTIDAD FROM AGRONOMO WHERE UPPER(NOMBRES) LIKE ? OR UPPER(APELLIDOS) LIKE ?");
            ps.setString(1, "%" + valorBuscado + "%");
            ps.setString(2, "%" + valorBuscado + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                cant = rs.getInt("CANTIDAD");
            }
        } catch (SQLException e) {
            cant = 0;
        }
        return cant;
    }

}
