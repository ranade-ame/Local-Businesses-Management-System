/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DeliveryRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author abhishek <your.name at your.org>
 */
public class DeliveryWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryWorkAreaJPanel
     */
    public DeliveryWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
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

                enterpriseLabel = new javax.swing.JLabel();
                valueLabel = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                workRequestJTable = new javax.swing.JTable();
                refreshJButton = new javax.swing.JButton();
                processJButton = new javax.swing.JButton();
                jButton1 = new javax.swing.JButton();

                enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                enterpriseLabel.setText("Hi");

                valueLabel.setText("<value>");

                workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "OrderID", "Organization Name", "Customer Name", "Delivery Address", "Order Amount", "Order Status"
                        }
                ) {
                        Class[] types = new Class [] {
                                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
                        };
                        boolean[] canEdit = new boolean [] {
                                false, false, false, false, false, false
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types [columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                jScrollPane1.setViewportView(workRequestJTable);

                refreshJButton.setText("Refresh");
                refreshJButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                refreshJButtonActionPerformed(evt);
                        }
                });

                processJButton.setText("Order Picked");
                processJButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                processJButtonActionPerformed(evt);
                        }
                });

                jButton1.setText("Delivered");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(enterpriseLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(valueLabel))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(141, 141, 141)
                                                .addComponent(refreshJButton)
                                                .addGap(48, 48, 48)
                                                .addComponent(processJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(jButton1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(valueLabel)
                                        .addComponent(enterpriseLabel))
                                .addGap(31, 31, 31)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(refreshJButton)
                                        .addComponent(processJButton)
                                        .addComponent(jButton1))
                                .addContainerGap(225, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
                
        }//GEN-LAST:event_refreshJButtonActionPerformed

        private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

                
        }//GEN-LAST:event_processJButtonActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel enterpriseLabel;
        private javax.swing.JButton jButton1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JButton processJButton;
        private javax.swing.JButton refreshJButton;
        private javax.swing.JLabel valueLabel;
        private javax.swing.JTable workRequestJTable;
        // End of variables declaration//GEN-END:variables
}
