
package quejassugerencias;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {
    private static Connection conn;
    private static final String DRIVER="com.mysql.jdbc.Driver";
    private static final String USER="root";
    private static final String PASSWORD="";
    private static final String URL="jdbc:mysql://localhost:3306/quejas_sugerencias";
    
    public Conexion(){
        conn=null;
        try{
            Class.forName(DRIVER);
            conn=(Connection) DriverManager.getConnection(URL, USER, PASSWORD);
            if(conn!=null){
                //JOptionPane.showMessageDialog(null, "Conexion establecida");
                   
            }
            
        }catch(ClassNotFoundException|SQLException e){
            JOptionPane.showMessageDialog(null, "Error al conectar "+e);
        }
               
    }
    
    public static Connection getConnection(){
        return conn;
    }
    
    public void desconectar(){
        conn=null;
        if(conn==null){
           // JOptionPane.showMessageDialog(null, "Conexion terminada ");
        }
    }
    
    public static ResultSet getTabla(String Consulta){
        Connection cn=getConnection();
        Statement st;
        ResultSet datos=null;
        try{
            st=cn.createStatement();
            datos=st.executeQuery(Consulta);            
        }
        catch(Exception e){ System.out.print(e.toString());}
        return datos;
    } 
    
    public ResultSet consultar(String sql) {
        ResultSet resultado;
        try {
            Statement sentencia = getConnection().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            resultado = sentencia.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el inicio de sesion, favor de informar al encargado del area sobre el siguiente mensaje de error: \n"+ex, "Error", JOptionPane.WARNING_MESSAGE);
            return null;
        }        
        
        return resultado;
    }
}
