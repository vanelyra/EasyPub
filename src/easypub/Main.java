/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easypub;

import java.awt.Toolkit;
import javax.swing.WindowConstants;

/**
 *
 * @author vanel
 */
public class Main extends javax.swing.JFrame {

    
    public Main() {
        initComponents();
        setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
        
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        bt_suppliers = new javax.swing.JButton();
        bt_others = new javax.swing.JButton();
        bt_stock = new javax.swing.JButton();
        bt_sales = new javax.swing.JButton();
        bt_products = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bt_others1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(950, 600));
        setMinimumSize(new java.awt.Dimension(950, 600));

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 100));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("EasyPub Dashboard");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(210, 210, 210))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(129, 129, 129))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setAlignmentX(0.0F);
        jPanel3.setAlignmentY(0.0F);
        jPanel3.setPreferredSize(new java.awt.Dimension(900, 500));

        bt_suppliers.setBackground(new java.awt.Color(204, 255, 204));
        bt_suppliers.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_suppliers.setForeground(new java.awt.Color(0, 102, 51));
        bt_suppliers.setText("Suppliers");
        bt_suppliers.setPreferredSize(new java.awt.Dimension(170, 130));
        bt_suppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_suppliersActionPerformed(evt);
            }
        });

        bt_others.setBackground(new java.awt.Color(204, 255, 204));
        bt_others.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_others.setForeground(new java.awt.Color(0, 102, 51));
        bt_others.setText("Others");
        bt_others.setPreferredSize(new java.awt.Dimension(170, 130));
        bt_others.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_othersActionPerformed(evt);
            }
        });

        bt_stock.setBackground(new java.awt.Color(204, 255, 204));
        bt_stock.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_stock.setForeground(new java.awt.Color(0, 102, 51));
        bt_stock.setText("Stock");
        bt_stock.setPreferredSize(new java.awt.Dimension(170, 130));
        bt_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_stockActionPerformed(evt);
            }
        });

        bt_sales.setBackground(new java.awt.Color(204, 255, 204));
        bt_sales.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_sales.setForeground(new java.awt.Color(0, 102, 51));
        bt_sales.setText("Sales");
        bt_sales.setPreferredSize(new java.awt.Dimension(170, 130));
        bt_sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salesActionPerformed(evt);
            }
        });

        bt_products.setBackground(new java.awt.Color(204, 255, 204));
        bt_products.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_products.setForeground(new java.awt.Color(0, 102, 51));
        bt_products.setText("Products");
        bt_products.setPreferredSize(new java.awt.Dimension(170, 130));
        bt_products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_productsActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("Welcome!");

        bt_others1.setBackground(new java.awt.Color(204, 255, 204));
        bt_others1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_others1.setForeground(new java.awt.Color(0, 102, 51));
        bt_others1.setText("Categories");
        bt_others1.setPreferredSize(new java.awt.Dimension(170, 130));
        bt_others1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_others1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(320, 320, 320))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(bt_suppliers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_others1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(bt_others, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(bt_sales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(bt_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addComponent(bt_products, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_sales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_products, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_suppliers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_others, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_others1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_suppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_suppliersActionPerformed
        Suppliers a = new Suppliers();
        a.setVisible(true);
        
    }//GEN-LAST:event_bt_suppliersActionPerformed

    private void bt_othersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_othersActionPerformed
        Others e = new Others();
        e.setVisible(true);
        
    }//GEN-LAST:event_bt_othersActionPerformed

    private void bt_productsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_productsActionPerformed
        Products c = new Products();
        c.setVisible(true);
        
    }//GEN-LAST:event_bt_productsActionPerformed

    private void bt_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_stockActionPerformed
        Stock d = new Stock();
        d.setVisible(true);
        
    }//GEN-LAST:event_bt_stockActionPerformed

    private void bt_salesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salesActionPerformed
        Sale b = new Sale();
        b.setVisible(true);
        
    }//GEN-LAST:event_bt_salesActionPerformed

    private void bt_others1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_others1ActionPerformed
        Category f = new Category();
        f.setVisible(true);
        
    }//GEN-LAST:event_bt_others1ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_others;
    private javax.swing.JButton bt_others1;
    private javax.swing.JButton bt_products;
    private javax.swing.JButton bt_sales;
    private javax.swing.JButton bt_stock;
    private javax.swing.JButton bt_suppliers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
