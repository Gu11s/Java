/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gggus
 */
public class Primitivos {

    public static void main(String args[]) {

        byte byteVar = 127;
        System.out.println("byteVar = " + byteVar);
        System.out.println("bits tipo byte: " + Byte.SIZE);
        System.out.println("bytes tipo byte: " + Byte.BYTES);
        System.out.println("MAX bits tipo byte: " + Byte.MAX_VALUE);
        System.out.println("MIN bits tipo byte: " + Byte.MIN_VALUE);
        
        System.out.println("--------------------*--------------------");

        short shortVar = 32767;
        System.out.println("shortVar = " + shortVar);
        System.out.println("bits tipo short: " + Short.SIZE);
        System.out.println("bytes tipo short: " + Short.BYTES);
        System.out.println("MAX bits tipo short: " + Short.MAX_VALUE);
        System.out.println("MIN bits tipo short: " + Short.MIN_VALUE);
        
        System.out.println("--------------------*--------------------");
        
        int intVar = 2147483647;
        System.out.println("intVar = " + intVar);
        System.out.println("bits tipo integer: " + Integer.SIZE);
        System.out.println("bytes tipo integer: " + Integer.BYTES);
        System.out.println("MAX bits tipo integer: " + Integer.MAX_VALUE);
        System.out.println("MIN bits tipo integer: " + Integer.MIN_VALUE);
        
        System.out.println("--------------------*--------------------");
        
        long longVar = 9223372036854775807L; //manejo de literales
        System.out.println("longVar = " + longVar);
        System.out.println("bits tipo long: " + Long.SIZE);
        System.out.println("bytes tipo long: " + Long.BYTES);
        System.out.println("MAX bits tipo long: " + Long.MAX_VALUE);
        System.out.println("MIN bits tipo long: " + Long.MIN_VALUE);
        
        System.out.println("--------------------*--------------------");
        
        var numero = 10;
        System.out.println("numero = " + numero);
        System.out.println("type numero: por default es tipo integer. "
                + "Depende tambien de la literal que se usa" );
        
       

    }

}
