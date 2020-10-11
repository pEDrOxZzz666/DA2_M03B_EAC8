/*
 * Classe que defineix una botiga d'espècies. Es defineixen pel seu codi, adreça, un vector 
 * d'espècies, un vector d'herbes aromàtiques, un vector de mestres especiers i un vector de mescles.
 */
package principal;
import java.util.Scanner;

import elementsBotiga.Especia;
import elementsBotiga.HerbaAromatica;
import elementsBotiga.Mescla;
import elementsBotiga.Mestre;
import java.util.Locale;

/**
 *
 * @author fta
 */
public class Botiga {

    private int codi;
    private static int properCodi = 1; //El proper codi a assignar
    private String adreca;
    private Especia[] especies = new Especia[200];
    private int posicioEspecies = 0; //Priemra posició buida del vector especies
    private HerbaAromatica[] herbes = new HerbaAromatica[200];
    private int posicioHerbes = 0; //Priemra posició buida del vector herbes
    private Mestre[] mestres = new Mestre[15];
    private int posicioMestres = 0; //Priemra posició buida del vector mestres
    private Mescla[] mescles = new Mescla[300];
    private int posicioMescles = 0; //Priemra posició buida del vector mescles
    
    private final static Scanner DADES = new Scanner(System.in, "ISO-8859-1");
    
    
    /*
     TODO CONSTRUCTOR
    
     Paràmetres: valors per tots els atributs de la classe menys els vectors i el codi.
    
     Accions:
     - Assignar als atributs corresponents els valors passats com a paràmetres.
     - Assignar a l'atribut codi el valor de l'atribut properCodi i actualitzar
     properCodi amb el següent codi a assignar.
     */
    public Botiga(String adreca) {
        this.adreca = adreca;
        codi = properCodi;
        properCodi++;
    }
    
    /*
     TODO Mètodes accessors    
     */
    public void setCodi(int codi){
        this.codi = codi;
    }
    
    public void setAdreca(String adreca){
        this.adreca = adreca;
    }
    
    public void setEspecies(Especia[] especies){
        this.especies = especies;
    }
    
    public void setPosicioEspecies(int posicioEspecies){
        this.posicioEspecies = posicioEspecies;
    }
    
    public void setHerbes(HerbaAromatica[] herbes){
        this.herbes = herbes;
    }
    
    public void setPosicioHerbes(int posicioHerbes){
        this.posicioHerbes = posicioHerbes;
    }
    
    public void setMestres(Mestre[] mestres){
        this.mestres = mestres;
    }
    
    public void setPosicioMestres(int posicioMestres){
        this.posicioMestres = posicioMestres;
    }
    
    public void setMescles(Mescla[] mescles){
        this.mescles = mescles;
    }
    
    public void setPosicioMescles(int posicioMescles){
        this.posicioMescles = posicioMescles;
    }
    
    //getters
    public int getCodi(){ 
        return codi;        
    }
    
    public String getAdreca(){
        return adreca; 
    }
    
    public Especia[] getEspecies(){
        return especies;
    }
    
    public int getPosicioEspecies(){
        return posicioEspecies;
    }
    
    public HerbaAromatica[] getHerbes(){
        return herbes;
    }
    
    public int getPosicioHerbes(){
        return posicioHerbes;
    }
    
    public Mestre[] getMestres(){
        return mestres;
    }
    
    public int getPosicioMestres(){
        return posicioMestres;
    }
    
    public Mescla[] getMescles(){
        return mescles;
    }
    
    public int getPosicioMescles(){
        return posicioMescles;
    }
    
    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari les dades per consola per crear una nova botiga. Les dades
     a demanar són les que passem per paràmetre en el constructor.
     - També heu de tenir en compte que l'adreça, pot ser una frases, per exemple, C/De la font, 1.
    
     Retorn: La nova botiga creada.
     */
    public static Botiga addBotiga() {
        String adreca;
        System.out.print("Escribe nueva dirección: ");
        adreca = DADES.nextLine();
        return new Botiga(adreca);
    }
    
    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual i
       modificar els atributs corresponents d'aquest objecte. Els únics atributs que
       modificarem són els que hem inicialitzat en el constructor amb els paràmetres passats.
     - També heu de tenir en compte que l'adreça, pot ser una frases, per exemple, C/De la font, 1.
     - Li heu de mostrar a l'usuari els valors dels atributs abans de modificar-los.
     
    Retorn: cap
     */
    public void updateBotiga() {
        String adreca;
        System.out.print("Escribe modificación dirección: ");
        adreca = DADES.nextLine();
        setAdreca(adreca);
    }
    
    public void showBotiga() {
        System.out.println("\nL'adreça de la botiga amb codi " + codi + " és:");
        System.out.println("\nAdreça: " + adreca);
    }
    
     /*
     ESPECIA
     */
    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - afegeix una nova espècia al vector d'espècies de la botiga actual si aquesta no existeix. 
       Per afegir-la heu de fer servir el mètode de la classe Especia escaient i per comprovar la seva 
       existència el mètode d'aquesta classe que ens ajuda en aquesta tasca.
     - actualitza la posició del vector d'espècies si s'afegeix l'espècia.
     - mostra el missatge "L'espècia ja existeix" si no s'ha afegit l'espècia.
    
     Retorn: cap
     */
    public void addEspecia() {      
        int posEspecia = -1;
        String codiEspecia = null;
        
        especies[posicioEspecies] = Especia.addEspecia();
        codiEspecia = especies[posicioEspecies].getCodi();
        posEspecia = selectEspecia(codiEspecia);
        if(posEspecia >= 0){
            System.out.println("La especia ja existeix"); 
        }else{
            posicioEspecies++;
        }
    }

    public int selectEspecia(String codi) {
        
        if (codi == null) {
            System.out.println("\nCodi de l'espècia?:");
            codi = DADES.next();
        }

        for (int i = 0; i < posicioEspecies; i++) {
            if (especies[i].getCodi().equals(codi)) {
                return i;
            }
        }

        return -1;
    }
    
    /*
     HERBA AROMÀTICA
     */
    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - afegeix una nova herba aromàtica al vector d'herbes aromàtiques de la botiga actual si aquesta no existeix. 
       Per afegir-la heu de fer servir el mètode de la classe HerbaAromatica escaient i per comprovar la seva 
       existència el mètode d'aquesta classe que ens ajuda en aquesta tasca.
     - actualitza la posició del vector d'herbes aromàtiques si s'afegeix l'herba aromàtica.
     - mostra el missatge "L'herba aromàtica ja existeix" si no s'ha afegit l'herba aromàtica.
    
     Retorn: cap
     */
    public void addHerbaAromatica() {  
        int posHerba = -1;
        String codi = null;
        
        herbes[posicioHerbes] = HerbaAromatica.addHerbaAromatica();
        codi = herbes[posicioHerbes].getCodi();
        posHerba = selectHerbaAromatica(codi);
        if(posHerba >= 0){
            System.out.println("L'especia ja existeix"); 
        }else{
            posicioHerbes++;
        }        
    }

    public int selectHerbaAromatica(String codi) {
        
        if (codi == null) {
            System.out.println("\nCodi de l'herba aromàtica?:");
            codi = DADES.next();
        }

        for (int i = 0; i < posicioHerbes; i++) {
            if (herbes[i].getCodi().equals(codi)) {
                return i;
            }
        }

        return -1;
    }
    
    /*
     MESTRE
     */
    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - afegeix un nou mestre o nova mestra al vector de mestres especiers de la botiga actual si aquest o aquesta no existeix. 
       Per afegir-lo o afegir-la heu de fer servir el mètode de la classe Mestre escaient i per comprovar la seva 
       existència el mètode d'aquesta classe que ens ajuda en aquesta tasca.
     - actualitza la posició del vector de mestres si s'afegeix el mestre o mestra.
     - mostra el missatge "El mestre o la mestra ja existeix" si no s'ha afegit el mestre o mestra.
    
     Retorn: cap
     */
    public void addMestre() {        
        int posMestre = -1;
        String nif = null;
        
        mestres[posicioMestres] = Mestre.addMestre();        
        nif = mestres[posicioMestres].getNif();
        posMestre = selectMestre(nif);        
        if(posMestre >= 0){
            System.out.println("El mestre o la mestra ja existeix"); 
        }else{
           posicioMestres++; 
        }   
    }

    public int selectMestre(String nif) {
        
        if (nif == null) {
            System.out.println("\nNIF del mestre o de la mestra?:");
            nif = DADES.next();
        }

        for (int i = 0; i < posicioMestres; i++) {
            if (mestres[i].getNif().equals(nif)) {
                return i;
            }
        }

        return -1;
    }
    
     /*
     MESCLA
     */
    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - afegeix una nova mescla al vector de mescles de la botiga actual si aquesta no existeix. 
       Per afegir-la heu de fer servir el mètode de la classe Mescla escaient i per comprovar la seva 
       existència el mètode d'aquesta classe que ens ajuda en aquesta tasca.
     - actualitza la posició del vector de mescles si s'afegeix la mescla.
     - mostra el missatge "La mescla ja existeix" si no s'ha afegit la mescla.
    
     Retorn: cap
     */
    public void addMescla() {       
        int posMescla = -1;
        String codi = null;
        
        mescles[posicioMescles] = Mescla.addMescla();
        codi = mescles[posicioMescles].getCodi();
        posMescla = selectMescla(codi);
        if(posMescla >= 0){
            System.out.println("La mescla ja existeix"); 
        }else{
            posicioMescles++;
        }
    }

    public int selectMescla(String codi) {
        
        if (codi == null) {
            System.out.println("\nCodi de la mescla?:");
            codi = DADES.next();
        }

        for (int i = 0; i < posicioMescles; i++) {
            if (mescles[i].getCodi().equals(codi)) {
                return i;
            }
        }

        return -1;
    }
    
    public void addEspeciaMescla() {
        
        Mescla mesclaSel = null;
        int pos = selectMescla(null);

        if (pos >= 0) {

            mesclaSel = this.getMescles()[pos];

            pos = selectEspecia(null);

            if (pos >= 0) {
                System.out.println("\nQuina quantitat s'ha d'afegir de l'espècia?");
                mesclaSel.addEspecia(this.getEspecies()[pos], DADES.nextDouble());
            } else {
                System.out.println("\nNo existeix aquesta espècia");
            }

        } else {
            System.out.println("\nNo existeix aquesta mescla");
        }

    }
    
    public void addHerbaMescla() {
        
        Mescla mesclaSel = null;
        int pos = selectMescla(null);

        if (pos >= 0) {

            mesclaSel = this.getMescles()[pos];

            pos = selectHerbaAromatica(null);

            if (pos >= 0) {
                System.out.println("\nQuina quantitat s'ha d'afegir de l'herba aromàtica?");
                mesclaSel.addHerba(this.getHerbes()[pos], DADES.nextDouble());
            } else {
                System.out.println("\nNo existeix aquesta herba aromàtica");
            }

        } else {
            System.out.println("\nNo existeix aquesta mescla");
        }

    }
    
    public void addMestreMescla() {
        
        Mescla mesclaSel = null;
        int pos = selectMescla(null);

        if (pos >= 0) {

            mesclaSel = this.getMescles()[pos];

            pos = selectMestre(null);

            if (pos >= 0) {
                mesclaSel.setMestre(this.getMestres()[pos]);
            } else {
                System.out.println("\nNo existeix aquest mestre o mestra");
            }

        } else {
            System.out.println("\nNo existeix aquesta mescla");
        }

    }
}
