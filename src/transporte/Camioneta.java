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
public class Camioneta extends Automovil{ 
    private int toneladasCarga;
    
    public Camioneta(){
        
    }
    
    public Camioneta(String marca, String color, int anio, int toneladasCarga){
        this.anio=anio;
        this.color=color;
        this.marca=marca;
        this.toneladasCarga=toneladasCarga;
    }

    public int getToneladasCarga() {
        return toneladasCarga;
    }

    public void setToneladasCarga(int toneladasCarga) {
        this.toneladasCarga = toneladasCarga;
    }
      
}
