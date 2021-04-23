/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.TransportRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.ItemCatalogue.Items;
import Business.Orders.Orders;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author abhishek
 */
public class TransportWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TransportWorkAreaJPanel
     */
    private Enterprise enterprise;
    private JPanel userProcessContainer;
    private Organization organization;
    private EcoSystem business;
    private UserAccount account;
    private ArrayList<Orders> inventoryOrderList;
    public TransportWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.business = business;
        this.enterprise = enterprise;
        System.out.println("Enterprise : " + enterprise.getName());
        this.organization = organization;
        System.out.println("Organization : " + organization.getName());
        this.account = account;
        this.inventoryOrderList = enterprise.getInventoryOrderList();
        for(Orders o1 : enterprise.getInventoryOrderList()){
            System.out.println("Order ID:" + o1.getOrderID());
            System.out.println("Order Contents :\n");
            for(Items i: o1.getOrderlist()){
                System.out.println("Item Name :" + i.getName());
            }
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

                jPanel1 = new javax.swing.JPanel();
                enterpriseLabel = new javax.swing.JLabel();
                valueLabel = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();
                btnDelivered = new javax.swing.JButton();
                btnOrderPicked = new javax.swing.JButton();
                btnRefresh = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                orderJTable = new javax.swing.JTable();

                setBackground(new java.awt.Color(255, 255, 255));

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));

                enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                enterpriseLabel.setForeground(new java.awt.Color(0, 102, 204));
                enterpriseLabel.setText("Hi");

                valueLabel.setForeground(new java.awt.Color(0, 102, 204));
                valueLabel.setText("<value>");

                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Icons/transport (1).png"))); // NOI18N

                btnDelivered.setBackground(new java.awt.Color(0, 102, 204));
                btnDelivered.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
                btnDelivered.setForeground(new java.awt.Color(255, 255, 255));
                btnDelivered.setText("Delivered");
                btnDelivered.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnDeliveredActionPerformed(evt);
                        }
                });

                btnOrderPicked.setBackground(new java.awt.Color(0, 102, 204));
                btnOrderPicked.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
                btnOrderPicked.setForeground(new java.awt.Color(255, 255, 255));
                btnOrderPicked.setText("Order Picked");
                btnOrderPicked.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnOrderPickedActionPerformed(evt);
                        }
                });

                btnRefresh.setBackground(new java.awt.Color(0, 102, 204));
                btnRefresh.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
                btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
                btnRefresh.setText("Refresh");
                btnRefresh.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnRefreshActionPerformed(evt);
                        }
                });

                orderJTable.setForeground(new java.awt.Color(0, 102, 204));
                orderJTable.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "OrderID", "Customer Name", "Delivery Address", "Order Amount", "Order Status"
                        }
                ) {
                        Class[] types = new Class [] {
                                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
                        };
                        boolean[] canEdit = new boolean [] {
                                false, false, false, false, false
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types [columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                jScrollPane1.setViewportView(orderJTable);

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(194, 194, 194)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(144, 144, 144)
                                                .addComponent(btnRefresh)
                                                .addGap(48, 48, 48)
                                                .addComponent(btnOrderPicked, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(btnDelivered))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(enterpriseLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(valueLabel))))
                                .addContainerGap(40, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(valueLabel)
                                        .addComponent(enterpriseLabel))
                                .addGap(14, 14, 14)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnRefresh)
                                        .addComponent(btnOrderPicked)
                                        .addComponent(btnDelivered))
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                .addGap(7, 7, 7))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                );
        }// </editor-fold>//GEN-END:initComponents

    private void btnDeliveredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveredActionPerformed
        // TODO add your handling code here:
        int selectedOrderRow = orderJTable.getSelectedRow();
        if(selectedOrderRow<0){
            JOptionPane.showMessageDialog(null,"Select an order","Warning",JOptionPane.WARNING_MESSAGE);
        }
        int orderID = (int) orderJTable.getValueAt(selectedOrderRow, 0);
        for(Orders o : inventoryOrderList){
            if(o.getOrderID() == orderID){
                o.setStatus("Delivered");
			JOptionPane.showMessageDialog(jPanel1,"Status updated to Delivered");
            }
        }
        populateTable();
    }//GEN-LAST:event_btnDeliveredActionPerformed

    private void btnOrderPickedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderPickedActionPerformed
        int selectedOrderRow = orderJTable.getSelectedRow();
        if(selectedOrderRow<0){
            JOptionPane.showMessageDialog(null,"Select an order","Warning",JOptionPane.WARNING_MESSAGE);
        }
        int orderID = (int) orderJTable.getValueAt(selectedOrderRow, 0);
        for(Orders o : inventoryOrderList){
            if(o.getOrderID() == orderID){
                o.setStatus("En Route");
		JOptionPane.showMessageDialog(jPanel1,"Status updated to En Route");
            }
        }
        populateTable();
    }//GEN-LAST:event_btnOrderPickedActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnDelivered;
        private javax.swing.JButton btnOrderPicked;
        private javax.swing.JButton btnRefresh;
        private javax.swing.JLabel enterpriseLabel;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable orderJTable;
        private javax.swing.JLabel valueLabel;
        // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) orderJTable.getModel();
        model.setRowCount(0);
        for(Orders o : inventoryOrderList){
            Object[] row = new Object[5]; 
            row[0] = o.getOrderID();
            row[1] = o.getCustomerName();
            row[2] = o.getCustomerAddress();
            row[3] = o.getTotalprice();
            row[4] = o.getStatus();
            model.addRow(row);
        }
    }
}
