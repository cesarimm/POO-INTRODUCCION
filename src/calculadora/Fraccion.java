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
public class Fraccion {

    private static int sumaSimple(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    ///Atributos
    private int numerador;
    private int denominador;
    
    //Metodos
    
    //Constructores
    public Fraccion(){
        
    }
    
    public Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    
    ///Getters && setters
    public int getNumerador(){
        return this.numerador;
    }
    
    public int getDenominador(){
        return this.denominador;
    }
    
    public void setNumerador(int numerador){
        this.numerador = numerador;
    }
    
    public void setDenominador(int denominador){
        this.denominador = denominador;
    }
    
    ////Suma
    
    public Fraccion suma(Fraccion numA, Fraccion numB){
        Fraccion aux = new Fraccion(); ///  0/8
        aux.setDenominador(numA.getDenominador()*numB.getDenominador());
        int mul1 = numA.getDenominador()*numB.getNumerador();
        int mul2 = numB.getDenominador()*numA.getNumerador();
        aux.setNumerador(mul1+mul2); 
        return aux;
    }
    
   
    
    ///Multiplicacion 
    public Fraccion multiplicacion(Fraccion numA, Fraccion numB){
        return new Fraccion(numA.getNumerador()*numB.getNumerador(), numA.getDenominador()*numB.getDenominador());
    }
    
      ///Simplificar o reducir fraccion 
     public Fraccion reducir(Fraccion numA){  
        int mcd = Fraccion.maximoCD(numA.getDenominador(),numA.getNumerador());
        if(mcd!=1){
            Fraccion aux = new Fraccion(numA.getNumerador()/mcd, numA.getDenominador()/mcd); ///  0/8
            return aux;
        } else{
          return  numA;
        }
        
    }
    
    ///Reducir fraccion
    @Override
    public String toString() {
        return "Fraccion{" + "numerador=" + numerador + ", denominador=" + denominador + '}';
    }
    
    
    ///Metodos staticos
     static int maximoCD(int a, int b){
     
        ///Algoritmo
        
        while(true){
             ///Buscar cual es el mayor y cual es el menor
             if(a<b){
                 ///
                 int aux = a;
                 a=b;
                 b=aux;
             }

             if(a==0){
                 ///Ya encontramos el maximo comun divisor
                 return b;
             }else if(b==0){
                 ///Ya encontramos el maximo comun divisor
                 return a;
             }

             int div = a/b;
             int modulo = a%b;

             int resta = a - modulo;

             ///Asignamos los nuevos valores 
             a = resta/div;
             b = modulo;

             //156 = 78 * 2
             //192 = 78 * 2 + 36
        }
               
    }
    
    static int sumaSimple(int a, int b){
       return a+b;
    }
    
   
      
}
