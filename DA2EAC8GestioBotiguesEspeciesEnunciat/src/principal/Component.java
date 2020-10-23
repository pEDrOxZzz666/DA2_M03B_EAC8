
package principal;

import java.util.Scanner;

/**
 * Interfíce Component.
 * @author Pedro
 */
public interface Component {
    public final static Scanner DADES = new Scanner(System.in);    
    
    public void updateComponent();
    public void showComponent();  
}
