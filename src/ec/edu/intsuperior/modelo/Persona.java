/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Santy
 */
public class Persona {
    private String ci;
    private String apellido1;
    private String apellido2;
    private String nombre1;
    private String nombre2;
    private String direccion;
    private String correo;
    private String celular;
    private String fechaNacimiento;

    public Persona() {
    }

    public Persona(String ci, String apellido1, String apellido2, String nombre1, String nombre2, String direccion, String correo, String celular, String fechaNacimiento) {
        this.ci = ci;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.direccion = direccion;
        this.correo = correo;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "\n\nDatos: \n"
                + "Cédula: "+getCi()+"\n"
                + "Apellidos: "+getApellido1()+" "+getApellido2()+"\n"
                + "Nombres: "+getNombre1()+" "+getNombre2()+"\n"
                + "Dirección: "+getDireccion()+"\n"
                + "Correo: "+getCorreo()+"\n"
                + "Celular: "+getCelular();               }
     
    
    
}
