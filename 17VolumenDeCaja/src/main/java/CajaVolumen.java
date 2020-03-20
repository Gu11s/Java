/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gggus
 */
public class CajaVolumen {

    int ancho;
    int alto;
    int largo;

    public CajaVolumen() {

    }

    public CajaVolumen(int ancho, int alto, int largo) {

        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;

    }

    public int volumen() {
        int volumen = ancho * alto * largo;
        return volumen;
    }

}
