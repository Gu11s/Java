/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gggus
 */
public class PassByValue {

    public static void main(String[] args) {
        var x = 10;
        System.out.println("x = " + x);

        changeValue(x);

        System.out.println("x = " + x);
    }

    private static void changeValue(int arg) {
        arg = 20;
        System.out.println("arg = " + arg);
    }

}
