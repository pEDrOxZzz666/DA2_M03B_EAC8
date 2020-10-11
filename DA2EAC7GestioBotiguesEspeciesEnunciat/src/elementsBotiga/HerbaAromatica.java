/*
 * Classe que defineix una herba aromàtica. Es defineixen pel seu codi, nom, característiques 
 * i preu.
 */
package elementsBotiga;
import java.util.Scanner;

public class HerbaAromatica {
    
    private String codi;
    private String nom;
    private String caracteristiques;
    private double preu;
    
    private final static Scanner DADES = new Scanner(System.in, "ISO-8859-1");

    /*
     TODO CONSTRUCTOR
    
     Paràmetres: valors per tots els atributs de la classe.
    
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.    
     */
    public HerbaAromatica(String codi, String nom, String caracteristiques, double preu) {
        this.codi = codi;
        this.nom = nom;
        this.caracteristiques = caracteristiques;
        this.preu = preu;
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
    
    //Getters
    public String getCodi(){
        return codi;
    }
    
    public String getNom(){
        return nom;
    }
    
    public String getCaracteristiques(){
        return caracteristiques;
    }
    
    public double getPreu(){
        return preu;
    }
    
    /*
    TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari les dades per consola per crear una nova herba aromàtica. 
       Les dades a demanar són les que necessita el constructor.
     - També heu de tenir en compte que tant el nom com les característiques, poden ser frases, 
       per exemple, Fonoll Dolç.
    
     Nota important: no controlem que l'usuari introdueixi una opció de tipus numèric, ja que això ho farem amb la
     tècnica de les excepcions que veurem més endavant. Així doncs suposarem que sempre introdueix
     un número.
     
     Retorn: La nova herba aromàtica creada.
     */
    public static HerbaAromatica addHerbaAromatica(){        
        String codi = null;
        String nom = null;
        String caracteristiques = null;
        double preu = 0;
        
        System.out.println("\nIntrodueix codi Herba Aromatica:");
        codi = DADES.next();
        DADES.nextLine();
        System.out.println("\nIntrodueix nom Herba Aromatica:");
        nom = DADES.nextLine();
        System.out.println("\nIntrodueix caracteristiques Herba Aromatica:");
        caracteristiques = DADES.nextLine();
        System.out.println("\nIntrodueix preu Herba Aromatica:");
        preu = DADES.nextDouble();
        DADES.nextLine();
        
        return new HerbaAromatica(codi, nom, caracteristiques, preu);
    }
    
    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual i
       modificar els atributs corresponents d'aquest objecte.
     - També heu de tenir en compte que tant el nom com les característiques, poden ser frases, 
       per exemple, Fonoll Dolç.
     - Li heu de mostrar a l'usuari els valors dels atributs abans de modificar-los.
     
     Nota important: no controlem que l'usuari introdueixi una opció de tipus numèric, ja que això ho farem amb la
     tècnica de les excepcions que veurem més endavant. Així doncs suposarem que sempre introdueix
     un número.
    
    Retorn: cap
     */
    public void updateHerbaAromatica() {
        String codi = null;
        String nom = null;
        String caracteristiques = null;
        double preu = 0;
        
        System.out.println("El valors de l'herba a modificar son:");
        showHerbaAromatica();
        
        System.out.println("\nIntrodueix codi Herba Aromatica:");
        codi = DADES.next();
        DADES.nextLine();
        System.out.println("\nIntrodueix nom Herba Aromatica:");
        nom = DADES.nextLine();
        System.out.println("\nIntrodueix caracteristiques Herba Aromatica:");
        caracteristiques = DADES.nextLine();
        System.out.println("\nIntrodueix preu Herba Aromatica:");
        preu = DADES.nextDouble();
        DADES.nextLine();
        
        setCodi(codi);
        setNom(nom);
        setCaracteristiques(caracteristiques);
        setPreu(preu);
    }
    
    public void showHerbaAromatica() {
        System.out.println("\nLes dades de l'herba aromàtica amb codi " + codi + " són:");
        System.out.println("\nNom: " + nom);
        System.out.println("\nCracterístiques: " + caracteristiques);
        System.out.println("\nPreu: " + preu);
    }
    
}
