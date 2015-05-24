package br.com.unlock.view;

/**
 *
 * @author Enoque Felipe
 */
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class getBranch extends javax.swing.JFrame {

    private static String branch;

    public getBranch() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTitle = new javax.swing.JLabel();
        jBunlock = new javax.swing.JButton();
        jTExit = new javax.swing.JToggleButton();
        jLBranch = new javax.swing.JLabel();
        jBLock = new javax.swing.JButton();
        jLBy = new javax.swing.JLabel();
        jFBranch = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLTitle.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLTitle.setText("Desbloqueio de Ramal");

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

        jLBranch.setText("RAMAL >>");

        jBLock.setText("Bloquear");
        jBLock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBLockMouseClicked(evt);
            }
        });
        jBLock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLockActionPerformed(evt);
            }
        });

        jLBy.setText("Powered by @eleal");

        try {
            jFBranch.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFBranch.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLBy)
                        .addGap(74, 74, 74)
                        .addComponent(jTExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLBranch)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFBranch)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBLock, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBunlock)))))
                .addGap(0, 27, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBranch)
                    .addComponent(jFBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBunlock)
                    .addComponent(jBLock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTExit, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLBy, javax.swing.GroupLayout.Alignment.TRAILING))
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

    private void jBLockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLockMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jBLockMouseClicked

    private void jBLockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLockActionPerformed
        try {
            lock();
        } catch (IOException ex) {
            Logger.getLogger(getBranch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBLockActionPerformed

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
        if (branch.equals("    ")) {
            JOptionPane.showMessageDialog(null, "DIGITE O RAMAL!");
        } else {
            try (FileWriter arq = new FileWriter("E:\\MV2000\\pari\\mvintegracao\\diretorio_envio_novo\\check." + branch + "a.txt")) {
//            try (FileWriter arq = new FileWriter("c:\\check." + branch + "a.txt")) {
                PrintWriter gravarArq = new PrintWriter(arq);
                gravarArq.printf("modiM " + branch + " RAMAL DESBLOQUEADO 1   " + branch + " 4               0");
                JOptionPane.showMessageDialog(null, "RAMAL DESBLOQUEADO COM SUCESSO!");
                finish();
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e);
                 finish();
            }
        }
    }

    public void lock() throws IOException {
        getBranch();
        if (branch.equals("    ")) {
            JOptionPane.showMessageDialog(null, "DIGITE O RAMAL!");
        } else {
            try (FileWriter arq = new FileWriter("E:\\MV2000\\pari\\mvintegracao\\diretorio_envio_novo\\check." + branch + "a.txt")) {
                PrintWriter gravarArq = new PrintWriter(arq);
                gravarArq.printf("modiM " + branch + " RAMAL BLaqOQUEADO 1   " + branch + " 8               0");

                JOptionPane.showMessageDialog(null, "RAMAL BLOQUEADO COM SUCESSO!");
                finish();
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null,"Erro: " +  e);
                 finish();
            }
        }
    }

    public void getBranch() {
        branch = jFBranch.getText().toUpperCase();
    }

    public void finish() {
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLock;
    private javax.swing.JButton jBunlock;
    private javax.swing.JFormattedTextField jFBranch;
    private javax.swing.JLabel jLBranch;
    private javax.swing.JLabel jLBy;
    private javax.swing.JLabel jLTitle;
    private javax.swing.JToggleButton jTExit;
    // End of variables declaration//GEN-END:variables
}
