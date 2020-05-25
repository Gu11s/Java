/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gggus
 */
public class ReturnOfObject {

    public static void main(String[] args) {
        Add s = newObjectAdd();
//        s.a = 5;
//        s.b = 10;
        System.out.println("final add: " + s.add());

    }

    private static Add newObjectAdd() {
        Add adding;
        adding = new Add(4, 6);
        return adding;
    }

}

class Add {

    int a;
    int b;

    public Add(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return a + b;
    }
}
