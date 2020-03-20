
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
public class Conversion {

    public static void main(String args[]) {

        var edad = Integer.parseInt("20");
        System.out.println("edad = " + edad);

        double valorPI = Double.parseDouble("3.141592");
        System.out.println("valorPI = " + valorPI);

        char c = "hola".charAt(0);
        System.out.println("c char at position = " + c);

        //var scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad deseada: ");
        int edadIngresada = Integer.parseInt(scanner.nextLine());
        System.out.println("Edad ingresada: " + edadIngresada);

        char edadCaracter = scanner.nextLine().charAt(0);
        System.out.println("edadCaracter: " + edadCaracter);

        String edadTexto = String.valueOf(25);
        System.out.println("edadTexto = " + edadTexto);

        short s = 129;
        byte b = (byte) s;
        System.out.println("b = " + b);

        System.out.println("---------------*********--------------");
        System.out.println("Tienda de libros");
        System.out.println("Proporciona el nombre: ");
        String nombreLibro = scanner.nextLine();
        System.out.println("Proporciona el id: ");
        int idLibro = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el precio: ");
        double precioLibro = Double.parseDouble(scanner.nextLine());
        System.out.println("Proporciona el simbolo: ");
        char simboloLibro = scanner.nextLine().charAt(0);
        System.out.println("Proporciona el envio gratuito: ");
        boolean envioLibro = Boolean.parseBoolean(scanner.nextLine());

        System.out.println(nombreLibro + " #" + idLibro);
        System.out.println("Precio: " + simboloLibro + precioLibro);
        System.out.println("Envio gratuito: " + envioLibro);

    }

}
