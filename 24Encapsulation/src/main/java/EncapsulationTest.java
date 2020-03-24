
public class EncapsulationTest {

    public static void main(String[] args) {
        Person person = new Person("John", 5000, false);

//        System.out.println("name: " + person.getName());
//        System.out.println("salary: " + person.getSalary());
//        System.out.println("is deleted?: " + person.isDeleted());
//        System.out.println("Person: " + person.toString());
        System.out.println("Person: " + person);

        Person person2 = new Person();
        person2.setName("Charls");
        person2.setSalary(3000);
        person2.setDeleted(true);

//        System.out.println("name 2: " + person2.getName());
//        System.out.println("salary 2: " + person2.getSalary());
//        System.out.println("is deleted? 2: " + person2.isDeleted());
//        System.out.println("Person: " + person2.toString());
        System.out.println("Person2 : " + person2);

    }

}
