
package quejassugerencias;

import javax.swing.JOptionPane;
//excepcion para mostrar mensajes de error
public class ExcepcionRegistro extends Exception {
    public ExcepcionRegistro(int num){
        //JOptionPane.showMessageDialog(null, "Campo vacio");
        switch(num){
            case 1: campo_vacio();
                    break;
            case 2: cadena_incorrecta();
                    break;
            case 3: edad_incorrecta();
                    break;
            default:System.out.println("error");
                    break;
                
            
        }
    }
    
    public void campo_vacio(){
        JOptionPane.showMessageDialog(null, "Campo vacio","Error",JOptionPane.WARNING_MESSAGE);
    }
    
    public void cadena_incorrecta(){
        JOptionPane.showMessageDialog(null, "Caracteres no válidos","Error",JOptionPane.WARNING_MESSAGE);
    }
    
    public void edad_incorrecta(){
        JOptionPane.showMessageDialog(null, "Edad no válida","Error",JOptionPane.WARNING_MESSAGE);
    }
    
}
