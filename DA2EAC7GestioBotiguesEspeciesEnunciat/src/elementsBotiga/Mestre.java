/*
 * Classe que defineix un mestre especier o una mestra especiera. Es defineixen pel seu nif, nom, sexe 
 * i talla de l'uniforme.
 */
package elementsBotiga;

import java.util.Scanner;


public class Mestre {

    private String nif;
    private String nom;
    private String sexe;
    private String talla;
    
    private final static Scanner DADES = new Scanner(System.in, "ISO-8859-1");

    /*
     TODO CONSTRUCTOR
    
     Paràmetres: valors per tots els atributs de la classe.
    
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.    
     */
    public Mestre(String nif, String nom, String sexe, String talla) {        
        this.nif = nif;
        this.nom = nom;
        this.sexe = sexe;
        this.talla = talla;
    }

    /*
     TODO Mètodes accessors    
     */
    //Setters
    public void setNif(String nif){
        this.nif = nif;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public void setSexe(String sexe){
        this.sexe = sexe;
    }
    
    public void setTalla(String talla){
        this.talla = talla;
    }
    
    //Getters
    public String getNif(){
        return nif;
    }
    
    public String getNom(){
        return nom;
    }
    
    public String getSexe(){
        return sexe;
    }
    
    public String getTalla(){
        return talla;
    }

    /*
    TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari les dades per consola per crear un nou mestre especier o nova 
       mestra especiera. Les dades a demanar són les que necessita el constructor.
     - Abans que l'usuari introdueixi el sexe, heu d'avisar-lo que ha d'introduir una "H" si es
       tracta d'un home o una "D" si es tracta d'una dona.
     - Abans que l'usuari introdueixi la talla de l'uniforme, heu d'avisar-lo que les possibles
       talles a introduir, són "S", "M", "L" o "XL".
     - En aquesta EAC, de moment no controlarem que les dades introduïdes tant en el sexe com
       en la talla siguin les correctes. Suposarem que les dades introduïdes per l'usuari són
       correctes.
     - També heu de tenir en compte que el nom, poden ser frases, per exemple, Francesc Xavier.
     
     Retorn: El nou mestre especier creat o nova mestra especiera creada.
     */
    public static Mestre addMestre() {
        String nif = null;
        String nom = null;
        String sexe = null;
        String talla = null;
        
        System.out.println("\nIntrodueix nif del Mestre/a:");
        nif = DADES.next();
        DADES.nextLine();
        System.out.println("\nIntrodueix nom del Mestre/a:");
        nom = DADES.nextLine();
        System.out.println("\nIntrodueix sexe del Mestre/a:");
        System.out.println("Ha d'introduir una \"H\" si es tracta d'un home " +
                           "o una \"D\" si es tracta d'una dona");
        sexe = DADES.next();
        DADES.nextLine();
        System.out.println("\nIntrodueix talla del Mestre/a:");
        System.out.println("les possibles talles a introduir, són:" +
                           " \"S\", \"M\", \"L\" o \"XL\".");
        talla = DADES.next();
        
        return new Mestre(nif, nom, sexe, talla);
    }
    
    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual i
       modificar els atributs corresponents d'aquest objecte.
     - En el cas de l'atribut sexe, li heu de demanar que ha d'introduir una "H" si es
       tracta d'un home o una "D" si es tracta d'una dona.
     - En el cas de l'atribut talla, l'heu d'avisar que les possibles talles a introduir, 
       són "S", "M", "L" o "XL".
     - En aquesta EAC, de moment no controlarem que les dades introduïdes tant en el sexe com
       en la talla siguin les correctes. Suposarem que les dades introduïdes per l'usuari són
       correctes.
     - També heu de tenir en compte que el nom, poden ser frases, per exemple, Francesc Xavier.
     - Li heu de mostrar a l'usuari els valors dels atributs abans de modificar-los.
     
    Retorn: cap
     */
    public void updateMestre() {
        String nif = null;
        String nom = null;
        String sexe = null;
        String talla = null;
        
        System.out.println("-------");
        System.out.println("Valors:");
        System.out.println("-------");
        showMestre(); //Mostramos valores antes modificación
        
        System.out.println("\nIntrodueix modificacio nif del Mestre/a:");
        nif = DADES.next();
        DADES.nextLine();
        System.out.println("\nIntrodueix modificacio nom del Mestre/a:");
        nom = DADES.nextLine();
        System.out.println("\nIntrodueix modificacio sexe del Mestre/a:");
        System.out.println("Ha d'introduir una \"H\" si es tracta d'un home " +
                           "o una \"D\" si es tracta d'una dona");
        sexe = DADES.next();
        DADES.nextLine();
        System.out.println("\nIntrodueix modificacio talla del Mestre/a:");
        System.out.println("les possibles talles a introduir, són:" +
                           " \"S\", \"M\", \"L\" o \"XL\".");
        talla = DADES.next();
        DADES.nextLine();
        
        setNif(nif);
        setNom(nom);
        setSexe(sexe);
        setTalla(talla);
        
        System.out.println("Els valors s'han modificat correctament.");
    }
    
    public void showMestre() {
        System.out.println("\nLes dades del mestre especier o mestra especiera amb nif " + nif + " són:");
        System.out.println("\nNom: " + nom);
        System.out.println("\nSexe: " + sexe);
        System.out.println("\nTalla: " + talla);
    }
}
