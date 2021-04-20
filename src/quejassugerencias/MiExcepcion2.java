
package quejassugerencias;
//importaciones de librerias 
import javax.swing.JOptionPane;
public class MiExcepcion2 extends Exception{
    public MiExcepcion2() {
         //mensaje de error
        JOptionPane.showMessageDialog(null, "Error de ingreso de Nombre","Error",JOptionPane.WARNING_MESSAGE);
    }  
}
