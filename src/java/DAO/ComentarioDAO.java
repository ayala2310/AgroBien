/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Configuraciones.Conexion;
import Modelo.Comentario;
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
public class ComentarioDAO {
    
     Connection cn;

    public ComentarioDAO() {
        Conexion con = new Conexion();
        cn = con.getConexion();
    }
    
     public boolean comentarPublicacion(Comentario comentario) {
        PreparedStatement ps;
        try {
            ps = cn.prepareStatement("INSERT INTO COMENTARIOS VALUES(NULL, ?, ?, ?, ?, ?)");
            ps.setInt(1, comentario.getIdAsunto());
            ps.setInt(2, comentario.getIdUsuario());
            ps.setString(3, comentario.getComentario());
            ps.setString(4, comentario.getUsuario());
            ps.setString(5, comentario.getFechaComentario());
            ps.execute();
            System.out.println("INSERT OK: ");
            return true;
        } catch (SQLException e) {
            System.out.println("ERROR INSERT: " + e);
            return false;
        }

    }
     
      public List<Comentario> listarComentarios(Integer idPublicacion) {
        PreparedStatement ps;
        ResultSet rs;

        List<Comentario> lista = new ArrayList<>();
        try {
            ps = cn.prepareStatement("SELECT * FROM COMENTARIOS WHERE ID_PUBLICACION = ? ORDER BY 1 DESC");
            ps.setInt(1, idPublicacion);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("ID");
                int idBlog = rs.getInt("ID_PUBLICACION");
                int idUsuario = rs.getInt("ID_USUARIO");
                String comenta = rs.getString("COMENTARIO");
                String usuario = rs.getString("USUARIO");
                String fecha = rs.getString("FECHA_COMENTARIO");

                Comentario comentario = new Comentario(id, idBlog, idUsuario, comenta, usuario, fecha);
                lista.add(comentario);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
        return lista;
    }
    
}
