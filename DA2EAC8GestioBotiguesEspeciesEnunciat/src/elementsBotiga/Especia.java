package elementsBotiga;
/**
 * Classe que defineix una especia. Es defineixen pel seu codi, nom, característiques
 * preu i grau de picantor.
 * Hereda de la classe ingredient.
 * @author fta
 */
public class Especia extends Ingredient {  

    private String picantor;

    /**
     * Constructor de la classe Especia
     * @param codi -> Parámetro codi de l'especia (String)
     * @param nom -> Parámetro nom de l'especia (String)
     * @param caracteristiques -> Parámetro característiques de l'especia (String)
     * @param preu -> Parámetro preu de l'especia (double)
     * @param picantor -> Parámetro picantor de l'especia (String) 
     */
    public Especia(String codi, String nom, String caracteristiques, double preu,String picantor) {
        super(codi, nom, caracteristiques, preu);
        this.picantor = picantor;
    }
    
    // SETTERS //
    
    /**
     * Setter per modificar l'atribut picantor.
     * @param picantor 
     */
    public void setPicantar(String picantor){
        this.picantor = picantor;
    }
    
    // GETTERS //
    
    /**
     * Getter que retorn valor atribut picantor.
     * @return 
     */
    public String getPicantor(){
        return picantor;
    }    
    
    /**
     * Mètode que crea objetes de tipus Especia.
     * @return -> Retorna un objecte de tipus Especia.
     */
    public static Especia addEspecia(){
        String codi, nom, caracteristiques, picantor;
        double preu;

        System.out.println("\nCodi de l'espècia:");
        codi = DADES.next();
        DADES.nextLine(); //Neteja buffer
        System.out.println("\nNom de l'espècia:");
        nom = DADES.nextLine();
        System.out.println("\nCracterístiques de l'espècia:");
        caracteristiques = DADES.nextLine();        
        System.out.println("\nPreu de l'espècia:");
        preu = DADES.nextDouble();
        System.out.println("\nGrau de picantor de l'espècia (0, 1, 2, 3, 4 o 5, on 0 és no picant i 5 el màxim):");
        picantor = DADES.next();
        DADES.nextLine();//Neteja buffer

        return new Especia(codi, nom, caracteristiques, preu, picantor);
    }  
    
    /**
     * Mètodo que actualiza els valors dels atributs de Especia
     * Mètode heretat de Ingredient.
     */
    public void updateComponent(){
        System.out.println("\nActualizar especia");
        System.out.println("*******************\n");
        super.updateComponent();
        System.out.println("\nGrau de picantor de l'espècia "
                         + "(0, 1, 2, 3, 4 o 5, on 0 és no picant i 5 el màxim): " 
                         + picantor);
        System.out.println("\nEntra el nou grau de picantor:");
        picantor = DADES.next();
        DADES.nextLine();//Neteja buffer
    }
    
    /**
     * Mètode que mostra els valors dels atributs de Especia
     * Mètode heretat d'Ingredients.
     */
    public void showComponent(){        
        System.out.println("\nDades especia");  
        System.out.println("**************");
        super.showComponent();
        System.out.println("Picantor: " + picantor);
    }    
   
}
