/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.modelo.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Santy
 */
public class Controlador {

    Cliente c;
    ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();

    public void menu() {
        String op;
        do {
            op = JOptionPane.showInputDialog("Ingresa una opción:\n"
                    + "1.- Ingresar Cliente\n"
                    + "2.- Consultar Clientes por cedula\n"
                    + "3.- Actualizar Cliente\n"
                    + "4.- Eliminar Cliente\n"
                    + "5.- Salir");
            switch (op) {
                case "1":
                    this.ingresarCliente();
                    break;
                case "2":
                    this.consultarPorCedula(JOptionPane.showInputDialog("ingresa la cedula que estas buscando"));
                    break;
                case "3":
                    this.actualizarCliente(JOptionPane.showInputDialog("ingresa la cedula que se va actualizar"));
                    break;
                case "4":
                    this.eliminar(JOptionPane.showInputDialog("ingresa la cedula que se va eliminar"));
                    break;
            }

        } while (!op.equals("5"));
    }

    public void ingresarCliente() {
        c = new Cliente();
        c.setCi(JOptionPane.showInputDialog("ingresa la cedula"));
        c.setApellido1(JOptionPane.showInputDialog("ingresa apellido1"));
        c.setApellido2(JOptionPane.showInputDialog("ingresa apellido2"));
        c.setNombre1(JOptionPane.showInputDialog("ingresa nombre1"));
        c.setNombre2(JOptionPane.showInputDialog("ingresa nombre2"));
        c.setCorreo(JOptionPane.showInputDialog("Ingresa un correo"));
        c.setCelular(JOptionPane.showInputDialog("Ingresa la celular"));

        listaCliente.add(c);
    }

    public void cosultarTodosClientes() {
        JOptionPane.showMessageDialog(null, listaCliente.toString());
    }

    public void consultarPorCedula(String ced) {
        for (Cliente cliente : listaCliente) {
            if (cliente.getCi().equals(ced)) {
                JOptionPane.showMessageDialog(null, cliente.toString());

            }

        }
    }

    public void actualizarCliente(String ci) {
        String op;
        for (Cliente cliente : listaCliente) {
            if (cliente.getCi().equals(ci)) {
                do {
                    op = JOptionPane.showInputDialog("Indica el parametro a actualizar\n"
                            + "a.- Cedula\n"
                            + "b.- Apellido1\n"
                            + "c.- Apellido2\n"
                            + "d.- Nombre1\n"
                            + "e.- Nombre2\n"
                            + "f.- Dirección\n"
                            + "s.- Salir");
                    switch (op) {
                        case "a":
                            cliente.setCi(JOptionPane.showInputDialog("ingresa nueva cedula"));
                            break;
                        case "b":
                            cliente.setApellido1(JOptionPane.showInputDialog("ingresa nuevo apellido"));
                            break;
                    }
                } while (!op.equals("s"));
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no existe");
            }
        }

    }
    
    public void eliminar(String ced){
        for (Cliente cliente : listaCliente) {
            if(cliente.getCi().equals(ced)){
                listaCliente.remove(cliente);
            }
            
        }
    }
}
