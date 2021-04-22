/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import Business.EcoSystem;
import javax.swing.JPanel;

/**
 *
 * @author bidar
 */
public class ViewStatisticJPanel extends javax.swing.JPanel {

	/**
	 * Creates new form ViewStatisticJPanel
	 */
	private JPanel userProcessContainer;
    private EcoSystem system;
	public ViewStatisticJPanel(JPanel userProcessContainer, EcoSystem system) {
		initComponents();
		this.userProcessContainer = userProcessContainer;
        this.system = system;
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

                setBackground(new java.awt.Color(255, 255, 255));

                jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(0, 102, 255));
                jLabel1.setText("Select label from below to view statistics");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(220, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(431, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel jLabel1;
        // End of variables declaration//GEN-END:variables
}