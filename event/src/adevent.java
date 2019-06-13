/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class adevent extends javax.swing.JFrame {

    /**
     * Creates new form adevent
     */
    public adevent() {
        initComponents();
    }
   public ArrayList<userev> userList()
   {
       ArrayList<userev> usersList=new ArrayList<>();
       try{ 
         Connection con=null;
         Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","mysqlnitisha");
        String query="select * from registerev";
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        userev user;
        while(rs.next())
        {
            user=new userev(rs.getString("First_name"),rs.getString("Last_name"),rs.getString("email"),rs.getString("mobile"),rs.getString("coname"),rs.getString("branch"),rs.getString("even"));
            usersList.add(user);
         }
       }
       catch(ClassNotFoundException | SQLException e)
       {
           JOptionPane.showMessageDialog(null,e);
       }
       return usersList;
   }
    public void show_user()
      {
       ArrayList<userev> list= userList();
       DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
       Object[] row=new Object[7];
       for(int i=0;i<list.size();i++)
       {
           row[0]=list.get(i).getfn();
           row[1]=list.get(i).getln();
           row[2]=list.get(i).getem();
           row[3]=list.get(i).getmn();
           row[4]=list.get(i).getco();
           row[5]=list.get(i).getbr();
           row[6]=list.get(i).geteven();
           model.addRow(row);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        show = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First name", "Last name", "Email", "Mobile no", "College name ", "Branch", "Event name"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 80, 710, 390);

        show.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        show.setText("Show");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        jPanel1.add(show);
        show.setBounds(330, 490, 80, 25);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(510, 490, 90, 23);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("NEW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(160, 490, 73, 25);

        jLabel6.setFont(new java.awt.Font("Segoe Script", 2, 36)); // NOI18N
        jLabel6.setText("Tech Fest");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 10, 190, 58);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/h1.jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(190, 10, 70, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blury-bg.jpg"))); // NOI18N
        jLabel4.setText("jLabel2");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 740, 540);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blury-bg.jpg"))); // NOI18N
        jLabel5.setText("jLabel2");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 740, 540);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/h1.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(190, 10, 70, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blury-bg.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-10, 0, 740, 540);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blury-bg.jpg"))); // NOI18N
        jLabel8.setText("jLabel2");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 740, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
     show_user();
    }//GEN-LAST:event_showActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       eventreg ti=new eventreg();
        ti.setVisible(true);
        ti.pack();
        ti.setLocationRelativeTo(null);
        ti.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(adevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adevent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton show;
    // End of variables declaration//GEN-END:variables
}
