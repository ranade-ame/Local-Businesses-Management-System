/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.NewCustomerRegistration.NewCustomerRegistrationJPanel;
import ui.SystemAdminWorkArea.CreateCustomerJPanel;
/**
 *
 * @author Lingfeng
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        this.setSize(1680, 1050);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        loginJButton1 = new javax.swing.JButton();
        userNameJTextField1 = new javax.swing.JTextField();
        passwordField1 = new javax.swing.JPasswordField();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        btnForgotPassword = new javax.swing.JButton();
        btnNewRegister = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1007, 925));

        container.setLayout(new java.awt.CardLayout());

        loginJButton1.setText("Login");
        loginJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButton1ActionPerformed(evt);
            }
        });

        passwordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordField1ActionPerformed(evt);
            }
        });

        lblUserName.setText("User Name");

        lblPassword.setText("Password");

        btnForgotPassword.setText("Forgot Password");

        btnNewRegister.setText("New Registration");
        btnNewRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewRegisterActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblTitle.setText("Local Business Management System");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPassword)
                                    .addComponent(lblUserName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(loginJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnForgotPassword))
                                    .addComponent(userNameJTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGap(111, 111, 111)
                            .addComponent(btnNewRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(49, 49, 49))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTitle)
                .addGap(151, 151, 151)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserName)
                            .addComponent(userNameJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPassword))
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginJButton1)
                    .addComponent(btnForgotPassword))
                .addGap(18, 18, 18)
                .addComponent(btnNewRegister)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(505, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(302, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(946, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 24, Short.MAX_VALUE)
                    .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void loginJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButton1ActionPerformed
                // Get user name
                String userName = userNameJTextField1.getText();
                // Get Password
                char[] passwordCharArray = passwordField1.getPassword();
                String password = String.valueOf(passwordCharArray);

                //Step1: Check in the system admin user account directory if you have the user
                UserAccount userAccount=system.getUserAccountDirectory().authenticateUser(userName, password);

                Enterprise inEnterprise=null;
                Organization inOrganization=null;

                if(userAccount==null){
                        //Step 2: Go inside each network and check each enterprise
                        for(Network network:system.getNetworkList()){
                                //Step 2.a: check against each enterprise
                                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                                        userAccount=enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                                        if(userAccount==null){
                                                //Step 3:check against each organization for each enterprise
                                                for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                                                        userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                                                        if(userAccount!=null){
                                                                inEnterprise=enterprise;
                                                                inOrganization=organization;
                                                                break;
                                                        }
                                                }

                                        }
                                        else{
                                                inEnterprise=enterprise;
                                                break;
                                        }
                                        if(inOrganization!=null){
                                                break;
                                        }
                                }
                                if(inEnterprise!=null){
                                        break;
                                }
                        }
                }

                if(userAccount==null){
                        JOptionPane.showMessageDialog(null, "Invalid credentials");
                        return;
                }
                else{

                        jPanel3.setVisible(false);
                        jPanel1.setVisible(true);
                        container.setVisible(true);
                        CardLayout layout=(CardLayout)container.getLayout();
                        container.add("workArea",userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, system));
                        layout.next(container);
                }

                loginJButton1.setEnabled(true);
                jButton1.setEnabled(true);
                jPanel3.setVisible(false);
                jPanel1.setVisible(true);
                container.setVisible(true);
                //logoutJButton1.setEnabled(true);
                userNameJTextField1.setText("");
                passwordField1.setText("");

        }//GEN-LAST:event_loginJButton1ActionPerformed

        private void passwordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordField1ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_passwordField1ActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                // TODO add your handling code here:
                container.removeAll();
                dB4OUtil.storeSystem(system);
                jPanel3.setVisible(true);
                container.setVisible(false);
                jPanel1.setVisible(true);
        }//GEN-LAST:event_jButton1ActionPerformed

    private void btnNewRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewRegisterActionPerformed
        // TODO add your handling code here:
	
        NewCustomerRegistrationJPanel panel = new NewCustomerRegistrationJPanel(container, system);
        jPanel3.setVisible(false);
        container.setVisible(true);
        jPanel1.setVisible(true);
        jButton1.setVisible(false);
//            btnBackLabel.setVisible(true);
        userNameJTextField1.setText("");
        passwordField1.setText("");
        //cc();
        //SystemAdminRole r = new SystemAdminRole();
        container.add("workArea", panel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        
    }//GEN-LAST:event_btnNewRegisterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnForgotPassword;
    private javax.swing.JButton btnNewRegister;
    private javax.swing.JPanel container;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JButton loginJButton1;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JTextField userNameJTextField1;
    // End of variables declaration//GEN-END:variables
}
