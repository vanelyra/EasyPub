/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easypub;

/**
 *
 * @author vanel
 */
public class Sale extends javax.swing.JFrame {

    /**
     * Creates new form Sale
     */
    public Sale() {
        initComponents();
    }
    
    /*Connection cnct = null;
    Statement stat = null;
    ResultSet resst = null;
    PreparedStatement prepst = null;
    
    public void sales(){
         
         int idgenerate = 0;
          try {
            cnct = DriverManager.getConnection("jdbc:mysql://localhost:3308/easypubdatabase?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
           
            prepst = cnct.prepareStatement("insert into sales(total_sale, payment, balance) values (?,?,?)", Statement.RETURN_GENERATED_KEYS);
     prepst.setString(1, jTextField3.getText());
     prepst.setString(2, jTextField4.getText());
     prepst.setString(3, jTextField2.getText());
     
     ResultSet genkey = prepst.getGeneratedKeys();
     
     if(genkey.next()){
         idgenerate = genkey.getInt(1);
     }
     int row = jTable1.getRowCount();
     PreparedStatement prepst2 = cnct.prepareStatement("insert into sales_product(id, product, price, qty, total) values (?,?,?,?,?)");
     
     String product ="";
     int price=0;
     int qty=0;
     int total = 0;
     
     for(int i=0; i<jTable1.getColumnCount();i++){
         product = (String)jTable1.getValueAt(i,0);
         price = (int)jTable1.getValueAt(i,1);
          qty = (int)jTable1.getValueAt(i,2);
          total  = (int)jTable1.getValueAt(i,3);    
          
          prepst2.setInt (1,idgenerate);
          prepst2.setString (2,product);
          prepst2.setInt (3,price);
          prepst2.setInt (4,qty);
           prepst2.setInt (5,total);
           prepst2.executeUpdate();
          
     }
       prepst.addBatch();
       JOptionPane.showMessageDialog(this, "Sale added sucesfully");
             }   catch (SQLException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*
    String num = jTextField5.getText();
      if(num==""){
          jTextField5.setText(bt1.getText());
      }else{
        num = jTextField5.getText() + bt1.getText();
      jTextField5.setText(num);
      }
    */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
