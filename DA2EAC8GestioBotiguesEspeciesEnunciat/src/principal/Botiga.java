package principal;

import elementsBotiga.Especia;
import elementsBotiga.HerbaAromatica;
import elementsBotiga.Mescla;
import elementsBotiga.Mestre;


/**
 * Classe que defineix una botiga d'espècies. Es defineixen pel seu codi, adreça, 
 * un vector d'espècies, un vector d'herbes aromàtiques, un vector de mestres 
 * especiers i un vector de mescles.
 * Implementa l'interfice Component.
 * @author fta
 */
public class Botiga implements Component {  
    
    private int codi;    
    private static int properCodi = 1; //El proper codi a assignar
    private String adreca;
    private Component[] components = new Component[715];
    private int posicioComponents = 0; 
    
    /**+
     * Constructor de la classe Botiga.
     * Rep un paràmetre adreca actualiza codi amb properCodi y actualiza 
     * properCodi.
     * @param adreca -> Rep paràmetre adreca (String).
     */
    public Botiga(String adreca) {
        codi = properCodi;
        properCodi++;
        this.adreca = adreca;
    }
    
    /**
     * Getter que retorna el codi de la Botiga.
     * @return 
     */
    public int getCodi() {
        return codi;
    }

    /**
     * Setter per modificar el codi de la Botiga.
     * @param codi 
     */
    public void setCodi(int codi) {
        this.codi = codi;
    }

    /**
     * Getter que retorna el atribut estàtic properCodi.
     * @return 
     */
    public static int getProperCodi() {
        return properCodi;
    }

    /**
     * Setter per modificar l'atribut properCodi.
     * @param properCodi 
     */
    public static void setProperCodi(int properCodi) {
        Botiga.properCodi = properCodi;
    }

    /**
     * Getter que retorna l'adreça de la Botiga.
     * @return 
     */
    public String getAdreca() {
        return adreca;
    }

    /**
     * Setter per modificar l'adreça de la Botiga.
     * @param adreca 
     */
    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    /**
     * Setter pero modificar el vector componets
     * @param components -> Rep un vector de tipus Component.
     */
    public void setComponents(Component[] components){
        this.components = components;
    }
    
    /**
     * Getter que retorna vector components.
     * @return 
     */
    public Component[] getComponents(){
        return components;
    }
    
    /**
     * setter per modificar el valor posicioComponents.
     * @param posicioComponents 
     */
    public void setPosicioComponents(int posicioComponents){
        this.posicioComponents = posicioComponents;
    }
    
    /**
     * Retorna la posició o el valor de posicioComponents
     * @return 
     */
    public int getPosicioComponents(){
        return posicioComponents;
    }
    
    /**
     * Mètode estàtic que retorna un objecte de tipus Botiga.
     * @return 
     */
    public static Botiga addBotiga() {

        System.out.println("\nAdreça de la botiga:");

        return new Botiga(DADES.nextLine());
    }
    
    /**
     * Mètode pero modificar el valors dels atributs de Botiga.
     * Heretat de l'interfice Component.
     */
    public void updateComponent(){
        System.out.println("\nAdreça de la botiga: " + adreca);
        System.out.println("\nEntra la nova adreça:");
        adreca = DADES.nextLine();
    }
    
    /**
     * Mètodo que mostra els valors de la Botiga.
     * Heretat de l'interfice Component.
     */
    public void showComponent(){
        System.out.println("\nL'adreça de la botiga amb codi " + codi + " és:");
        System.out.println("\nAdreça: " + adreca);
    }   
    
    /**
     * Mètodo que crea noves especies i les afegeix al vector components
     */
    public void addEspecia() {

        Especia novaEspecia = Especia.addEspecia();

        if (selectComponent(2, novaEspecia.getCodi()) == -1) {
            components[posicioComponents] = novaEspecia;
            posicioComponents++;
        } else {
            System.out.println("\nL'espècia ja existeix");
        }
    }

    /**
     * Mètodo que crea noves Herbes i les afegeix al vector components
     */
    public void addHerbaAromatica() {

        HerbaAromatica novaHerba = HerbaAromatica.addHerbaAromatica();

        if (selectComponent(3,novaHerba.getCodi()) == -1) {
            components[posicioComponents] = novaHerba;
            posicioComponents++;
        } else {
            System.out.println("\nL'herba aromàtica ja existeix");
        }
    }

    /**
     * Mètodo que crea nous Mestres i els afegeix al vector components
     */
    public void addMestre() {

        Mestre nouMestre = Mestre.addMestre();

        if (selectComponent(1, nouMestre.getNif()) == -1) {
            components[posicioComponents] = nouMestre;
            posicioComponents++;
        } else {
            System.out.println("\nEl mestre o la mestra ja existeix");
        }
    }   
     
    /**
     * Mètodo que crea noves mescles i les afegeix al vector components
     */
    public void addMescla() {

        Mescla novaMescla = Mescla.addMescla();

        if (selectComponent(4, novaMescla.getCodi()) == -1) {
            components[posicioComponents] = novaMescla;
            posicioComponents++;
        } else {
            System.out.println("\nLa mescla ja existeix");
        }
    }    
    
    /**
     * Mètode per comprovar la existencia o no d'un component
     * @param tipusComponent -> Rep el tipus component (=Mestre 2=Especia  3=HerbaAromatica i 4=Mescla).
     * @param id -> Rep el codi/nif del component (String).
     * @return -> Retorna la posición del component si s'ha trobat, en cas contrari retorna "-1".
     */
    public int selectComponent(int tipusComponent, String id){       
        
        if(id == null){
            switch(tipusComponent){
                case 1:
                    System.out.println("\nIntrodueix nif Mestre:");
                    id = DADES.next();
                    break;
                case 2:
                    System.out.println("\nIntrodueix codi de l'especia:");
                    id = DADES.next();
                    break;
                case 3:
                    System.out.println("\nIntrodueix codi de l'herba:");
                    id = DADES.next();
                    break;
                case 4:
                    System.out.println("\nIntrodueix codi de la mescla:");
                    id = DADES.next();
                    break;
                default:
                    System.out.println("No existeix el tipo de Component" + tipusComponent + ".");
            }            
        }   
        
        for(int i = 0; i < posicioComponents; i++){            
            if(tipusComponent == 1 && components[i] instanceof Mestre){                                                
                if(((Mestre)components[i]).getNif().equals(id)){                                   
                    return i;                        
                }                
            }else if(tipusComponent == 2 && components[i] instanceof Especia){                                
                if(((Especia)components[i]).getCodi().equals(id)){
                    return i;
                }                
            }else if(tipusComponent == 3 && components[i] instanceof HerbaAromatica){                                
                if(((HerbaAromatica)components[i]).getCodi().equals(id)){
                    return i;
                }                
            }else if(tipusComponent == 4 && components[i] instanceof Mescla){         
                if(((Mescla)components[i]).getCodi().equals(id)){
                    return i;
                }                
            } 
        }
        
        return -1;        
    }
    
    /**
     * Mètode per afegir una especia ja creada a la Mescla.
     * 1.Cerca la posició de la Mescla.
     * 2.Una vegada te la posició de la Mescla, cerca la posició de l'especia.
     * 3.Pregunta la quantitat afegir i l'afegeix.
     * NOTA: si no troba la Mescla o l'especia emet un missatge.
     */    
    public void addEspeciaMescla() {
        
        Mescla mesclaSel = null;
        int pos = selectComponent(4, null);

        if (pos >= 0) {

            mesclaSel = (Mescla)this.getComponents()[pos];

            pos = selectComponent(2, null);

            if (pos >= 0) {
                System.out.println("\nQuina quantitat s'ha d'afegir de l'espècia?");                                
                mesclaSel.addIngredient((Especia)this.getComponents()[pos], DADES.nextDouble());                
            } else {
                System.out.println("\nNo existeix aquesta espècia");
            }

        } else {
            System.out.println("\nNo existeix aquesta mescla");
        }

    }
    
    /**
     * Mètode per afegir una Herba aromàtica ja creada a la Mescla.
     * 1.Cerca la posició de la Mescla.
     * 2.Una vegada te la posició de la Mescla, cerca la posició de l'herba.
     * 3.Pregunta la quantitat afegir i l'afegeix.
     * NOTA: si no troba la Mescla o l'herba emet un missatge.
     */
    public void addHerbaMescla() {
        
        Mescla mesclaSel = null;
        int pos = selectComponent(4,null);

        if (pos >= 0) {
            
            mesclaSel = (Mescla)this.getComponents()[pos];

            pos = selectComponent(3,null);

            if (pos >= 0) {
                System.out.println("\nQuina quantitat s'ha d'afegir de l'herba aromàtica?");                
                mesclaSel.addIngredient((HerbaAromatica)this.getComponents()[pos], DADES.nextDouble());
            } else {
                System.out.println("\nNo existeix aquesta herba aromàtica");
            }

        } else {
            System.out.println("\nNo existeix aquesta mescla");
        }

    }
    
    /**
     * Mètode per afegir un Mestre ja creat a la Mescla.
     * 1.Cerca la posició de la Mescla.
     * 2.Una vegada te la posició de la Mescla, cerca la posició del Mestre.
     * 3.Afegeix el mestre a la mescla.
     * NOTA: si no troba la Mescla o el mestre emet un missatge. Només pot tenir
     * un mestre a una mescla en concret.
     */
    public void addMestreMescla() {
        
        Mescla mesclaSel = null;        
        int pos = selectComponent(4,null);

        if (pos >= 0) {
            
            mesclaSel = (Mescla)this.getComponents()[pos];
            
            pos = selectComponent(1,null);

            if (pos >= 0) {                
                mesclaSel.setMestre((Mestre)this.getComponents()[pos]);
            } else {
                System.out.println("\nNo existeix aquest mestre o mestra");
            }

        } else {
            System.out.println("\nNo existeix aquesta mescla");
        }

    }
}
