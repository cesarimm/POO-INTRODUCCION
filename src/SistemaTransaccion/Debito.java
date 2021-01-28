/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaTransaccion;

/**
 *
 * @author CESAR IVAN MTZ
 */
public class Debito {
    
    private double saldo;
    private int nip;
    private String numeroTarjeta;
    ///Agregacion
    private Fecha fechaVencimiento;
    private boolean seguridad;

    public Debito() {
    }

    public Debito(double saldo, int nip, String numeroTarjeta, Fecha fechaVencimiento, boolean seguridad) {
        this.saldo = saldo;
        this.nip = nip;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.seguridad = seguridad;
    }
    
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public Fecha getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Fecha fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public boolean getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(boolean seguridad) {
        this.seguridad = seguridad;
    }
    
    
    public boolean bloquearTarjeta(String motivo){
        System.out.println("El motivo de su bloqueo es: "+motivo);
        return true;
    }
    
    
    public double retiro(double cantidad){
        if(validarSaldo(cantidad)){
           System.out.println("Su retiro es de"+cantidad);
           return this.getSaldo() - cantidad;  
        }else{
            System.out.println("Fondos insuficientes");
            return this.getSaldo();
        }  
    }
    
    public double deposito(double cantidad){
        System.out.println("Su deposito es de"+cantidad);
        return this.getSaldo() + cantidad;  
    }
    
    public boolean validarSaldo(double cantidad){
        ///Verificar seguridad
        if(getSeguridad()){
            System.out.println("TARJETA BLOQUEADA");
            return false;
        }
        
        //Verificar que cumpla con el saldo
        if(cantidad>this.getSaldo()){
            return false;
        }else{
            return true;
        }     
    }
    
  
}
