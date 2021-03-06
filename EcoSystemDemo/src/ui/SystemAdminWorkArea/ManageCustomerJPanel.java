/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import ui.AdministrativeRole.*;
import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;

import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ameya
 */
public class ManageCustomerJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer; 
    private EcoSystem ecosystem;
    private CustomerDirectory customerDirectory;
    /**
     * Creates new form ManageCustomerJPanel
     */
    public ManageCustomerJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.customerDirectory = ecosystem.getCustomerdirectory();
        populateTable();
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
                tblCustomer = new javax.swing.JTable();
                btnDelete = new javax.swing.JButton();
                btnCreate = new javax.swing.JButton();
                btnModify = new javax.swing.JButton();
                btnBack = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();

                setBackground(new java.awt.Color(255, 255, 255));

                tblCustomer.setForeground(new java.awt.Color(0, 102, 204));
                tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null}
                        },
                        new String [] {
                                "Username", "Name ", "Phone Number", "Email Address", "Street Address", "Country", "City", "Zipcode", "Age"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, true, false, false, false, true, true, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                jScrollPane1.setViewportView(tblCustomer);

                btnDelete.setForeground(new java.awt.Color(0, 102, 204));
                btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Icons/delete-1432400-1211078-2.png"))); // NOI18N
                btnDelete.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnDeleteActionPerformed(evt);
                        }
                });

                btnCreate.setBackground(new java.awt.Color(0, 102, 204));
                btnCreate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
                btnCreate.setForeground(new java.awt.Color(255, 255, 255));
                btnCreate.setText("Create Customer");
                btnCreate.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnCreateActionPerformed(evt);
                        }
                });

                btnModify.setBackground(new java.awt.Color(0, 102, 204));
                btnModify.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
                btnModify.setForeground(new java.awt.Color(255, 255, 255));
                btnModify.setText("Modify Customer");
                btnModify.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnModifyActionPerformed(evt);
                        }
                });

                btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Icons/93634-2.png"))); // NOI18N
                btnBack.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnBackActionPerformed(evt);
                        }
                });

                jLabel1.setBackground(new java.awt.Color(255, 255, 255));
                jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(0, 102, 204));
                jLabel1.setText("Manage Customer");

                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Icons/group Enterprise.png"))); // NOI18N

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(225, 225, 225)
                                                .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(176, 176, 176)
                                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(28, 28, 28)
                                                                .addComponent(jLabel1)
                                                                .addGap(54, 54, 54)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(39, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnBack)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnModify)
                                                        .addComponent(btnCreate)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnDelete)))
                                .addContainerGap(46, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        CreateCustomerJPanel createCustomer = new CreateCustomerJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("CreateCustomersJPanel",createCustomer);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCustomer.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Customer customer = (Customer)tblCustomer.getValueAt(selectedRow,0);
        ModifyCustomerJPanel modifyCustomer = new ModifyCustomerJPanel(userProcessContainer, ecosystem, customerDirectory, customer);
        userProcessContainer.add("ModifyCustomersJPanel",modifyCustomer);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCustomer.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Customer customer = (Customer) tblCustomer.getValueAt(selectedRow, 0);
        customerDirectory.deleteCustomer(customer);
	JOptionPane.showMessageDialog(btnCreate, "Customer deleted from the database");
        populateTable();

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
//        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        //sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnBack;
        private javax.swing.JButton btnCreate;
        private javax.swing.JButton btnDelete;
        private javax.swing.JButton btnModify;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable tblCustomer;
        // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblCustomer.getModel();
        dtm.setRowCount(0);
        for(Customer customer : ecosystem.getCustomerdirectory().getCustomerDir()){
            Object [] row = new Object[9];
            row[0] = customer;
            row[1] = customer.getName();
            row[2] = customer.getPhone();
            row[3] = customer.getEmail();
            row[4] = customer.getStreetAddress();
            row[5] = customer.getCountry();
            row[6] = customer.getCity();
            row[7] = customer.getZipcode();
            row[8] = customer.getAge();
            dtm.addRow(row);
        }
    }
}
