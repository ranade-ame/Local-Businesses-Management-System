/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
    private JPanel container;
    private Enterprise enterprise;
    private Employee employee;
    public ManageUserAccountJPanel(JPanel container, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.container = container;

        popOrganizationComboBox();
       // employeeJComboBox.removeAllItems();
        popData();
    }

    public void popOrganizationComboBox() {
        organizationJComboBox.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            organizationJComboBox.addItem(organization);
        }
    }
    
    public void populateEmployeeComboBox(Organization organization){
//        employeeJComboBox.removeAllItems();
//        
//        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
//            employeeJComboBox.addItem(employee);
//        }
    }
    
    private void populateRoleComboBox(Organization organization){
        roleJComboBox.removeAllItems();
        for (Role role : organization.getSupportedRole()){
            roleJComboBox.addItem(role);
        }
    }

    public void popData() {

        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = organization.getType();
                ((DefaultTableModel) userJTable.getModel()).addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                createUserJButton = new javax.swing.JButton();
                nameJTextField = new javax.swing.JTextField();
                jLabel1 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                userJTable = new javax.swing.JTable();
                jLabel2 = new javax.swing.JLabel();
                backjButton1 = new javax.swing.JButton();
                jLabel5 = new javax.swing.JLabel();
                organizationJComboBox = new javax.swing.JComboBox();
                jLabel4 = new javax.swing.JLabel();
                roleJComboBox = new javax.swing.JComboBox();
                passwordJTextField = new javax.swing.JPasswordField();

                setBackground(new java.awt.Color(255, 255, 255));

                createUserJButton.setBackground(new java.awt.Color(255, 255, 255));
                createUserJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Icons/file_light-07-512-2.png"))); // NOI18N
                createUserJButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                createUserJButtonActionPerformed(evt);
                        }
                });

                jLabel1.setForeground(new java.awt.Color(0, 102, 204));
                jLabel1.setText("User Name");

                userJTable.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "User Name", "Role"
                        }
                ) {
                        Class[] types = new Class [] {
                                java.lang.String.class, java.lang.String.class
                        };
                        boolean[] canEdit = new boolean [] {
                                true, false
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types [columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                jScrollPane1.setViewportView(userJTable);
                if (userJTable.getColumnModel().getColumnCount() > 0) {
                        userJTable.getColumnModel().getColumn(0).setResizable(false);
                        userJTable.getColumnModel().getColumn(1).setResizable(false);
                }

                jLabel2.setForeground(new java.awt.Color(0, 102, 204));
                jLabel2.setText("Password");

                backjButton1.setBackground(new java.awt.Color(255, 255, 255));
                backjButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                backjButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Icons/93634-2.png"))); // NOI18N
                backjButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                backjButton1ActionPerformed(evt);
                        }
                });

                jLabel5.setForeground(new java.awt.Color(0, 102, 204));
                jLabel5.setText("Organization");

                organizationJComboBox.setBackground(new java.awt.Color(0, 102, 204));
                organizationJComboBox.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
                organizationJComboBox.setForeground(new java.awt.Color(255, 255, 255));
                organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                organizationJComboBoxActionPerformed(evt);
                        }
                });

                jLabel4.setForeground(new java.awt.Color(0, 102, 204));
                jLabel4.setText("Role");

                roleJComboBox.setBackground(new java.awt.Color(0, 102, 204));
                roleJComboBox.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
                roleJComboBox.setForeground(new java.awt.Color(255, 255, 255));
                roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                roleJComboBox.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                roleJComboBoxActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(backjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(176, 176, 176)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(88, 88, 88)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(roleJComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 146, Short.MAX_VALUE)
                                                        .addComponent(organizationJComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(nameJTextField)
                                                        .addComponent(passwordJTextField)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(217, 217, 217)
                                                .addComponent(createUserJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(215, 254, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(backjButton1)
                                .addGap(19, 19, 19)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(createUserJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(177, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents

    private void createUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserJButtonActionPerformed
        String userName = nameJTextField.getText();
        String password = passwordJTextField.getText();
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        boolean flag = organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName);
        if(flag == false){
            JOptionPane.showMessageDialog(roleJComboBox, "User name already exists");
        }
        else{
            //Employee employee = (Employee) employeeJComboBox.getSelectedItem();
            Role role = (Role) roleJComboBox.getSelectedItem();

            organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
                JOptionPane.showMessageDialog(roleJComboBox, "User Added successfully!");

            popData();
        }
    }//GEN-LAST:event_createUserJButtonActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null){
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

        private void roleJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleJComboBoxActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_roleJComboBoxActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton backjButton1;
        private javax.swing.JButton createUserJButton;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTextField nameJTextField;
        private javax.swing.JComboBox organizationJComboBox;
        private javax.swing.JPasswordField passwordJTextField;
        private javax.swing.JComboBox roleJComboBox;
        private javax.swing.JTable userJTable;
        // End of variables declaration//GEN-END:variables
}
