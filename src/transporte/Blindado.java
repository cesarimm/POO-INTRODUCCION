/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte;

/**
 *
 * @author CESAR IVAN MTZ
 */
public class Blindado extends Automovil{
    
    private int nivelBlindaje;
    
    public Blindado(){
        
    }
    
    public Blindado(String marca, String color, int anio, int nivelBlindaje){
        this.anio=anio;
        this.color=color;
        this.marca=marca;
        this.nivelBlindaje = nivelBlindaje;
    }

    public int getNivelBlindaje() {
        return nivelBlindaje;
    }

    public void setNivelBlindaje(int nivelBlindaje) {
        this.nivelBlindaje = nivelBlindaje;
    }
    
}
