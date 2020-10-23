package elementsBotiga;

import principal.Component;

/**
 * Classe que defineix un mestre especier o una mestra especiera. Es defineixen 
 * pel seu nif, nom, sexe i talla de l'uniforme. * 
 * @author fta
 */
public class Mestre implements Component {    

    private String nif;
    private String nom;
    private String sexe;
    private String talla;

    /**
     * Constructor de la clase Mestre
     * @param nif -> Atribut nif de la classe Mestre.
     * @param nom -> Atribut nom de la classe Mestre.
     * @param sexe -> Atribut sexe de la classe Mestre.
     * @param talla -> Atribut talla de la classe Mestre.
     */
    public Mestre(String nif, String nom, String sexe, String talla) {
        this.nif = nif;
        this.nom = nom;
        this.sexe = sexe;
        this.talla = talla;
    }

    /**
     * Getter que retorna el nif del Mestre.
     * @return 
     */
    public String getNif() {
        return nif;
    }
    
    /**
     * Setter per modificar el nif del Mestre.
     * @param nif 
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * Getter que retorna el nom del Mestre.
     * @return 
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter per modificar el nom del Mestre.
     * @param nom 
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter que retorna el sexe del Mestre.
     * @return 
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * Setter pero modificar el sexe del Mestre
     * @param sexe 
     */
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    /**
     * Getter que retorna la talla del Mestre.
     * @return 
     */
    public String getTalla() {
        return talla;
    }

    /**
     * Setter per modificar la talla del Mestre.
     * @param talla 
     */
    public void setTalla(String talla) {
        this.talla = talla;
    }

    /**
     * Mètodo per crear objectes de tipus Mestre.
     * @return -> Retorna un objecte Mestre.
     */
    public static Mestre addMestre() {

        String nif, nom, sexe, talla;

        System.out.println("\nNIF del mestre especier o mestra especiera:");
        nif = DADES.next();
        DADES.nextLine(); //Neteja buffer
        System.out.println("\nNom del mestre especier o mestra especiera:");
        nom = DADES.nextLine();
        System.out.println("\nSexe del mestre especier o mestra especiera (H per home o D per dona):");
        sexe = DADES.next();        
        System.out.println("\nTalla del mestre especier o mestra especiera (S, M, L o XL):");
        talla = DADES.next();
        DADES.nextLine();//Neteja buffer

        return new Mestre(nif, nom, sexe, talla);
    }    
    
    /**
     * Mètode per modificar els atributs de la clase Mestre.
     * Mètodo heretat de l'interfice Component.
     */
    public void updateComponent(){
        System.out.println("\nNIF del mestre especier o mestra especiera: " + nif);
        System.out.println("\nEntra el nou nif:");
        nif = DADES.next();
        DADES.nextLine(); //Neteja buffer
        System.out.println("\nNom del mestre especier o mestra especiera: " + nom);
        System.out.println("\nEntra el nou nom:");
        nom = DADES.nextLine();
        System.out.println("\nSexe del mestre especier o mestra especiera: " + sexe);
        System.out.println("\nEntra el nou sexe (H per home o D per dona):");
        sexe = DADES.next();
        System.out.println("\nTalla del mestre especier o mestra especiera (S, M, L o XL): " + talla);
        System.out.println("\nEntra la nova talla:");
        talla = DADES.next();
        DADES.nextLine();//Neteja buffer
    }
    
    /**
     * Mètodo per mostrar valors dels atributs de la clase Mestre.
     * Mètodo heretat de l'interfice Component.
     */
    public void showComponent(){
        System.out.println("\nLes dades del mestre especier o mestra especiera amb nif " + nif + " són:");
        System.out.println("Nom: " + nom);
        System.out.println("Sexe: " + sexe);
        System.out.println("Talla: " + talla);
    }
}
