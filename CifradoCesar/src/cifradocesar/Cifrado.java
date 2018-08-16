
package cifradocesar;
/**
 *
 * @author gggus
 */
public class Cifrado {
    private String lMayus;
    private String lMinus;
    
    public Cifrado(String lMayus, String lMinus){
        this.lMayus = lMayus;
        this.lMinus = lMinus;
    }
    
    public String cifrar(String texto, int desplazamiento){
        String salida = "";
        
        for (int i = 0; i < texto.length(); i++){
            if((this.lMayus.indexOf(texto.charAt(i))!= -1) || (this.lMinus.indexOf(texto.charAt(i))!= -1 )){
                salida += (this.lMayus.indexOf(texto.charAt(i)) != -1) ? 
                        this.lMayus.charAt(((this.lMayus.indexOf(texto.charAt(i))) +  desplazamiento) % this.lMayus.length()):
                        this.lMinus.charAt(((this.lMinus.indexOf(texto.charAt(i))) +  desplazamiento) % this.lMinus.length());
            }else{
                salida += texto.charAt(i); //para números o espacio
            }
        }
        return salida;
    }
    
    public String desCifrar(String texto, int desplazamiento){
        String salida = "";
        
        for (int i = 0; i < texto.length(); i++){
            if((this.lMayus.indexOf(texto.charAt(i))!= -1) || (this.lMinus.indexOf(texto.charAt(i))!= -1 )){
                if((this.lMayus.indexOf(texto.charAt(i))!= -1)){
                    if((this.lMayus.indexOf(texto.charAt(i)) - desplazamiento) < 0){
                        salida += this.lMayus.charAt((this.lMayus.length()) + 
                                ((this.lMayus.indexOf(texto.charAt(i)))-desplazamiento));
                    }else{
                        salida += this.lMayus.charAt(((this.lMayus.indexOf(texto.charAt(i)))-desplazamiento) % 
                                (this.lMayus.length()));
                    }
                }else{
                    if(this.lMinus.indexOf(texto.charAt(i)) - desplazamiento < 0){
                        salida += this.lMinus.charAt((this.lMinus.length()) + (
                                (this.lMinus.indexOf(texto.charAt(i)))-desplazamiento));
                    }else{
                        salida += this.lMinus.charAt(((this.lMinus.indexOf(texto.charAt(i)))-desplazamiento) % 
                                (this.lMinus.length()));
                    }
                }
            }else{
                salida += texto.charAt(i);
            }
        }
        return salida;
    }
}
