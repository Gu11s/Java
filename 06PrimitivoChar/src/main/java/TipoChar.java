/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gggus
 */
public class TipoChar {
    
    public static void main(String args[]){
        
        
        System.out.println("bits char: " + Character.SIZE);
        System.out.println("bytes char: " + Character.BYTES);
        System.out.println("MIN char: " + Character.MIN_VALUE);
        System.out.println("MAX char: " + Character.MAX_VALUE);
        
        char varChar = 'a'; //comilla simple porque no es cadena == UNICODE CHARACTER
        System.out.println("varChar: " + varChar);
        
        char varCharUnicode = '\u0021'; //var varCharUnicode = '\u0021';
        System.out.println("varChar2: " + varCharUnicode);
        
        char varCharDecimal = 33; 
        System.out.println("varChar2: " + varCharDecimal);
        
        char varCharSimbolo = '!'; //var varCharSimbolo = '!';
        System.out.println("varCharSimbolo: " + varCharSimbolo);
    }
    
}
