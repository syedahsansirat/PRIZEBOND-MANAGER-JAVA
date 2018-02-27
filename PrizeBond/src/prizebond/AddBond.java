/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prizebond;

import welcome.WelcomePage;
import java.io.*;
import java.util.Date;
import java.util.logging.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Sirat
 */
public class AddBond extends javax.swing.JFrame {

    /**
     * Creates new form AddBond
     */
    String st;
    String myTokens = "";

    public AddBond() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon("img/icon.png").getImage());
        setResizable(false);
        try {
            int i = 1;
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/prizebond", "root", "");
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("select token from prizebond");
            while (resultSet.next()) {
                String token = resultSet.getString(1);
                myArea1.append("Token: " + i + " )  " + token + "\n");
                i++;
            }
            con.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error!\nPlease Apache and Mysql from Xampp!");

            new WelcomePage();
            dispose();
        }
        setVisible(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tokenTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        myArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prizebond Manager of Mydul Islam Chowdhury");

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setText("Add Prizebond");

        jLabel2.setText("Token: ");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        myArea1.setColumns(20);
        myArea1.setRows(5);
        jScrollPane1.setViewportView(myArea1);

        jLabel3.setText("Database: ");

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        backButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\uk\\Desktop\\Mydul Sir's Project\\PrizeBond\\img\\back.png")); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tokenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tokenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton)
                    .addComponent(deleteButton))
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        new WelcomePage();
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        Date dNow = new Date();
       // SimpleDateFormat ft = new SimpleDateFormat("E dd.MM.yyyy 'at' hh:mm a ");
         SimpleDateFormat ft = new SimpleDateFormat("E, dd / MM / yyyy");
        String entryDate = "";
        entryDate = "" + ft.format(dNow);

        String s = "";
        s = tokenTextField.getText();
        s = s.trim();
        if (s != null && !s.isEmpty()) {
            String[] words = s.split(",");
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/prizebond", "root", "");

                for (String w : words) {
                    int preparedStatementWork = 0;
                    Statement statement = con.createStatement();
                    statement.executeUpdate("INSERT INTO prizebond (token,date) VALUES ('" + w + "','" + entryDate + "')");
                    statement.close();
                }
                con.close();
                JOptionPane.showMessageDialog(this, "PrizeBonds Added Successfully!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error!\nPlease Turn On Apache and Mysql from Xampp!");
                new WelcomePage();
                dispose();
            }

            new AddBond();
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Please Enter Tokens...");
        }


    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String s = tokenTextField.getText();
        s = s.trim();
        String[] words = s.split(",");
        if (s != null && !s.isEmpty()) {
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/prizebond", "root", "");

                for (String w : words) {
                    int preparedStatementWork = 0;
                    Statement statement = con.createStatement();
                    statement.executeUpdate("delete from prizebond where token ='" + w + "'");
                    statement.close();
                }
                con.close();
                JOptionPane.showMessageDialog(this, "PrizeBonds (" + s + ") Deleted Successfully!");
            } catch (Exception ex) {
                 JOptionPane.showMessageDialog(this, "Error!\nPlease Turn On Apache and Mysql from Xampp!");
               new WelcomePage();
                dispose();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Enter Tokens...");
        }

        new AddBond();
        dispose();

    }//GEN-LAST:event_deleteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddBond.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBond.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBond.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBond.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBond().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea myArea1;
    private javax.swing.JTextField tokenTextField;
    // End of variables declaration//GEN-END:variables
}
