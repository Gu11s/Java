/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gggus
 */
public class Labels {
    
    public static void main(String[] args) {

//        for (var i = 0; i < 3; i++) {
//            //Imprimimos solo numeros pares
//            if (i % 2 == 0) {
//                System.out.println("i = " + i);
//                break;
//            }
//        }
        
        inicio:
        for (var i = 0; i < 3; i++) {
            //Imprimimos solo numeros pares
            if (i % 2 != 0) {
                //break inicio;
                continue inicio;
                
            }
            System.out.println("i = " + i);
        }

    }
    
}
