/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author this pc
 */
public class RemoveDealerFrm extends javax.swing.JFrame {

    /**
     * Creates new form RemoveDealerFrm
     */
    public RemoveDealerFrm() {
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

        jFrame1 = new javax.swing.JFrame();
        updateDealerAddrLable = new javax.swing.JLabel();
        updateDealerContinuingLable = new javax.swing.JLabel();
        updateDealerContinuing = new javax.swing.JCheckBox();
        updateDealerID = new javax.swing.JTextField();
        cancelUpdateBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        updateDealerTitle = new javax.swing.JLabel();
        updateDealerIDLable = new javax.swing.JLabel();
        updateDealerPhone = new javax.swing.JTextField();
        dealerName = new javax.swing.JTextField();
        updateDealerNameLable = new javax.swing.JLabel();
        updateDealerAddr = new javax.swing.JTextField();
        updateDealerPhoneLable = new javax.swing.JLabel();
        updateDealerSubTitle = new javax.swing.JLabel();
        updateSearchBtn = new javax.swing.JButton();
        jFrame2 = new javax.swing.JFrame();
        updateDealerAddrLable1 = new javax.swing.JLabel();
        updateDealerContinuingLable1 = new javax.swing.JLabel();
        updateDealerContinuing1 = new javax.swing.JCheckBox();
        updateDealerID1 = new javax.swing.JTextField();
        cancelUpdateBtn1 = new javax.swing.JButton();
        updateBtn1 = new javax.swing.JButton();
        updateDealerTitle1 = new javax.swing.JLabel();
        updateDealerIDLable1 = new javax.swing.JLabel();
        updateDealerPhone1 = new javax.swing.JTextField();
        dealerName1 = new javax.swing.JTextField();
        updateDealerNameLable1 = new javax.swing.JLabel();
        updateDealerAddr1 = new javax.swing.JTextField();
        updateDealerPhoneLable1 = new javax.swing.JLabel();
        updateDealerSubTitle1 = new javax.swing.JLabel();
        updateSearchBtn1 = new javax.swing.JButton();
        searchDealerIDLable = new javax.swing.JLabel();
        deleteDealerTitle1 = new javax.swing.JLabel();
        deleteDealerIDLable1 = new javax.swing.JLabel();
        deleteDealerID = new javax.swing.JTextField();
        deleteDealerBtn = new javax.swing.JButton();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        updateDealerAddrLable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateDealerAddrLable.setText("Dealer's address:");

        updateDealerContinuingLable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateDealerContinuingLable.setText("Continuing:");

        cancelUpdateBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelUpdateBtn.setText("Cancel ");
        cancelUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelUpdateBtnActionPerformed(evt);
            }
        });

        updateBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        updateDealerTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        updateDealerTitle.setText("Update Dealer's Information");

        updateDealerIDLable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateDealerIDLable.setText("Enter Dealer's ID:");

        updateDealerNameLable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateDealerNameLable.setText("Dealer's name:");

        updateDealerPhoneLable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateDealerPhoneLable.setText("Dealer's phone number:");

        updateDealerSubTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateDealerSubTitle.setText("Dealer's New Information");

        updateSearchBtn.setText("Search");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jFrame1Layout.createSequentialGroup()
                                        .addComponent(updateDealerPhoneLable)
                                        .addGap(18, 18, 18)
                                        .addComponent(updateDealerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(updateDealerNameLable)
                                            .addComponent(updateDealerContinuingLable)))
                                    .addComponent(updateDealerSubTitle))
                                .addGap(18, 18, 18)
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(updateDealerContinuing)
                                    .addComponent(updateDealerAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                                .addComponent(cancelUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                                .addComponent(updateDealerAddrLable)
                                .addGap(18, 18, 18)
                                .addComponent(dealerName, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(429, 429, 429)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                                .addComponent(updateDealerTitle)
                                .addGap(267, 267, 267))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                                .addComponent(updateDealerIDLable)
                                .addGap(37, 37, 37)
                                .addComponent(updateDealerID, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(updateSearchBtn)
                                .addGap(125, 125, 125))))))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateDealerTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateDealerID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateDealerIDLable)
                    .addComponent(updateSearchBtn))
                .addGap(69, 69, 69)
                .addComponent(updateDealerSubTitle)
                .addGap(61, 61, 61)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dealerName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateDealerNameLable)
                    .addComponent(updateDealerAddrLable)
                    .addComponent(updateDealerAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateDealerPhoneLable)
                    .addComponent(updateDealerContinuingLable)
                    .addComponent(updateDealerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateDealerContinuing))
                .addGap(20, 20, 20)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jFrame2.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        updateDealerAddrLable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateDealerAddrLable1.setText("Dealer's address:");

        updateDealerContinuingLable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateDealerContinuingLable1.setText("Continuing:");

        cancelUpdateBtn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelUpdateBtn1.setText("Cancel ");
        cancelUpdateBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelUpdateBtn1ActionPerformed(evt);
            }
        });

        updateBtn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateBtn1.setText("Update");
        updateBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtn1ActionPerformed(evt);
            }
        });

        updateDealerTitle1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        updateDealerTitle1.setText("Update Dealer's Information");

        updateDealerIDLable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateDealerIDLable1.setText("Enter Dealer's ID:");

        updateDealerNameLable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateDealerNameLable1.setText("Dealer's name:");

        updateDealerPhoneLable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateDealerPhoneLable1.setText("Dealer's phone number:");

        updateDealerSubTitle1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateDealerSubTitle1.setText("Dealer's New Information");

        updateSearchBtn1.setText("Search");

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame2Layout.createSequentialGroup()
                        .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame2Layout.createSequentialGroup()
                                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jFrame2Layout.createSequentialGroup()
                                        .addComponent(updateDealerPhoneLable1)
                                        .addGap(18, 18, 18)
                                        .addComponent(updateDealerPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(updateDealerNameLable1)
                                            .addComponent(updateDealerContinuingLable1)))
                                    .addComponent(updateDealerSubTitle1))
                                .addGap(18, 18, 18)
                                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(updateDealerContinuing1)
                                    .addComponent(updateDealerAddr1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame2Layout.createSequentialGroup()
                                .addComponent(cancelUpdateBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(updateBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame2Layout.createSequentialGroup()
                                .addComponent(updateDealerAddrLable1)
                                .addGap(18, 18, 18)
                                .addComponent(dealerName1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(429, 429, 429)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame2Layout.createSequentialGroup()
                                .addComponent(updateDealerTitle1)
                                .addGap(267, 267, 267))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame2Layout.createSequentialGroup()
                                .addComponent(updateDealerIDLable1)
                                .addGap(37, 37, 37)
                                .addComponent(updateDealerID1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(updateSearchBtn1)
                                .addGap(125, 125, 125))))))
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateDealerTitle1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateDealerID1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateDealerIDLable1)
                    .addComponent(updateSearchBtn1))
                .addGap(69, 69, 69)
                .addComponent(updateDealerSubTitle1)
                .addGap(61, 61, 61)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dealerName1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateDealerNameLable1)
                    .addComponent(updateDealerAddrLable1)
                    .addComponent(updateDealerAddr1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateDealerPhoneLable1)
                    .addComponent(updateDealerContinuingLable1)
                    .addComponent(updateDealerPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateDealerContinuing1))
                .addGap(20, 20, 20)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelUpdateBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        searchDealerIDLable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchDealerIDLable.setText("Enter Dealer's ID:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        deleteDealerTitle1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        deleteDealerTitle1.setText("Delete Dealer's Information");

        deleteDealerIDLable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteDealerIDLable1.setText("Enter Dealer's ID:");

        deleteDealerBtn.setText("Delete");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(deleteDealerTitle1)
                        .addGap(255, 255, 255))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(deleteDealerIDLable1)
                        .addGap(18, 18, 18)
                        .addComponent(deleteDealerID, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteDealerBtn)
                        .addGap(209, 209, 209))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteDealerTitle1)
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteDealerID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteDealerIDLable1)
                    .addComponent(deleteDealerBtn))
                .addContainerGap(261, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelUpdateBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelUpdateBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateBtnActionPerformed

    private void cancelUpdateBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelUpdateBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelUpdateBtn1ActionPerformed

    private void updateBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateBtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(RemoveDealerFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveDealerFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveDealerFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveDealerFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveDealerFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelUpdateBtn;
    private javax.swing.JButton cancelUpdateBtn1;
    private javax.swing.JTextField dealerName;
    private javax.swing.JTextField dealerName1;
    private javax.swing.JButton deleteDealerBtn;
    private javax.swing.JTextField deleteDealerID;
    private javax.swing.JLabel deleteDealerIDLable1;
    private javax.swing.JLabel deleteDealerTitle1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel searchDealerIDLable;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton updateBtn1;
    private javax.swing.JTextField updateDealerAddr;
    private javax.swing.JTextField updateDealerAddr1;
    private javax.swing.JLabel updateDealerAddrLable;
    private javax.swing.JLabel updateDealerAddrLable1;
    private javax.swing.JCheckBox updateDealerContinuing;
    private javax.swing.JCheckBox updateDealerContinuing1;
    private javax.swing.JLabel updateDealerContinuingLable;
    private javax.swing.JLabel updateDealerContinuingLable1;
    private javax.swing.JTextField updateDealerID;
    private javax.swing.JTextField updateDealerID1;
    private javax.swing.JLabel updateDealerIDLable;
    private javax.swing.JLabel updateDealerIDLable1;
    private javax.swing.JLabel updateDealerNameLable;
    private javax.swing.JLabel updateDealerNameLable1;
    private javax.swing.JTextField updateDealerPhone;
    private javax.swing.JTextField updateDealerPhone1;
    private javax.swing.JLabel updateDealerPhoneLable;
    private javax.swing.JLabel updateDealerPhoneLable1;
    private javax.swing.JLabel updateDealerSubTitle;
    private javax.swing.JLabel updateDealerSubTitle1;
    private javax.swing.JLabel updateDealerTitle;
    private javax.swing.JLabel updateDealerTitle1;
    private javax.swing.JButton updateSearchBtn;
    private javax.swing.JButton updateSearchBtn1;
    // End of variables declaration//GEN-END:variables
}
