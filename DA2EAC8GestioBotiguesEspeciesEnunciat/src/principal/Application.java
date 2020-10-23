package principal;

import java.util.Scanner;
import elementsBotiga.Especia;
import elementsBotiga.HerbaAromatica;
import elementsBotiga.Mescla;
import elementsBotiga.Mestre;

/**
 * Classe que mostra l'interfice de usuari.
 * @author fta
 */
public class Application {

    // CONSTANTS //
    private final static Scanner DADES = new Scanner(System.in);    
    private final static int MESTRE = 1;
    private final static int ESPECIA = 2;
    private final static int HERBA = 3;
    // FI CONSTANTS //
    
    static private Botiga[] botigues = new Botiga[10];
    static private int posicioBotigues = 0;
    static private Botiga botigaActual = null;
    
    /**
     * Mètede principal.
     * @param args 
     */
    public static void main(String[] args) {
        menuPrincipal();         
    }

    /**
     * Mètode que mostra l'interfíce del menú principal i vincula amb la resta de menús.
     */
    private static void menuPrincipal() {
        int opcio = 0;

        do {
            System.out.println();
            System.out.println("-------------------------------------");
            System.out.println("Menú Principal");
            System.out.println("-------------------------------------");            
            System.out.println("0. Sortir");
            System.out.println("1. Gestió de botigues");
            System.out.println("2. Gestió de mescles");
            System.out.println("3. Gestió Components");
            System.out.print  ("Selecciona una opció: ");
            opcio = DADES.nextInt();

            switch (opcio) {
                case 0:
                    break;
                case 1:
                    menuBotigues();
                    break;
                case 2:
                    if (botigaActual != null) {
                        menuMescles();
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar la botiga al menú Gestió de botigues");
                    }
                    break;
                case 3:
                    if (botigaActual != null) {
                        int tipus = 0;

                        do{
                            System.out.println();
                            System.out.println("-------------------------------------");
                            System.out.println("Menú Components");
                            System.out.println("-------------------------------------");            
                            System.out.println("1. Mestre");
                            System.out.println("2. Especia");
                            System.out.println("3. Herba Aromatica");
                            System.out.print  ("Selecciona una opció: ");
                            tipus = DADES.nextInt();            

                            switch(tipus){
                                case MESTRE:
                                    menuComponents(MESTRE);
                                    break;
                                case ESPECIA:
                                    menuComponents(ESPECIA);
                                    break;
                                case HERBA:
                                    menuComponents(HERBA);
                                    break;
                                default:
                                    System.out.println("Opció incorrecta.");
                            }
                        }while(tipus <= 0 || tipus > 3);
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar la botiga al menú Gestió de botigues");
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }

    /**
     * Mètode que mostra l'interfíce del menú botigues pero crear, seleccionar,
     * modificar y llistar botiques.
     */
    public static void menuBotigues() {
        int opcio = 0;

        do {
            int indexSel = -1;
            
            System.out.println();
            System.out.println("-------------------------------------");
            System.out.println("Menú Botiques");
            System.out.println("-------------------------------------");             
            System.out.println("0. Sortir");
            System.out.println("1. Alta");
            System.out.println("2. Seleccionar botiga");
            System.out.println("3. Modificar");
            System.out.println("4. Llista de botigues");
            System.out.print  ("Selecciona una opció: ");
            opcio = DADES.nextInt();
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    botigues[posicioBotigues] = Botiga.addBotiga();
                    posicioBotigues++;
                    break;
                case 2:
                    indexSel = selectBotiga();
                    if (indexSel >= 0) {
                        botigaActual = botigues[indexSel];
                    } else {
                        System.out.println("\nNo existeix aquesta botiga");
                    }
                    break;
                case 3:
                    indexSel = selectBotiga();
                    if (indexSel >= 0) {
                        botigues[indexSel].updateComponent();
                    } else {
                        System.out.println("\nNo existeix aquesta botiga");
                    }
                    break;
                case 4:
                    for (int i = 0; i < posicioBotigues; i++) {
                        botigues[i].showComponent();
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }

    /**
     * Mètode que mostra l'interfice del menú components (Mestre, Espcia i Herbes).
     * Crea, modifica i llista el diferentes components.
     * @param tipus 
     */
    public static void menuComponents(int tipus) {        
        int opcio = 0;
        
        do{
            if(tipus == MESTRE){
                System.out.println(); 
                System.out.println("*************************");
                System.out.println("Gestió Mestre");
                System.out.println("*************************");
            }else if(tipus == ESPECIA){
                System.out.println(); 
                System.out.println("*************************");
                System.out.println("Gestió Especia");
                System.out.println("*************************");
            }else if(tipus == HERBA){
                System.out.println(); 
                System.out.println("*************************");
                System.out.println("Gestió Herba Aromatica");
                System.out.println("*************************");
            }
            
            System.out.println("0. Sortir");
            System.out.println("1. Alta");
            System.out.println("2. Modificar");
            System.out.println("3. Llistar");
            System.out.print("Selecciona una opció: ");
            opcio = DADES.nextInt();
            
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    if(tipus == MESTRE){
                        botigaActual.addMestre();
                    }else if(tipus == ESPECIA){
                        botigaActual.addEspecia();
                    }else if(tipus == HERBA){
                        botigaActual.addHerbaAromatica();
                    }                    
                    break;
                case 2:
                    if(tipus == MESTRE){
                        int indexSel = botigaActual.selectComponent(MESTRE, null);
                        if (indexSel >= 0) {
                        botigaActual.getComponents()[indexSel].updateComponent();
                        } else {
                            System.out.println("\nNo existeix aquest mestre o aquesta mestra.");
                        }
                    }else if(tipus == ESPECIA){
                        int indexSel = botigaActual.selectComponent(ESPECIA, null);
                        if (indexSel >= 0) {
                        botigaActual.getComponents()[indexSel].updateComponent();
                        } else {
                            System.out.println("\nNo existeix aquesta especia.");
                        }
                    }else if(tipus == HERBA){
                        int indexSel = botigaActual.selectComponent(HERBA, null);
                        if (indexSel >= 0) {
                        botigaActual.getComponents()[indexSel].updateComponent();
                        } else {
                            System.out.println("\nNo existeix aquesta Herba Aromatica.");
                        }
                    }              
                    break;
                case 3:                                 
                    for (int i = 0; i < botigaActual.getPosicioComponents(); i++) {                         
                        if(botigaActual.getComponents()[i] instanceof Mestre && tipus == MESTRE){
                            botigaActual.getComponents()[i].showComponent();
                        }else if(botigaActual.getComponents()[i] instanceof Especia && tipus == ESPECIA){
                            botigaActual.getComponents()[i].showComponent();
                        }else if(botigaActual.getComponents()[i] instanceof HerbaAromatica && tipus == HERBA){
                            botigaActual.getComponents()[i].showComponent();
                        }                      
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        }while(opcio != 0);     
        
    }

    /**
     * Mètode que mostra l'interfíce del menú de Mescles.
     * Pot crear, modificar, afegir i llistar els components d'una mescla.     *
     */
    public static void menuMescles() {
        int opcio = 0;

        do {
            System.out.println();
            System.out.println("-------------------------------------");
            System.out.println("Menú Mescles");
            System.out.println("-------------------------------------");            
            System.out.println("0. Sortir");
            System.out.println("1. Alta");
            System.out.println("2. Modificar");
            System.out.println("3. Afegir espècia");
            System.out.println("4. Afegir herba aromàtica");
            System.out.println("5. Afegir mestre o mestra");
            System.out.println("6. Llista de mescles");
            System.out.print  ("Selecciona una opció: ");
            opcio = DADES.nextInt();
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    botigaActual.addMescla();
                    break;
                case 2:
                    int indexSel = botigaActual.selectComponent(4,null);
                    if (indexSel >= 0) {
                        botigaActual.getComponents()[indexSel].updateComponent();
                    } else {
                        System.out.println("\nNo existeix aquesta mescla");
                    }
                    break;
                case 3:
                    botigaActual.addEspeciaMescla();
                    break;
                case 4:
                    botigaActual.addHerbaMescla();
                    break;
                case 5:
                    botigaActual.addMestreMescla();
                    break;
                case 6:
                    for (int i = 0; i < botigaActual.getPosicioComponents(); i++) {
                        if (botigaActual.getComponents()[i] instanceof Mescla){
                            botigaActual.getComponents()[i].showComponent();
                        }                        
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }

    /**+
     * Mètodo per seleccionar una botiga creada.
     * @return -> Retorna la posició de la botiga.
     */
    public static Integer selectBotiga() {

        System.out.println("\nCodi de la botiga?:");
        int codi = DADES.nextInt();

        for (int i = 0; i < posicioBotigues; i++) {
            if (botigues[i].getCodi() == codi) {
                return i;
            }
        }
        return -1;
    }
}
