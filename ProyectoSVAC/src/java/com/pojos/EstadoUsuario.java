package com.pojos;
// Generated Apr 27, 2018 1:46:45 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * EstadoUsuario generated by hbm2java
 */
public class EstadoUsuario  implements java.io.Serializable {


     private Integer codigoEstadoUsuario;
     private String nombreEstadoUsuario;
     private Set<Usuario> usuarios = new HashSet<Usuario>(0);

    public EstadoUsuario() {
    }

	
    public EstadoUsuario(String nombreEstadoUsuario) {
        this.nombreEstadoUsuario = nombreEstadoUsuario;
    }
    public EstadoUsuario(String nombreEstadoUsuario, Set<Usuario> usuarios) {
       this.nombreEstadoUsuario = nombreEstadoUsuario;
       this.usuarios = usuarios;
    }
   
    public Integer getCodigoEstadoUsuario() {
        return this.codigoEstadoUsuario;
    }
    
    public void setCodigoEstadoUsuario(Integer codigoEstadoUsuario) {
        this.codigoEstadoUsuario = codigoEstadoUsuario;
    }
    public String getNombreEstadoUsuario() {
        return this.nombreEstadoUsuario;
    }
    
    public void setNombreEstadoUsuario(String nombreEstadoUsuario) {
        this.nombreEstadoUsuario = nombreEstadoUsuario;
    }
    public Set<Usuario> getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }




}


