
package quejassugerencias;

import com.mysql.jdbc.Connection;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfExporterConfiguration;
import net.sf.jasperreports.view.JasperViewer;


public class FrameAdministrador extends javax.swing.JFrame {

    Conexion con;
    String nombre="";
    public FrameAdministrador(String nombre) {
        this.nombre=nombre;//toma los valores que vienen en el constructor
        initComponents();
        this.setTitle("Administrador");//titulo que aparece en la ventana
        this.setLocationRelativeTo(null);//muestra la pantalla en el centro
        this.setResizable(false);//no se mueve el tamaño del frame
        lbNombre.setText(nombre);
        lbLogo.setIcon(new javax.swing.ImageIcon("imagenes\\admin.png"));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JButton();
        btnIncidencias = new javax.swing.JButton();
        btnGraficas = new javax.swing.JButton();
        btnHistorico = new javax.swing.JButton();
        lbNombre = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        lbLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Bienvenido, Administrador");

        btnUsuarios.setText("Consultar usuarios");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnIncidencias.setText("Consultar incidencias");
        btnIncidencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncidenciasActionPerformed(evt);
            }
        });

        btnGraficas.setText("Consultar Graficas");
        btnGraficas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficasActionPerformed(evt);
            }
        });

        btnHistorico.setText("Consultar historico");
        btnHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoricoActionPerformed(evt);
            }
        });

        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNombre)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGraficas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIncidencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNombre)
                .addGap(28, 28, 28)
                .addComponent(btnUsuarios)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnIncidencias)
                        .addGap(18, 18, 18)
                        .addComponent(btnGraficas)
                        .addGap(18, 18, 18)
                        .addComponent(btnHistorico)
                        .addGap(18, 18, 18)
                        .addComponent(btnCerrarSesion))
                    .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
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

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        
        try { //conexion
            con=new Conexion();
            Connection reg=con.getConnection();
            /*
            

            
        
            JasperViewer view= new JasperViewer(jprint,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            */
            JasperReport reporte=null; //generar reporte
            String path="src\\reportes\\Usuarios.jasper";
            reporte=(JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint=JasperFillManager.fillReport(reporte,null,reg);
            Date date = new Date();
            DateFormat hourdateFormat = new SimpleDateFormat("HH-mm-ss-dd-MM-yyyy");
                
                
            JRPdfExporter exp = new JRPdfExporter();
            exp.setExporterInput(new SimpleExporterInput(jprint));
            exp.setExporterOutput(new SimpleOutputStreamExporterOutput("Reportes\\ReporteUsuarios"+hourdateFormat.format(date)+".pdf"));
            SimplePdfExporterConfiguration conf = new SimplePdfExporterConfiguration();
            exp.setConfiguration(conf);
            exp.exportReport();
            JOptionPane.showMessageDialog(null, "El reporte de usuarios fue generado exitosamente y se encuentra en la carpeta -Reportes-");
        
        
        } catch (JRRuntimeException ex2) {//excepciones
            JOptionPane.showMessageDialog(null, "Error al generar reporte, favor de informar al encargado del area sobre el siguiente mensaje de error: \n"+ex2, "Error", JOptionPane.WARNING_MESSAGE);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Error al generar reporte, favor de informar al encargado del area sobre el siguiente mensaje de error: \n"+ex, "Error", JOptionPane.WARNING_MESSAGE);
        } /*catch(FileNotFoundException ex3){
            
        }*/
        finally{
           con.desconectar();
        }
        
        //JRRuntimeException: java.io.FileNotFoundException
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoricoActionPerformed
        try { 
            con=new Conexion();
            Connection reg=con.getConnection();

            JasperReport reporte=null; 
            String path="src\\reportes\\Historico.jasper";

            reporte=(JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint=JasperFillManager.fillReport(reporte,null,reg);
        
            /*JasperViewer view= new JasperViewer(jprint,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);*/
        
        
            Date date = new Date();
            DateFormat hourdateFormat = new SimpleDateFormat("HH-mm-ss-dd-MM-yyyy");
            
            
                
                
            JRPdfExporter exp = new JRPdfExporter();
            exp.setExporterInput(new SimpleExporterInput(jprint));
            exp.setExporterOutput(new SimpleOutputStreamExporterOutput("Reportes\\Historico"+hourdateFormat.format(date)+".pdf"));
            SimplePdfExporterConfiguration conf = new SimplePdfExporterConfiguration();
            exp.setConfiguration(conf);
            exp.exportReport();
            JOptionPane.showMessageDialog(null, "El reporte fue generado exitosamente");
        
        
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Error al generar reporte, favor de informar al encargado del area sobre el siguiente mensaje de error: \n"+ex, "Error", JOptionPane.WARNING_MESSAGE);
        } catch (JRRuntimeException ex2) {
            JOptionPane.showMessageDialog(null, "Error al generar reporte, favor de informar al encargado del area sobre el siguiente mensaje de error: \n"+ex2, "Error", JOptionPane.WARNING_MESSAGE);
        }finally{
           con.desconectar();
        }
        
    }//GEN-LAST:event_btnHistoricoActionPerformed

    private void btnIncidenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncidenciasActionPerformed
        // TODO add your handling code here:
        try { 
            con=new Conexion();
            Connection reg=con.getConnection();

            JasperReport reporte=null; 
            String path="src\\reportes\\ReporteIncidencias.jasper";

            reporte=(JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint=JasperFillManager.fillReport(reporte,null,reg);
        
            /*JasperViewer view= new JasperViewer(jprint,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);*/
        
        
            Date date = new Date();
            DateFormat hourdateFormat = new SimpleDateFormat("HH-mm-ss-dd-MM-yyyy");
            
            
                
                
            JRPdfExporter exp = new JRPdfExporter();
            exp.setExporterInput(new SimpleExporterInput(jprint));
            exp.setExporterOutput(new SimpleOutputStreamExporterOutput("Reportes\\Incidencias"+hourdateFormat.format(date)+".pdf"));
            SimplePdfExporterConfiguration conf = new SimplePdfExporterConfiguration();
            exp.setConfiguration(conf);
            exp.exportReport();
            JOptionPane.showMessageDialog(null, "El reporte fue generado exitosamente");
        
        
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Error al generar reporte, favor de informar al encargado del area sobre el siguiente mensaje de error: \n"+ex, "Error", JOptionPane.WARNING_MESSAGE);
        } catch (JRRuntimeException ex2) {
            JOptionPane.showMessageDialog(null, "Error al generar reporte, favor de informar al encargado del area sobre el siguiente mensaje de error: \n"+ex2, "Error", JOptionPane.WARNING_MESSAGE);
        }finally{
           con.desconectar();
        } 
    }//GEN-LAST:event_btnIncidenciasActionPerformed

    private void btnGraficasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficasActionPerformed
        // TODO add your handling code here:
        new FrameGraficas(nombre).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGraficasActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        
        java.awt.EventQueue.invokeLater(new Runnable() {//cerrar sesion y abre pantalla de inicio
            public void run() {
                new Inicio().setVisible(true);//llama a otro frame
            }
        });
        this.setVisible(false);//deshabilita esta ventana
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrameAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameAdministrador().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnGraficas;
    private javax.swing.JButton btnHistorico;
    private javax.swing.JButton btnIncidencias;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbNombre;
    // End of variables declaration//GEN-END:variables
}
