/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gggus
 */
public class TipoBoolean {
    
    public static void main(String args[]){
        
        System.out.println("true tipo boolean: " + Boolean.TRUE);
        System.out.println("false tipo boolean: " + Boolean.FALSE);
        System.out.println("tipo boolean: " + Boolean.TYPE);
        
        boolean varBoolean = true;
        
        //if (varBoolean == true){
        if (varBoolean){
            System.out.println("el valor es verdadero");            
        } else {
            System.out.println("el valor es falso");
        }
        
        System.out.println("-------------*----------------");
        
        var edad = 10;
        var esAdulto = edad >= 18;
        
        if(esAdulto){
            System.out.println("Es adulto " + esAdulto);
        } else {
            System.out.println("No es adulto " + esAdulto);
        }
    }
    
}
