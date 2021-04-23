/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bidar
 */
public class RetailJPanel extends javax.swing.JPanel {

	/**
	 * Creates new form RetailJPanel
	 */
	private JPanel userProcessContainer;
        private EcoSystem ecosystem;
        private Customer customer;
	public RetailJPanel(JPanel userProcessContainer, EcoSystem ecosystem, Customer customer) {
		initComponents();
                this.userProcessContainer = userProcessContainer;
                this.ecosystem = ecosystem;
                this.customer = customer;
                populateTable();
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                lblAvailableStores = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                retailJTable = new javax.swing.JTable();
                btnMenuDetails = new javax.swing.JButton();
                backJButton = new javax.swing.JButton();

                setBackground(new java.awt.Color(255, 255, 255));

                lblAvailableStores.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
                lblAvailableStores.setForeground(new java.awt.Color(0, 102, 204));
                lblAvailableStores.setText("Below are the nearest local services available for you ");

                retailJTable.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "Store Name", "Contact Number", "Street Address", "City", "ZipCode"
                        }
                ));
                jScrollPane1.setViewportView(retailJTable);

                btnMenuDetails.setBackground(new java.awt.Color(0, 102, 204));
                btnMenuDetails.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
                btnMenuDetails.setForeground(new java.awt.Color(255, 255, 255));
                btnMenuDetails.setText("View Details");
                btnMenuDetails.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnMenuDetailsActionPerformed(evt);
                        }
                });

                backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Icons/93634-2.png"))); // NOI18N
                backJButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                backJButtonActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(200, 200, 200)
                                                .addComponent(lblAvailableStores))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(370, 370, 370)
                                                .addComponent(btnMenuDetails))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(78, 78, 78)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(80, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(lblAvailableStores)
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMenuDetails))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
            userProcessContainer.remove(this);
            Component[] componentArray = userProcessContainer.getComponents();
            Component component = componentArray[componentArray.length - 1];
//            CustomerWorkAreaJPanel custAreajp = (CustomerWorkAreaJPanel) component;
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        }//GEN-LAST:event_backJButtonActionPerformed

    private void btnMenuDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = retailJTable.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String enterpriseName = retailJTable.getValueAt(selectedRow, 0).toString();
        Enterprise enterprise = null;
        for(Network n: ecosystem.getNetworkList()){
                for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
                    if(e.getEnterpriseType().toString().equals("Retail")){
                        if(e.getName().equalsIgnoreCase(enterpriseName)){
                            enterprise = e;
                        }
                    }
                }
            }
        
        RetailOrdersJPanel retailorderJPanel = new RetailOrdersJPanel(userProcessContainer, enterprise, customer);
        userProcessContainer.add("retailorderJPanel", retailorderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnMenuDetailsActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton backJButton;
        private javax.swing.JButton btnMenuDetails;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JLabel lblAvailableStores;
        private javax.swing.JTable retailJTable;
        // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) retailJTable.getModel();
            model.setRowCount(0);
            for(Network n: ecosystem.getNetworkList()){
                for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
                    if(e.getEnterpriseType().toString().equals("Retail")){
                        if(e.getZipcode() == customer.getZipcode()){
                            System.out.println("Enterprise Name :" + e.getName());
                            Object[] row = new Object[5];
                            row[0] = e.getName();
                            row[1] = e.getPhone();
                            row[2] = e.getStreetaddress();
                            row[3] = e.getCity();
                            row[4] = e.getZipcode();
                            model.addRow(row);
                    }
                }
            }
        }
    }   
}
