/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

/**
 *
 * @author gggus
 */
public class PruebaAritmetica {
    public static void main(String args[]){
        Aritmetica a = new Aritmetica(); //obejo de clase aritmetica CONSTRUCTOR
        
        int resultado = a.sumar(3,5); //se llama al metodo sumar y se guarda el resultado en la variable
        
        System.out.println("Resultado: " + resultado);
    }
}
