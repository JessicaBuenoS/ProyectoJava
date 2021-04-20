
package quejassugerencias;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class Registro extends javax.swing.JFrame {
     //variables a utilizar
     Conexion con;
     String id_usuario="";
     String nombre="";
     int edad;
     String contrasena="";
     String nacionalidad="";
     int id_turno;
     int id_tipo_usuario;
     int activo;
     
    
    public Registro() {
        /*con=new Conexion();
        Connection reg=con.getConnection();*/
        initComponents();
        this.setTitle("Registro");//titulo
        this.setLocationRelativeTo(null);//pantalla en el centro
        this.setResizable(false);//no se mueve el tamaño del frame
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        comboTurno = new javax.swing.JComboBox<>();
        btnRegistro = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre completo");

        jLabel2.setText("Edad");

        jLabel3.setText("Nacionalidad");

        jLabel4.setText("Turno");

        comboTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matutino", "Vespertino"}));
        comboTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTurnoActionPerformed(evt);
            }
        });

        btnRegistro.setText("Registrar");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre)
                    .addComponent(txtEdad)
                    .addComponent(txtNacionalidad)
                    .addComponent(comboTurno, 0, 115, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegistro)
                        .addGap(162, 162, 162))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegresar)
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
       try{ 
        con=new Conexion();//conexion
        Connection reg=con.getConnection();
        int rand_num,rand_letra,rand_caracter,rand1,rand2;//aleatorios para usuarios y contraseñas
        rand_num=(int)(Math.random()*(58-48)+48);
        rand_letra=(int)(Math.random()*(123-97)+97);
        rand_caracter=(int)(Math.random()*(48-33)+33);
        String turno;
        
        vacio_espacios();
        valida_cadena(txtNombre.getText());
        valida_cadena(txtNacionalidad.getText());
        

        id_usuario=""+(char)rand_num+(char)rand_letra+(char)rand_caracter;
       // id_usuario="7i%";
        
        
        nombre=txtNombre.getText();
        
        edad=Integer.parseInt(txtEdad.getText());
        valida_edad(edad);
        
        rand1=(int)(Math.random()*(58-48)+48);
        rand2=(int)(Math.random()*(58-48)+48);
        contrasena=""+nombre.toLowerCase().charAt(0)+nombre.toLowerCase().charAt(1)+nombre.toLowerCase().charAt(2)+(char)rand1+(char)rand2;
        
        nacionalidad=txtNacionalidad.getText();
        
        turno=comboTurno.getSelectedItem().toString();//valor de turno
        if(turno.equals("Matutino")){
            id_turno=1;
        }else if(turno.equals("Vespertino")){
            id_turno=2;
        }
        
        id_tipo_usuario=2;
        
        activo=1;
        
        //se inserta en la base de datos
        String sSQL = "Insert Into usuarios  (id_usuario, nombre, edad, contrasena, nacionalidad, id_turno, id_tipo_usuario, activo) values ('"+id_usuario+"','"+nombre+"',"+edad+",'"+contrasena+"','"+nacionalidad+"',"+id_turno+","+id_tipo_usuario+","+activo+");";
        Statement st = (Statement) reg.createStatement();
       
        st.executeUpdate(sSQL);
        
        //JOptionPane.showMessageDialog(null, "Registro exitoso \nGuarde los siguientes datos para su prÃ³ximo inicio de sesiÃ³n"+"\nId usuario: "+id_usuario+"\nContrasena: "+contrasena);
        
        int resp;
        
        do{//se muestran el usuario y contraseña
            JOptionPane.showMessageDialog(null, "Registro exitoso \nGuarde los siguientes datos para su próximo inicio de sesión"+"\nId usuario: "+id_usuario+"\nContrasena: "+contrasena);
            resp=JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
        }while(resp>0);
        
        
        
       
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Error en el registro, favor de informar al encargado del area sobre el siguiente mensaje de error: \n"+ex, "Error", JOptionPane.WARNING_MESSAGE);
              
       }catch(StringIndexOutOfBoundsException ex1){
           JOptionPane.showMessageDialog(null,"No ingreso nombre","Error",JOptionPane.WARNING_MESSAGE );
       }catch(NumberFormatException ex2){
           JOptionPane.showMessageDialog(null,"Ingreso caracter en campo númerico","Error",JOptionPane.WARNING_MESSAGE);
       }catch(ExcepcionRegistro ex3){
           //ex3.campo_vacio();
       }
       
       finally{//se desconecta de la BD
           con.desconectar();
           txtEdad.setText("");
           txtNacionalidad.setText("");
           txtNombre.setText("");
       }
        
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void comboTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTurnoActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Inicio().setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void valida_edad(int edad) throws ExcepcionRegistro{//validar que la edad sea en el siguiente rango
        if(edad<=15||edad>=101){
            throw new ExcepcionRegistro(3);
        }
    }
    private void vacio_espacios() throws ExcepcionRegistro{//cha si esta vacio el campo
        boolean bandera=false;
        
        if (txtNacionalidad.getText().isEmpty()){
            throw new ExcepcionRegistro(1);
        }else if (txtNombre.getText().isEmpty()){
            throw new ExcepcionRegistro(1);
        }else if (txtEdad.getText().isEmpty()){
            throw new ExcepcionRegistro(1);
        }
        
        bandera=false;
        
        for(int i=0; i<txtNombre.getText().length();i++){
            if(txtNombre.getText().charAt(i)==' '){
                bandera=true;
            }else{
                bandera=false;
                break;
            }
        }
        if(bandera==true){
            throw new ExcepcionRegistro(1);
        }
        
        bandera=false;
        
        for(int i=0; i<txtEdad.getText().length();i++){
            if(txtEdad.getText().charAt(i)==' '){
                bandera=true;
            }else{
                bandera=false;
                break;
            }
        }
        if(bandera==true){
            throw new ExcepcionRegistro(1);
        }
        
        
        
        bandera=false;
        
        for(int i=0; i<txtNacionalidad.getText().length();i++){
            if(txtNacionalidad.getText().charAt(i)==' '){
                bandera=true;
            }else{
                bandera=false;
                break;
            }
        }
        if(bandera==true){
            throw new ExcepcionRegistro(1);
        }
    }
    
    private void valida_cadena(String cadena) throws ExcepcionRegistro{//checa que solo se haya ingresado letras
         if(!cadena.matches("^[A-Za-z\\s]*$")){
             throw new ExcepcionRegistro(2);
         }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> comboTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
