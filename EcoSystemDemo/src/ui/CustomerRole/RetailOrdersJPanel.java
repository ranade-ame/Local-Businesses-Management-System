/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CustomerRole;

import Business.Customer.Customer;
import Business.Enterprise.Enterprise;
import Business.ItemCatalogue.Items;
import Business.ItemCatalogue.ItemsDirectory;
import Business.Orders.Orders;
import java.awt.CardLayout;
import java.awt.Component;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bidar
 */
public class RetailOrdersJPanel extends javax.swing.JPanel {

	/**
	 * Creates new form RetailOrdersJPanel
	 */
        private JPanel userProcessContainer;
        private Enterprise enterprise;
        private Customer customer;
        private ItemsDirectory itemsdir;
        private Orders order;
        private ArrayList<Items> orderItems = new ArrayList<Items>();
        private ArrayList<Orders> orderplaced = new ArrayList<Orders>();
	public RetailOrdersJPanel(JPanel userProcessContainer, Enterprise enterprise, Customer customer) {
            initComponents();
            this.userProcessContainer = userProcessContainer;
            this.enterprise = enterprise;
            this.customer = customer;
            
            if (enterprise.getItemsDirectory() != null){
                this.itemsdir = enterprise.getItemsDirectory();
            }
            else{
                this.itemsdir = new ItemsDirectory();
                enterprise.setItemsDirectory(itemsdir);
            }
            
            populateMenuTable();
            populateCartTable();
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jScrollPane3 = new javax.swing.JScrollPane();
                cartJTable = new javax.swing.JTable();
                enterpriseLabel = new javax.swing.JLabel();
                btnAddtoCart = new javax.swing.JButton();
                btnRemovefromCart = new javax.swing.JButton();
                enterpriseLabel2 = new javax.swing.JLabel();
                btnConfirmOrder = new javax.swing.JButton();
                backJButton = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                tfTotalPrice = new javax.swing.JTextField();
                jScrollPane5 = new javax.swing.JScrollPane();
                menuJTable = new javax.swing.JTable();

                setBackground(new java.awt.Color(255, 255, 255));

                cartJTable.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "Item Name", "Description", "Price"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                jScrollPane3.setViewportView(cartJTable);
                if (cartJTable.getColumnModel().getColumnCount() > 0) {
                        cartJTable.getColumnModel().getColumn(0).setResizable(false);
                        cartJTable.getColumnModel().getColumn(1).setResizable(false);
                }

                enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                enterpriseLabel.setForeground(new java.awt.Color(0, 102, 204));
                enterpriseLabel.setText("Available Items");

                btnAddtoCart.setBackground(new java.awt.Color(0, 102, 204));
                btnAddtoCart.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
                btnAddtoCart.setForeground(new java.awt.Color(255, 255, 255));
                btnAddtoCart.setText("Add Item to Cart");
                btnAddtoCart.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnAddtoCartActionPerformed(evt);
                        }
                });

                btnRemovefromCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Icons/delete-1432400-1211078-2.png"))); // NOI18N
                btnRemovefromCart.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnRemovefromCartActionPerformed(evt);
                        }
                });

                enterpriseLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                enterpriseLabel2.setForeground(new java.awt.Color(0, 102, 204));
                enterpriseLabel2.setText("Cart Details");

                btnConfirmOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Icons/file_light-07-512-2.png"))); // NOI18N
                btnConfirmOrder.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnConfirmOrderActionPerformed(evt);
                        }
                });

                backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Icons/93634-2.png"))); // NOI18N
                backJButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                backJButtonActionPerformed(evt);
                        }
                });

                jLabel1.setForeground(new java.awt.Color(0, 102, 204));
                jLabel1.setText("Total Amount");

                menuJTable.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "Item Name", "Description", "Price", "Available Quantity"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false, false
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
                                                .addGap(10, 10, 10)
                                                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(496, 496, 496)
                                                .addComponent(btnRemovefromCart, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(enterpriseLabel)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(tfTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(enterpriseLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(596, 596, 596)))
                                                                .addComponent(btnConfirmOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(305, 305, 305)
                                                .addComponent(btnAddtoCart, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(55, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(btnAddtoCart)
                                .addGap(4, 4, 4)
                                .addComponent(enterpriseLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(btnRemovefromCart, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(tfTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnConfirmOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 11, Short.MAX_VALUE))))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void btnAddtoCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddtoCartActionPerformed
            // TODO add your handling code here:
            int selectedMenuRow = cartJTable.getSelectedRow();
            if(selectedMenuRow<0){
                JOptionPane.showMessageDialog(null,"Select a row","Warning",JOptionPane.WARNING_MESSAGE);
            }
            Items item = itemsdir.getItem(cartJTable.getValueAt(selectedMenuRow, 0).toString());
            orderItems.add(item);
	    JOptionPane.showMessageDialog(cartJTable, "Item Added to cart");
            populateCartTable();

        }//GEN-LAST:event_btnAddtoCartActionPerformed

        private void btnRemovefromCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovefromCartActionPerformed
            // TODO add your handling code here:
            int selectedCartRow = cartJTable.getSelectedRow();
            if(selectedCartRow<0){
                JOptionPane.showMessageDialog(null,"Select a row","Warning",JOptionPane.WARNING_MESSAGE);
            }
            Items item = itemsdir.getItem(menuJTable.getValueAt(selectedCartRow, 0).toString());
            orderItems.remove(item);
	    JOptionPane.showMessageDialog(cartJTable, "Item deleted from cart");
            populateCartTable();
        }//GEN-LAST:event_btnRemovefromCartActionPerformed

        private void btnConfirmOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmOrderActionPerformed
            int total = 0;
            for(Items i : orderItems){
                total = total + parseInt(i.getPrice());
            }
            tfTotalPrice.setText(String.valueOf(total));
            order = new Orders(enterprise.getName(), customer.getName(), orderItems, total, customer.getStreetAddress(), enterprise.getStreetaddress());
            orderplaced.add(order);
            customer.getOrderslist().add(order);
            enterprise.getOrders().add(order);
	    JOptionPane.showMessageDialog(cartJTable, "Order Placed");
            //customer.setOrderslist(orderplaced);
            
        }//GEN-LAST:event_btnConfirmOrderActionPerformed

        private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
            userProcessContainer.remove(this);
            Component[] componentArray = userProcessContainer.getComponents();
            Component component = componentArray[componentArray.length - 1];
//            CustomerWorkAreaJPanel custAreajp = (CustomerWorkAreaJPanel) component;
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        }//GEN-LAST:event_backJButtonActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton backJButton;
        private javax.swing.JButton btnAddtoCart;
        private javax.swing.JButton btnConfirmOrder;
        private javax.swing.JButton btnRemovefromCart;
        private javax.swing.JTable cartJTable;
        private javax.swing.JLabel enterpriseLabel;
        private javax.swing.JLabel enterpriseLabel2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JScrollPane jScrollPane3;
        private javax.swing.JScrollPane jScrollPane5;
        private javax.swing.JTable menuJTable;
        private javax.swing.JTextField tfTotalPrice;
        // End of variables declaration//GEN-END:variables

    private void populateMenuTable() {
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

    private void populateCartTable() {
        DefaultTableModel model = (DefaultTableModel) cartJTable.getModel();
        model.setRowCount(0);
        for(Items i : orderItems){
            Object[] row = new Object[3];
            row[0] = i.getName();
            row[1] = i.getDesc();
            row[2] = i.getPrice();
            
            model.addRow(row);
        }
    } 
}
