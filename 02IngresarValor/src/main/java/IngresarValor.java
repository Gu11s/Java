
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
public class IngresarValor {

    public static void main(String args[]) {
        /*
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese valor de usuario: ");
        var usuario = scanner.nextLine();
        
        System.out.println("Usuario = " + usuario);
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Proporciona el titulo: ");
        var titulo = scanner.nextLine();
        System.out.println("Porporciona el autor: ");
        var autor = scanner.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    }

}
