/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gggus
 */
public class OverloadConstructor {
    
    public static void main(String[] args) {
        Person person = new Person("John", 25);
        System.out.println("person = " + person);
        
        Employee employee = new Employee("Karla", 30, 4000);
        System.out.println("empleado1 = " + employee);
    }
    
}
