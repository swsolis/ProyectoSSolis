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
public class Cliente extends Persona{
    String idCliente;

    public Cliente() {
    }

    public Cliente(String idCliente, String ci, String apellido1, String apellido2, String nombre1, String nombre2, String direccion, String correo, String celular, String fechaNacimiento) {
        super(ci, apellido1, apellido2, nombre1, nombre2, direccion, correo, celular, fechaNacimiento);
        this.idCliente = idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdCliente() {
        return idCliente;
    }
    
    
    
}
