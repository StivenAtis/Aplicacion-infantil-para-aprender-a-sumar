package VISTAS;

import classes.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Booh
 */
public class frmApp_1 extends javax.swing.JFrame {


    public frmApp_1() {
        initComponents();
        Number1.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        bt0 = new javax.swing.JButton();
        btEquals = new javax.swing.JButton();
        btClear = new javax.swing.JButton();
        arrow1 = new javax.swing.JLabel();
        arrow = new javax.swing.JLabel();
        NumberLlevadas2 = new javax.swing.JTextField();
        Number2 = new javax.swing.JTextField();
        Number1 = new javax.swing.JTextField();
        Number5 = new javax.swing.JTextField();
        Number6 = new javax.swing.JTextField();
        Number3 = new javax.swing.JTextField();
        Number4 = new javax.swing.JTextField();
        result1 = new javax.swing.JTextField();
        result2 = new javax.swing.JTextField();
        result4 = new javax.swing.JTextField();
        NumberLlevadas1 = new javax.swing.JTextField();
        result3 = new javax.swing.JTextField();
        emoji_happy = new javax.swing.JLabel();
        emoji_happy_2 = new javax.swing.JLabel();
        cat_happy_1 = new javax.swing.JLabel();
        cat_happy_2 = new javax.swing.JLabel();
        goals = new javax.swing.JLabel();
        goals1 = new javax.swing.JLabel();
        Banner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EasyMaths");
        setPreferredSize(new java.awt.Dimension(1000, 698));
        setResizable(false);

        jPanel2.setMinimumSize(new java.awt.Dimension(1000, 678));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/INICIO_MIN.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/INICIO_MIN.png"))); // NOI18N
        jButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/INICIO_MAX.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 230, 90));

        bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/1_min.png"))); // NOI18N
        bt1.setContentAreaFilled(false);
        bt1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/1_min.png"))); // NOI18N
        bt1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/1_max.png"))); // NOI18N
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        jPanel2.add(bt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 80, 80));

        bt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/2_min.png"))); // NOI18N
        bt2.setContentAreaFilled(false);
        bt2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/2_min.png"))); // NOI18N
        bt2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/2_max.png"))); // NOI18N
        jPanel2.add(bt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 80, 80));

        bt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/3_min.png"))); // NOI18N
        bt3.setContentAreaFilled(false);
        bt3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/3_min.png"))); // NOI18N
        bt3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/3_max.png"))); // NOI18N
        jPanel2.add(bt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 80, 80));

        bt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/4_min.png"))); // NOI18N
        bt4.setContentAreaFilled(false);
        bt4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/4_min.png"))); // NOI18N
        bt4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/4_max.png"))); // NOI18N
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });
        jPanel2.add(bt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 80, 80));

        bt5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/5_min.png"))); // NOI18N
        bt5.setContentAreaFilled(false);
        bt5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/5_min.png"))); // NOI18N
        bt5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/5_max.png"))); // NOI18N
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });
        jPanel2.add(bt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, 80, 80));

        bt6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/6_min.png"))); // NOI18N
        bt6.setContentAreaFilled(false);
        bt6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/6_min.png"))); // NOI18N
        bt6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/6_max.png"))); // NOI18N
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });
        jPanel2.add(bt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, 80, 80));

        bt7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/7_min.png"))); // NOI18N
        bt7.setContentAreaFilled(false);
        bt7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/7_min.png"))); // NOI18N
        bt7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/7_max.png"))); // NOI18N
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });
        jPanel2.add(bt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, 80, 80));

        bt8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/8_min.png"))); // NOI18N
        bt8.setContentAreaFilled(false);
        bt8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/8_min.png"))); // NOI18N
        bt8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/8_max.png"))); // NOI18N
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });
        jPanel2.add(bt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, 80, 80));

        bt9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/9_min.png"))); // NOI18N
        bt9.setContentAreaFilled(false);
        bt9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/9_min.png"))); // NOI18N
        bt9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/9_max.png"))); // NOI18N
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });
        jPanel2.add(bt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 570, 80, 80));

        bt0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/0_min.png"))); // NOI18N
        bt0.setContentAreaFilled(false);
        bt0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/0_min.png"))); // NOI18N
        bt0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/0_max.png"))); // NOI18N
        bt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt0ActionPerformed(evt);
            }
        });
        jPanel2.add(bt0, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 570, 80, 80));

        btEquals.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/=_min.png"))); // NOI18N
        btEquals.setContentAreaFilled(false);
        btEquals.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/=_min.png"))); // NOI18N
        btEquals.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/=_max.png"))); // NOI18N
        btEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEqualsActionPerformed(evt);
            }
        });
        jPanel2.add(btEquals, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 570, 80, 80));

        btClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/c_min.png"))); // NOI18N
        btClear.setContentAreaFilled(false);
        btClear.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/c_min.png"))); // NOI18N
        btClear.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/c_max.png"))); // NOI18N
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });
        jPanel2.add(btClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 570, 80, 80));
        jPanel2.add(arrow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 100, 50));
        jPanel2.add(arrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 100, 50));

        NumberLlevadas2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        NumberLlevadas2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NumberLlevadas2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NumberLlevadas2MouseClicked(evt);
            }
        });
        NumberLlevadas2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NumberLlevadas2KeyTyped(evt);
            }
        });
        jPanel2.add(NumberLlevadas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 70, 50));

        Number2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Number2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Number2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Number2MouseClicked(evt);
            }
        });
        Number2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Number2KeyTyped(evt);
            }
        });
        jPanel2.add(Number2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 70, 50));

        Number1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Number1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Number1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Number1MouseClicked(evt);
            }
        });
        Number1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Number1KeyTyped(evt);
            }
        });
        jPanel2.add(Number1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 70, 50));

        Number5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Number5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Number5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Number5MouseClicked(evt);
            }
        });
        Number5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Number5KeyTyped(evt);
            }
        });
        jPanel2.add(Number5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 70, 50));

        Number6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Number6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Number6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Number6MouseClicked(evt);
            }
        });
        Number6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Number6KeyTyped(evt);
            }
        });
        jPanel2.add(Number6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 70, 50));

        Number3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Number3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Number3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Number3MouseClicked(evt);
            }
        });
        Number3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Number3KeyTyped(evt);
            }
        });
        jPanel2.add(Number3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 70, 50));

        Number4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Number4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Number4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Number4MouseClicked(evt);
            }
        });
        Number4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Number4KeyTyped(evt);
            }
        });
        jPanel2.add(Number4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 70, 50));

        result1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        result1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        result1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                result1MouseClicked(evt);
            }
        });
        result1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                result1KeyTyped(evt);
            }
        });
        jPanel2.add(result1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 70, 50));

        result2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        result2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        result2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                result2MouseClicked(evt);
            }
        });
        result2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                result2KeyTyped(evt);
            }
        });
        jPanel2.add(result2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 70, 50));

        result4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        result4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        result4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                result4MouseClicked(evt);
            }
        });
        result4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                result4KeyTyped(evt);
            }
        });
        jPanel2.add(result4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 70, 50));

        NumberLlevadas1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        NumberLlevadas1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NumberLlevadas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NumberLlevadas1MouseClicked(evt);
            }
        });
        NumberLlevadas1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NumberLlevadas1KeyTyped(evt);
            }
        });
        jPanel2.add(NumberLlevadas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 70, 50));

        result3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        result3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        result3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                result3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                result3MousePressed(evt);
            }
        });
        result3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                result3KeyTyped(evt);
            }
        });
        jPanel2.add(result3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 70, 50));

        emoji_happy.setFocusable(false);
        jPanel2.add(emoji_happy, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 150, 130));

        emoji_happy_2.setFocusable(false);
        jPanel2.add(emoji_happy_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 150, 140));

        cat_happy_1.setFocusable(false);
        jPanel2.add(cat_happy_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 100, 140));

        cat_happy_2.setFocusable(false);
        jPanel2.add(cat_happy_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 100, 140));
        jPanel2.add(goals, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 190, 260, 340));
        jPanel2.add(goals1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 260, 340));

        Banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/main.png"))); // NOI18N
        jPanel2.add(Banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt8ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt0ActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt9ActionPerformed

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        
        Number1.setText("");
        Number2.setText("");
        Number3.setText("");
        Number4.setText("");
        Number5.setText("");
        Number6.setText("");
        result1.setText("");
        result2.setText("");
        result3.setText("");
        result4.setText("");
        NumberLlevadas1.setText("");
        NumberLlevadas2.setText("");
        emoji_happy.setIcon(null);
        emoji_happy_2.setIcon(null);
        cat_happy_1.setIcon(null);
        cat_happy_2.setIcon(null);
        goals.setIcon(null);
        goals1.setIcon(null);
        arrow.setIcon(null);
        arrow1.setIcon(null);
        
    }//GEN-LAST:event_btClearActionPerformed

    private void btEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEqualsActionPerformed
        
        
        //----------------------------------------------------------------------
        int numero_1;
        if ("".equals(Number1.getText())) {
            Number1.setText("0");
            numero_1 = 0;
        }else{
            numero_1 = Integer.parseInt(Number1.getText());
        }
        
        int numero_2;
        if ("".equals(Number2.getText())) {
            Number2.setText("0");
            numero_2 = 0;
        }else{
        numero_2 = Integer.parseInt(Number2.getText());
        }
        
        int numero_3;
        if ("".equals(Number3.getText())) {
            Number3.setText("0");
            numero_3 = 0;
        }else{
        numero_3 = Integer.parseInt(Number3.getText());
        }
        
        int numero_4;
        if ("".equals(Number4.getText())) {
            Number4.setText("0");
            numero_4 = 0;
        }else{
        numero_4 = Integer.parseInt(Number4.getText());
        }
        
        int numero_5;
        if ("".equals(Number5.getText())) {
            Number5.setText("0");
            numero_5 = 0;
        }else{
        numero_5 = Integer.parseInt(Number5.getText());
        }
        
        int numero_6;
        if ("".equals(Number6.getText())) {
            Number6.setText("0");
            numero_6 = 0;
        }else{
        numero_6 = Integer.parseInt(Number6.getText());
        }
        
        int llevada_1;
        if ("".equals(NumberLlevadas1.getText())) {
            NumberLlevadas1.setText("0");
            llevada_1 = 0;
        }else{
        llevada_1 = Integer.parseInt(NumberLlevadas1.getText());
        }
        
        int llevada_2;
        if ("".equals(NumberLlevadas2.getText())) {
            NumberLlevadas2.setText("0");
            llevada_2 = 0;
        }else{
        llevada_2 = Integer.parseInt(NumberLlevadas2.getText());
        }
        
        int resutado_1;
        if ("".equals(result1.getText())) {
            result1.setText("0");
            resutado_1 = 0;
        }else{
        resutado_1 = Integer.parseInt(result1.getText());
        }
        
        int resutado_2;
        if ("".equals(result2.getText())) {
            result2.setText("0");
            resutado_2 = 0;
        }else{
        resutado_2 = Integer.parseInt(result2.getText());
        }
        
        int resutado_3;
        if ("".equals(result3.getText())) {
            result3.setText("0");
            resutado_3 = 0;
        }else{
        resutado_3 = Integer.parseInt(result3.getText());
        }
        
        int resutado_4;
        if ("".equals(result4.getText())) {
            result4.setText("0");
            resutado_4 = 0;
        }else{
        resutado_4 = Integer.parseInt(result4.getText());
        }
        
        //----------------------------------------------------------------------
        
        String resultadoTotal;
        resultadoTotal = resutado_1 + "" + resutado_2 + "" + resutado_3 + "" + resutado_4;
        System.out.println("r" + resultadoTotal);
        
        //----------------------------------------------------------------------
        //----------------------------------------------------------------------
        
        String resultado_suma_fila_1;
        resultado_suma_fila_1 = llevada_1 + "" + resutado_1;
        int resultado_suma_fila_uno = Integer.parseInt(resultado_suma_fila_1);
        System.out.println("resultado suma fila 1: " + resultado_suma_fila_uno);
        
        //----------------------------------------------------------------------
        
        String resultado_suma_fila_2;
        resultado_suma_fila_2 = llevada_2 + "" + resutado_2;
        int resultado_suma_fila_dos = Integer.parseInt(resultado_suma_fila_2);
        System.out.println("resultado suma fila 2: " + resultado_suma_fila_dos);
        
        //----------------------------------------------------------------------
        
        String resultado_suma_fila_3;
        resultado_suma_fila_3 = resutado_4 + "" + resutado_3;
        int resultado_suma_fila_tres = Integer.parseInt(resultado_suma_fila_3);
        System.out.println("resultado suma fila 3: " + resultado_suma_fila_tres);
        
        //----------------------------------------------------------------------
        //----------------------------------------------------------------------
        
        int suma_primera_fila = clsAddition.sumar_numeros(numero_1, numero_4);
        
        //----------------------------------------------------------------------
        
        int suma_segunda_fila = clsAddition.sumar_segunda_fila(llevada_1, numero_2, numero_5);
        
        //----------------------------------------------------------------------
        
        int suma_tercera_fila = clsAddition.sumar_segunda_fila(llevada_2, numero_3, numero_6);
        
        //----------------------------------------------------------------------

        
        //----------------------------------------------------------------------
        
        if(suma_primera_fila == resultado_suma_fila_uno && resultado_suma_fila_dos == 0 && resultado_suma_fila_tres == 0){
            System.out.println("Lo has hecho bien");
            if(resultado_suma_fila_uno != 0){
                emoji_happy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/emoji_happy_1.gif")));
                emoji_happy_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/emoji_happy_1.gif")));
                goals.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/goals.png")));
                goals1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/goals.png")));
            }
        }
        else{
            System.out.println("Lo has hecho MAL");
        }
        
        //----------------------------------------------------------------------
        
        if(suma_primera_fila == resultado_suma_fila_uno && suma_segunda_fila !=  resultado_suma_fila_dos ){
            System.out.println("LO HAZ HECHO MAL");
            emoji_happy.setIcon(null);
            emoji_happy_2.setIcon(null);
        }
        
        //----------------------------------------------------------------------
        
        if(suma_primera_fila == resultado_suma_fila_uno && suma_segunda_fila !=  resultado_suma_fila_dos && suma_tercera_fila !=  resultado_suma_fila_tres){
            System.out.println("LO HAZ HECHO MAL");
            emoji_happy.setIcon(null);
            emoji_happy_2.setIcon(null);
        }
        
        //----------------------------------------------------------------------
        
        if(suma_primera_fila == resultado_suma_fila_uno && suma_segunda_fila == resultado_suma_fila_dos){
            System.out.println("Lo has hecho bien");
            if(resultado_suma_fila_dos != 0){
                emoji_happy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/emoji_happy_1.gif")));
                emoji_happy_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/emoji_happy_1.gif")));
                goals.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/goals.png")));
                goals1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/goals.png")));
            }
        }
        else{
            System.out.println("Lo has hecho MAL");
        }
        
        //----------------------------------------------------------------------
        
        if(suma_primera_fila == resultado_suma_fila_uno && suma_segunda_fila == resultado_suma_fila_dos && suma_tercera_fila == resultado_suma_fila_tres){
            System.out.println("Lo has hecho bien");
            if(resultado_suma_fila_tres != 0){
               emoji_happy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/emoji_happy_1.gif")));
               emoji_happy_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/emoji_happy_1.gif")));
               cat_happy_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/Cat_happy.gif")));
               cat_happy_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/Cat_happy.gif")));
               goals.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/goals.png")));
               goals1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/goals.png")));
            }
        }
        else{
            System.out.println("Lo has hecho MAL");
            emoji_happy.setIcon(null);
            emoji_happy_2.setIcon(null);
            cat_happy_1.setIcon(null);
            cat_happy_2.setIcon(null);
            goals.setIcon(null);
            goals1.setIcon(null);
            Icon m = new ImageIcon(getClass().getResource("/imahes/sad_emoji.gif"));
            emoji_happy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/emoji_sad_2.gif")));
            emoji_happy_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/emoji_sad_2.gif")));
            JOptionPane.showMessageDialog(this, "¡¡¡Has cometido un \n ERROR!!!", "ERROR", WIDTH, m);
            //JOptionPane.showMessageDialog(this, m, "¡¡¡Has cometido un \n ERROR!!!", WIDTH, m);
        }
        
        
        
        //----------------------------------------------------------------------
        
        
        
        //----------------------------------------------------------------------
    }//GEN-LAST:event_btEqualsActionPerformed
 
    private void Number2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Number2KeyTyped
        
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||
            (caracter > '9')) &&
            (caracter != '\b' /*corresponde a BACK_SPACE*/))
            {
            evt.consume();  // ignorar el evento de teclado
            }
        
        if (Number2.getText().length()== 1) {

         evt.consume();
        }
    }//GEN-LAST:event_Number2KeyTyped

    private void Number3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Number3KeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||
            (caracter > '9')) &&
            (caracter != '\b' /*corresponde a BACK_SPACE*/))
            {
            evt.consume();  // ignorar el evento de teclado
            }
        
        if (Number3.getText().length()== 1) {

         evt.consume();
        }
    }//GEN-LAST:event_Number3KeyTyped

    private void Number6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Number6KeyTyped
        
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||
            (caracter > '9')) &&
            (caracter != '\b' /*corresponde a BACK_SPACE*/))
            {
            evt.consume();  // ignorar el evento de teclado
            }
        
        if (Number6.getText().length()== 1) {

         evt.consume();
        }
    }//GEN-LAST:event_Number6KeyTyped

    private void Number5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Number5KeyTyped
        
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||
            (caracter > '9')) &&
            (caracter != '\b' /*corresponde a BACK_SPACE*/))
            {
            evt.consume();  // ignorar el evento de teclado
            }
        
        if (Number5.getText().length()== 1) {

         evt.consume();
        }
    }//GEN-LAST:event_Number5KeyTyped

    private void Number4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Number4KeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||
            (caracter > '9')) &&
            (caracter != '\b' /*corresponde a BACK_SPACE*/))
            {
            evt.consume();  // ignorar el evento de teclado
            }
        
        if (Number4.getText().length()== 1) {

         evt.consume();
        }
    }//GEN-LAST:event_Number4KeyTyped

    private void result1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_result1KeyTyped
        
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||
            (caracter > '9')) &&
            (caracter != '\b' /*corresponde a BACK_SPACE*/))
            {
            evt.consume();  // ignorar el evento de teclado
            }
        
        if (result1.getText().length()== 1) {

         evt.consume();
        }
    }//GEN-LAST:event_result1KeyTyped

    private void result2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_result2KeyTyped
        
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||
            (caracter > '9')) &&
            (caracter != '\b' /*corresponde a BACK_SPACE*/))
            {
            evt.consume();  // ignorar el evento de teclado
            }
        
        if (result2.getText().length()== 1) {
         evt.consume();
        }
    }//GEN-LAST:event_result2KeyTyped

    private void result3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_result3KeyTyped
        
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||
            (caracter > '9')) &&
            (caracter != '\b' /*corresponde a BACK_SPACE*/))
            {
            evt.consume();  // ignorar el evento de teclado
            }
        
        if (result3.getText().length()== 1) {

         evt.consume();
        }
    }//GEN-LAST:event_result3KeyTyped

    private void result4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_result4KeyTyped
        
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||
            (caracter > '9')) &&
            (caracter != '\b' /*corresponde a BACK_SPACE*/))
            {
            evt.consume();  // ignorar el evento de teclado
            }
        
        if (result4.getText().length()== 1) {

         evt.consume();
        }
//        result4.addKeyListener(escucharTeclado);
//        if (evt.VK_1 == evt.getKeyCode()) {
//            bt1.setRolloverEnabled(false);
//        }
    }//GEN-LAST:event_result4KeyTyped

    private void NumberLlevadas1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumberLlevadas1KeyTyped
        
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||
            (caracter > '9')) &&
            (caracter != '\b' /*corresponde a BACK_SPACE*/))
            {
            evt.consume();  // ignorar el evento de teclado
            }
        
        if (NumberLlevadas1.getText().length()== 1) {

         evt.consume();
        }
    }//GEN-LAST:event_NumberLlevadas1KeyTyped

    private void NumberLlevadas2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumberLlevadas2KeyTyped
        
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||
            (caracter > '9')) &&
            (caracter != '\b' /*corresponde a BACK_SPACE*/))
            {
            evt.consume();  // ignorar el evento de teclado
            }
        
        if (NumberLlevadas2.getText().length()== 1) {

         evt.consume();
        }
    }//GEN-LAST:event_NumberLlevadas2KeyTyped

    private void result2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_result2MouseClicked

        if (Number2.getText().equals("")) {
            Number2.setText("0");
        }
        if (Number5.getText().equals("")) {
            Number5.setText("0");              
            }
        if (NumberLlevadas1.getText().equals("")){
            NumberLlevadas1.setText("0");
        }
        if (Integer.parseInt(NumberLlevadas1.getText()) + Integer.parseInt(Number2.getText()) + Integer.parseInt(Number5.getText())== 0) {
                result2.setFocusable(false);
                result2.setText("0");
                Number1.requestFocus();
            }
        
        if(((Integer.parseInt(NumberLlevadas1.getText())) + Integer.parseInt(Number2.getText()) + Integer.parseInt(Number5.getText())) < 10){
            NumberLlevadas2.setText("0");
        }
        if(((Integer.parseInt(NumberLlevadas1.getText())) + Integer.parseInt(Number2.getText()) + Integer.parseInt(Number5.getText())) >= 10){
            arrow1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/arrow_2.png")));
            NumberLlevadas2.setText("");
            result2.setFocusable(true);
            arrow.setIcon(null);
        }
        else{
            if(Integer.parseInt(NumberLlevadas1.getText()) >= 0){
                result2.setFocusable(true);
            }else{
                result2.setFocusable(false);
            }
            if(Integer.parseInt(Number2.getText()) >= 0){
                result2.setFocusable(true);
            }
            else{
                result2.setFocusable(false);
            }
            if (Integer.parseInt(Number5.getText()) >= 0) {
                result2.setFocusable(true);
            }
            else {
                result2.setFocusable(false);
            }
            if (Integer.parseInt(NumberLlevadas1.getText()) + Integer.parseInt(Number2.getText()) >= 0) {
                result2.setFocusable(true);
            }
            else {
                result2.setFocusable(false);
            }
            if (Integer.parseInt(NumberLlevadas1.getText()) + Integer.parseInt(Number2.getText()) + Integer.parseInt(Number5.getText())>= 0) {
                result2.setFocusable(true);
            }
            else {
                result2.setFocusable(false);
            }
        }     
    }//GEN-LAST:event_result2MouseClicked

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
       
//        if (Number1.getText().isEmpty()){
//            Number1.setText("1");
//        }
//        
//        if (Number2.requestFocusInWindow()==true){
//            Number2.setText("2");
//        }else{
//            Number2.setText("");
//        }
        
        
         //requestFocus(true) 
    }//GEN-LAST:event_bt1ActionPerformed

    private void Number1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Number1KeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter < '0') ||
            (caracter > '9')) &&
            (caracter != '\b' /*corresponde a BACK_SPACE*/))
            {
            evt.consume();  // ignorar el evento de teclado
            }
        
        if (Number1.getText().length()== 1) {

         evt.consume();
        }
    }//GEN-LAST:event_Number1KeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
                dispose();
            }
        });
    }//GEN-LAST:event_jButton3ActionPerformed

    private void NumberLlevadas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumberLlevadas1MouseClicked
        
        if(result1.getText().equals("")){
            NumberLlevadas1.setText("0");
        }
        if (Number1.getText().equals("")) {

            if (Number4.getText().equals("")) {

                if(0 + 0 > 9){
                    NumberLlevadas1.setFocusable(true);
                }else{
                    NumberLlevadas1.setFocusable(false);
                    arrow.setIcon(null);
                }

            }

        }
        else{
            if(Integer.parseInt(Number1.getText()) + Integer.parseInt(Number4.getText()) > 9){
                NumberLlevadas1.setFocusable(true);
               
            }else{
                NumberLlevadas1.setFocusable(false);
                NumberLlevadas1.setText("0");
                arrow.setIcon(null);
            }
        }

    }//GEN-LAST:event_NumberLlevadas1MouseClicked

    private void NumberLlevadas2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumberLlevadas2MouseClicked

        if(Number2.getText().equals("")){
            NumberLlevadas2.setFocusable(false);
        }
        if(Number5.getText().equals("")){
            NumberLlevadas2.setFocusable(false);
        }
        if(result2.getText().equals("")){
            NumberLlevadas2.setText("0");
        }
        if(Number2.getText().equals("") && Number5.getText().equals("")){
            NumberLlevadas2.setFocusable(false);
        }
        
        if (Number2.getText().equals("")) {

            if (Number5.getText().equals("")) {

                if(0 + 0 > 9){
                    NumberLlevadas2.setFocusable(true);
                }else{
                    NumberLlevadas2.setFocusable(false);
                    arrow.setIcon(null);
                }

            }

        }
        else{
            int numero_1 = Integer.parseInt(NumberLlevadas1.getText());
            int numero_2 = Integer.parseInt(Number2.getText());
            int numero_3 = Integer.parseInt(Number5.getText());
            int suma_1 = clsAddition.sumar_numeros(numero_1,numero_2);
            int suma_2 = clsAddition.sumar_numeros(numero_1,numero_3);
            int suma_3 = clsAddition.sumar_numeros(numero_2,numero_3);
            int suma_4 = clsAddition.sumar_segunda_fila(numero_1,numero_2,numero_3);

            if( suma_1 >= 10 || suma_2 >= 10 || suma_3 >= 10 || suma_4 >= 10){
                NumberLlevadas2.setFocusable(true);
            }
            else{
                NumberLlevadas2.setFocusable(false);
                arrow1.setIcon(null);
            }
            
        }
    }//GEN-LAST:event_NumberLlevadas2MouseClicked

    private void result1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_result1MouseClicked

        
        if (Number4.getText().equals("")) {
            Number4.setText("0");
        }
        if (Number1.getText().equals("")) {
            Number1.setText("0");
        }
        if (Integer.parseInt(Number1.getText()) + Integer.parseInt(Number4.getText()) == 0) {
            result1.setText("0");
            Number1.requestFocus();
            result1.setFocusable(false);
        }
        
        else{
            if(Integer.parseInt(Number1.getText()) + Integer.parseInt(Number4.getText()) > 0){
                result1.setFocusable(true);
                 
            }else{
                result1.setFocusable(false);
            }
            if(Integer.parseInt(Number1.getText()) + Integer.parseInt(Number4.getText()) > 9){
                arrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahes/arrow.png")));
                NumberLlevadas1.setText("");
            }
            else{
                NumberLlevadas1.setText("0");
                arrow.setIcon(null);
                arrow1.setIcon(null);
            }
        }
        
    }//GEN-LAST:event_result1MouseClicked

    private void result3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_result3MouseClicked
        
        arrow1.setIcon(null);
        result4.setText("");
        if (result3.getText().equals("0")) {
            result3.setText("");
        }
        if (NumberLlevadas2.getText().equals("")) {
            NumberLlevadas2.setText("0");
        }
        if (Number3.getText().equals("")) {
            Number3.setText("0");
            }
        if (Number6.getText().equals("")) {
            Number6.setText("0");
            }
        
        int numero_1 = Integer.parseInt(NumberLlevadas2.getText());
        int numero_2 = Integer.parseInt(Number3.getText());
        int numero_3 = Integer.parseInt(Number6.getText());
        int suma_1 = clsAddition.sumar_numeros(numero_1,numero_2);
        int suma_2 = clsAddition.sumar_numeros(numero_1,numero_3);
        int suma_3 = clsAddition.sumar_numeros(numero_2,numero_3);
        int suma_4 = clsAddition.sumar_segunda_fila(numero_1,numero_2,numero_3);
        
        if(suma_4  == 0){
            result3.setFocusable(false);
            result3.setText("0");
        }
        else{
            result3.setFocusable(true);
            result3.setText("");
        }
        
//        if(suma_4 <= 9){
//            result4.setFocusable(false);
//        }
        
        //---
//        else{
            if(Integer.parseInt(NumberLlevadas2.getText()) >= 0){
                result3.setFocusable(true);
            }else{
                result3.setFocusable(false);
            }
            if(Integer.parseInt(Number3.getText()) >= 0){
                result3.setFocusable(true);
            }
            else{
                result3.setFocusable(false);
            }
            if (Integer.parseInt(Number6.getText()) >= 0) {
                result3.setFocusable(true);
            }
            else {
                result3.setFocusable(false);
            }
            if (Integer.parseInt(NumberLlevadas2.getText()) + Integer.parseInt(Number3.getText()) >= 0) {
                result3.setFocusable(true);
            }
            else {
                result3.setFocusable(false);
            }
            if (suma_4 >= 0) {
                result3.setFocusable(true);
            }
            else {
                result3.setFocusable(false);
 //           }
    }
        //---
    }//GEN-LAST:event_result3MouseClicked

    private void result4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_result4MouseClicked
        
        if (NumberLlevadas2.getText().equals("")) {
            NumberLlevadas2.setText("0");
        }
        if (Number3.getText().equals("")) {
            Number3.setText("0");
            }
        if (Number6.getText().equals("")) {
            Number6.setText("0");
            }
        if (result3.getText().equals("")) {
            result3.setText("0");
            }
        
        int numero_1 = Integer.parseInt(NumberLlevadas2.getText());
        int numero_2 = Integer.parseInt(Number3.getText());
        int numero_3 = Integer.parseInt(Number6.getText());
        int suma_1 = clsAddition.sumar_numeros(numero_1,numero_2);
        int suma_2 = clsAddition.sumar_numeros(numero_1,numero_3);
        int suma_3 = clsAddition.sumar_numeros(numero_2,numero_3);
        int suma_4 = clsAddition.sumar_segunda_fila(numero_1,numero_2,numero_3);
        
        if (suma_3 == 0) {
            result4.setFocusable(false);
            result4.setText("0");
            Number1.requestFocus();
        }
        else{
            
            if(suma_4 <= 9){
                result4.setFocusable(false);
                result4.setText("0");
            }
                else{
                    if(suma_4 >= 10){
                    result4.setFocusable(true);
                    result4.setText("");
                }
            }         
        }
    }//GEN-LAST:event_result4MouseClicked

    private void Number2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Number2MouseClicked
        
        if (NumberLlevadas1.getText().equals("")){
            NumberLlevadas1.setText("0");
        }
        if (Number2.getText().equals("0")){
            Number2.setText("");
        }
    }//GEN-LAST:event_Number2MouseClicked

    private void Number3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Number3MouseClicked
        
        if (NumberLlevadas2.getText().equals("")){
            NumberLlevadas2.setText("0");
        }
        if (Number3.getText().equals("0")){
            Number3.setText("");
        }
    }//GEN-LAST:event_Number3MouseClicked

    private void Number5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Number5MouseClicked
        if (NumberLlevadas1.getText().equals("")){
            NumberLlevadas1.setText("0");
        }
        if (Number5.getText().equals("0")){
            Number5.setText("");
        }
    }//GEN-LAST:event_Number5MouseClicked

    private void Number6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Number6MouseClicked
        if (NumberLlevadas2.getText().equals("")){
            NumberLlevadas2.setText("0");
        }
        if (Number6.getText().equals("0")){
            Number6.setText("");
        }
    }//GEN-LAST:event_Number6MouseClicked

    private void Number1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Number1MouseClicked
        
        if (Number1.getText().equals("0")){
            Number1.setText("");
        }
    }//GEN-LAST:event_Number1MouseClicked

    private void Number4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Number4MouseClicked
        if (Number4.getText().equals("0")){
            Number4.setText("");
        }
    }//GEN-LAST:event_Number4MouseClicked

    private void result3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_result3MousePressed
        
//        int numero_1 = Integer.parseInt(NumberLlevadas2.getText());
//        int numero_2 = Integer.parseInt(Number3.getText());
//        int numero_3 = Integer.parseInt(Number6.getText());
//        int suma_1 = clsAddition.sumar_numeros(numero_1,numero_2);
//        int suma_2 = clsAddition.sumar_numeros(numero_1,numero_3);
//        int suma_3 = clsAddition.sumar_numeros(numero_2,numero_3);
//        int suma_4 = clsAddition.sumar_segunda_fila(numero_1,numero_2,numero_3);
//        
//        if(suma_1 < 10 || suma_2 < 10 || suma_3 < 10 || suma_4 < 10){
//            result4.setText("");
//        }
//        else{
//            result4.setText("");
//        }
    }//GEN-LAST:event_result3MousePressed

    
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
            java.util.logging.Logger.getLogger(frmApp_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmApp_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmApp_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmApp_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmApp_1().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Banner;
    private javax.swing.JTextField Number1;
    private javax.swing.JTextField Number2;
    private javax.swing.JTextField Number3;
    private javax.swing.JTextField Number4;
    private javax.swing.JTextField Number5;
    private javax.swing.JTextField Number6;
    private javax.swing.JTextField NumberLlevadas1;
    private javax.swing.JTextField NumberLlevadas2;
    private javax.swing.JLabel arrow;
    private javax.swing.JLabel arrow1;
    private javax.swing.JButton bt0;
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JButton btClear;
    private javax.swing.JButton btEquals;
    private javax.swing.JLabel cat_happy_1;
    private javax.swing.JLabel cat_happy_2;
    private javax.swing.JLabel emoji_happy;
    private javax.swing.JLabel emoji_happy_2;
    private javax.swing.JLabel goals;
    private javax.swing.JLabel goals1;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField result1;
    private javax.swing.JTextField result2;
    private javax.swing.JTextField result3;
    private javax.swing.JTextField result4;
    // End of variables declaration//GEN-END:variables
}
