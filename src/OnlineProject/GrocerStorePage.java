
package OnlineProject;

import java.text.MessageFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class GrocerStorePage extends javax.swing.JFrame {

   
    public GrocerStorePage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnBiscuits = new javax.swing.JButton();
        jbtnRice = new javax.swing.JButton();
        jbtnCoffee = new javax.swing.JButton();
        jbtnPotato = new javax.swing.JButton();
        jbtnMilk = new javax.swing.JButton();
        jbtnOil = new javax.swing.JButton();
        jbtnEgg = new javax.swing.JButton();
        jbtnOnion = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbtn7 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtnPoint = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtnC = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jbtnPay = new javax.swing.JButton();
        jbtnPrint = new javax.swing.JButton();
        jbtnRemove = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnBack = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtChange = new javax.swing.JTextField();
        jtxtDisplay = new javax.swing.JTextField();
        jcboPayment = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtSubTotal = new javax.swing.JTextField();
        jtxtTotal = new javax.swing.JTextField();
        jtxtTax = new javax.swing.JTextField();
        jtxtBarCode = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnBiscuits.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GroceryImage/Biscuites.jpg"))); // NOI18N
        jbtnBiscuits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBiscuitsActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnBiscuits, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 272, 228));

        jbtnRice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GroceryImage/rice.jpg"))); // NOI18N
        jbtnRice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRiceActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 272, -1));

        jbtnCoffee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GroceryImage/coffee.jpg"))); // NOI18N
        jbtnCoffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCoffeeActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnCoffee, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 272, 228));

        jbtnPotato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GroceryImage/Potato.jpg"))); // NOI18N
        jbtnPotato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPotatoActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnPotato, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 272, 231));

        jbtnMilk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GroceryImage/milk.jpg"))); // NOI18N
        jbtnMilk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMilkActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnMilk, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 272, 228));

        jbtnOil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GroceryImage/cooking oil.jpg"))); // NOI18N
        jbtnOil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOilActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnOil, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, 272, 228));

        jbtnEgg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GroceryImage/Egg.jpg"))); // NOI18N
        jbtnEgg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEggActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnEgg, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 272, 231));

        jbtnOnion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GroceryImage/onion.jpg"))); // NOI18N
        jbtnOnion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOnionActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnOnion, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 310, 272, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setText("Milk");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 50, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setText("Oil-5 liter");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 250, 100, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setText("Onion-1kg");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 540, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setText("Egg-1 Dozen");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, 130, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel11.setText("Potato-1kg");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, 120, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel12.setText("Rice-1kg");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 100, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel13.setText("Coffee");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 90, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel14.setText("Biscuits");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 90, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 255));
        jLabel15.setText("Price-150/-");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 255));
        jLabel16.setText("Price-120/-");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 255));
        jLabel17.setText("Price-490/-");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 255));
        jLabel18.setText("Price-350/-");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 255));
        jLabel19.setText("Price-1100/-");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 250, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 255));
        jLabel20.setText("Price-95/-");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 540, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 255));
        jLabel21.setText("Price-110/-");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 540, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 255));
        jLabel22.setText("Price-60/-");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 1150, 592));

        jTable1.setBackground(new java.awt.Color(255, 204, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Quantity", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 120, 330, 512));

        jPanel7.setBackground(java.awt.SystemColor.info);
        jPanel7.setForeground(new java.awt.Color(0, 185, 219));

        jLabel23.setFont(new java.awt.Font("Elephant", 3, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 51, 0));
        jLabel23.setText("MHRA Bazar Express");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 500, 60));

        jPanel2.setBackground(java.awt.SystemColor.info);
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jbtn7.setBackground(java.awt.SystemColor.activeCaption);
        jbtn7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn7.setForeground(new java.awt.Color(51, 0, 51));
        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });

        jbtn9.setBackground(java.awt.SystemColor.activeCaption);
        jbtn9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn9.setText("9");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });

        jbtn8.setBackground(java.awt.SystemColor.activeCaption);
        jbtn8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn8.setText("8");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });

        jbtn4.setBackground(java.awt.SystemColor.activeCaption);
        jbtn4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn4.setText("4");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });

        jbtn1.setBackground(java.awt.SystemColor.activeCaption);
        jbtn1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn1.setText("1");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });

        jbtn5.setBackground(java.awt.SystemColor.activeCaption);
        jbtn5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn5.setText("5");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });

        jbtn0.setBackground(java.awt.SystemColor.activeCaption);
        jbtn0.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn0.setText("0");
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });

        jbtn2.setBackground(java.awt.SystemColor.activeCaption);
        jbtn2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn2.setText("2");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });

        jbtn6.setBackground(java.awt.SystemColor.activeCaption);
        jbtn6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn6.setText("6");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });

        jbtnPoint.setBackground(java.awt.SystemColor.activeCaption);
        jbtnPoint.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnPoint.setText(".");
        jbtnPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPointActionPerformed(evt);
            }
        });

        jbtn3.setBackground(java.awt.SystemColor.activeCaption);
        jbtn3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn3.setText("3");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });

        jbtnC.setBackground(java.awt.SystemColor.activeCaption);
        jbtnC.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnC.setText("C");
        jbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(28, 28, 28))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 120, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jbtnPay.setBackground(java.awt.SystemColor.activeCaption);
        jbtnPay.setFont(new java.awt.Font("Tahoma", 1, 34)); // NOI18N
        jbtnPay.setText("Pay");
        jbtnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPayActionPerformed(evt);
            }
        });

        jbtnPrint.setBackground(java.awt.SystemColor.activeCaption);
        jbtnPrint.setFont(new java.awt.Font("Tahoma", 1, 34)); // NOI18N
        jbtnPrint.setText("Print");
        jbtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrintActionPerformed(evt);
            }
        });

        jbtnRemove.setBackground(java.awt.SystemColor.activeCaption);
        jbtnRemove.setFont(new java.awt.Font("Tahoma", 1, 34)); // NOI18N
        jbtnRemove.setForeground(new java.awt.Color(51, 0, 51));
        jbtnRemove.setText("Remove");
        jbtnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRemoveActionPerformed(evt);
            }
        });

        jbtnExit.setBackground(new java.awt.Color(255, 51, 51));
        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 34)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jbtnReset.setBackground(java.awt.SystemColor.activeCaption);
        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 34)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        jbtnBack.setFont(new java.awt.Font("Tahoma", 1, 34)); // NOI18N
        jbtnBack.setText("Back");
        jbtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(jbtnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(jbtnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 20, 488, 177));

        jPanel5.setBackground(new java.awt.Color(51, 255, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Pay");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Payment Method ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Change");

        jtxtChange.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jtxtDisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jcboPayment.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jcboPayment.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cash", "Card", "Bikash", "Nagad", "Upay", "Paypal" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jtxtChange, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcboPayment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcboPayment, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtDisplay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 18, -1, 180));

        jPanel6.setBackground(new java.awt.Color(255, 255, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Sub Total");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Tax");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Total");

        jtxtSubTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jtxtTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jtxtTax.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtTax, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtSubTotal)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jtxtTax))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jtxtTotal)
                        .addGap(2, 2, 2)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 18, 610, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 720, 1840, 216));

        jtxtBarCode.setBackground(new java.awt.Color(255, 204, 255));
        jtxtBarCode.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(jtxtBarCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 631, 330, 80));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GroceryImage/Grocery Top.jpg"))); // NOI18N
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1840, 120));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
        String Enternumber = jtxtDisplay.getText();
       
       if(Enternumber == "")
       {
           jtxtDisplay.setText(jbtn7.getText());
           
       }
       else
       {
           Enternumber = jtxtDisplay.getText() + jbtn7.getText();
           jtxtDisplay.setText(Enternumber);
          
       }
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
        String Enternumber = jtxtDisplay.getText();
       
       if(Enternumber == "")
       {
           jtxtDisplay.setText(jbtn8.getText());
           
       }
       else
       {
           Enternumber = jtxtDisplay.getText() + jbtn8.getText();
           jtxtDisplay.setText(Enternumber);
          
       }
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
        String Enternumber = jtxtDisplay.getText();
       
       if(Enternumber == "")
       {
           jtxtDisplay.setText(jbtn9.getText());
           
       }
       else
       {
           Enternumber = jtxtDisplay.getText() + jbtn9.getText();
           jtxtDisplay.setText(Enternumber);
          
       }
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
       String Enternumber = jtxtDisplay.getText();
       
       if(Enternumber == "")
       {
           jtxtDisplay.setText(jbtn4.getText());
           
       }
       else
       {
           Enternumber = jtxtDisplay.getText() + jbtn4.getText();
           jtxtDisplay.setText(Enternumber);
          
       }
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
        String Enternumber = jtxtDisplay.getText();
       
       if(Enternumber == "")
       {
           jtxtDisplay.setText(jbtn5.getText());
           
       }
       else
       {
           Enternumber = jtxtDisplay.getText() + jbtn5.getText();
           jtxtDisplay.setText(Enternumber);
          
       }
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
         String Enternumber = jtxtDisplay.getText();
       
       if(Enternumber == "")
       {
           jtxtDisplay.setText(jbtn6.getText());
           
       }
       else
       {
           Enternumber = jtxtDisplay.getText() + jbtn6.getText();
           jtxtDisplay.setText(Enternumber);
          
       }
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
         String Enternumber = jtxtDisplay.getText();
       
       if(Enternumber == "")
       {
           jtxtDisplay.setText(jbtn1.getText());
           
       }
       else
       {
           Enternumber = jtxtDisplay.getText() + jbtn1.getText();
           jtxtDisplay.setText(Enternumber);
          
       }
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
         String Enternumber = jtxtDisplay.getText();
       
       if(Enternumber == "")
       {
           jtxtDisplay.setText(jbtn2.getText());
           
       }
       else
       {
           Enternumber = jtxtDisplay.getText() + jbtn2.getText();
           jtxtDisplay.setText(Enternumber);
          
       }
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
        String Enternumber = jtxtDisplay.getText();
       
       if(Enternumber == "")
       {
           jtxtDisplay.setText(jbtn3.getText());
           
       }
       else
       {
           Enternumber = jtxtDisplay.getText() + jbtn3.getText();
           jtxtDisplay.setText(Enternumber);
          
       }
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn0ActionPerformed
         String Enternumber = jtxtDisplay.getText();
       
       if(Enternumber == "")
       {
           jtxtDisplay.setText(jbtn0.getText());
           
       }
       else
       {
           Enternumber = jtxtDisplay.getText() + jbtn0.getText();
           jtxtDisplay.setText(Enternumber);
          
       }
    }//GEN-LAST:event_jbtn0ActionPerformed

    private void jbtnPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPointActionPerformed
         if(! jtxtDisplay.getText().contains("."))
       {
            jtxtDisplay.setText(jtxtDisplay.getText() +jbtnPoint.getText() );
       }
    }//GEN-LAST:event_jbtnPointActionPerformed

    private void jbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCActionPerformed
        jtxtDisplay.setText("");
      jtxtChange.setText("");
    }//GEN-LAST:event_jbtnCActionPerformed

    private void jbtnBiscuitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBiscuitsActionPerformed
       double PriceOfItem=120;
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Biscuits","1",PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jbtnBiscuitsActionPerformed

    private void jbtnCoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCoffeeActionPerformed
         double PriceOfItem=490;
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Coffee","1",PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jbtnCoffeeActionPerformed

    private void jbtnMilkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMilkActionPerformed
         double PriceOfItem=350;
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Milk","1",PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jbtnMilkActionPerformed

    private void jbtnOilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnOilActionPerformed
        double PriceOfItem=1100;
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Oil-5 Liter","1",PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jbtnOilActionPerformed

    private void jbtnRiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRiceActionPerformed
         double PriceOfItem=150;
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Rice-1kg","1",PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jbtnRiceActionPerformed

    private void jbtnPotatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPotatoActionPerformed
          double PriceOfItem=60;
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Potato-1kg","1",PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jbtnPotatoActionPerformed

    private void jbtnEggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEggActionPerformed
          double PriceOfItem=110;
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Egg-1 Dozen","1",PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jbtnEggActionPerformed

    private void jbtnOnionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnOnionActionPerformed
        double PriceOfItem=95;
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Onion-1kg","1",PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jbtnOnionActionPerformed

    private void jbtnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPayActionPerformed
         if(jcboPayment.getSelectedItem().equals("Cash"))
      {
          Change();
      }
      else
      {
              jtxtChange.setText("");
              jtxtDisplay.setText("");
              }
    }//GEN-LAST:event_jbtnPayActionPerformed

    private void jbtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrintActionPerformed
        MessageFormat header = new MessageFormat("MHRA Bazar Express");
      
         
      MessageFormat footer = new MessageFormat("Page {0,number,integer}");
      
      
         try
         {
             jTable1.print(JTable.PrintMode.NORMAL, header, footer);
         }
         catch(java.awt.print.PrinterException e)
         {
             System.err.format("No Printer Found", e.getMessage());
         }
    }//GEN-LAST:event_jbtnPrintActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        jtxtChange.setText("");
        jtxtTax.setText("");
         jtxtTotal.setText("");
        jtxtSubTotal.setText("");
         jtxtDisplay.setText("");
        jtxtBarCode.setText("");
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemoveActionPerformed
         DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        
        int RemoveItem = jTable1.getSelectedRow();
        if(RemoveItem >= 0)
        {
            model.removeRow(RemoveItem);
        }
        ItemCost();
         if(jcboPayment.getSelectedItem().equals("Cash"))
      {
          Change();
      }
      else
      {
              jtxtChange.setText("");
              jtxtDisplay.setText("");
              }
    }//GEN-LAST:event_jbtnRemoveActionPerformed

     private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Computer Shop",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackActionPerformed
        ShopSelectionPage shopSelection=new ShopSelectionPage();
        shopSelection.show();
        dispose();
    }//GEN-LAST:event_jbtnBackActionPerformed
    
     //==========================Function===========================================//
    
    public void ItemCost(){
        
        double sum=0;
        
        for(int i = 0; i<jTable1.getRowCount(); i++)
        {
            sum=sum+Double.parseDouble(jTable1.getValueAt(i, 2).toString());
        }
        jtxtSubTotal.setText(Double.toString(sum));
        double cTotal1=Double.parseDouble( jtxtSubTotal.getText());
        
        double cTax=(cTotal1 * 3.9)/100;
        String iTaxTotal=String.format(" %.2f", cTax);
        jtxtTax.setText(iTaxTotal);
        
         String iSubTotal=String.format(" %.2f", cTotal1);
        jtxtSubTotal.setText(iSubTotal);
        
         String iTotal=String.format(" %.2f", cTotal1 + cTax);
        jtxtTotal.setText(iTotal);
        
         String BarCode=String.format("Total %.2f", cTotal1 + cTax);
        jtxtBarCode.setText(BarCode);
    }
    
    //==========================Function Changer===========================================//
    
    public void Change()
    {
        double sum=0;
        double tax=3.9;
        double cash=Double.parseDouble( jtxtDisplay.getText());
        
        for(int i = 0; i<jTable1.getRowCount(); i++)
        {
            sum=sum+Double.parseDouble(jTable1.getValueAt(i, 2).toString());
        }
       
        double cTax= (sum * 3.9)/100;
         double cChange=(cash - (sum + cTax));
         
         String ChangeGiven = String.format(" %.2f", cChange);
         jtxtChange.setText(ChangeGiven);
    }
    
    
   
    public static void main(String args[]) {
      
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
            java.util.logging.Logger.getLogger(GrocerStorePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GrocerStorePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GrocerStorePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GrocerStorePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GrocerStorePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnBack;
    private javax.swing.JButton jbtnBiscuits;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnCoffee;
    private javax.swing.JButton jbtnEgg;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnMilk;
    private javax.swing.JButton jbtnOil;
    private javax.swing.JButton jbtnOnion;
    private javax.swing.JButton jbtnPay;
    private javax.swing.JButton jbtnPoint;
    private javax.swing.JButton jbtnPotato;
    private javax.swing.JButton jbtnPrint;
    private javax.swing.JButton jbtnRemove;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnRice;
    private javax.swing.JComboBox jcboPayment;
    private javax.swing.JTextField jtxtBarCode;
    private javax.swing.JTextField jtxtChange;
    private javax.swing.JTextField jtxtDisplay;
    private javax.swing.JTextField jtxtSubTotal;
    private javax.swing.JTextField jtxtTax;
    private javax.swing.JTextField jtxtTotal;
    // End of variables declaration//GEN-END:variables
}
