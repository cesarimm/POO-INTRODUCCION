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
public class Automovil {
    
    ///Atributos
    protected String marca;
    protected String color;
    protected int anio;

   
    
    ///Metodos
    
    ////Constructores
    public Automovil(){
        
    }
    
    public Automovil(String marca, String color, int anio){
        this.marca = marca;
        this.color = color;
        this.anio = anio;
    }

        ///Getters 
    public String getMarca(){
        return this.marca;
    }
    
    
    public String getColor(){
        return this.color;
    }
    
    public int getAnio(){
        return this.anio;
    }
    
    ///Setters
    public void setMarca(String marca){
        this.marca=marca;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public void setAnio(int anio){
        this.anio = anio;
    }
    
    public double gastoGasolina(double distancia, double velocidad, double masa){   
        double resultado =0;
        resultado = Math.pow(distancia, 2)/masa*velocidad;
        return resultado;
    }
    
    ////ToString
    @Override
    public String toString() {
        return "Automovil{" + "marca=" + marca + ", color=" + color + ", anio=" + anio + '}';
    }   
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
