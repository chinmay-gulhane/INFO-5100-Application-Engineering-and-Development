/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * WorkAreaJPanel.java
 *
 * Created on May 17, 2020, 8:35:29 AM
 */
package UserInterface.Main.WorkSpaceProfiles;

import TheBusiness.Business.Business;
import UserInterface.ManageTheBusiness.AddSolutionOfferJPanel;
import UserInterface.ManageTheBusiness.ManageSolutionJPanel;
import UserInterface.ManageTheBusiness.ManageTheBusinessJPanel;
import UserInterface.ManageTheBusiness.ManageTheChannelJPanel;
import UserInterface.ManageTheBusiness.ManageTheMCAComboJPanel;
import UserInterface.ProductManagement.ManageSuppliersJPanel;
import javax.swing.JPanel;

/**
 *
 * @author kal
 */
public class MarketingManagerWorkAreaJPanel1 extends javax.swing.JPanel {

    javax.swing.JPanel CardSequencePanel;
    Business business;

    /**
     * Creates new form UnitRiskWorkArea
     */

    public MarketingManagerWorkAreaJPanel1(Business b, JPanel clp) {

        business = b;
        this.CardSequencePanel = clp;
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

        jButton4 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(51, 51, 51));

        jButton4.setBackground(new java.awt.Color(102, 153, 255));
        jButton4.setFont(getFont());
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Manage Markets");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton4.setMinimumSize(new java.awt.Dimension(20, 23));
        jButton4.setPreferredSize(new java.awt.Dimension(240, 30));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4IdentifyResourceAssetsActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(102, 153, 255));
        jButton10.setFont(getFont());
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Manage Channels");
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton10.setMinimumSize(new java.awt.Dimension(20, 20));
        jButton10.setPreferredSize(new java.awt.Dimension(240, 25));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Marketing ");

        jButton12.setBackground(new java.awt.Color(102, 153, 255));
        jButton12.setFont(getFont());
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Manage Market and Channel Combo");
        jButton12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton12.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton12.setMinimumSize(new java.awt.Dimension(20, 20));
        jButton12.setPreferredSize(new java.awt.Dimension(240, 25));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(102, 153, 255));
        jButton7.setFont(getFont());
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Manage Solution Offers");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.setMaximumSize(new java.awt.Dimension(145, 40));
        jButton7.setMinimumSize(new java.awt.Dimension(20, 20));
        jButton7.setPreferredSize(new java.awt.Dimension(240, 25));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7IdentifyEventsActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(102, 153, 255));
        jButton8.setFont(getFont());
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Add Solution Offer");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.setMaximumSize(new java.awt.Dimension(145, 40));
        jButton8.setMinimumSize(new java.awt.Dimension(20, 20));
        jButton8.setPreferredSize(new java.awt.Dimension(240, 25));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8IdentifyEventsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(195, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4IdentifyResourceAssetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4IdentifyResourceAssetsActionPerformed
        // TODO add your handling code here:
        //CardSequencePanel.removeAll();

        ManageTheBusinessJPanel aos = new ManageTheBusinessJPanel(business, CardSequencePanel);

        CardSequencePanel.add("ManageVulns", aos);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_jButton4IdentifyResourceAssetsActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:

        ManageTheChannelJPanel mcj = new ManageTheChannelJPanel(business, CardSequencePanel);
        CardSequencePanel.add("ManageTheChannelJPanel", mcj);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        ManageTheMCAComboJPanel mso = new ManageTheMCAComboJPanel(business, CardSequencePanel);
        CardSequencePanel.add("ManageTheMCAComboJPanel", mso);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton7IdentifyEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7IdentifyEventsActionPerformed
        // TODO add your handling code here:
        ManageSolutionJPanel mso = new ManageSolutionJPanel(business, CardSequencePanel);
        CardSequencePanel.add("AddSolutionOfferJPanel", mso);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_jButton7IdentifyEventsActionPerformed

    private void jButton8IdentifyEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8IdentifyEventsActionPerformed
        // TODO add your handling code here:
        AddSolutionOfferJPanel aso = new AddSolutionOfferJPanel(business, CardSequencePanel);
        CardSequencePanel.add("AddSolutionOfferJPanel", aso);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_jButton8IdentifyEventsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
