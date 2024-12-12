/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bc5mc.ar101;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class JFRAME2 extends javax.swing.JFrame {

    /**
     * Creates new form JFRAME2
     */
    public JFRAME2() {
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

        AddSubjectInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        AddSubject = new javax.swing.JButton();
        BackToHome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddSubjectInput.setBackground(new java.awt.Color(255, 204, 204));
        AddSubjectInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AddSubjectInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        AddSubjectInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSubjectInputActionPerformed(evt);
            }
        });

        jLabel1.setText("Add subject");

        AddSubject.setText("Add");
        AddSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSubjectActionPerformed(evt);
            }
        });

        BackToHome.setText("Back");
        BackToHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackToHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackToHomeMouseClicked(evt);
            }
        });
        BackToHome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BackToHomeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(BackToHome))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AddSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82))
                            .addComponent(jLabel1)
                            .addComponent(AddSubjectInput, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(BackToHome)
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddSubjectInput, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddSubjectInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSubjectInputActionPerformed

    }//GEN-LAST:event_AddSubjectInputActionPerformed

    private void AddSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSubjectActionPerformed
        String subject = AddSubjectInput.getText();
        if(subject.isEmpty()){
            JOptionPane.showMessageDialog(null, "Field is empty");
            return;
        }
        DataManager.subjects.add(subject);
        AddSubjectInput.setText("");
        JOptionPane.showMessageDialog(null, "You entered: " + subject);
        System.out.println("Subjects in DataManager: " + DataManager.subjects);

    }//GEN-LAST:event_AddSubjectActionPerformed

    private void BackToHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackToHomeMouseClicked
        Home home = new Home();
        home.show();
        this.dispose();
    }//GEN-LAST:event_BackToHomeMouseClicked

    private void BackToHomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BackToHomeKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_BackToHomeKeyPressed

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
            java.util.logging.Logger.getLogger(JFRAME2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFRAME2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFRAME2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFRAME2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFRAME2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddSubject;
    private javax.swing.JTextField AddSubjectInput;
    private javax.swing.JLabel BackToHome;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
