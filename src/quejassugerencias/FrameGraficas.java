
package quejassugerencias;

import com.mysql.jdbc.Connection;
import net.sf.jasperreports.engine.JasperReport;
import java.sql.Timestamp;
import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
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


public class FrameGraficas extends javax.swing.JFrame {

    Conexion con;
    String nombre="";
    public FrameGraficas(String nombre) {
        this.nombre=nombre;
        initComponents();
        this.setTitle("Gráficas");//titulo que aparece en la ventana
        this.setLocationRelativeTo(null);//muestra la pantalla en el centro
        this.setResizable(false);//no se mueve el tamaño del frame
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAnio = new javax.swing.JComboBox<>();
        btnGraficaAnio = new javax.swing.JButton();
        comboMes = new javax.swing.JComboBox<>();
        btnGraficaMes = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        btnAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019"}));

        btnGraficaAnio.setText("Gráfica año");
        btnGraficaAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficaAnioActionPerformed(evt);
            }
        });

        comboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04","05","06","07","08","09","10","11","12" }));

        btnGraficaMes.setText("Gráfica mes");
        btnGraficaMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficaMesActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnAnio, 0, 87, Short.MAX_VALUE)
                            .addComponent(comboMes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGraficaMes)
                            .addComponent(btnGraficaAnio))
                        .addGap(117, 117, 117))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGraficaAnio))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGraficaMes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGraficaAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficaAnioActionPerformed
        
        try{
            con=new Conexion();//conexion
            Connection reg=con.getConnection();

            JasperReport reporte=null;
            String path="src\\Graficas\\GraficaAnnio.jasper";

            String anio= (String) btnAnio.getSelectedItem();//obtener año que se desea buscar

            Map parametro=new HashMap();

            Timestamp inferior = Timestamp.valueOf(anio+"-01-01 00:00:00");//limite inferior y superior de rango de fecha
            parametro.put("inferior",inferior);
            Timestamp superior = Timestamp.valueOf(anio+"-12-31 23:59:59");
            parametro.put("superior",superior);
            /*System.out.println(superior);
            System.out.println(inferior);*/
            Date date = new Date();
            DateFormat hourdateFormat = new SimpleDateFormat("HH-mm-ss-dd-MM-yyyy");//hora para guardar reporte
            
            reporte=(JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint=JasperFillManager.fillReport(reporte,parametro,reg);

            /*JasperViewer view= new JasperViewer(jprint,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);*/
            //se genera reporte
            JRPdfExporter exp = new JRPdfExporter();
            exp.setExporterInput(new SimpleExporterInput(jprint));
            exp.setExporterOutput(new SimpleOutputStreamExporterOutput("Reportes\\GraficaAnio"+hourdateFormat.format(date)+".pdf"));
            SimplePdfExporterConfiguration conf = new SimplePdfExporterConfiguration();
            exp.setConfiguration(conf);
            exp.exportReport();
            JOptionPane.showMessageDialog(null, "La gráfica fue generada exitosamente y se encuentra en la carpeta -Reportes-");
        }catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Error al generar reporte, favor de informar al encargado del area sobre el siguiente mensaje de error: \n"+ex, "Error", JOptionPane.WARNING_MESSAGE);
        } catch (JRRuntimeException ex2) {
            JOptionPane.showMessageDialog(null, "Error al generar reporte, favor de informar al encargado del area sobre el siguiente mensaje de error: \n"+ex2, "Error", JOptionPane.WARNING_MESSAGE);
        }finally{
           con.desconectar();
        } 
    }//GEN-LAST:event_btnGraficaAnioActionPerformed

    private void btnGraficaMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficaMesActionPerformed
        // TODO add your handling code here:
        try{//conexion a BD
            con=new Conexion();
            Connection reg=con.getConnection();
            
            Date date = new Date();
            DateFormat hourdateFormat = new SimpleDateFormat("HH-mm-ss-dd-MM-yyyy");
            
            JasperReport reporte=null;
            String path="src\\Graficas\\GraficaAnnio.jasper";

            String mes= (String) comboMes.getSelectedItem();

            Map parametro=new HashMap();
            //intervalos para los meses
            if(mes.equals("01")||mes.equals("03")||mes.equals("05")||mes.equals("07")||mes.equals("08")||mes.equals("10")||mes.equals("12")){
                Timestamp inferior = Timestamp.valueOf("2019-"+mes+"-01 00:00:00");
                parametro.put("inferior",inferior);
                Timestamp superior = Timestamp.valueOf("2019-"+mes+"-31 23:59:59");
                parametro.put("superior",superior);
            }else if(mes.equals("04")||mes.equals("06")||mes.equals("09")||mes.equals("11")){
                Timestamp inferior = Timestamp.valueOf("2019-"+mes+"-01 00:00:00");
                parametro.put("inferior",inferior);
                Timestamp superior = Timestamp.valueOf("2019-"+mes+"-30 23:59:59");
                parametro.put("superior",superior);
            }else if(mes.equals("02")){
                Timestamp inferior = Timestamp.valueOf("2019-"+mes+"-01 00:00:00");
                parametro.put("inferior",inferior);
                Timestamp superior = Timestamp.valueOf("2019-"+mes+"-28 23:59:59");
                parametro.put("superior",superior);
            }

            
            /*System.out.println(superior);
            System.out.println(inferior);*/
//se genera el reporte
            reporte=(JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint=JasperFillManager.fillReport(reporte,parametro,reg);

            /*JasperViewer view= new JasperViewer(jprint,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);*/
            JRPdfExporter exp = new JRPdfExporter();
            exp.setExporterInput(new SimpleExporterInput(jprint));
            exp.setExporterOutput(new SimpleOutputStreamExporterOutput("Reportes\\GraficaMes"+hourdateFormat.format(date)+".pdf"));
            SimplePdfExporterConfiguration conf = new SimplePdfExporterConfiguration();
            exp.setConfiguration(conf);
            exp.exportReport();
            JOptionPane.showMessageDialog(null, "La gráfica fue generada exitosamente y se encuentra en la carpeta -Reportes-");
        }catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Error al generar reporte, favor de informar al encargado del area sobre el siguiente mensaje de error: \n"+ex, "Error", JOptionPane.WARNING_MESSAGE);
        } catch (JRRuntimeException ex2) {
            JOptionPane.showMessageDialog(null, "Error al generar reporte, favor de informar al encargado del area sobre el siguiente mensaje de error: \n"+ex2, "Error", JOptionPane.WARNING_MESSAGE);
        }finally{
           con.desconectar();
        } 
    }//GEN-LAST:event_btnGraficaMesActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        
        java.awt.EventQueue.invokeLater(new Runnable() {//se abre la pantalla del frame administrador
            public void run() {
                new FrameAdministrador(nombre).setVisible(true);//llama al frame
            }
        });
        this.setVisible(false);//hace "invisible una ventana
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(FrameGraficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameGraficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameGraficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameGraficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameGraficas().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> btnAnio;
    private javax.swing.JButton btnGraficaAnio;
    private javax.swing.JButton btnGraficaMes;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> comboMes;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
