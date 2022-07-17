/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author amontanez
 */
public class Comentario {
    
    private Integer id;
    private Integer idAsunto;
    private Integer idUsuario;
    private String comentario;
    private String usuario;
    private String fechaComentario;

    public Comentario(Integer id, Integer idAsunto, Integer idUsuario, String comentario, String usuario, String fechaComentario) {
        this.id = id;
        this.idAsunto = idAsunto;
        this.idUsuario = idUsuario;
        this.comentario = comentario;
        this.usuario = usuario;
        this.fechaComentario = fechaComentario;
    }

    public String getFechaComentario() {
        return fechaComentario;
    }

    public void setFechaComentario(String fechaComentario) {
        this.fechaComentario = fechaComentario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Integer getIdAsunto() {
        return idAsunto;
    }

    public void setIdAsunto(Integer idAsunto) {
        this.idAsunto = idAsunto;
    }
    
     public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
    
}
