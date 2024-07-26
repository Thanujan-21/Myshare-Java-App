package View;

import javax.swing.*;
import Model.MonthlyIncomeReport;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Thanujan
 */
public class MonthlyIncomeExpenceUI extends javax.swing.JFrame {

    /**
     * Creates new form MonthlyIncomeExpenceUI
     */
    public MonthlyIncomeExpenceUI() {
        initComponents();
    }
    int Total = 0;
    DefaultTableModel ModelTable;
    MonthlyIncomeReport MIER = new MonthlyIncomeReport();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        lblAmount = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblIncomeExpence = new javax.swing.JTable();
        btnIncome = new javax.swing.JButton();
        btnExpence = new javax.swing.JButton();
        lblIncome = new javax.swing.JLabel();
        lblavIncome = new javax.swing.JLabel();
        lblExpence = new javax.swing.JLabel();
        lblavExpence = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblavTotal = new javax.swing.JLabel();
        dash1 = new javax.swing.JLabel();
        dash2 = new javax.swing.JLabel();
        dash3 = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 204));

        lblHeader.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblHeader.setText("Income & Expence Report");

        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenu)
                .addGap(76, 76, 76)
                .addComponent(lblHeader)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblHeader)
                .addComponent(btnMenu))
        );

        lblDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDate.setText("Date");

        txtDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAmount.setText("Amount");

        txtAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tblIncomeExpence.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblIncomeExpence.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date", "Income", "Expence", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblIncomeExpence.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblIncomeExpenceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblIncomeExpence);

        btnIncome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnIncome.setText("Income");
        btnIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncomeActionPerformed(evt);
            }
        });

        btnExpence.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExpence.setText("Expence");
        btnExpence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpenceActionPerformed(evt);
            }
        });

        lblIncome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblIncome.setText("Total Income");

        lblavIncome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblavIncome.setText("0");

        lblExpence.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblExpence.setText("Total Expence");

        lblavExpence.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblavExpence.setText("0");

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTotal.setText("Total");

        lblavTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblavTotal.setText("0");

        dash1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dash1.setText("-");

        dash2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dash2.setText("-");

        dash3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dash3.setText("-");

        btnRemove.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAmount)
                            .addComponent(lblDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(txtAmount)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnIncome)
                        .addGap(18, 18, 18)
                        .addComponent(btnExpence))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lblIncome)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTotal)
                                    .addComponent(lblExpence))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dash1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblavIncome))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dash2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblavExpence))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dash3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblavTotal))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnRemove)))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDate)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAmount)
                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIncome)
                            .addComponent(btnExpence))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemove)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIncome)
                            .addComponent(lblavIncome)
                            .addComponent(dash1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblExpence)
                            .addComponent(lblavExpence)
                            .addComponent(dash2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(dash3)
                                .addComponent(lblavTotal))
                            .addComponent(lblTotal))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(31, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncomeActionPerformed
        // TODO add your handling code here:
        try{
            MIER.AddAction(GetAmount());
            Total = MIER.TotIncome + MIER.TotExpense;
            ModelTable = (DefaultTableModel) tblIncomeExpence.getModel();
            ModelTable.addRow(new Object[]{
                txtDate.getText(),
                txtAmount.getText(),
                "",
                Total});

            AvbSetText();
            txtDate.setText("");
            txtAmount.setText("");
        }
        catch (Exception Ex)
        {
            JOptionPane.showMessageDialog(this, "Enter Values", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIncomeActionPerformed

    private void btnExpenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpenceActionPerformed
        // TODO add your handling code here:
        try{
            MIER.RemoveAction(GetAmount());
            Total = MIER.TotIncome + MIER.TotExpense;
            ModelTable = (DefaultTableModel) tblIncomeExpence.getModel();
                ModelTable.addRow(new Object[]{
                    txtDate.getText(),
                    "",
                    txtAmount.getText(),
                    Total});

                AvbSetText();
                txtDate.setText("");
                txtAmount.setText("");
        } 
        catch (Exception Ex)
        {
            JOptionPane.showMessageDialog(this, "Enter Values", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExpenceActionPerformed

    
    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        MenuUI send = new MenuUI();
        send.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        if (tblIncomeExpence.getSelectedRowCount() == 1) {
            ModelTable.removeRow(tblIncomeExpence.getSelectedRow());
            JOptionPane.showMessageDialog(rootPane, "Deleted", "Sucess", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (tblIncomeExpence.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Table Is Empty", "Info", 0);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Please Select Atleast One Row", "Info", 0);
            }
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void tblIncomeExpenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIncomeExpenceMouseClicked
        // TODO add your handling code here:
        ModelTable = (DefaultTableModel) tblIncomeExpence.getModel();
        
        String tblDate = ModelTable.getValueAt(tblIncomeExpence.getSelectedRow(), 0).toString();
        String tblAmount="";
        if((ModelTable.getValueAt(tblIncomeExpence.getSelectedRow(), 1))==""){
            tblAmount = ModelTable.getValueAt(tblIncomeExpence.getSelectedRow(), 2).toString();
        } else {
            tblAmount = ModelTable.getValueAt(tblIncomeExpence.getSelectedRow(), 1).toString();
        }
        

        txtDate.setText(tblDate);
        txtAmount.setText(tblAmount);
    }//GEN-LAST:event_tblIncomeExpenceMouseClicked
  
    public int GetAmount() {
        int Amount = Integer.parseInt(txtAmount.getText());
        return Amount;
    }
    
    public String AvbSetText() {
        lblavIncome.setText(Integer.toString(MonthlyIncomeReport.TotIncome));
        lblavExpence.setText(Integer.toString(MonthlyIncomeReport.TotExpense));
        lblavTotal.setText(Integer.toString(Total));
        return null;
    }
    
    
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
            java.util.logging.Logger.getLogger(MonthlyIncomeExpenceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MonthlyIncomeExpenceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MonthlyIncomeExpenceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MonthlyIncomeExpenceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MonthlyIncomeExpenceUI().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JButton btnExpence;
    private javax.swing.JButton btnIncome;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel dash1;
    private javax.swing.JLabel dash2;
    private javax.swing.JLabel dash3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblExpence;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblIncome;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblavExpence;
    private javax.swing.JLabel lblavIncome;
    private javax.swing.JLabel lblavTotal;
    private javax.swing.JTable tblIncomeExpence;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtDate;
    // End of variables declaration//GEN-END:variables
}
