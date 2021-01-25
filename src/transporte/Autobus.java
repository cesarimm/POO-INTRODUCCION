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
public class Autobus extends Automovil{
    
    private int numeroPasajeros;
    
    ///Constructor
    
    public Autobus(){
        
    }
    
    public Autobus(String marca, String color, int anio, int numPasajeros){
       this.anio=anio;
       this.color=color;
       this.marca=marca;
       this.numeroPasajeros=numPasajeros;
    }
    
    ///Getters 
    public int getNumeroPasajeros(){
        return this.numeroPasajeros;
    }
    ///Setters
    public void setNumeroPasajeros(int numeroPasajeros){
        this.numeroPasajeros = numeroPasajeros;
    }

    @Override
    public String toString() {
        return "Autobus{" + "numeroPasajeros=" + numeroPasajeros + '}'+" Marca: "+this.getMarca()+" Color: "+this.getColor()+" Año: "+this.getAnio();
    }

 
    
}
