/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gggus
 */
public class PassByReference {
    
    public static void main(String[] args) {
        Person person = new Person();
        
        person.changeName("John");
        
        System.out.println("Name: " + person.catchName());
        
        modifyPerson(person);
        
        System.out.println("Modify name: " + person.catchName());
    }

    private static void modifyPerson(Person personArg) {
        personArg.changeName("Peter");
    }
    
}
