/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CustomerRole;

import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;

import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author ameya
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount account;
    private CustomerDirectory customerDirectory;
    /**
     * @param userProcessContainer
     * @param account
     * @param organization
     * @param enterprise
     * @param ecosystem
     * @param customerdirectory
     */


    public CustomerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization Organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = business;
        this.customerDirectory = business.getCustomerdirectory();
        this.account = account;
        this.organization = Organization;
        this.enterprise = enterprise;
        valueLabel.setText(account.getUsername());
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

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Customer :");

        valueLabel.setText("<value>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(474, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(641, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
