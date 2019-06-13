import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import static net.ucanaccess.converters.Functions.string;

public class eventreg extends javax.swing.JFrame {

    
    public eventreg() {
        initComponents();
       
    combo();  
    }
    void combo()
    {
       jComboBox1.setSelectedItem(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton_register = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_fn = new javax.swing.JTextField();
        jTextField_ln = new javax.swing.JTextField();
        jTextField_em = new javax.swing.JTextField();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jTextField_mn = new javax.swing.JTextField();
        jTextField_cn = new javax.swing.JTextField();
        jTextField_br = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setLayout(null);

        jButton_register.setBackground(new java.awt.Color(51, 51, 255));
        jButton_register.setForeground(new java.awt.Color(255, 255, 255));
        jButton_register.setText("Register");
        jButton_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_registerMouseClicked(evt);
            }
        });
        jButton_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registerActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_register);
        jButton_register.setBounds(130, 480, 90, 23);

        jLabel2.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("First name");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(120, 120, 90, 23);

        jLabel3.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Last name");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(120, 170, 81, 23);

        jLabel4.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("DOB");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(120, 210, 40, 23);

        jLabel5.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("email");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(120, 250, 50, 23);

        jLabel6.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Mobile no.");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(120, 290, 90, 23);

        jLabel7.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("College name");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(110, 330, 110, 23);

        jLabel8.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Event name");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(120, 410, 100, 23);

        jTextField_fn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_fnActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_fn);
        jTextField_fn.setBounds(260, 120, 170, 30);

        jTextField_ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_lnActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_ln);
        jTextField_ln.setBounds(260, 160, 170, 30);
        jPanel2.add(jTextField_em);
        jTextField_em.setBounds(260, 240, 170, 30);
        jPanel2.add(jDateChooser);
        jDateChooser.setBounds(260, 200, 170, 30);
        jPanel2.add(jTextField_mn);
        jTextField_mn.setBounds(260, 280, 170, 30);
        jPanel2.add(jTextField_cn);
        jTextField_cn.setBounds(260, 320, 170, 30);

        jTextField_br.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_brActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_br);
        jTextField_br.setBounds(260, 360, 170, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TED TALKS", "SEMINARS", "INTERSTELLAR TALKS", "OPEN MIC", "MUN", "DJ NIGHT" }));
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(260, 410, 170, 30);

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
        jButton2.setBounds(300, 480, 90, 23);

        jLabel11.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Branch");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(120, 370, 60, 23);

        jLabel1.setFont(new java.awt.Font("Segoe Script", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registration ");
        jLabel1.setToolTipText("Registration Form");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(70, 20, 329, 78);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/c1.JPG"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(0, 0, 510, 530);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(130, 40, 510, 530);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/c0.jpg"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 0, 810, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(826, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_lnActionPerformed

    private void jTextField_brActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_brActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_brActionPerformed

    private void jButton_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_registerMouseClicked
    
    }//GEN-LAST:event_jButton_registerMouseClicked

    private void jButton_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registerActionPerformed
                // JOptionPane.showMessageDialog(null,"Enter Date of birth");
        String fname=jTextField_fn.getText();
        String lname=jTextField_ln.getText();
       // SimpleDateFormat date= new SimpleDateFormat("yyyy-MM-dd");
        //String bdate=date.format(jDateChooser.getDate());
       //JOptionPane.showMessageDialog(null,"Enter Date of birth");
        String email=jTextField_em.getText();
        String mobile=jTextField_mn.getText();
        String cname=jTextField_cn.getText();
        String branch=jTextField_br.getText();
        String even;
        even =   (String) jComboBox1.getSelectedItem();
        
         if(fname.equals(" "))
        {
         JOptionPane.showMessageDialog(null,"Enter First name");   
        }
        else if(lname.equals(" "))
        {
         JOptionPane.showMessageDialog(null,"Enter Last name");   
        }
        
        else if(email.equals(" "))
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
        else
        {
         PreparedStatement ps;
        String query="INSERT into registerev(First_name,Last_name,email,mobile,coname,branch,even) values(?,?,?,?,?,?,?)";
        try {
           ps=MyConnection.getConnection().prepareStatement(query);
        ps.setString(1, fname);
        ps.setString(2, lname);
        ps.setString(3 ,email);
        ps.setString(4, mobile);
        ps.setString(5, cname);
        ps.setString(6, branch);
        ps.setString(7, even);
        
       
        if(ps.executeUpdate()>0)
        {
            JOptionPane.showMessageDialog(null,"Registration Done");
            try {
			// Construct data
			String apiKey = "apikey=" + "MaIaMKRus8U-2xLASs3tfZ3B1UyFxlCSEMWTaahoEu";
			String message = "&message=" + "Dear student,\n Thank you for registring for Techfest\n your registration has been received\nFOR MORE DETAILS CONTACT US @8109373136 \nThanks! ";
			String sender = "&sender=" + " ";
			String numbers = "&numbers=" + jTextField_mn.getText();
			
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
         
            //Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
     }
        }
    }//GEN-LAST:event_jButton_registerActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField_fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_fnActionPerformed

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
            java.util.logging.Logger.getLogger(eventreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(eventreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(eventreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(eventreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new eventreg().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_register;
    private javax.swing.JComboBox jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField jTextField_br;
    private javax.swing.JTextField jTextField_cn;
    private javax.swing.JTextField jTextField_em;
    private javax.swing.JTextField jTextField_fn;
    private javax.swing.JTextField jTextField_ln;
    private javax.swing.JTextField jTextField_mn;
    // End of variables declaration//GEN-END:variables
}
