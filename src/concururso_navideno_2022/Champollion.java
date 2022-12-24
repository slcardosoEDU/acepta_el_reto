package concururso_navideno_2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Samuel
 */
public class Champollion {
      public static void main(String[] args) {
        //Descomentar para entregar
        Scanner sc = getScanner();
        //Comentar para entregar
        //Scanner sc = getScanner("entrada.in");
        int n = Integer.parseInt(sc.nextLine());
        while(n!=0){
            String cp = sc.nextLine();
            System.out.println(resolverCasoPrueba(cp));
            n--;
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

    //Utilizar el set como atributo es más eficiente que concatenar etructuras.
    public static Set<String> silabas;
    public static  String resolverCasoPrueba(String cp){
        silabas = new HashSet<String>();
        String[] palabras = cp.split(" ");
        for (String s : palabras){        
            contarSilabas(s.toUpperCase());
        }
        return silabas.size()+"";
    }
    
    public static void contarSilabas(String palabra){
        
        String silaba = "";
        
        for(int i=0;i<palabra.length();i++){
            char letra = palabra.charAt(i);
            //Siempre acumulamos la letra salvo que la siguiente letra sea una vocal.
            if(silaba.length()>0 && i+1 < palabra.length() && esVocal(palabra.charAt(i+1))){
                silabas.add(silaba);
                silaba = letra+"";
                continue;
            }
            silaba+=letra;            
        }
        silabas.add(silaba);
       
    }
    
    public static boolean esVocal(char letra){
        return letra == 'A' || letra == 'E' ||letra == 'I' ||letra == 'O' ||letra == 'U';
    }
}