package gui;

import controlador.Data;
import java.sql.SQLException;
import modelo.Tarjeta;

public final class GUI_TarjetaTransferencias extends javax.swing.JFrame {

    GUI_FormularioTarjeta mcli = new GUI_FormularioTarjeta();
    
    public GUI_TarjetaTransferencias() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        txtId.setText(GUI_FormularioTarjeta.id+"");
        
        setCoordenadas();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblb1 = new javax.swing.JLabel();
        lbla3 = new javax.swing.JLabel();
        lbla4 = new javax.swing.JLabel();
        lbla5 = new javax.swing.JLabel();
        lbla6 = new javax.swing.JLabel();
        lbla7 = new javax.swing.JLabel();
        lbla8 = new javax.swing.JLabel();
        lbla9 = new javax.swing.JLabel();
        lbla1 = new javax.swing.JLabel();
        lblb2 = new javax.swing.JLabel();
        lblb3 = new javax.swing.JLabel();
        lblb4 = new javax.swing.JLabel();
        lbla10 = new javax.swing.JLabel();
        lblb5 = new javax.swing.JLabel();
        lblb6 = new javax.swing.JLabel();
        lblb7 = new javax.swing.JLabel();
        lblb8 = new javax.swing.JLabel();
        lblb9 = new javax.swing.JLabel();
        lblb10 = new javax.swing.JLabel();
        lblc1 = new javax.swing.JLabel();
        lblc2 = new javax.swing.JLabel();
        lblc3 = new javax.swing.JLabel();
        lblc4 = new javax.swing.JLabel();
        lblc5 = new javax.swing.JLabel();
        lbld1 = new javax.swing.JLabel();
        lble1 = new javax.swing.JLabel();
        lbld2 = new javax.swing.JLabel();
        lble2 = new javax.swing.JLabel();
        lbld3 = new javax.swing.JLabel();
        lble3 = new javax.swing.JLabel();
        lbld4 = new javax.swing.JLabel();
        lble4 = new javax.swing.JLabel();
        lbld5 = new javax.swing.JLabel();
        lble5 = new javax.swing.JLabel();
        lblc6 = new javax.swing.JLabel();
        lbld6 = new javax.swing.JLabel();
        lble6 = new javax.swing.JLabel();
        lblc7 = new javax.swing.JLabel();
        lbld7 = new javax.swing.JLabel();
        lble7 = new javax.swing.JLabel();
        lblc8 = new javax.swing.JLabel();
        lbld8 = new javax.swing.JLabel();
        lble8 = new javax.swing.JLabel();
        lblc9 = new javax.swing.JLabel();
        lbld9 = new javax.swing.JLabel();
        lble9 = new javax.swing.JLabel();
        lblc10 = new javax.swing.JLabel();
        lbld10 = new javax.swing.JLabel();
        lble10 = new javax.swing.JLabel();
        lbla2 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        txtId = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(860, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblb1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblb1.setText("jLabel2");
        getContentPane().add(lblb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 50, 40));

        lbla3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbla3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbla3.setText("jLabel2");
        getContentPane().add(lbla3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 60, 40));

        lbla4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbla4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbla4.setText("jLabel2");
        getContentPane().add(lbla4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 60, 40));

        lbla5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbla5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbla5.setText("jLabel2");
        getContentPane().add(lbla5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 60, 40));

        lbla6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbla6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbla6.setText("jLabel2");
        getContentPane().add(lbla6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 60, 40));

        lbla7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbla7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbla7.setText("jLabel2");
        getContentPane().add(lbla7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 60, 40));

        lbla8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbla8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbla8.setText("jLabel2");
        getContentPane().add(lbla8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 50, 40));

        lbla9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbla9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbla9.setText("jLabel2");
        getContentPane().add(lbla9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 60, 40));

        lbla1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbla1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbla1.setText("jLabel2");
        getContentPane().add(lbla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, 30));

        lblb2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblb2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblb2.setText("jLabel2");
        getContentPane().add(lblb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 60, 40));

        lblb3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblb3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblb3.setText("jLabel2");
        getContentPane().add(lblb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 60, 40));

        lblb4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblb4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblb4.setText("jLabel2");
        getContentPane().add(lblb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 60, 40));

        lbla10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbla10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbla10.setText("jLabel2");
        getContentPane().add(lbla10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 60, 40));

        lblb5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblb5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblb5.setText("jLabel2");
        getContentPane().add(lblb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 60, 40));

        lblb6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblb6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblb6.setText("jLabel2");
        getContentPane().add(lblb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 60, 40));

        lblb7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblb7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblb7.setText("jLabel2");
        getContentPane().add(lblb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 60, 40));

        lblb8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblb8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblb8.setText("jLabel2");
        getContentPane().add(lblb8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 60, 40));

        lblb9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblb9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblb9.setText("jLabel2");
        getContentPane().add(lblb9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 60, 40));

        lblb10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblb10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblb10.setText("jLabel2");
        getContentPane().add(lblb10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 60, 40));

        lblc1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblc1.setText("jLabel2");
        getContentPane().add(lblc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 50, 40));

        lblc2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblc2.setText("jLabel2");
        getContentPane().add(lblc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 60, 40));

        lblc3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblc3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblc3.setText("jLabel2");
        getContentPane().add(lblc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 60, 40));

        lblc4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblc4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblc4.setText("jLabel2");
        getContentPane().add(lblc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 60, 40));

        lblc5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblc5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblc5.setText("jLabel2");
        getContentPane().add(lblc5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 60, 40));

        lbld1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbld1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbld1.setText("jLabel2");
        getContentPane().add(lbld1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 50, 40));

        lble1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lble1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lble1.setText("jLabel2");
        getContentPane().add(lble1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 50, 40));

        lbld2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbld2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbld2.setText("jLabel2");
        getContentPane().add(lbld2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 60, 40));

        lble2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lble2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lble2.setText("jLabel2");
        getContentPane().add(lble2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 60, 40));

        lbld3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbld3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbld3.setText("jLabel2");
        getContentPane().add(lbld3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 60, 40));

        lble3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lble3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lble3.setText("jLabel2");
        getContentPane().add(lble3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 60, 40));

        lbld4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbld4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbld4.setText("jLabel2");
        getContentPane().add(lbld4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 60, 40));

        lble4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lble4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lble4.setText("jLabel2");
        getContentPane().add(lble4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 60, 40));

        lbld5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbld5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbld5.setText("jLabel2");
        getContentPane().add(lbld5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 60, 40));

        lble5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lble5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lble5.setText("jLabel2");
        getContentPane().add(lble5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 60, 40));

        lblc6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblc6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblc6.setText("jLabel2");
        getContentPane().add(lblc6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 60, 40));

        lbld6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbld6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbld6.setText("jLabel2");
        getContentPane().add(lbld6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 60, 40));

        lble6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lble6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lble6.setText("jLabel2");
        getContentPane().add(lble6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 60, 40));

        lblc7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblc7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblc7.setText("jLabel2");
        getContentPane().add(lblc7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 60, 40));

        lbld7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbld7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbld7.setText("jLabel2");
        getContentPane().add(lbld7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 60, 40));

        lble7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lble7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lble7.setText("jLabel2");
        getContentPane().add(lble7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 60, 40));

        lblc8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblc8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblc8.setText("jLabel2");
        getContentPane().add(lblc8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 60, 40));

        lbld8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbld8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbld8.setText("jLabel2");
        getContentPane().add(lbld8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 60, 40));

        lble8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lble8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lble8.setText("jLabel2");
        getContentPane().add(lble8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 60, 40));

        lblc9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblc9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblc9.setText("jLabel2");
        getContentPane().add(lblc9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 60, 40));

        lbld9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbld9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbld9.setText("jLabel2");
        getContentPane().add(lbld9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 60, 40));

        lble9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lble9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lble9.setText("jLabel2");
        getContentPane().add(lble9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 60, 40));

        lblc10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblc10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblc10.setText("jLabel2");
        getContentPane().add(lblc10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 60, 40));

        lbld10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbld10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbld10.setText("jLabel2");
        getContentPane().add(lbld10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, 60, 40));

        lble10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lble10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lble10.setText("jLabel2");
        getContentPane().add(lble10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 350, 60, 40));

        lbla2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbla2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbla2.setText("jLabel2");
        getContentPane().add(lbla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 60, 30));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 160, 40));

        txtId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtId.setText("jLabel2");
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 150, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fulvio\\source\\clases\\clasesST\\patrones\\Banco\\src\\img\\Transferencias.png")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(860, 550));
        jLabel1.setMinimumSize(new java.awt.Dimension(860, 550));
        jLabel1.setPreferredSize(new java.awt.Dimension(858, 544));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        GUI_MenuCliente cli = new GUI_MenuCliente();
        cli.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_TarjetaTransferencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_TarjetaTransferencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_TarjetaTransferencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_TarjetaTransferencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_TarjetaTransferencias().setVisible(true);
            }
        });
    }

    private void setCoordenadas(){
        Data c = new Data();
        int id = mcli.id;
        try {
            Tarjeta tar = c.buscarTarjeta(id);
            lbla1.setText(tar.getLetraA().get(0));
            lbla2.setText(tar.getLetraA().get(1));
            lbla3.setText(tar.getLetraA().get(2));
            lbla4.setText(tar.getLetraA().get(3));
            lbla5.setText(tar.getLetraA().get(4));
            lbla6.setText(tar.getLetraA().get(5));
            lbla7.setText(tar.getLetraA().get(6));
            lbla8.setText(tar.getLetraA().get(7));
            lbla9.setText(tar.getLetraA().get(8));
            lbla10.setText(tar.getLetraA().get(9));
            
            lblb1.setText(tar.getLetraB().get(0));
            lblb2.setText(tar.getLetraB().get(1));
            lblb3.setText(tar.getLetraB().get(2));
            lblb4.setText(tar.getLetraB().get(3));
            lblb5.setText(tar.getLetraB().get(4));
            lblb6.setText(tar.getLetraB().get(5));
            lblb7.setText(tar.getLetraB().get(6));
            lblb8.setText(tar.getLetraB().get(7));
            lblb9.setText(tar.getLetraB().get(8));
            lblb10.setText(tar.getLetraB().get(9));
            
            lblc1.setText(tar.getLetraC().get(0));
            lblc2.setText(tar.getLetraC().get(1));
            lblc3.setText(tar.getLetraC().get(2));
            lblc4.setText(tar.getLetraC().get(3));
            lblc5.setText(tar.getLetraC().get(4));
            lblc6.setText(tar.getLetraC().get(5));
            lblc7.setText(tar.getLetraC().get(6));
            lblc8.setText(tar.getLetraC().get(7));
            lblc9.setText(tar.getLetraC().get(8));
            lblc10.setText(tar.getLetraC().get(9));
            
            lbld1.setText(tar.getLetraD().get(0));
            lbld2.setText(tar.getLetraD().get(1));
            lbld3.setText(tar.getLetraD().get(2));
            lbld4.setText(tar.getLetraD().get(3));
            lbld5.setText(tar.getLetraD().get(4));
            lbld6.setText(tar.getLetraD().get(5));
            lbld7.setText(tar.getLetraD().get(6));
            lbld8.setText(tar.getLetraD().get(7));
            lbld9.setText(tar.getLetraD().get(8));
            lbld10.setText(tar.getLetraD().get(9));
           
            lble1.setText(tar.getLetraE().get(0));
            lble2.setText(tar.getLetraE().get(1));
            lble3.setText(tar.getLetraE().get(2));
            lble4.setText(tar.getLetraE().get(3));
            lble5.setText(tar.getLetraE().get(4));
            lble6.setText(tar.getLetraE().get(5));
            lble7.setText(tar.getLetraE().get(6));
            lble8.setText(tar.getLetraE().get(7));
            lble9.setText(tar.getLetraE().get(8));
            lble10.setText(tar.getLetraE().get(9));
           
            
            
        } catch (SQLException ex) {
            System.out.println("error obtencion");
        }
        
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbla1;
    private javax.swing.JLabel lbla10;
    private javax.swing.JLabel lbla2;
    private javax.swing.JLabel lbla3;
    private javax.swing.JLabel lbla4;
    private javax.swing.JLabel lbla5;
    private javax.swing.JLabel lbla6;
    private javax.swing.JLabel lbla7;
    private javax.swing.JLabel lbla8;
    private javax.swing.JLabel lbla9;
    private javax.swing.JLabel lblb1;
    private javax.swing.JLabel lblb10;
    private javax.swing.JLabel lblb2;
    private javax.swing.JLabel lblb3;
    private javax.swing.JLabel lblb4;
    private javax.swing.JLabel lblb5;
    private javax.swing.JLabel lblb6;
    private javax.swing.JLabel lblb7;
    private javax.swing.JLabel lblb8;
    private javax.swing.JLabel lblb9;
    private javax.swing.JLabel lblc1;
    private javax.swing.JLabel lblc10;
    private javax.swing.JLabel lblc2;
    private javax.swing.JLabel lblc3;
    private javax.swing.JLabel lblc4;
    private javax.swing.JLabel lblc5;
    private javax.swing.JLabel lblc6;
    private javax.swing.JLabel lblc7;
    private javax.swing.JLabel lblc8;
    private javax.swing.JLabel lblc9;
    private javax.swing.JLabel lbld1;
    private javax.swing.JLabel lbld10;
    private javax.swing.JLabel lbld2;
    private javax.swing.JLabel lbld3;
    private javax.swing.JLabel lbld4;
    private javax.swing.JLabel lbld5;
    private javax.swing.JLabel lbld6;
    private javax.swing.JLabel lbld7;
    private javax.swing.JLabel lbld8;
    private javax.swing.JLabel lbld9;
    private javax.swing.JLabel lble1;
    private javax.swing.JLabel lble10;
    private javax.swing.JLabel lble2;
    private javax.swing.JLabel lble3;
    private javax.swing.JLabel lble4;
    private javax.swing.JLabel lble5;
    private javax.swing.JLabel lble6;
    private javax.swing.JLabel lble7;
    private javax.swing.JLabel lble8;
    private javax.swing.JLabel lble9;
    private javax.swing.JLabel txtId;
    // End of variables declaration//GEN-END:variables
}
