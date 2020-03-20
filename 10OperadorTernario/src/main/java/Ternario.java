
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gggus
 */
public class Ternario {

    public static void main(String args[]) {
        int numero = 10;

        var resultado = (numero % 2 == 0) ? "Es numero par" : "Es numero impar";
        System.out.println("resultado = " + resultado);

        var par = (numero % 2 == 0) ? true : false;
        if (par) {
            System.out.println("numero par");
        } else {
            System.out.println("numero impar");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero mayor");
        System.out.println("Proporciona el numero1: ");
        int primerNumero = Integer.parseInt(scanner.nextLine());
        System.out.println("Porporciona el numero2: ");
        int segundoNumero = Integer.parseInt(scanner.nextLine());

        var resultados = (primerNumero > segundoNumero) ? "Primer numero es mayor" : "Segundo numero es mayor";
        System.out.println("Resultado: " + resultados);
    }

}
