
public class Operations {
    
   //Method add
    public static int add(int a, int b){
        System.out.println("method add(int, int)");
        return a + b;
    }
    
    //Overload method add
    public static double add(double a, double b){
        System.out.println("method add(double, double)");
        return a + b;
    }
    
    public static double add(int a, double b){
        System.out.println("method add(int, double)");
        return a + b;
    }
    
    public static double add(double a, int b){
        System.out.println("method add(double, int)");
        return a + b;
    }
    
}
