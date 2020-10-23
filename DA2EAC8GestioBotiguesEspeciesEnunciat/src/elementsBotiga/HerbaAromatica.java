package elementsBotiga;

/**
 * Classe que defineix una herba aromàtica. Es defineixen pel seu codi, nom, característiques 
 * i preu.
 * @author fta
 */
public class HerbaAromatica extends Ingredient {
    
    /**
     * Constructor de HerbaAromatica. Hereda de Ingredient.
     * @param codi -> Parámetro codi de l'especia (String)
     * @param nom -> Parámetro nom de l'especia (String)
     * @param caracteristiques -> Parámetro característiques de l'especia (String)
     * @param preu -> Parámetro preu de l'especia (double)
     */
    public HerbaAromatica(String codi, String nom, String caracteristiques, double preu) {
       super(codi, nom, caracteristiques, preu);
    }
    
    /**
     * Mètode que crea objetes de tipus HerbaAromatica.
     * @return -> Retorna un objecte de tipus HerbaAromatica.
     */    
    public static HerbaAromatica addHerbaAromatica(){
        String codi, nom, caracteristiques;
        double preu;

        System.out.println("\nCodi de l'herba aromàtica:");
        codi = DADES.next();
        DADES.nextLine(); //Neteja buffer
        System.out.println("\nNom de l'herba aromàtica:");
        nom = DADES.nextLine();
        System.out.println("\nCracterístiques de l'herba aromàtica:");
        caracteristiques = DADES.nextLine();        
        System.out.println("\nPreu de l'herba aromàtica:");
        preu = DADES.nextDouble();
        DADES.nextLine();//Neteja buffer

        return new HerbaAromatica(codi, nom, caracteristiques, preu);
    }
       
    /**
     * Método que actualiza els valors dels atributs de HerbaAromatica
     * Mètode heretat de Ingredient.
     */
    public void updateComponent(){
        System.out.println("\nActualizar herba");
        System.out.println("*****************");
        super.updateComponent();
    }
    
    /**
     * Mètode que mostra els valors dels atributs de HerbaAromatica.
     * Mètode heretat d'Ingredients.
     */
    public void showComponent(){
        System.out.println("\nDades herba");  
        System.out.println("************");
        super.showComponent();
    }
    
}
