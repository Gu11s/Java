
public class Employee extends Person {

    private double salary;
    private int id;
    private static int employeeCounter;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
        this.id = ++employeeCounter;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getEmployeeCounter() {
        return employeeCounter;
    }

    @Override
    public String toString() {
        return super.toString() + "Employee{" + " id= " + id + ", salary= " + salary + '}';
    }

}
