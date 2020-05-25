/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gggus
 */
public class Person {
    
    private int idPerson;
    private String name;
    private int age;
    private static int personCounter;
    
    private Person(){
        //super(); se manda a llamar de manera automática
        this.idPerson = ++personCounter;
    }
    
    //Copnstructor completo - sobrecarga
    public Person(String nombre, int edad){
        this();
        this.name = nombre;
        this.age = edad;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getPersonCounter() {
        return personCounter;
    }

    @Override
    public String toString() {
        return "Person{" + "idPerson=" + idPerson + ", name=" + name + ", age=" + age + '}';
    }

    
    
}
