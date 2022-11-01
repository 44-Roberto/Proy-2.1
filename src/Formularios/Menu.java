/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

//import javax.swing.*;

import java.awt.Image;
import javax.swing.ImageIcon;


/**
 *
 * @author Roberto Moya
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        Login l2 = new Login();
        user_lbl.setText(l2.usertx);
        if (l2.rol == 1) {
            rol_lbl.setText("Administrador");
            JBTN_deleteProfile.setEnabled(false);
        }else{
            rol_lbl.setText("Usuario");
            JBTN_IngresarUser.setEnabled(false);
            JBTN_backup.setEnabled(false);
            JBTN_search.setEnabled(false);
        }
        foto_lbl.setIcon(new ImageIcon(l2.FotoPath));
        //******
        
        
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
        JBTN_backup = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JBTN_IngresarUser = new javax.swing.JButton();
        JBTN_modify = new javax.swing.JButton();
        foto_lbl = new javax.swing.JLabel();
        user_lbl = new javax.swing.JLabel();
        rol_lbl = new javax.swing.JLabel();
        JBTN_search = new javax.swing.JButton();
        JBTN_deleteProfile = new javax.swing.JButton();
        JBTN_logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        JBTN_backup.setBackground(new java.awt.Color(102, 102, 102));
        JBTN_backup.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        JBTN_backup.setForeground(new java.awt.Color(255, 255, 255));
        JBTN_backup.setText("Backup");
        JBTN_backup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTN_backupActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INICIO");

        JBTN_IngresarUser.setBackground(new java.awt.Color(102, 102, 102));
        JBTN_IngresarUser.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        JBTN_IngresarUser.setForeground(new java.awt.Color(255, 255, 255));
        JBTN_IngresarUser.setText("Ingresar usuario");
        JBTN_IngresarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTN_IngresarUserActionPerformed(evt);
            }
        });

        JBTN_modify.setBackground(new java.awt.Color(102, 102, 102));
        JBTN_modify.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        JBTN_modify.setForeground(new java.awt.Color(255, 255, 255));
        JBTN_modify.setText("Modificar datos");
        JBTN_modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTN_modifyActionPerformed(evt);
            }
        });

        foto_lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        user_lbl.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        user_lbl.setForeground(new java.awt.Color(255, 255, 255));
        user_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_lbl.setText("User");
        user_lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        rol_lbl.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        rol_lbl.setForeground(new java.awt.Color(255, 255, 255));
        rol_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rol_lbl.setText("Rol");
        rol_lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JBTN_search.setBackground(new java.awt.Color(102, 102, 102));
        JBTN_search.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        JBTN_search.setForeground(new java.awt.Color(255, 255, 255));
        JBTN_search.setText("Buscar usuario");
        JBTN_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTN_searchActionPerformed(evt);
            }
        });

        JBTN_deleteProfile.setBackground(new java.awt.Color(102, 102, 102));
        JBTN_deleteProfile.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        JBTN_deleteProfile.setForeground(new java.awt.Color(255, 255, 255));
        JBTN_deleteProfile.setText("Eliminar perfil");

        JBTN_logout.setBackground(new java.awt.Color(102, 102, 102));
        JBTN_logout.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        JBTN_logout.setForeground(new java.awt.Color(255, 255, 255));
        JBTN_logout.setText("Cerrar sesión");
        JBTN_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTN_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(JBTN_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JBTN_IngresarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JBTN_backup, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JBTN_deleteProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBTN_search, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBTN_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(103, 103, 103)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(user_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(foto_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rol_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addComponent(jLabel1)))
                    .addContainerGap(91, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(345, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JBTN_search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBTN_deleteProfile)
                        .addGap(18, 18, 18)
                        .addComponent(JBTN_logout))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JBTN_IngresarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBTN_modify)
                        .addGap(18, 18, 18)
                        .addComponent(JBTN_backup)))
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(foto_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(27, 27, 27)
                    .addComponent(user_lbl)
                    .addGap(18, 18, 18)
                    .addComponent(rol_lbl)
                    .addContainerGap(142, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBTN_IngresarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTN_IngresarUserActionPerformed
        // TODO add your handling code here:
        CreateUsersForm C1= new CreateUsersForm();
        C1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JBTN_IngresarUserActionPerformed
public static int ValAdm=0;
public static int ValMod=0;
    private void JBTN_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTN_logoutActionPerformed
        // TODO add your handling code here:
         Login l1 = new Login();
        l1.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_JBTN_logoutActionPerformed

    private void JBTN_backupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTN_backupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBTN_backupActionPerformed

    private void JBTN_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTN_searchActionPerformed
        // TODO add your handling code here:
        //Busqueda de usuario
        
        ValMod=1;//1 es que vino para buscar
        OperationsForm of1 = new OperationsForm();
        of1.setVisible(true);
        
        
        
    }//GEN-LAST:event_JBTN_searchActionPerformed

    private void JBTN_modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTN_modifyActionPerformed
        // TODO add your handling code here:
        ValMod=2;//1 es que vino para buscar
        OperationsForm of1 = new OperationsForm();
        of1.setVisible(true);
    }//GEN-LAST:event_JBTN_modifyActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
               
               
          
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTN_IngresarUser;
    private javax.swing.JButton JBTN_backup;
    private javax.swing.JButton JBTN_deleteProfile;
    private javax.swing.JButton JBTN_logout;
    private javax.swing.JButton JBTN_modify;
    private javax.swing.JButton JBTN_search;
    private javax.swing.JLabel foto_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel rol_lbl;
    private javax.swing.JLabel user_lbl;
    // End of variables declaration//GEN-END:variables
}
