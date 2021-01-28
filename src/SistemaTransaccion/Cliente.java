/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaTransaccion;

import java.util.ArrayList;

/**
 *
 * @author CESAR IVAN MTZ
 */
public class Cliente {
    
    private String idCliente, nombre, telefono, email;
    private Direccion direccion;
    private Debito debito;
    private ArrayList<String> registroTransacciones = new ArrayList<String>();

    public Cliente() {
    }

    public Cliente(String idCliente, String nombre, String telefono, String email, Direccion direccion, Debito debito) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.debito = debito;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Debito getDebito() {
        return debito;
    }

    public void setDebito(Debito debito) {
        this.debito = debito;
    }

    public ArrayList<String> getRegistroTransacciones() {
        return registroTransacciones;
    }

    public void setRegistroTransacciones(ArrayList<String> registroTransacciones) {
        this.registroTransacciones = registroTransacciones;
    }
    
    public void deposito(double cantidad){
        this.debito.setSaldo(this.debito.deposito(cantidad));
        String referencia = "Deposito de "+cantidad;
        this.registroTransacciones.add(referencia);
    }
    
    
    public void retiro(double cantidad){
        if(debito.validarSaldo(cantidad)&&debito.getSeguridad()==false){
           this.debito.setSaldo(this.debito.retiro(cantidad));
             String referencia = "Retiro de "+cantidad;
             this.registroTransacciones.add(referencia);
        }else{
            System.out.println("Problemas de seguridad o no tienes dinero");
        }
    }
    
    public void desbloquearTarjeta(){
        debito.setSeguridad(false);
        System.out.println("Tarjeta desbloqueada");
    }
    
    
    public void consultarSaldo(){
        System.out.println("Tu salgo actual es de: "+debito.getSaldo());
    }
    
    
    public void estadoCuenta(){
        for (int i = 0; i<registroTransacciones.size(); i++) {
            System.out.println(registroTransacciones.get(i)); ///arreglo[i]
        }
    }
}
