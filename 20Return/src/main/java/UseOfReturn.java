/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gggus
 */
public class UseOfReturn {

    public static void main(String[] args) {
        addNumbers(3, 6);
        int result2 = addNumbers2(4, 2);
        System.out.println("result: " + result2);
    }

    private static void addNumbers(int a, int b) {
        System.out.println("result: " + (a + b));
    }

    private static int addNumbers2(int a, int b) {
        int s;
        s = a + b;

        if (a == 0 && b == 0) {
            System.out.println("No values for a and b");
            return 0;
        }
        return s;
    }

}
