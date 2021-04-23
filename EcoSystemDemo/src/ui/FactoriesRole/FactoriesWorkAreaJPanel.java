/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.FactoriesRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.ItemCatalogue.Items;
import Business.ItemCatalogue.ItemsDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import static java.lang.Integer.parseInt;
import javax.swing.JPanel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ameya
 */
public class FactoriesWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FactoriesWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private Organization organization;
    private UserAccount account;
    private ItemsDirectory itemsdir;
    private OrganizationDirectory orgdir;
    private Enterprise enterprise;
    
    public FactoriesWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = business;
        this.account = account;
        this.enterprise = enterprise;
        this.organization = organization;
        System.out.println("Enterprise Name = " + enterprise.getName());
        System.out.println("Organization Name = " + organization.getName());
        if (organization.getItemsDirectory() != null){
                this.itemsdir = organization.getItemsDirectory();
            }
        else{
            this.itemsdir = new ItemsDirectory();
            organization.setItemsDirectory(itemsdir);
        }
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

                jLabel1 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                tfItemName = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                tfItemDescription = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                tfQuantity = new javax.swing.JTextField();
                tfPrice = new javax.swing.JTextField();
                btnDelete = new javax.swing.JButton();
                btnViewOrders = new javax.swing.JButton();
                btnAddItem = new javax.swing.JButton();
                jScrollPane5 = new javax.swing.JScrollPane();
                menuJTable = new javax.swing.JTable();

                setBackground(new java.awt.Color(255, 255, 255));

                jLabel1.setForeground(new java.awt.Color(0, 102, 204));
                jLabel1.setText("Add Items to available list");

                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Icons/images (2).png"))); // NOI18N

                jLabel7.setForeground(new java.awt.Color(0, 102, 204));
                jLabel7.setText("Item Name:");

                jLabel2.setForeground(new java.awt.Color(0, 102, 204));
                jLabel2.setText("Item Description:");

                jLabel3.setForeground(new java.awt.Color(0, 102, 204));
                jLabel3.setText("Price:");

                jLabel5.setForeground(new java.awt.Color(0, 102, 204));
                jLabel5.setText("Quantity :");

                tfQuantity.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                tfQuantityActionPerformed(evt);
                        }
                });

                tfPrice.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                tfPriceActionPerformed(evt);
                        }
                });

                btnDelete.setBackground(new java.awt.Color(255, 255, 255));
                btnDelete.setForeground(new java.awt.Color(240, 240, 240));
                btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Icons/delete-1432400-1211078-2.png"))); // NOI18N
                btnDelete.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnDeleteActionPerformed(evt);
                        }
                });

                btnViewOrders.setBackground(new java.awt.Color(0, 102, 204));
                btnViewOrders.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
                btnViewOrders.setForeground(new java.awt.Color(255, 255, 255));
                btnViewOrders.setText("View orders");
                btnViewOrders.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnViewOrdersActionPerformed(evt);
                        }
                });

                btnAddItem.setBackground(new java.awt.Color(0, 102, 204));
                btnAddItem.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
                btnAddItem.setForeground(new java.awt.Color(255, 255, 255));
                btnAddItem.setText("Add to List");
                btnAddItem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnAddItemActionPerformed(evt);
                        }
                });

                menuJTable.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "Item Name", "Description", "Price", "Quantity"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, true, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                jScrollPane5.setViewportView(menuJTable);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(68, 68, 68)
                                                                .addComponent(jLabel1)
                                                                .addGap(252, 252, 252))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel7)
                                                                                .addGap(82, 82, 82)
                                                                                .addComponent(tfItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel2)
                                                                                .addGap(54, 54, 54)
                                                                                .addComponent(tfItemDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel3)
                                                                                .addGap(115, 115, 115)
                                                                                .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel5)
                                                                                .addGap(92, 92, 92)
                                                                                .addComponent(tfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(82, 82, 82)))
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(151, 151, 151)
                                                .addComponent(btnAddItem)
                                                .addGap(33, 33, 33)
                                                .addComponent(btnViewOrders)
                                                .addGap(34, 34, 34)
                                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(122, Short.MAX_VALUE))
                        .addComponent(jScrollPane5)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jLabel7))
                                                        .addComponent(tfItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jLabel2))
                                                        .addComponent(tfItemDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jLabel3))
                                                        .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jLabel5))
                                                        .addComponent(tfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(8, 8, 8)))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnAddItem)
                                        .addComponent(btnViewOrders)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63))
                );
        }// </editor-fold>//GEN-END:initComponents

    private void tfQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfQuantityActionPerformed

    private void tfPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPriceActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = menuJTable.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Items item = itemsdir.getItem(menuJTable.getValueAt(selectedRow, 0).toString());
        itemsdir.deleteItem(item);
	JOptionPane.showMessageDialog(jScrollPane5,"Item deleted");
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrdersActionPerformed
        // TODO add your handling code here:
        ViewOrdersJPanel viewOrdersJPanel = new ViewOrdersJPanel(userProcessContainer, organization, enterprise, itemsdir);
        userProcessContainer.add("viewOrdersJPanel", viewOrdersJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewOrdersActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        // TODO add your handling code here:
        String itemName = tfItemName.getText();
        String itemDesc = tfItemDescription.getText();
        String itemPrice = tfPrice.getText();
        int itemQuantity = parseInt(tfQuantity.getText());
        Items item = itemsdir.addItem(itemName, itemDesc, itemPrice, itemQuantity);
	JOptionPane.showMessageDialog(jScrollPane5, "Item added to the list");
        populateTable();
    }//GEN-LAST:event_btnAddItemActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnAddItem;
        private javax.swing.JButton btnDelete;
        private javax.swing.JButton btnViewOrders;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JScrollPane jScrollPane5;
        private javax.swing.JTable menuJTable;
        private javax.swing.JTextField tfItemDescription;
        private javax.swing.JTextField tfItemName;
        private javax.swing.JTextField tfPrice;
        private javax.swing.JTextField tfQuantity;
        // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) menuJTable.getModel();
        model.setRowCount(0);
        for(Items i : itemsdir.getItemsList()){
            Object[] row = new Object[4];
            row[0] = i.getName();
            row[1] = i.getDesc();
            row[2] = i.getPrice();
            row[3] = i.getQuantity();
            model.addRow(row);
        } 
    }
}
