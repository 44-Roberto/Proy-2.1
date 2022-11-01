/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.Color;
import java.awt.Image;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.ImageIcon;
import Funciones.AESencripter;
import Funciones.ArchivoSecuencial;

public class Backup extends javax.swing.JFrame {

    /**
     * Creates new form Backup
     */
    public Backup() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JBTNVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JTFRuta = new javax.swing.JTextField();
        JBTNUbicacion = new javax.swing.JButton();
        JBTNBackup = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        JBTNVolver.setBackground(new java.awt.Color(102, 102, 102));
        JBTNVolver.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        JBTNVolver.setForeground(new java.awt.Color(255, 255, 255));
        JBTNVolver.setText("Volver");
        JBTNVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNVolverActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Direccion del backup");

        JTFRuta.setBackground(new java.awt.Color(102, 102, 102));
        JTFRuta.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        JTFRuta.setForeground(new java.awt.Color(255, 255, 255));

        JBTNUbicacion.setBackground(new java.awt.Color(102, 102, 102));
        JBTNUbicacion.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        JBTNUbicacion.setForeground(new java.awt.Color(255, 255, 255));
        JBTNUbicacion.setText("Buscar Ubicacion");
        JBTNUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNUbicacionActionPerformed(evt);
            }
        });

        JBTNBackup.setBackground(new java.awt.Color(102, 102, 102));
        JBTNBackup.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        JBTNBackup.setForeground(new java.awt.Color(255, 255, 255));
        JBTNBackup.setText("Realizar Backup");
        JBTNBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNBackupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(JBTNUbicacion))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(JBTNVolver)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTFRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(111, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBTNBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBTNUbicacion)
                    .addComponent(JTFRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBTNVolver)
                    .addComponent(JBTNBackup))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBTNUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNUbicacionActionPerformed
        // TODO add your handling code here:
        JFileChooser dfile=new JFileChooser();
        dfile.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        File BackupDir;
        String PathDir="";

        int valor = dfile.showOpenDialog(this);
        if (valor == JFileChooser.APPROVE_OPTION) {
            BackupDir = dfile.getSelectedFile();
            PathDir = BackupDir.getPath();

            JTFRuta.setText(PathDir+"\\MEIA_backup");
        }
    }//GEN-LAST:event_JBTNUbicacionActionPerformed

    private void JBTNVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNVolverActionPerformed
        // TODO add your handling code here:
        Menu M1 = new Menu();
        M1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBTNVolverActionPerformed

    private void JBTNBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNBackupActionPerformed
        // TODO add your handling code here:
        Login log1 = new Login();
        if(!JTFRuta.getText().equals(""))
        {
            ImpBitBackup(log1.usertx,"C:\\MEIA");
            copiarDirectorios(new File("C:\\MEIA"), new File(JTFRuta.getText()));
            JOptionPane.showMessageDialog(null, "Backup realizado");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Escoja una ruta");
        }

    }//GEN-LAST:event_JBTNBackupActionPerformed

    
    //*******************
    private void copiarDirectorios(File d1, File d2){
        try {
            if (d1.isDirectory()) {
                if (!d2.exists()) {
                    d2.mkdir(); // si d2 no existe, lo crea
                }
            
                String[] ficheros = d1.list();
                for (int i=0; i < d1.list().length; i++) {
                    copiarDirectorios(new File(d1, ficheros[i]),
                        new File(d2, ficheros[i]));
                }
            }
            else {
                copiarFicheros(d1, d2);
            }
        } catch(Exception e){
            System.out.println(e);
        }
       
    }
    
    
    private void copiarFicheros(File f1, File f2){
        try {
            InputStream in = new FileInputStream(f1);
            OutputStream out = new FileOutputStream(f2);

            byte[] buf = new byte[1024];
            int len;

            while ((len = in.read(buf)) > 0) {
              out.write(buf, 0, len);
            }

            in.close();
            out.close();

        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
    public int i=0;
    public void ImpBitBackup(String User, String ruta_abs)
    {
    File bitacora_backup = new File("C:\\MEIA\\bitacora_backup.txt");
    File desc_bitacora_backup = new File("C:\\MEIA\\desc_bitacora_backup.txt");
    Login log1 = new Login();    
    
     DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
     LocalDateTime date = LocalDateTime.now();
     String dt = dtf.format(date);
        
     try {
            if(i==0)
            {
                i=1;
                PrintWriter dw= new PrintWriter(desc_bitacora_backup);
                dw.print(
                        "nombre_simbolico: bitacora_usuario\n"
                        +"fecha_creacion: "+dt+"\n"
                        +"usuario_creacion: "+log1.usertx+"\n"
                        +"fecha_modificacion: "+dt+"\n"
                        +"usuario_modificacion: "+log1.usertx+"\n"
                        +"#_registros: 1\n"
                );
                dw.close();
                
                FileWriter writer = new FileWriter(bitacora_backup, true);
                BufferedWriter bw = new BufferedWriter(writer);
                bw.write(JTFRuta.getText()+"|"+log1.usertx +"|"+dt+ System.getProperty("line.separator"));
                bw.close();
                writer.close();
                
            }
            else
            {
                ArrayList desc =ReadFile(desc_bitacora_backup);
                desc.set(3,"fecha_modificacion: "+dt);
                desc.set(4,"usuario_modificacion: "+log1.usertx);
                
                String[] aux=desc.get(5).toString().split(" ");
                int registros = Integer.parseInt(aux[1]);//Qué me da esto?
                registros++;
                desc.set(5,"#_registros: "+registros);
                
               PrintWriter descWriter = new PrintWriter(desc_bitacora_backup);
                for (int i = 0; i < desc.size(); i++) {
                    descWriter.println(desc.get(i).toString());
                }
                descWriter.close();
                    
                FileWriter writer = new FileWriter(bitacora_backup, true);
                BufferedWriter bw = new BufferedWriter(writer);
                bw.write(JTFRuta.getText()+"|"+log1.usertx +"|"+dt+ System.getProperty("line.separator"));
                bw.close();
                writer.close();
                
                
            }
                  
            
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    private ArrayList ReadFile(File input) {
        FileReader lectura;
        ArrayList response = new ArrayList();

        try {
            //crear el lector
            lectura = new FileReader(input);
            BufferedReader reader = new BufferedReader(lectura);
            String linea = "";

            try {
                linea = reader.readLine();

                while (linea != null) {
                    if (!"".equals(linea)) {
                        response.add(linea);
                    }
                    linea = reader.readLine();
                }

                lectura.close();
                reader.close();

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (FileNotFoundException ex) {
            // archivo no encontrado
            System.out.println(ex.getMessage());
        }
        return response;
    }
    //*******************
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
            java.util.logging.Logger.getLogger(Backup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Backup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Backup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Backup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Backup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton JBTNBackup;
    private javax.swing.JButton JBTNUbicacion;
    private javax.swing.JButton JBTNVolver;
    private javax.swing.JTextField JTFRuta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
