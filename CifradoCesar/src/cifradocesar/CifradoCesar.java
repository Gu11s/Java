
package cifradocesar;
/**
 *
 * @author gggus
 */
public class CifradoCesar {

    public static void main(String[] args) {
       String lMayus = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
       String lMinus = "abcdefghijklmnñopqrstuvwxyz";
       
       Cifrado obj = new Cifrado(lMayus, lMinus);
       
       System.out.println(obj.cifrar("¿hola NIÑOS, cómo estan? 123", 3));
       System.out.println(obj.desCifrar("¿krñd plqrv, fóor hvwdp? 123", 3));
    } 
}
