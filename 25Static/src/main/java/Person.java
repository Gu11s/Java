
public class Person {
    
    private int idPerson;//se asocia con un objeto (instancia)
    private String name;//se asocia con un objeto (instancia)
    private static int personCounter;//se asocia con la clase
    
    public Person(String name){
        this.idPerson = ++personCounter;
        this.name = name;
    }
    
    public int getIdPerson(){
        return this.idPerson;
    }
    
//    public void setIdPerson(int idPerson){
//        this.idPerson = idPerson;
//    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public static int getPersonCounter(){
        return personCounter;
    }
    
    @Override
    public String toString(){
        return "idPerson: " + idPerson + ", name: " + name + ", personCounter:" + personCounter; 
    }
    
}
