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
public class Cajero {   
    public static void main(String args[]){
        
        Fecha f = new Fecha(12,25);
        Debito d = new Debito(1800, 7788, "1234123412341234", f, true);
        
        Cliente cliente = new Cliente("01", "Juuan", "12344321", "juuan@mail.com", new Direccion("Independencia", "45-A", "Leon", "Aguscalientes", 78900),d);
      
        cliente.desbloquearTarjeta();
        
        cliente.retiro(300);
         cliente.retiro(500);
          cliente.deposito(80000);
           cliente.consultarSaldo();
            cliente.estadoCuenta();
        
       /*//Construir un arreglo;
       String lista[] = new String[600];
       
       ///ArrayList
       ArrayList<String> registroTransacciones = new ArrayList<String>();*/
       
    }   
}
