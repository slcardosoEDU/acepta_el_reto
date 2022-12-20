import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Samuel Loureiro Cardoso
 */
public class Cleopatra {
    

    public static void main(String[] args) {
        //Descomentar para entregar
        Scanner sc = getScanner();
        //Comentar para entregar
        //Scanner sc = getScanner("entrada.in");
        //Me salto el numero de casos de prueba
        int n = Integer.parseInt(sc.nextLine());
        while(n!=0){
            String cp = sc.nextLine();
            System.out.println(resolverCasoPrueba(cp));
            n--;
        }
//        do{
//            String cp = sc.nextLine();
//            System.out.println(resolverCasoPrueba(cp));
//            
//        }while(sc.hasNext());
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
        String salida = "EMPATE";
        String[] params = cp.split(" ");
        int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt(params[1]);
        int c = Integer.parseInt(params[2]);
        //Calculamos la diferencia entre ambos.
        int difA = b-a;
        int difC = c-b;
        
        //Si el cero está por el medio, como no se cuenta hay que restarlo.
        if(a<0 && b>0){
            difA --;
        }
        
        
        if(b<0 && c>0){
            difC --;
        }
        
        //Calculamos la salida
        if(difA < difC){
            salida = a+"";
        }
        if(difA > difC){
            salida = c+"";
        }
        
        
        return salida;
    }
}
