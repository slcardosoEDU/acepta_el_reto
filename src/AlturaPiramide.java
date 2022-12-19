import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Samuel Loureiro Cardoso
 */
public class AlturaPiramide {
    

    public static void main(String[] args) {
        //Descomentar para entregar
        //Scanner sc = getScanner();
        //Comentar para entregar
        Scanner sc = getScanner("entrada.in");
        //Este bucle hay que modificarlo en función del formato de la entrada.
        String cp;
        while(!(cp = sc.nextLine()).equals("0")){
            System.out.println(resolverCasoPrueba(cp));
        }
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
        int bloques = Integer.parseInt(cp);
        int altura = 1;
        int totales = 1;
        //La altura mínima es con toda la pirámide hueca. Si tenemos un solo ladrillo más hay que crear pasar a la siguiente altura.
        //Se cumple que cada altura se agrega un numero de bloques = (altura*2-1)^2
        while((totales+=Math.pow((altura*2)-1, 2))<=bloques){
            altura++;
        }
        return altura+"";
    }
}
