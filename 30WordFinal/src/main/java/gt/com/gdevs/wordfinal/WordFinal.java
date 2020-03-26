
package gt.com.gdevs.wordfinal;

public class WordFinal {
    
    public static void main(String[] args) {
        //Is not possible to modify a final attribute
        //ClassFinal.VAR_PRIMITIVE = 20;
        
        //Modify reference of an Object type attribute
        //ClaseFinal.VAR_PERSON = new Person();
        
        ClassFinal.VAR_PERSONA.setName("John");
        System.out.println(ClassFinal.VAR_PERSONA.getName());
        
        ClassFinal.VAR_PERSONA.setName("Charls");
        System.out.println(ClassFinal.VAR_PERSONA.getName());
        
    }
    
}
