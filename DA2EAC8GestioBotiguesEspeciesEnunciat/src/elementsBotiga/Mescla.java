package elementsBotiga;

import principal.Component;

/**
 * Classe que defineix una mescla d'espècies i/o herbes aromàtiques. Es defineixen pel seu codi, nom, mestre especier o 
 * mestra especiera que ha creat la mescla, preu, un vector amb les espècies que porta la mescla, un vector amb les
 * les quantitats de cadascuna de les espècies que porta la mescla, un vector amb les herbes aromàtiques
 * que porta la mescla i un vector amb les quantitats de cadascuna de les herbes aromàtiques que porta 
 * la mescla.
 * Implementa l'interfice Component.
 * @author fta
 */
public class Mescla implements Component {    

    private String codi;
    private String nom;
    private Mestre mestre;
    private double preu;
    private Ingredient[] ingredients = new Ingredient[100];
    private int posicioIngredients = 0;  
    private double[] quantitatIngredients = new double[100];
    private int posicioQuantitatIngredients = 0; 
    
    /**
     * Constructor clase Mescla.
     * @param codi -> Atribut codi clase Mescla (String).
     * @param nom -> Atribut nom clase Mescla (String).
     * @param preu -> Atribut pre clase Mescla (double). 
     */
    public Mescla(String codi, String nom, Double preu) {
        this.codi = codi;
        this.nom = nom;
        this.mestre = null;
        this.preu = preu;
    }

    /**
     * Getter que retorna codi de Mescla.
     * @return 
     */
    public String getCodi() {
        return codi;
    }

    /**
     * Setter per modificar codi de Mescla.
     * @param codi 
     */
    public void setCodi(String codi) {
        this.codi = codi;
    }

    /**
     * Getter que retorna nom Mescla.
     * @return 
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter per modificar nom Mescla.
     * @param nom 
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter que retorna objecte de tipus Mestre.
     * @return 
     */
    public Mestre getMestre() {
        return mestre;
    }

    /**
     * Setter pero modificar objecte de tipus Mestre.
     * @param mestre 
     */
    public void setMestre(Mestre mestre) {
        this.mestre = mestre;
    }

    /**
     * Getter que retorna preu de la Mescla.
     * @return 
     */
    public Double getPreu() {
        return preu;
    }

    /**
     * Setter per modificar preu de la Mescla.
     * @param preu 
     */
    public void setPreu(Double preu) {
        this.preu = preu;
    }

    /**
     * Setter per modificar vector Ingredients.
     * @param ingredients -> Paràmetre de tipus Ingredient.
     */
    public void setIngredients(Ingredient[] ingredients){
        this.ingredients = ingredients;
    }
    
    /**
     * Getter que retorna vector ingredients.
     * @return 
     */
    public Ingredient[] getIngredients(){
        return ingredients;
    }
    
    /**
     * Setter per modificar posició vector ingredients. 
     * @param posicioIngredients 
     */
    public void setPosicioIngredients(int posicioIngredients){
        this.posicioIngredients = posicioIngredients;
    }
    
    /**
     * Getter que retorna el valor del atribut posicioIngredients.
     * @return 
     */
    public int getPosicioIngredients(){
        return posicioIngredients;
    }
    
    /**
     * Setter per modificar la quantitat del vector quantitatIngredients
     * @param quantitatIngredients 
     */
    public void setQuantitatIngredients(double[] quantitatIngredients){
        this.quantitatIngredients = quantitatIngredients;
    }
    
    /**
     * Getter que retorna vector quantitatIngredients.
     * @return 
     */
    public double[] getQuantitatIngredients(){
        return quantitatIngredients;
    }
    
    /**
     * Setter per modificar la posició del vector quantitatIngredients
     * @param posicioQuantitatIngredients 
     */
    public void setPosicioQuantitatIngredients(int posicioQuantitatIngredients){
        this.posicioQuantitatIngredients = posicioQuantitatIngredients;
    }

    /**
     * Mètodo pero crear objectes de la clase Mescla.
     * @return -> Retorna un objecte de tipus Mescla.
     */
    public static Mescla addMescla() {

        String codi, nom;
        double preu;

        System.out.println("\nCodi de la mescla:");
        codi = DADES.next();
        DADES.nextLine(); //Neteja buffer
        System.out.println("\nNom de la mescla:");
        nom = DADES.nextLine();
        System.out.println("\nPreu de la mescla:");
        preu = DADES.nextDouble();
        DADES.nextLine();//Neteja buffer

        return new Mescla(codi, nom, preu);
    }

    /**
     * Mètode pero modificar els atributs de la clase Mescla.
     * Mètode heretat de l'interfice Component.
     */
    public void updateComponent(){
        System.out.println("\nCodi de la mescla: " + codi);
        System.out.println("\nEntra el nou codi:");
        codi = DADES.next();
        DADES.nextLine(); //Neteja buffer
        System.out.println("\nNom de la mescla: " + nom);
        System.out.println("\nEntra el nou nom:");
        nom = DADES.nextLine();
        System.out.println("\nPreu de la mescla: " + preu);
        System.out.println("\nEntra el nou preu:");
        preu = DADES.nextDouble();
        DADES.nextLine();//Neteja buffer
    }
    

    /**
     * Mètode per afegir Ingredients (herbes i especies) amb les seves quantitats.
     * @param ingredient -> Rep objecte de tipus Ingredient.
     * @param quantitat -> Rep la quantitat de l'ingredient.
     */
    public void addIngredient(Ingredient ingredient, double quantitat){
        int i;
        boolean afegida = false;
        
        for(i = 0; i < posicioIngredients && !afegida; i++){
            if(ingredients[i].getCodi().equals(ingredient.getCodi())){
                ingredients[i] = ingredient;                
                quantitatIngredients[i] = quantitat;
                afegida = true;
            }
        }
        
        if(!afegida){
            ingredients[posicioIngredients] = ingredient;
            posicioIngredients++;
            quantitatIngredients[posicioQuantitatIngredients] = quantitat;
            posicioQuantitatIngredients++;
        }
    }

    
    /**
     * Mètode per mostrar les dades de la Mescla.
     * Mètode heretat de l'interfice Component.
     */
    public void showComponent(){
        System.out.println("\nLes dades de la mescla amb codi " + codi + " són:");
        System.out.println("Nom: " + nom);
        System.out.println("Preu: " + preu);

        if (mestre != null) {
            mestre.showComponent();
        } else {
            System.out.println("\nEncara no s'ha assignat el mestre o mestra.");
        }        

        for (int i = 0; i < posicioIngredients; i++) {
            ingredients[i].showComponent();
            System.out.println("quantitat: " + quantitatIngredients[i]);
        }
    }  

}
