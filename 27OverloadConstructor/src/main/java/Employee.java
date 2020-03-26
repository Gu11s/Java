/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gggus
 */
public class Employee extends Person{
    private double salary;
    
    public Employee(String name, int age) {
        super(name, age);
    }
    
    //constructor sobrecargado
    public Employee(String name, int age, double salary){
        this(name, age);
        //super(nombre, edad);
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +  " Employee{" + "salary= " + salary + '}';
    }
    
}
