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

    private String name;
    private double salary;
    private boolean deleted;

    public Person(String name, double salary, boolean deleted) {
        this.name = name;
        this.salary = salary;
        this.deleted = deleted;
    }

    public Person() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    //    public String toString(){
//        return "name: " + name + ", salary: " + salary + ", deleted:" + deleted;
//    }
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", salary=" + salary + ", deleted=" + deleted + '}';
    }

}
