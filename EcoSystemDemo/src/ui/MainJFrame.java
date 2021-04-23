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
//import ui.NewCustomerRegistration.NewCustomerRegistrationJPanel;
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
        this.setSize(633, 478);
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
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        loginJButton1 = new javax.swing.JButton();
        userNameJTextField1 = new javax.swing.JTextField();
        passwordField1 = new javax.swing.JPasswordField();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Icons/logout.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Icons/applicationicon (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 529, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 10));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginJButton1.setBackground(new java.awt.Color(51, 51, 255));
        loginJButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        loginJButton1.setForeground(new java.awt.Color(255, 255, 255));
        loginJButton1.setText("Login");
        loginJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(loginJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 180, 220, -1));
        jPanel3.add(userNameJTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 99, 220, -1));

        passwordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordField1ActionPerformed(evt);
            }
        });
        jPanel3.add(passwordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 140, 220, -1));

        lblUserName.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lblUserName.setText("User Name");
        jPanel3.add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 105, -1, -1));

        lblPassword.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lblPassword.setText("Password");
        jPanel3.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 146, -1, -1));

        lblTitle.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTitle.setText("Local Business Management System");
        jPanel3.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 41, 269, 18));

        jLabel3.setBackground(new java.awt.Color(25, 56, 82));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Icons/usericon.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 99, 39, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Icons/passwordicon.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 140, -1, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Icons/vendoricon2 (1).png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 150, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

        private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
                // TODO add your handling code here:
        }//GEN-LAST:event_formComponentResized

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
    private javax.swing.JPanel container;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
