/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gggus
 */
public class BreakContinue {
    
    public static void main(String[] args) {

//        for (var i = 0; i < 3; i++) {
//            //Imprimimos solo numeros pares
//            if (i % 2 == 0) {
//                System.out.println("i = " + i);
//                break;
//            }
//        }

        for (var i = 0; i < 3; i++) {
            //Imprimimos solo numeros pares
            if (i % 2 != 0) {
                continue;
            }
            System.out.println("i = " + i);
        }

    }
    
}
