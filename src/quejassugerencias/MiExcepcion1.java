
package quejassugerencias;
////importaciones de librerias 
import javax.swing.JOptionPane;
public class MiExcepcion1 extends Exception{

    public MiExcepcion1() {
         //mensaje de error
         JOptionPane.showMessageDialog(null, "Error de ingreso de Teléfono, deben ser 6 digitos","Error",JOptionPane.WARNING_MESSAGE);
        
    }
    
    
}
