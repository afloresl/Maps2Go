package java.com.maave.maps2go.modelo;
// Generated 24/03/2019 03:06:54 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private String nombreUsuario;
     private String contrasenia;
     private String correo;
     private int rol;
     private Set temas = new HashSet(0);
     private Set comentarios = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(String nombreUsuario, String contrasenia, String correo, int rol) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.correo = correo;
        this.rol = rol;
    }
    public Usuario(String nombreUsuario, String contrasenia, String correo, int rol, Set temas, Set comentarios) {
       this.nombreUsuario = nombreUsuario;
       this.contrasenia = contrasenia;
       this.correo = correo;
       this.rol = rol;
       this.temas = temas;
       this.comentarios = comentarios;
    }
   
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getContrasenia() {
        return this.contrasenia;
    }
    
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public int getRol() {
        return this.rol;
    }
    
    public void setRol(int rol) {
        this.rol = rol;
    }
    public Set getTemas() {
        return this.temas;
    }
    
    public void setTemas(Set temas) {
        this.temas = temas;
    }
    public Set getComentarios() {
        return this.comentarios;
    }
    
    public void setComentarios(Set comentarios) {
        this.comentarios = comentarios;
    }




}


