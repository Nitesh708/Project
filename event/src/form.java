
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


public class form extends javax.swing.JFrame {

    /**
     * Creates new form form
     */
    public form() {
        initComponents();
    
    combo();  
    }
    void combo()
    {
       jComboBox1.setSelectedItem(null);
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
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1_fn = new javax.swing.JTextField();
        jTextField2_ln = new javax.swing.JTextField();
        jTextField4_em = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField6_NOM = new javax.swing.JTextField();
        jTextField3_mn = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField5_cn = new javax.swing.JTextField();
        jTextField6_br = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton_REGISTER = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(null);

        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("First name");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(110, 110, 90, 23);

        jLabel3.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Last name");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(110, 160, 81, 23);

        jLabel4.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("DOB");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(110, 210, 40, 23);

        jLabel5.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("email");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(110, 260, 50, 23);

        jLabel6.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Mobile no.");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(110, 310, 90, 23);

        jLabel7.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("College name");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(110, 360, 110, 23);

        jLabel8.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Branch");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(110, 400, 60, 23);

        jTextField1_fn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1_fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_fnActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1_fn);
        jTextField1_fn.setBounds(260, 110, 170, 30);

        jTextField2_ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_lnActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2_ln);
        jTextField2_ln.setBounds(260, 160, 170, 30);
        jPanel2.add(jTextField4_em);
        jTextField4_em.setBounds(260, 250, 170, 30);
        jPanel2.add(jDateChooser1);
        jDateChooser1.setBounds(260, 210, 170, 30);

        jTextField6_NOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6_NOMActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField6_NOM);
        jTextField6_NOM.setBounds(260, 430, 170, 30);

        jTextField3_mn.setText("91");
        jTextField3_mn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3_mnActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField3_mn);
        jTextField3_mn.setBounds(260, 300, 170, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BLIND CODING", "DEBUGGING", "ROBO WAR", "PROGRAMMING", "DANCING ", "SINGING", "PAINTING", "TREASURE HUNT", " " }));
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(270, 480, 160, 30);
        jPanel2.add(jTextField5_cn);
        jTextField5_cn.setBounds(260, 350, 170, 30);

        jTextField6_br.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6_brActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField6_br);
        jTextField6_br.setBounds(260, 390, 170, 30);

        jButton2.setBackground(new java.awt.Color(0, 51, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(290, 520, 100, 23);

        jLabel12.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("competition Name");
        jLabel12.setToolTipText("");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(110, 480, 150, 23);

        jLabel9.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("No.of members");
        jLabel9.setToolTipText("");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(110, 440, 120, 23);

        jButton_REGISTER.setBackground(new java.awt.Color(51, 102, 255));
        jButton_REGISTER.setForeground(new java.awt.Color(255, 255, 255));
        jButton_REGISTER.setText("Register");
        jButton_REGISTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_REGISTERActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_REGISTER);
        jButton_REGISTER.setBounds(130, 520, 100, 23);

        jLabel1.setFont(new java.awt.Font("Segoe Script", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registration ");
        jLabel1.setToolTipText("Registration Form");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(70, 20, 329, 78);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/c0.jpg"))); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(0, 0, 510, 550);

        jPanel3.add(jPanel2);
        jPanel2.setBounds(133, 34, 510, 550);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/c0.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(0, 0, 810, 590);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        setSize(new java.awt.Dimension(826, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField6_brActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6_brActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6_brActionPerformed

    private void jTextField2_lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_lnActionPerformed

    private void jButton_REGISTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_REGISTERActionPerformed
        
        String fname=jTextField1_fn.getText();
        String lname=jTextField2_ln.getText();
         // SimpleDateFormat date= new SimpleDateFormat("yyyy-MM-dd");
        // String bdate=date.format(jDateChooser1.getDate());
       // JOptionPane.showMessageDialog(null,"Enter Date of birth");
        String email=jTextField4_em.getText();
        String mobile=jTextField3_mn.getText();
        String cname=jTextField5_cn.getText();
        String branch=jTextField6_br.getText();
        String NOM=jTextField6_NOM.getText();
        String comp;
        comp = (String) jComboBox1.getSelectedItem();
        
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
        else if(cname.equals(""))
        {
         JOptionPane.showMessageDialog(null,"Enter college name");   
        }
        else if(branch.equals(""))
        {
          JOptionPane.showMessageDialog(null,"Enter branch");    
        }
        else if(NOM.equals(""))
        {
          JOptionPane.showMessageDialog(null,"Enter number of participants");    
        }
         else
        {
         PreparedStatement ps;
        String query="INSERT into registerco(First_name,Last_name,email,mobile,branch,NOM,comp) values(?,?,?,?,?,?,?)";
        try {
           ps=MyConnection.getConnection().prepareStatement(query);
        ps.setString(1, fname);
        ps.setString(2, lname);
        //ps.setString(3, bdate);
        ps.setString(3, email);
        ps.setString(4, mobile);
        //ps.setString(5, cname);
        ps.setString(5, branch);
        ps.setString(6, NOM);
        ps.setString(7, comp);
        if(ps.executeUpdate()>0)
        {
            JOptionPane.showMessageDialog(null,"Registration Done");
               try {
			// Construct data
			String apiKey = "apikey=" + "0z+5V6a3E/s-aWewSyKwP74Ai8MjQnAKahXbnmPvN6";
			String message = "&message=" + "Dear student,\n Thank you for registring for Techfest\n your registration has been received\nFOR MORE DETAILS CONTACT US @8109373136 \n Thanks!";
			String sender = "&sender=" + " ";
			String numbers = "&numbers=" + jTextField3_mn.getText();
			
			// Send data
			HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
			conn.getOutputStream().write(data.getBytes("UTF-8"));
			final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			final StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = rd.readLine()) != null) {
				//stringBuffer.append(line);
			//JOptionPane.showMessageDialog(null, "message"+line );
                        System.out.println("message"+line);
                        }
			rd.close();
			
			//return stringBuffer.toString();
		} catch (Exception e) {
			//System.out.println("Error SMS "+e);
                        //JOptionPane.showMessageDialog(null, "error" );
			System.out.println("error");
//return "Error "+e;
		}
        }
        ps.close();
        this.dispose();
       
        } 
        
     catch (SQLException | HeadlessException ex) {
         JOptionPane.showMessageDialog(null,"Registration Not Done");
            //Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
     }
        
        }
       
    }//GEN-LAST:event_jButton_REGISTERActionPerformed

    private void jTextField6_NOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6_NOMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6_NOMActionPerformed

    private void jTextField3_mnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3_mnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3_mnActionPerformed

    private void jTextField1_fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_fnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_REGISTER;
    private javax.swing.JComboBox jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1_fn;
    private javax.swing.JTextField jTextField2_ln;
    private javax.swing.JTextField jTextField3_mn;
    private javax.swing.JTextField jTextField4_em;
    private javax.swing.JTextField jTextField5_cn;
    private javax.swing.JTextField jTextField6_NOM;
    private javax.swing.JTextField jTextField6_br;
    // End of variables declaration//GEN-END:variables
}