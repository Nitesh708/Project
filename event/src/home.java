/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */import AppPackage.AnimationClass;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
 import java.lang.*;
 
public class home extends javax.swing.JFrame {
AnimationClass AC=new AnimationClass();



    /**
     * Creates new form home
     */
    public home() {
       initComponents();
       
    
      //  this.setdecorated(true);
        home.setVisible(false);
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       contactus.setVisible(false);
        this.setVisible(true);
        this.setResizable(true);
        this.setAlwaysOnTop(false);
        Toolkit tc=Toolkit.getDefaultToolkit();
        int x=(int) tc.getScreenSize().getWidth();
        int y=(int) tc.getScreenSize().getHeight();
    setSize(x,y);
    
    Slideshow(); 
    }
    public void Slideshow()
        {
            new Thread()
            {
                int count;
                
                @Override
                public void run()
                {
                  try
                    {
                    
                        while(true)
                        {
                         switch(count)
                        {
                             case 0:
                                 ImageIcon II=new ImageIcon(getClass().getResource("/images/thumb-1920-665091.jpg"));
                                 picture1.setIcon(II);
                                 Thread.sleep(3000);
                                 AC.jLabelXLeft(270,-822 , 20, 7, picture1);
                                 AC.jLabelXLeft(1362, 270, 20, 7, picture2);
                                count=1;
                                 break;
                            case 1:
                                 ImageIcon II2=new ImageIcon(getClass().getResource("/images/1_eowbTUoaSRM-6GxQ50quCw.jpeg"));
                                 picture2.setIcon(II2);
                                 Thread.sleep(3000);
                                 AC.jLabelXRight(-822, 270, 20, 7, picture1);
                                 AC.jLabelXRight(270, 1362, 20, 7, picture2);
                                count=2;
                                 break;    
                           case 2:
                                ImageIcon II4=new ImageIcon(getClass().getResource("/images/tedtalks.png"));
                                picture1.setIcon(II4);                 
                                Thread.sleep(3000);
                                AC.jLabelXLeft(270,-822 , 20, 7, picture1);
                                AC.jLabelXLeft(1362, 270, 20, 7, picture2);
                                count=3;
                                 break;
                            case 3:
                                ImageIcon II7=new ImageIcon(getClass().getResource("/images/robowar.jpg"));
                                picture2.setIcon(II7);           
                                Thread.sleep(3000);
                                AC.jLabelXRight(-822, 270, 20, 7, picture1);
                                AC.jLabelXRight(270, 1362, 20, 7, picture2);
                                count=4;
                                break;        
                            case 4:
                                ImageIcon II8=new ImageIcon(getClass().getResource("/images/tedtalks.png"));
                                picture1.setIcon(II8);           
                                
                                 Thread.sleep(3000);
                                AC.jLabelXLeft(270,-822 , 20, 7, picture1);
                                 AC.jLabelXLeft(1362, 270, 20, 7, picture2);
                                count=6
                                        ;
                                 break; 
                             case 6:
                                ImageIcon II3=new ImageIcon(getClass().getResource("/images/5.jpg"));
                                picture2.setIcon(II3);  
                                  
                                 Thread.sleep(3000);
                                    //JOptionPane.showMessageDialog(null,"Logout Successfully");
                                 AC.jLabelXRight(-822, 270, 20, 7, picture1);
                                 AC.jLabelXRight(270, 1362, 20, 7, picture2);
                                count=7;
                                 break;      
                         case 7:
                                ImageIcon II10=new ImageIcon(getClass().getResource("/images/dance.jpg"));
                                picture1.setIcon(II10);  
                                  
                                 Thread.sleep(3000);
                                    //JOptionPane.showMessageDialog(null,"Logout Successfully");
                                 AC.jLabelXLeft(270,-822 , 20, 7, picture1);
                                 AC.jLabelXLeft(1362, 270, 20, 7, picture2);
                                count=8;
                                 break;    
                           case 8:
                                ImageIcon II11=new ImageIcon(getClass().getResource("/images/5.jpg"));
                                picture2.setIcon(II11);  
                                  
                                 Thread.sleep(3000);
                                    //JOptionPane.showMessageDialog(null,"Logout Successfully");
                                 AC.jLabelXRight(-822, 270, 20, 7, picture1);
                                 AC.jLabelXRight(270, 1362, 20, 7, picture2);
                                count=0;
                         }
        
        
        }   
                    }
                     catch(Exception e)
                    {  
                
                    }
                }
                
            }.start();       
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        contactus = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        aboutus = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        home = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        compimg = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        help = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        picture2 = new javax.swing.JLabel();
        picture1 = new javax.swing.JLabel();

        jPanel6.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jLabel2.setText("About us");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 310, 150, 48);

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jLabel4.setText("Help");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 420, 90, 48);

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jLabel5.setText("Contact us");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 200, 170, 48);

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MENU");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 130, 48);

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jLabel7.setText("HOME");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 100, 130, 48);

        jPanel6.add(jPanel1);
        jPanel1.setBounds(0, 90, 270, 610);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe Script", 2, 36)); // NOI18N
        jLabel1.setText("Tech Fest");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 10, 190, 58);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/h1.jpg"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(190, 10, 70, 60);

        jPanel6.add(jPanel2);
        jPanel2.setBounds(0, 0, 270, 90);

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.setLayout(null);

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton2.setText("LOGOUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(980, 10, 90, 23);

        jPanel6.add(jPanel3);
        jPanel3.setBounds(270, 0, 1090, 40);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.CardLayout());

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));

        jLabel25.setFont(new java.awt.Font("Tempus Sans ITC", 0, 90)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("WELCOME");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(333, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(328, 328, 328))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel25)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel4, "card6");

        contactus.setBackground(new java.awt.Color(0, 153, 153));

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 50)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Contact us");

        jTextArea2.setBackground(new java.awt.Color(153, 204, 255));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Comic Sans MS", 0, 25)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("Over team believes that\nevery step, no matter\nhow tiny,adds up to\ngenerate a wave of\nsomething new");
        jScrollPane2.setViewportView(jTextArea2);

        jPanel7.setBackground(new java.awt.Color(51, 204, 255));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("OVER TEAM");

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("MUSKAN AGRAWAL");

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("NITISHA JAIN");

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("NITESH JAIN");

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("MANSI GAUR");

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Mo:-7389395180");

        jLabel21.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Mo:-8109373136");

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 51));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Mo:-8109409344");

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Mo:-7999882186");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(30, 30, 30))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21))
                .addGap(44, 44, 44))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(48, 48, 48)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel21))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout contactusLayout = new javax.swing.GroupLayout(contactus);
        contactus.setLayout(contactusLayout);
        contactusLayout.setHorizontalGroup(
            contactusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactusLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(contactusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contactusLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(contactusLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        contactusLayout.setVerticalGroup(
            contactusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contactusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                    .addGroup(contactusLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel5.add(contactus, "card3");

        aboutus.setBackground(new java.awt.Color(0, 102, 102));

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 50)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("About us");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Comic Sans MS", 0, 25)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Techfest provides a plateform for one and all to witness of the most beautiful and ground breaking \namalgamatios of science and technology with pure enthusiasm.\n\nIt will attract people with its innovative technology cut-throat competition and breathtaking \nperformances for its audience.\n\nTechfest for past 10 years has served to be an ideal destination for student to learn, create and \nexperience the beauty of technology.\n\nThe spirit of Techfest was\" to promote technology and science thinking and innovation\" a moto\nthat has been followed by every techfest since.\n\nTechfest 2K19 will be held from 18 April to 21 April, and will feature an impressive level up of\nmore than 20 sci-Tech events including Seminars,Workshops,Events,Competition.\n\n");
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout aboutusLayout = new javax.swing.GroupLayout(aboutus);
        aboutus.setLayout(aboutusLayout);
        aboutusLayout.setHorizontalGroup(
            aboutusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aboutusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1071, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        aboutusLayout.setVerticalGroup(
            aboutusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutusLayout.createSequentialGroup()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.add(aboutus, "card4");

        home.setBackground(new java.awt.Color(0, 204, 255));

        jLabel8.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel8.setText("Competition");

        jLabel9.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel9.setText("Workshops");

        jLabel10.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel10.setText("events");

        compimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        compimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/comp.jpg"))); // NOI18N
        compimg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compimgMouseClicked(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/workshop.jpg"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dj.jpg"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homeLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel8)
                        .addGap(166, 166, 166)
                        .addComponent(jLabel9))
                    .addGroup(homeLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(compimg)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(211, 211, 211))))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                        .addComponent(compimg, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(26, 26, 26)))
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addGap(87, 87, 87))
        );

        jPanel5.add(home, "card5");

        help.setBackground(new java.awt.Color(0, 153, 153));

        jLabel24.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 50)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("HELP");

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(51, 204, 255));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Comic Sans MS", 0, 25)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("How to access the app ?\n\n1) On the first, screen we have a splash/loading screen.\n2) For further proceedings, you have a LOGIN screen if you are new here than you can \n    sign up by clicking on sign up.\n3) After login,we are on our home page. On the left side providing various options like\n    Home,Contact us,About us.\n4) If you want to known about Techest & its legacy visit About us where you will be aware\n    about all things.\n5) To known about our Team, cliick on Contact us.\n6) On clicking Home, you can go through Competitions,Workshops & events of techfest.\n7) On further clicking on any of above mentioned you find list of that particular event.\n    you get info about that event/workshop/competitiion by just placing mouse cursor on\n    the topic information will appear about particular topic.\n8) On every page Register and Cancel option is provided which will register you for that \n     particular event.");
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout helpLayout = new javax.swing.GroupLayout(help);
        help.setLayout(helpLayout);
        helpLayout.setHorizontalGroup(
            helpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(helpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1057, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        helpLayout.setVerticalGroup(
            helpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpLayout.createSequentialGroup()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))
        );

        jPanel5.add(help, "card5");

        jPanel6.add(jPanel5);
        jPanel5.setBounds(266, 330, 1100, 370);

        picture2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        picture2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tedtalks.png"))); // NOI18N
        picture2.setText("jLabel14");
        jPanel6.add(picture2);
        picture2.setBounds(1362, 40, 1092, 290);

        picture1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        picture1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/robowar.jpg"))); // NOI18N
        picture1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        jPanel6.add(picture1);
        picture1.setBounds(270, 40, 1092, 290);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1378, 735));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
     jPanel5.removeAll();
     jPanel5.repaint();
     jPanel5.revalidate();
     
     jPanel5.add(home);
     jPanel5.repaint();
     jPanel5.revalidate();
    
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       
     jPanel5.removeAll();
     jPanel5.repaint();
     jPanel5.revalidate();
     
     jPanel5.add(aboutus);
     jPanel5.repaint();
     jPanel5.revalidate();
    
       
        //jPanel4.setVisible(false);   
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
     jPanel5.removeAll();
     jPanel5.repaint();
     jPanel5.revalidate();
     
     jPanel5.add(contactus);
     jPanel5.repaint();
     jPanel5.revalidate();
    
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
         jPanel5.removeAll();
     jPanel5.repaint();
     jPanel5.revalidate();
     
     jPanel5.add(help);
     jPanel5.repaint();
     jPanel5.revalidate();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void compimgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compimgMouseClicked
       comp t=new comp();
       t.setVisible(true);
       t.pack();
       t.setLocationRelativeTo(null);
       
       t.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_compimgMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
    work ty=new work();
       ty.setVisible(true);
       ty.pack();
       
       ty.setLocationRelativeTo(null);
       ty.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);      
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
         eve ty=new eve();
       ty.setVisible(true);
       ty.pack();
       
       ty.setLocationRelativeTo(null);
       ty.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null,"Logout Successfully");
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws NullPointerException 
    {
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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    //</editor-fold>
    
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new home();
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aboutus;
    private javax.swing.JLabel compimg;
    private javax.swing.JPanel contactus;
    private javax.swing.JPanel help;
    private javax.swing.JPanel home;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JLabel picture1;
    private javax.swing.JLabel picture2;
    // End of variables declaration//GEN-END:variables
}
