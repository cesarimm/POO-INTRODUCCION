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
public class PruebaAuto {
    
    
    ///main
    public static void main(String args[]){
        ///Creanmdo un automovil vacio
       Automovil autoUno = new Automovil(); 
     
       ///Utilizar setters
       autoUno.setMarca("Nissan"); // marca=Nissa
       autoUno.setColor("Azul");
       autoUno.setAnio(2021);
       
       String aux = autoUno.toString();
        
        ///Mostrar la informacion
        System.out.println(aux);
        
        ///Utiizamos el otro constructor
        Automovil autoDos = new Automovil("FORD", "ROJO", 2020);
        autoDos.setColor("GUINDA");
        System.out.println(autoDos.toString());
        
        ///Uso de los get
        System.out.println("Marca: "+autoDos.getMarca());
        
        System.out.println("Gasolina: "+autoDos.gastoGasolina(100, 80, 2000));
        
        ////if else else if
        ///While do while
        //for
        ///case
        
        /// "Hola"=="Hola" c++ 
        /// "Hola".compare("Hola") Java
        
        Autobus bus1 = new Autobus("DINA", "Blanco", 1970, 50);
        System.out.println("");
        System.out.println(bus1.toString());
        
    }
    
}                                                                                 
