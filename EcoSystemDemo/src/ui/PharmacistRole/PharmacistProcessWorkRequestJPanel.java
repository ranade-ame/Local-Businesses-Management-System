/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PharmacistRole;

/**
 *
 * @author bidar
 */
public class PharmacistProcessWorkRequestJPanel extends javax.swing.JPanel {

	/**
	 * Creates new form PharmacistProcessWorkRequestJPanel
	 */
	public PharmacistProcessWorkRequestJPanel() {
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

                jLabel1 = new javax.swing.JLabel();
                resultJTextField = new javax.swing.JTextField();
                backJButton = new javax.swing.JButton();
                submitJButton = new javax.swing.JButton();

                jLabel1.setText("Result");

                backJButton.setText("Back");
                backJButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                backJButtonActionPerformed(evt);
                        }
                });

                submitJButton.setText("Submit Result");
                submitJButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                submitJButtonActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(backJButton)
                                        .addComponent(jLabel1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(46, 46, 46)
                                                .addComponent(resultJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                                                .addComponent(submitJButton)
                                                .addGap(63, 63, 63))))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(resultJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(submitJButton)
                                        .addComponent(backJButton))
                                .addContainerGap(169, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

                //                userProcessContainer.remove(this);
                //                Component[] componentArray = userProcessContainer.getComponents();
                //                Component component = componentArray[componentArray.length - 1];
                //                LabAssistantWorkAreaJPanel dwjp = (LabAssistantWorkAreaJPanel) component;
                //                dwjp.populateTable();
                //                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                //                layout.previous(userProcessContainer);
        }//GEN-LAST:event_backJButtonActionPerformed

        private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
                //                request.setTestResult(resultJTextField.getText());
                //                request.setStatus("Completed");
        }//GEN-LAST:event_submitJButtonActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton backJButton;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JTextField resultJTextField;
        private javax.swing.JButton submitJButton;
        // End of variables declaration//GEN-END:variables
}
