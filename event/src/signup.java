
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class signup extends javax.swing.JFrame {

    /**
     * Creates new form signup
     */
    public signup() {
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
        jButton2 = new javax.swing.JButton();
        register = new javax.swing.JButton();
        jPasswordField2_cpass = new javax.swing.JPasswordField();
        jPasswordField1_pass = new javax.swing.JPasswordField();
        jTextField5_ln = new javax.swing.JTextField();
        jTextField4_em = new javax.swing.JTextField();
        jTextField2_mn = new javax.swing.JTextField();
        jTextField1_fn = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(390, 390, 73, 25);

        register.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        jPanel1.add(register);
        register.setBounds(240, 390, 100, 23);

        jPasswordField2_cpass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField2_cpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2_cpassActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField2_cpass);
        jPasswordField2_cpass.setBounds(360, 340, 170, 30);

        jPasswordField1_pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField1_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1_passActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1_pass);
        jPasswordField1_pass.setBounds(360, 300, 170, 30);

        jTextField5_ln.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField5_ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5_lnActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5_ln);
        jTextField5_ln.setBounds(360, 180, 170, 30);

        jTextField4_em.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField4_em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4_emActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4_em);
        jTextField4_em.setBounds(360, 220, 170, 30);

        jTextField2_mn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2_mn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_mnActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2_mn);
        jTextField2_mn.setBounds(360, 260, 170, 30);

        jTextField1_fn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1_fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_fnActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1_fn);
        jTextField1_fn.setBounds(360, 140, 170, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Email");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(210, 220, 60, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Comfirm Password");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(210, 340, 160, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("First Name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(210, 140, 90, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Mobile No.");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(210, 260, 90, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Password");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(210, 300, 80, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Last Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(210, 180, 90, 22);

        jLabel3.setFont(new java.awt.Font("Segoe Script", 2, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sign up");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(210, 10, 310, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\images\\transparent-glass-3.png")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 90, 360, 370);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\images\\c0.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 750, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(762, 579));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_fnActionPerformed

    private void jTextField2_mnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_mnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_mnActionPerformed

    private void jTextField4_emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4_emActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4_emActionPerformed

    private void jTextField5_lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5_lnActionPerformed

    private void jPasswordField1_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1_passActionPerformed

    private void jPasswordField2_cpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2_cpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2_cpassActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
       
        String fname=jTextField1_fn.getText();
        String lname=jTextField5_ln.getText();
        String email=jTextField4_em.getText();
        String mobile=jTextField2_mn.getText();
        String pass=String.valueOf(jPasswordField1_pass.getPassword());
        String cpass=String.valueOf(jPasswordField2_cpass.getPassword());
     
        if(fname.equals(""))
        {
         JOptionPane.showMessageDialog(null,"Enter First name");   
        }
        else if(lname.equals(""))
        {
         JOptionPane.showMessageDialog(null,"Enter Last name");   
        }
        else if(email.equals(""))
        {
         JOptionPane.showMessageDialog(null,"Enter Email");        
        }
        else if(mobile.equals(""))
        {
         JOptionPane.showMessageDialog(null,"Enter Mobile number");   
        }
        else if(pass.equals(""))
        {
         JOptionPane.showMessageDialog(null,"Enter Password");   
        }
        else if(!(cpass.equals(pass)))
        {
          JOptionPane.showMessageDialog(null,"You have entered an incorrect password");    
        }
        else
        {
        PreparedStatement ps;
        String query="INSERT into signup(First_name,Last_name,Email,mobile_no,Password,Confirm) values(?,?,?,?,?,?)";
        try {
           ps=MyConnection.getConnection().prepareStatement(query);
        ps.setString(1, fname);
        ps.setString(2, lname);
        ps.setString(3, email);
        ps.setString(4, mobile);
        ps.setString(5, pass);
        ps.setString(6, cpass);
       
        if(ps.executeUpdate()>0)
        {
            JOptionPane.showMessageDialog(null,"New User added");
             login f=new login();
        f.setVisible(true);
       f.pack();
       f.setLocationRelativeTo(null);
       f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       this.dispose();
           
        }
        
        ps.close();
        } 
        
     catch (SQLException | HeadlessException ex) {
         
            //Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
     }
        }
        
    }//GEN-LAST:event_registerActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      login f=new login();
        f.setVisible(true);
       f.pack();
       f.setLocationRelativeTo(null);
       f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new signup().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1_pass;
    private javax.swing.JPasswordField jPasswordField2_cpass;
    private javax.swing.JTextField jTextField1_fn;
    private javax.swing.JTextField jTextField2_mn;
    private javax.swing.JTextField jTextField4_em;
    private javax.swing.JTextField jTextField5_ln;
    private javax.swing.JButton register;
    // End of variables declaration//GEN-END:variables
}