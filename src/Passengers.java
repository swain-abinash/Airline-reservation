
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Passengers extends javax.swing.JFrame {

    /**
     * Creates new form Passangers
     */
    public Passengers() {
        initComponents();
        DisplayPassengers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        PNameTb = new javax.swing.JTextField();
        GenCb = new javax.swing.JComboBox<>();
        NatCb = new javax.swing.JComboBox<>();
        PAddressTb = new javax.swing.JTextField();
        BackBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        PassengersTable = new javax.swing.JTable();
        PassNumTb = new javax.swing.JTextField();
        PPhoneTb = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 40));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel9.setText("SWAIN AIRLINE");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 340, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setText("Manage Passangers");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 250, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setText("Passanger Name");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 150, 30));
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setText("Nationality");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, 30));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setText("Gender");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setText("Passport Number");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setText("Address");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, 90, -1));
        jPanel4.add(PNameTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 150, 30));

        GenCb.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        GenCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        GenCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenCbActionPerformed(evt);
            }
        });
        jPanel4.add(GenCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, 30));

        NatCb.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        NatCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IND", "USA", "PAK", "BAN", "UAE", "AUS", "ENG" }));
        NatCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NatCbActionPerformed(evt);
            }
        });
        jPanel4.add(NatCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 120, -1));
        jPanel4.add(PAddressTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, 120, 30));

        BackBtn.setBackground(new java.awt.Color(255, 0, 51));
        BackBtn.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        BackBtn.setText("BACK");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        jPanel4.add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 100, -1));

        SaveBtn.setBackground(new java.awt.Color(255, 0, 51));
        SaveBtn.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        SaveBtn.setText("SAVE");
        SaveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveBtnMouseClicked(evt);
            }
        });
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        jPanel4.add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 100, -1));

        EditBtn.setBackground(new java.awt.Color(255, 0, 51));
        EditBtn.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        EditBtn.setText("EDIT");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });
        jPanel4.add(EditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 100, -1));

        DeleteBtn.setBackground(new java.awt.Color(255, 51, 51));
        DeleteBtn.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        DeleteBtn.setText("DELETE");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        jPanel4.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 120, -1));

        jTextField4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 0, 0));
        jTextField4.setText("Passanger Lists");
        jPanel4.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 150, 30));

        PassengersTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        PassengersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        PassengersTable.setRowHeight(25);
        PassengersTable.setSelectionBackground(new java.awt.Color(255, 0, 51));
        PassengersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassengersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PassengersTable);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 1040, 210));
        jPanel4.add(PassNumTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 140, 30));

        PPhoneTb.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jPanel4.add(PPhoneTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 180, 120, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel17.setText("Phone");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 150, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GenCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenCbActionPerformed

    private void NatCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NatCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NatCbActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed
       Connection Con=null;
       PreparedStatement pst=null;
       ResultSet Rs=null,Rs1=null;
       Statement St=null,St1=null;
       
      private void DisplayPassengers()
      {
           try{
               Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","root");
               St=Con.createStatement();
               Rs=St.executeQuery("select * from PassengersTbl");
               PassengersTable.setModel(DbUtils.resultSetToTableModel(Rs));
           }catch(Exception e)
           {
                
           }  
      }  
      int PassId=0;
      private void CountPassengers()
      {
           try{
               St1=Con.createStatement();
               Rs1=St1.executeQuery("select Max(PId) from PassengersTbl");
               Rs1.next();
               PassId=Rs1.getInt(1)+1;
           }catch(Exception e)
           {
               
           }
          
      }  
     private void Clear()
     {      
         PNameTb.setText(" ");
         PassNumTb.setText(" ");
         PAddressTb.setText(" ");
         PPhoneTb.setText(" ");
         
         
     }    
    private void SaveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseClicked
       
             if(PNameTb.getText().isEmpty() || PassNumTb.getText().isEmpty() || PAddressTb.getText().isEmpty() || PPhoneTb.getText().isEmpty())
             {
                  JOptionPane.showMessageDialog(this,"Missing InforMation");
                      
             }else{
                    try{
                          CountPassengers();
                         
                          Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","root");
                          PreparedStatement Add=Con.prepareStatement("insert into PassengersTbl values(?,?,?,?,?,?,?)");
                          Add.setInt(1,PassId);
                          Add.setString(2, PNameTb.getText());
                          Add.setString(3,NatCb.getSelectedItem().toString());
                          Add.setString(4,GenCb.getSelectedItem().toString());
                          Add.setString(5,PassNumTb.getText());
                           Add.setString(6,PAddressTb.getText()); 
                          Add.setString(7,PPhoneTb.getText());
                          int row=Add.executeUpdate();
                          JOptionPane.showMessageDialog(this,"Passenger Added");
                          Con.close();
                          DisplayPassengers(); 
                          Clear();
                    }catch(Exception e)
                    {
                     JOptionPane.showMessageDialog(this, e);
                    }     
                     
             }
                  
        
        
    }//GEN-LAST:event_SaveBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(key == 0)
        {
            JOptionPane.showMessageDialog(this,"select a Passenger");
        }else{
            try{
               Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","root");
               String Query="Delete from PassengersTbl where PId="+key;
               Statement Del=Con.createStatement();
               Del.executeUpdate(Query);
               JOptionPane.showMessageDialog(this,"Passenger Deleted.");
               DisplayPassengers();
               
            }catch(Exception e)
            {
               JOptionPane.showMessageDialog(this,e);
            }
        } 
        
        
    }//GEN-LAST:event_DeleteBtnMouseClicked
       int key=0;
       
    private void PassengersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassengersTableMouseClicked
         DefaultTableModel model=(DefaultTableModel)PassengersTable.getModel();
         int MyIndex=PassengersTable.getSelectedRow();
         key=Integer.valueOf(model.getValueAt(MyIndex,0).toString());
         PNameTb.setText(model.getValueAt(MyIndex,1).toString());
         NatCb .setSelectedItem(model.getValueAt(MyIndex,2).toString());
         GenCb .setSelectedItem(model.getValueAt(MyIndex,3).toString());
         PassNumTb.setText(model.getValueAt(MyIndex,4).toString());
         PAddressTb.setText(model.getValueAt(MyIndex,5).toString());
         PPhoneTb.setText(model.getValueAt(MyIndex,6).toString());
        
    }//GEN-LAST:event_PassengersTableMouseClicked

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        new MainForm().setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_BackBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
         if(key == 0)
             {
                  JOptionPane.showMessageDialog(this,"select A Passengers");
                      
             }else{
                    try{
                          CountPassengers();
                         
                          Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","root");
                          String Query ="update PassengersTbl set PName=?,PNat=?,PGen=?,PPass=?,PAdd=?,Pphone=? where PId=?";
                          
                          
                          PreparedStatement Add=Con.prepareStatement(Query);
                          Add.setInt(7,key);
                          Add.setString(1, PNameTb.getText());
                          Add.setString(2,NatCb.getSelectedItem().toString());
                          Add.setString(3,GenCb.getSelectedItem().toString());
                          Add.setString(4,PassNumTb.getText());
                           Add.setString(5,PAddressTb.getText()); 
                          Add.setString(6,PPhoneTb.getText());
                          int row=Add.executeUpdate();
                          JOptionPane.showMessageDialog(this,"Passenger updated");
                          Con.close();
                          DisplayPassengers(); 
                          Clear();
                    }catch(Exception e)
                    {
                     JOptionPane.showMessageDialog(this, e);
                    }     
                     
             }
        
        
    }//GEN-LAST:event_EditBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Passengers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Passengers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Passengers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Passengers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Passengers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JComboBox<String> GenCb;
    private javax.swing.JComboBox<String> NatCb;
    private javax.swing.JTextField PAddressTb;
    private javax.swing.JTextField PNameTb;
    private javax.swing.JTextField PPhoneTb;
    private javax.swing.JTextField PassNumTb;
    private javax.swing.JTable PassengersTable;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
