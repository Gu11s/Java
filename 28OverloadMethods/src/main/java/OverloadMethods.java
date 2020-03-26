
public class OverloadMethods {
    
     public static void main(String[] args) {
        System.out.println("Result 1: " + Operations.add(3, 4));
        
        System.out.println("Result 2: " + Operations.add(2.0, 4));
        
        System.out.println("Result 3: " + Operations.add(3, 5L));
        
        System.out.println("Result 4: " + Operations.add(3F, 'A'));
        
    }
    
}
