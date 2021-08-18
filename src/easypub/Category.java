/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easypub;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author vanel Area where the user can manage categories on the system
 */
public class Category extends javax.swing.JFrame {

    Connection cnct;
    PreparedStatement prepst = null;
    Statement stat = null;
    ResultSet resst = null;
    DefaultTableModel tableCat;

    public Category() {
        initComponents();
        cnct = ConnectDB.connect();
        setResizable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        categorySelect();
        limitChar();
    }

    //method to generate custom Category ID
    public void getCatId() {
        try {
            stat = cnct.createStatement();
            resst = stat.executeQuery("select MAX(category_ID) from category");
            resst.next();
            resst.getString("MAX(category_ID)");
            if (resst.getString("MAX(category_ID)") == null) {
                tfCatId.setText("C001");
            } else {
                long catID = Long.parseLong(resst.getString("MAX(category_ID)").substring(1, resst.getString("MAX(category_ID)").length()));
                catID++;
                tfCatId.setText("C" + String.format("%03d", catID));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Others.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void limitChar() {
        tfCatName.setDocument(new TextFieldLength(20));
    }

    //method to update table with database data    
    public final void categorySelect() {
        try {
            stat = cnct.createStatement();
            resst = stat.executeQuery("select category_ID, category_name from category");
            tbCategory.setModel(DbUtils.resultSetToTableModel(resst));
        } catch (SQLException ex) {
            Logger.getLogger(Others.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btCatAdd = new javax.swing.JButton();
        btCatEdit = new javax.swing.JButton();
        btCatDel = new javax.swing.JButton();
        btCatClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCategory = new javax.swing.JTable();
        tfCatName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfCatId = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tfSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(java.awt.Color.white);

        btCatAdd.setBackground(new java.awt.Color(0, 102, 51));
        btCatAdd.setForeground(new java.awt.Color(204, 255, 204));
        btCatAdd.setText("Add");
        btCatAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCatAddMouseClicked(evt);
            }
        });

        btCatEdit.setBackground(new java.awt.Color(0, 102, 51));
        btCatEdit.setForeground(new java.awt.Color(204, 255, 204));
        btCatEdit.setText("Edit");
        btCatEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCatEditMouseClicked(evt);
            }
        });

        btCatDel.setBackground(new java.awt.Color(0, 102, 51));
        btCatDel.setForeground(new java.awt.Color(204, 255, 204));
        btCatDel.setText("Delete");
        btCatDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCatDelMouseClicked(evt);
            }
        });

        btCatClear.setBackground(new java.awt.Color(0, 102, 51));
        btCatClear.setForeground(new java.awt.Color(204, 255, 204));
        btCatClear.setText("Clear");
        btCatClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCatClearMouseClicked(evt);
            }
        });

        tbCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category ID", "Name"
            }
        ));
        tbCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCategoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCategory);

        jLabel10.setText("Category name");

        tfCatId.setEditable(false);

        jLabel14.setText("Category ID");

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("Categories");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(324, 324, 324))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel15.setText("Search");

        tfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCatId, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tfSearch, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfCatName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btCatAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btCatEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btCatDel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btCatClear, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btCatAdd, btCatClear, btCatDel, btCatEdit});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCatId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCatName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCatAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCatEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCatDel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCatClear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btCatAdd, btCatClear, btCatDel, btCatEdit});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel14, jLabel15, tfCatId, tfCatName, tfSearch});

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCatAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCatAddMouseClicked
        //method to add a new category by clicking button 
        if (tfCatName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Insert the new category name");
        } else if (!tfCatId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Category already exists");
        } else {
            try {
                getCatId();
                prepst = cnct.prepareStatement("insert into category (category_ID, category_name) values(?,?)");
                prepst.setString(1, tfCatId.getText());
                prepst.setString(2, tfCatName.getText().toUpperCase());
                int row = prepst.executeUpdate();
                categorySelect();
                JOptionPane.showMessageDialog(this, "New category registered");
                btCatClearMouseClicked(evt);
            } catch (SQLException ex) {
                Logger.getLogger(Others.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btCatAddMouseClicked

    private void btCatEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCatEditMouseClicked
        //method to edit a category by clicking button 
        if (tfCatId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Select the category ID to be edited");
        } else {
            try {
                prepst = cnct.prepareStatement("update category SET category_name = ? where category_ID = ?");
                prepst.setString(1, tfCatName.getText().toUpperCase());
                prepst.setString(2, tfCatId.getText());
                int row1 = prepst.executeUpdate();
                categorySelect();
                JOptionPane.showMessageDialog(this, "Category updated sucesfully");
                btCatClearMouseClicked(evt);
            } catch (SQLException ex) {
                Logger.getLogger(Others.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btCatEditMouseClicked

    private void btCatDelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCatDelMouseClicked
        //method to delete a category by clicking button 
        if (tfCatId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Select the category to be deleted");
        } else {
            try {
                prepst = cnct.prepareStatement("Delete from category where category_ID=?");
                prepst.setString(1, tfCatId.getText());
                int warningDel = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record?", "Warning", JOptionPane.YES_NO_OPTION);
                if (warningDel == JOptionPane.YES_OPTION) {
                    prepst.execute();
                    JOptionPane.showMessageDialog(null, "Category deleted sucesfully");
                    categorySelect();
                }
                btCatClearMouseClicked(evt);
            } catch (SQLException ex) {
                Logger.getLogger(Others.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btCatDelMouseClicked

    private void btCatClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCatClearMouseClicked
        //clear all info from fields
        tfCatId.setText("");
        tfCatName.setText("");
    }//GEN-LAST:event_btCatClearMouseClicked

    private void tbCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCategoryMouseClicked
        //fill jtextfield with info from table
        tableCat = (DefaultTableModel) tbCategory.getModel();
        int rowIndex = tbCategory.getSelectedRow();
        tfCatId.setText(tableCat.getValueAt(rowIndex, 0).toString());
        tfCatName.setText(tableCat.getValueAt(rowIndex, 1).toString());
    }//GEN-LAST:event_tbCategoryMouseClicked

    private void tfSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyReleased
        //field searches user input throught table
        tableCat = (DefaultTableModel) tbCategory.getModel();
        TableRowSorter<DefaultTableModel> sort = new TableRowSorter<>(tableCat);
        tbCategory.setRowSorter(sort);
        sort.setRowFilter(RowFilter.regexFilter(tfSearch.getText().toUpperCase().trim()));
    }//GEN-LAST:event_tfSearchKeyReleased

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
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCatAdd;
    private javax.swing.JButton btCatClear;
    private javax.swing.JButton btCatDel;
    private javax.swing.JButton btCatEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbCategory;
    private javax.swing.JTextField tfCatId;
    private javax.swing.JTextField tfCatName;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
