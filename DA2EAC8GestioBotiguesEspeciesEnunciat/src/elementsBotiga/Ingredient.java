package elementsBotiga;

import principal.Component;

/**
 * Clase abstracta que crea Ingredients (especies i herbes).
 * Implementa la interface Component
 * @author Pedro
 */
public abstract class Ingredient implements Component {
    protected String codi;
    protected String nom;
    protected String caracteristiques;
    protected double preu;
    
    /**
     * Constructor de la clase Ingredient.
     * @param codi -> Codi de l'ingredient (String).
     * @param nom -> Nom de l'ingredient (String).
     * @param caracteristiques -> Caracteristiques de l'ingredient (String).
     * @param preu -> Preu de l'ingredient (double).
     */
    public Ingredient(String codi, String nom, String caracteristiques, double preu){
        this.codi = codi;
        this.nom = nom;
        this.caracteristiques = caracteristiques;
        this.preu = preu;
    }
    
    // SETTERS //
    /**
     * Setter para modificar el codi de l'ingredient.
     * @param codi 
     */
    public void setCodi(String codi){
        this.codi = codi;
    }
    
    /**
     * Setter para modificar el nom de l'ingredient.
     * @param nom 
     */
    public void setNom(String nom){
        this.nom = nom;
    }
    
    /**
     * Setter para modificar les caracteristiques de l'ingredient.
     * @param caracteristiques 
     */
    public void setCaracteristiques(String caracteristiques){
        this.caracteristiques = caracteristiques;
    }
    
    /**
     * Setter para modificar el preu de l'ingredient.
     * @param preu 
     */
    public void setPreu(double preu){
        this.preu = preu;
    }
    
    // GETTERS //
    /**
     * Getter que retorna codi de l'ingredient.
     * @return 
     */
    public String getCodi(){
        return codi;
    }
    
    /**
     * Getter que retorna nom de l'ingredient.
     * @return 
     */
    public String getNom(){
        return nom;
    }
    
    /**
     * Getter que retorna caracteristiques de l'ingredient.
     * @return 
     */
    public String getCaracteristiques(){
        return caracteristiques;
    }
    
    /**
     * Getter que retorna preu de l'ingredient.
     * @return 
     */
    public double getPreu(){
        return preu;
    }
    
    /**
     * Mètode per actualizar atributs la clase Ingredient. 
     * Atributs (codi, nom, caracteristiques i preu). 
     */
    public void updateComponent(){
        System.out.println("\nCodi: " + codi);
        System.out.println("\nEntra el nou codi:");
        codi = DADES.next();
        DADES.nextLine(); //Neteja buffer
        System.out.println("\nNom: " + nom);
        System.out.println("\nEntra el nou nom:");
        nom = DADES.nextLine();
        System.out.println("\nCaracterístiques: " + caracteristiques);
        System.out.println("\nEntra les noves característiques:");
        caracteristiques = DADES.nextLine();
        System.out.println("\nPreu: " + preu);
        System.out.println("\nEntra el nou preu:");
        preu = DADES.nextDouble();     
    }
    
    /**
     * Mètode per mostrar els valor dels atributs de l'ingredient.
     * Heretat de l'interfice Component.
     * Atributs (codi, nom, caracteristiques i preu). 
     */
    public void showComponent(){        
        System.out.println("Codi: " + codi);
        System.out.println("Nom: " + nom);
        System.out.println("Característiques: " + caracteristiques);
        System.out.println("Preu: " + preu);
    }    
    
}
