/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gggus
 */
public class FloatDouble {
    
    public static void main (String args[]){
        
        float floatVar = 1000.10F; //var floatVar = 1000.10F;
        System.out.println("floatVar = " + floatVar);
        System.out.println("bits float: " + Float.SIZE);
        System.out.println("bytes float: " + Float.BYTES);
        System.out.println("MIN float: " + Float.MIN_VALUE);
        System.out.println("MAX float: " + Float.MAX_VALUE);
        
        System.out.println("-----------------DOUBLE----------------");
        
        double doubleVar = 1000.10d;
        System.out.println("doubleVar = " + doubleVar);
        System.out.println("bits double: " + Double.SIZE);
        System.out.println("bytes double: " + Double.BYTES);
        System.out.println("MIN double: " + Double.MIN_VALUE);
        System.out.println("MAX double: " + Double.MAX_VALUE);
    }
    
}
