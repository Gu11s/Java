
import java.util.Date;

public class InheritanceExample {

    public static void main(String[] args) {

        Employee employee = new Employee("John", 5000);
        employee.setAge(28);
        employee.setGender('M');
        employee.setAddress("Lomas #13");
        System.out.println(employee);

        Employee newEmployee = employee;
        newEmployee.setName("Peter");
        newEmployee.setSalary(200);

        System.out.println(newEmployee);

        Client client = new Client(new Date(), true);
        client.setName("Karla");
        System.out.println(client);

        Client newClient = new Client(new Date(), false);
        newClient.setName("Paul");
        newClient.setGender('M');
        newClient.setAddress("New York");
        System.out.println(newClient);

    }

}
