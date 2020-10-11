/*
 * Classe que defineix una especia. Es defineixen pel seu codi, nom, característiques 
 * preu i grau de picantor.
 */
package elementsBotiga;
import java.util.Scanner;

/**
 *
 * @author fta
 */
public class Especia {
    
    private String codi;
    private String nom;
    private String caracteristiques;
    private double preu;
    private String picantor;
    
    private final static Scanner DADES = new Scanner(System.in, "ISO-8859-1");

    /*
     TODO CONSTRUCTOR
    
     Paràmetres: valors per tots els atributs de la classe.
    
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.    
     */
    public Especia(String codi, String nom, String caracteristiques, double preu,String picantor) {
        this.codi = codi;
        this.nom = nom;
        this.caracteristiques = caracteristiques;
        this.preu = preu;
        this.picantor = picantor;
    }

    /*
     TODO Mètodes accessors    
     */
    
    //Setters
    public void setCodi(String codi){
        this.codi = codi;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public void setCaracteristiques(String caracteristiques){
        this.caracteristiques = caracteristiques;
    }
    
    public void setPreu(double preu){
        this.preu = preu;
    }
    
    public void setPicantor(String picantor){
        this.picantor = picantor;
    }
    
    //getters
    public String getCodi(){
        return codi;
    }
    
    public String getNom(){
        return nom;
    }
    
    public String getCaracteristiques(){
        return caracteristiques;
    }
    
    public double gePreu(){
        return preu;
    }   
    
    public String gePicantor(){
        return picantor;
    }   
    /*
    TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari les dades per consola per crear una nova espècia. 
       Les dades a demanar són les que necessita el constructor.
     - Abans que l'usuari introdueixi el grau de picantor, heu d'avisar-lo que els possibles
       graus a introduir, són "0", "1", "2", "3", "4" o "5", on "0" és no picant i "5" el màxim.
     - En aquesta EAC, de moment no controlarem que les dades introduïdes en la picantor
       siguin les correctes. Suposarem que les dades introduïdes per l'usuari són correctes.
     - També heu de tenir en compte que tant el nom com les característiques, poden ser frases, 
       per exemple, Pebrer de Jamaica.
     
     Retorn: La nova herba aromàtica creada.
    
     Nota important: no controlem que l'usuari introdueixi una opció de tipus numèric, ja que això ho farem amb la
     tècnica de les excepcions que veurem més endavant. Així doncs suposarem que sempre introdueix
     un número.
     */
    public static Especia addEspecia(){       
        String codi = null;
        String nom = null;
        String caracteristiques = null;
        double preu = 0;
        String picantor = null;
        
        System.out.println("\nIntrodueix codi: ");
        codi = DADES.next(); 
        DADES.nextLine(); 
        System.out.println("\nIntrodueix nom: ");
        nom = DADES.nextLine();                
        System.out.println("\nIntrodueix caracteristiques: ");
        caracteristiques = DADES.nextLine();                
        System.out.println("\nIntrodueix preu: ");
        preu = DADES.nextDouble();
        DADES.nextLine(); 
        System.out.println("Introdueix picantor: ");
        System.out.println("\nels possibles graus a introduir, són: " + 
                           "\"0\", \"1\", \"2\", \"3\", \"4\" o \"5\", " +
                           "on \"0\" és no picant i \"5\" el màxim.");
        picantor = DADES.next(); 
        DADES.nextLine(); 
        
        return new Especia(codi, nom, caracteristiques, preu, picantor);
    }
    
    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual i
       modificar els atributs corresponents d'aquest objecte.
     - Abans que l'usuari introdueixi el grau de picantor, heu d'avisar-lo que els possibles
       graus a introduir, són "0", "1", "2", "3", "4" o "5", on "0" és no picant i "5" el màxim.
     - En aquesta EAC, de moment no controlarem que les dades introduïdes en la picantor
       siguin les correctes. Suposarem que les dades introduïdes per l'usuari són correctes.
     - També heu de tenir en compte que tant el nom com les característiques, poden ser frases, 
       per exemple, Pebre de Jamaica.
     - Li heu de mostrar a l'usuari els valors dels atributs abans de modificar-los.
    
     Nota important: no controlem que l'usuari introdueixi una opció de tipus numèric, ja que això ho farem amb la
     tècnica de les excepcions que veurem més endavant. Així doncs suposarem que sempre introdueix
     un número.
     
    Retorn: cap
     */
    public void updateEspecia() {
        String codi = null;
        String nom = null;
        String caracteristiques = null;
        double preu = 0;
        String picantor = null;
        
        System.out.println("-------");
        System.out.println("Valors:");
        System.out.println("-------");
        showEspecia(); //Mostramos valores antes modificación
        
        System.out.println("\nIntrodueix codi: ");
        codi = DADES.next();
        DADES.nextLine();        
        System.out.println("\nIntrodueix nom: ");
        nom = DADES.nextLine();         
        System.out.println("\nIntrodueix caracteristiques: ");
        caracteristiques = DADES.nextLine();                
        System.out.print("\nIntrodueix preu: ");        
        preu = DADES.nextDouble();
        DADES.nextLine();                
        System.out.println("Introdueix picantor: ");
        System.out.print("\nels possibles graus a introduir, són: " + 
                         "\"0\", \"1\", \"2\", \"3\", \"4\" o \"5\", " +
                         "on \"0\" és no picant i \"5\" el màxim.");
        picantor = DADES.next();
        DADES.nextLine();        
        
        setCodi(codi);
        setNom(nom);
        setCaracteristiques(caracteristiques);
        setPreu(preu);
        setPicantor(picantor);
        
        System.out.println("Els valors s'han modificat correctament.");
    }
    
    public void showEspecia() {
        System.out.println("\nLes dades de l'espècia amb codi " + codi + " són:");
        System.out.println("\nNom: " + nom);
        System.out.println("\nCracterístiques: " + caracteristiques);
        System.out.println("\nPreu: " + preu);
        System.out.println("\nPicantor: " + picantor);
    }
}
