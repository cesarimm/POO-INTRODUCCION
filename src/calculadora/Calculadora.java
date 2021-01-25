/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author CESAR IVAN MTZ
 */
public class Calculadora {
    
    public static void main(String args[]){
        
        //int a = Fraccion.maximoCD(17, 49);
        //System.out.println("Mcd: "+a);
        
        Fraccion num1 = new Fraccion(12,10);
        Fraccion num2 = new Fraccion(198,74);
        
        Fraccion resultado = new Fraccion(); 
        resultado = resultado.suma(num1, num2);
        System.out.println("");
        System.out.println(resultado.toString());
        System.out.println("Reducido");
        System.out.println(resultado.reducir(resultado));
        
        Fraccion res2 = new Fraccion();
        res2 = res2.multiplicacion(num1, num2);
        System.out.println(res2.toString());
        System.out.println(res2.reducir(res2));
        
        // reducir(new Fraccion(22, 20)); = Fraccion(11, 10);
    }   
}
