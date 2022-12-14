
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Samuel Loureiro Cardoso
 */
public class AceptaElReto {
    

    public static void main(String[] args) {
        //Descomentar para entregar
        //Scanner sc = getScanner();
        //Comentar para entregar
        Scanner sc = getScanner("entrada.in");
        //Este bucle hay que modificarlo en función del formato de la entrada.
        do{
            String cp = sc.nextLine();
            System.out.println(resolverCasoPrueba(cp));
            
        }while(sc.hasNext());

    }
    /** * 
     * Establece la entrada al fichero indicado. Este método permite leer línea a línea un fichero en lugar de tener que leer porconsola.
     * @param rutaFichero Path de la ubicació  del fichero en el sistema.

     */
    public static Scanner getScanner(String rutaFichero){
        Scanner sc = null;
        try{
           File text = new File(rutaFichero);
           sc = new Scanner(text);
        }catch(FileNotFoundException e){
            System.err.println(e);
        }
        return sc;        
    }
    
    /**
     * Establece la entrada estándar.
     * Este es el método que se debe utilizar para entregar los problemas.
     * @return Un objeto Scanner asociado al terminal del sistema.
     */
    public static Scanner getScanner(){
        return new Scanner(System.in);        
    }

    
    public static  String resolverCasoPrueba(String cp){
        //TODO AQUI RESOLVEMOS EL PROBLEMA
        String salida = null;
        return salida;
    }
}
