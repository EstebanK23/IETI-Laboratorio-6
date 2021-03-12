package edu.escuelaing.ieti.TaskPlanner6API.Model;

public class User {

    private String Id;
    private String nombre;
    private String clave;
    private String correo;

    public User(String Id,String nombre,String clave,String correo){
        this.Id = Id;
        this.nombre = nombre;
        this.clave = clave;
        this.correo = correo;
    }

    public String getId() {
        return this.Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return this.clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", clave=" + clave + ", correo=" + correo + "}";
    }
    
}
