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
public class Publicacion {

    private Integer id;
    private String asunto;
    private Integer idUsuario;
    private String cuerpo;
    private String fecha;
    private String usuario;
    private Integer cantidadRespuestas;

    public Publicacion(Integer id, String asunto,int idUsuario, String cuerpo, String fecha, String usuario, Integer cantidadRespuestas) {
        this.id = id;
        this.asunto = asunto;
        this.idUsuario = idUsuario;
        this.cuerpo = cuerpo;
        this.fecha = fecha;
        this.usuario = usuario; 
        this.cantidadRespuestas = cantidadRespuestas;
    }

    public Publicacion() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Integer getCantidadRespuestas() {
        return cantidadRespuestas;
    }

    public void setCantidadRespuestas(Integer cantidadRespuestas) {
        this.cantidadRespuestas = cantidadRespuestas;
    }
    
      public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

}
