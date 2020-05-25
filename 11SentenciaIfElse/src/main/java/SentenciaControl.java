/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gggus
 */
public class SentenciaControl {

    public static void main(String args[]) {
        var condicion = false;

        if (condicion) {
            System.out.println("condicion verdadera");
        } else {
            System.out.println("condicion falsa");
        }

        var numero = 2;
        var numeroTexto = "numero desconocido";

        if (numero == 1) {
            numeroTexto = "numero uno";
        } else if (numero == 2) {
            numeroTexto = "numero dos";
        } else if (numero == 3) {
            numeroTexto = "numero tres";
        } else {
            numeroTexto = "valor desconocido";
        }
        System.out.println("numeroTexto = " + numeroTexto);
        
        
    }

}
