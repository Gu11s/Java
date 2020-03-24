
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
public class TriangularNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int number = Integer.parseInt(scanner.nextLine());

        int x = 1;
        int triangularNumber = 1;

        while (triangularNumber < number) {
            x++;
            triangularNumber = triangularNumber + x;
        }

        if (triangularNumber == number) {
            System.out.println("It is a triangular number");
        } else {
            System.out.println("It is not a triangular number");
        }
        
        for (int i = 0; i<4;i++){
            System.out.println(i);
        }
    }

}
