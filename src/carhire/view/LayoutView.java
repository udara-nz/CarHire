/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carhire.view;

/**
 *
 * @author Buddika Isuranga
 */
public class LayoutView extends javax.swing.JFrame {

    /**
     * Creates new form LayoutView
     */
    public LayoutView() {
        initComponents();
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
        headerPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        sideNavPanel = new javax.swing.JPanel();
        catButton = new javax.swing.JButton();
        manageCustomerButton1 = new javax.swing.JButton();
        carButton1 = new javax.swing.JButton();
        bodayPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerPanel.setBackground(javax.swing.UIManager.getDefaults().getColor("RadioButtonMenuItem.selectionBackground"));

        headerLabel.setBackground(javax.swing.UIManager.getDefaults().getColor("TextPane.selectionBackground"));
        headerLabel.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(51, 51, 51));
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setText("Car Hire Portal");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        sideNavPanel.setBackground(javax.swing.UIManager.getDefaults().getColor("TextPane.selectionBackground"));

        catButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        catButton.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        catButton.setText("Manage Car Categories");
        catButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catButtonActionPerformed(evt);
            }
        });

        manageCustomerButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        manageCustomerButton1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        manageCustomerButton1.setText("Manage Customer");
        manageCustomerButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCustomerButton1ActionPerformed(evt);
            }
        });

        carButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        carButton1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        carButton1.setText("Manage Cars");
        carButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sideNavPanelLayout = new javax.swing.GroupLayout(sideNavPanel);
        sideNavPanel.setLayout(sideNavPanelLayout);
        sideNavPanelLayout.setHorizontalGroup(
            sideNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideNavPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(catButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(sideNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sideNavPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(manageCustomerButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(sideNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sideNavPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(carButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        sideNavPanelLayout.setVerticalGroup(
            sideNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideNavPanelLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(catButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
            .addGroup(sideNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sideNavPanelLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(manageCustomerButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(409, Short.MAX_VALUE)))
            .addGroup(sideNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sideNavPanelLayout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(carButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(357, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout bodayPanelLayout = new javax.swing.GroupLayout(bodayPanel);
        bodayPanel.setLayout(bodayPanelLayout);
        bodayPanelLayout.setHorizontalGroup(
            bodayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 704, Short.MAX_VALUE)
        );
        bodayPanelLayout.setVerticalGroup(
            bodayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(sideNavPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sideNavPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bodayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void catButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catButtonActionPerformed
          loadManageCarCatPanel();
    }//GEN-LAST:event_catButtonActionPerformed

    private void manageCustomerButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCustomerButton1ActionPerformed
       
        loadCustomerPanel();
    }//GEN-LAST:event_manageCustomerButton1ActionPerformed

    private void carButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carButton1ActionPerformed
       
          loadManageCarPanel();
    }//GEN-LAST:event_carButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LayoutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LayoutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LayoutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LayoutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LayoutView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodayPanel;
    private javax.swing.JButton carButton1;
    private javax.swing.JButton catButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton manageCustomerButton1;
    private javax.swing.JPanel sideNavPanel;
    // End of variables declaration//GEN-END:variables

    private void loadCustomerPanel() {
        bodayPanel.removeAll();
        CustomerPanel customerPanel = new CustomerPanel();
        customerPanel.setSize(bodayPanel.getWidth(), bodayPanel.getHeight());
        bodayPanel.add(customerPanel);
        bodayPanel.repaint();
        bodayPanel.revalidate();
    }

    private void loadManageCarPanel() {
        bodayPanel.removeAll();
        ManageCar manageCar = new ManageCar();
        manageCar.setSize(bodayPanel.getWidth(), bodayPanel.getHeight());
        bodayPanel.add(manageCar);
        bodayPanel.repaint();
        bodayPanel.revalidate();
    }

    private void loadManageCarCatPanel() {
         bodayPanel.removeAll();
        ManageCarCatPanel manageCarCatPanel  = new ManageCarCatPanel();
        manageCarCatPanel.setSize(bodayPanel.getWidth(), bodayPanel.getHeight());
        bodayPanel.add(manageCarCatPanel);
        bodayPanel.repaint();
        bodayPanel.revalidate();   
        
    }
}
