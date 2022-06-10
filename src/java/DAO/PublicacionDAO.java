/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Configuraciones.Conexion;
import Modelo.Publicacion;
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
public class PublicacionDAO {

    Connection cn;

    public PublicacionDAO() {
        Conexion con = new Conexion();
        cn = con.getConexion();
    }

    public boolean publicarBlog(Publicacion publicacion) {
        PreparedStatement ps;
        try {
            ps = cn.prepareStatement("INSERT INTO PUBLICACIONES VALUES(NULL, ?, ?, ?, ?)");
            ps.setString(1, publicacion.getUsuario());
            ps.setString(2, publicacion.getAsunto());
            ps.setString(3, publicacion.getFecha());
            ps.setString(4, publicacion.getCuerpo());
            ps.execute();
            System.out.println("INSERT OK: ");
            return true;
        } catch (SQLException e) {
            System.out.println("ERROR INSERT: " + e);
            return false;
        }

    }

    public List<Publicacion> listarPublicaciones() {
        PreparedStatement ps;
        ResultSet rs;

        List<Publicacion> lista = new ArrayList<>();
        try {
            ps = cn.prepareStatement("SELECT * FROM PUBLICACIONES ORDER BY 1 DESC");
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("ID");
                String asunto = rs.getString("ASUNTO");
                String cuerpo = rs.getString("CUERPO");
                String fecha = rs.getString("FECHA");
                String usuario = rs.getString("USUARIO");

                Publicacion publicacion = new Publicacion(id, asunto, cuerpo, fecha, usuario);
                lista.add(publicacion);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
        return lista;
    }
    
        public List<Publicacion> buscarPublicacion(String buscar) {
        PreparedStatement ps;
        ResultSet rs;

        List<Publicacion> lista = new ArrayList<>();
        try {
            ps = cn.prepareStatement("SELECT * FROM PUBLICACIONES WHERE UPPER(ASUNTO) LIKE ? OR UPPER(CUERPO) LIKE ? ORDER BY 1 DESC");
             ps.setString(1, "%"+buscar+"%");
             ps.setString(2, "%"+buscar+"%");
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("ID");
                String asunto = rs.getString("ASUNTO");
                String cuerpo = rs.getString("CUERPO");
                String fecha = rs.getString("FECHA");
                String usuario = rs.getString("USUARIO");

                Publicacion publicacion = new Publicacion(id, asunto, cuerpo, fecha, usuario);
                lista.add(publicacion);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
        return lista;
    }

}
