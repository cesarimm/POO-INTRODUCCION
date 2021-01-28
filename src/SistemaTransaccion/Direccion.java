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
public class Direccion {
    
    private String calle;
    private String numeroCalle;
    private String localidad;
    private String estado;
    private int CP;

    public Direccion() {
    }

    public Direccion(String calle, String numeroCalle, String localidad, String estado, int CP) {
        this.calle = calle;
        this.numeroCalle = numeroCalle;
        this.localidad = localidad;
        this.estado = estado;
        this.CP = CP;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(String numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }
       
}
