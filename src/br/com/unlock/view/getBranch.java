package br.com.unlock.view;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class getBranch extends javax.swing.JFrame {

    private static String branch;
    private static String name;

    public getBranch() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTitle = new javax.swing.JLabel();
        jTBranch = new javax.swing.JTextField();
        jBunlock = new javax.swing.JButton();
        jTExit = new javax.swing.JToggleButton();
        jTName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLTitle.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLTitle.setText("Desbloqueio de Ramal");

        jTBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBranchActionPerformed(evt);
            }
        });

        jBunlock.setText("Desbloquear");
        jBunlock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBunlockMouseClicked(evt);
            }
        });
        jBunlock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBunlockActionPerformed(evt);
            }
        });

        jTExit.setText("Sair");
        jTExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLTitle)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTExit)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104))))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jBunlock)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jTName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBunlock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jTExit)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBunlockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBunlockActionPerformed
        try {
            unlock();
        } catch (IOException ex) {
            Logger.getLogger(getBranch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBunlockActionPerformed

    private void jBunlockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBunlockMouseClicked
        try {
            unlock();
        } catch (IOException ex) {
            Logger.getLogger(getBranch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBunlockMouseClicked

    private void jTExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTExitActionPerformed
        finish();
    }//GEN-LAST:event_jTExitActionPerformed

    private void jTBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBranchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBranchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new getBranch().setVisible(true);
            }
        });
    }

    public void unlock() throws IOException {
        getBranch();
        if (branch.equals("") || (name.equals(""))) {
            JOptionPane.showMessageDialog(null, "Preencha as informações!");
        } else {
            try (FileWriter arq = new FileWriter("c:\\check." + branch + "a.txt")) {
                PrintWriter gravarArq = new PrintWriter(arq);
                gravarArq.printf("modiM " + branch + " " + name + " 1   " + branch + " 4               0");
            }
            System.out.printf("\n Ramal desbloqueado com sucesso!, o arquivo foi salvo em \"c:\\check." + branch + "a.txt\".\n");
            JOptionPane.showMessageDialog(null, "Ramal desbloqueado com sucesso!");
            finish();
        }
    }

    public void getBranch() {
        branch = jTBranch.getText();
        name = jTName.getText().toUpperCase();
    }

    public void finish() {
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBunlock;
    private javax.swing.JLabel jLTitle;
    private javax.swing.JTextField jTBranch;
    private javax.swing.JToggleButton jTExit;
    private javax.swing.JTextField jTName;
    // End of variables declaration//GEN-END:variables
}
