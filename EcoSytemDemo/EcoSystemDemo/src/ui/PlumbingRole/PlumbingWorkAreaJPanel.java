/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PlumbingRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author ameya
 */
public class PlumbingWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PlumbingWorkAreaJPanel
     */
    public PlumbingWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
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

                jScrollPane1 = new javax.swing.JScrollPane();
                workRequestJTable = new javax.swing.JTable();
                assignJButton = new javax.swing.JButton();
                refreshJButton = new javax.swing.JButton();
                processJButton = new javax.swing.JButton();
                enterpriseLabel = new javax.swing.JLabel();
                valueLabel = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();

                setBackground(new java.awt.Color(255, 255, 255));

                workRequestJTable.setForeground(new java.awt.Color(0, 102, 204));
                workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "OrderID", "Customer Name", "Customer Address", "Issue Description", "Status", "Assigned To"
                        }
                ) {
                        Class[] types = new Class [] {
                                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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

                assignJButton.setBackground(new java.awt.Color(0, 102, 204));
                assignJButton.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
                assignJButton.setText("Assign to me");
                assignJButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                assignJButtonActionPerformed(evt);
                        }
                });

                refreshJButton.setBackground(new java.awt.Color(0, 102, 204));
                refreshJButton.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
                refreshJButton.setText("Refresh");
                refreshJButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                refreshJButtonActionPerformed(evt);
                        }
                });

                processJButton.setBackground(new java.awt.Color(0, 102, 204));
                processJButton.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
                processJButton.setText("Process");
                processJButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                processJButtonActionPerformed(evt);
                        }
                });

                enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                enterpriseLabel.setForeground(new java.awt.Color(0, 102, 204));
                enterpriseLabel.setText("Hi");

                valueLabel.setForeground(new java.awt.Color(0, 102, 204));
                valueLabel.setText("<value>");

                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Icons/plumbericon.png"))); // NOI18N

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(enterpriseLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(valueLabel)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(127, 127, 127)
                                                                .addComponent(refreshJButton)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(processJButton)
                                                .addGap(93, 93, 93))))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(valueLabel)
                                        .addComponent(enterpriseLabel))
                                .addGap(38, 38, 38)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(assignJButton)
                                        .addComponent(refreshJButton)
                                        .addComponent(processJButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6, 6, 6))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        }//GEN-LAST:event_assignJButtonActionPerformed

        private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed

        }//GEN-LAST:event_refreshJButtonActionPerformed

        private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        }//GEN-LAST:event_processJButtonActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton assignJButton;
        private javax.swing.JLabel enterpriseLabel;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JButton processJButton;
        private javax.swing.JButton refreshJButton;
        private javax.swing.JLabel valueLabel;
        private javax.swing.JTable workRequestJTable;
        // End of variables declaration//GEN-END:variables
}