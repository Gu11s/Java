/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gggus
 */
public class Volumen {

    public static void main(String args[]) {
        int alto = 5;
        int ancho = 5;
        int largo = 5;

//        CajaVolumen volumenCaja = new CajaVolumen();
        CajaVolumen volumenCaja = new CajaVolumen(alto,ancho, largo);

//        volumenCaja.alto = 3;
//        volumenCaja.ancho = 2;
//        volumenCaja.largo = 6;

        int volumen = volumenCaja.volumen();

        System.out.println("el volumen de la caja es: " + volumen);
    }

}
