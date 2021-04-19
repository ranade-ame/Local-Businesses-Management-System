/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CustomerRole;

import Business.EcoSystem;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author bidar
 */
public class EateriesJPanel extends javax.swing.JPanel {

	/**
	 * Creates new form EateriesJPanel
	 */
	private JPanel userProcessContainer;
        private EcoSystem ecosystem;
	public EateriesJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
		this.userProcessContainer = userProcessContainer;
            this.ecosystem = ecosystem;
            initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                enterpriseLabel = new javax.swing.JLabel();
                valueLabel = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                tblcafeslist = new javax.swing.JTable();
                btnMenuDetails = new javax.swing.JButton();
                btnback = new javax.swing.JButton();

                enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                enterpriseLabel.setText("Hi");

                valueLabel.setText("<value>");

                tblcafeslist.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null, null},
                                {null, null, null, null, null, null}
                        },
                        new String [] {
                                "Restaurant Name", "Contact Number", "Address", "Street Address", "City", "ZipCode"
                        }
                ));
                jScrollPane1.setViewportView(tblcafeslist);
                if (tblcafeslist.getColumnModel().getColumnCount() > 0) {
                        tblcafeslist.getColumnModel().getColumn(5).setResizable(false);
                }

                btnMenuDetails.setText("View Menu Details");

                btnback.setText("<< Back");
                btnback.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnbackActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(76, 76, 76)
                                                .addComponent(enterpriseLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(valueLabel))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(btnback)
                                                .addGap(127, 127, 127)
                                                .addComponent(btnMenuDetails)))
                                .addContainerGap(242, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(valueLabel)
                                        .addComponent(enterpriseLabel))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnMenuDetails)
                                        .addComponent(btnback))
                                .addGap(120, 120, 120))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
                // TODO add your handling code here:
		userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerWorkAreaJPanel custAreajp = (CustomerWorkAreaJPanel) component;
        

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        }//GEN-LAST:event_btnbackActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnMenuDetails;
        private javax.swing.JButton btnback;
        private javax.swing.JLabel enterpriseLabel;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable tblcafeslist;
        private javax.swing.JLabel valueLabel;
        // End of variables declaration//GEN-END:variables
}
