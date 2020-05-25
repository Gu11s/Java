
public class StaticExample {
    
    public static void main(String[] args) {
        Person person1 = new Person("Juan");
        System.out.println(person1);
        
        Person person2 = new Person("Karla");
        System.out.println(person2);
        
        Person person3 = new Person("Carlos");
        System.out.println(person3);
        
        System.out.println("contadorPersonas:" + Person.getPersonCounter());
    }
    
}
