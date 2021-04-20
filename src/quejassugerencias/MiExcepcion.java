
package quejassugerencias;
import javax.swing.JOptionPane;//importaciones de librerias 
public class MiExcepcion extends Exception{

    public MiExcepcion() {
        JOptionPane.showMessageDialog(null, "Error de ingreso de edad","Error",JOptionPane.WARNING_MESSAGE);
        //mensaje de error 
        
    }
    
}
