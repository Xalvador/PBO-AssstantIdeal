/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul7_tugas;

import javax.swing.JOptionPane;

/**
 *
 * @author Cordovix-ME
 */
public class Frame1 extends javax.swing.JFrame {

    String temp="";
    Double ti,bt, h1;
    
    public Frame1() {
        initComponents();
    }
  /**
     *
    public Frame1() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        nam = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pri = new javax.swing.JRadioButton();
        wan = new javax.swing.JRadioButton();
        hit = new javax.swing.JButton();
        res = new javax.swing.JButton();
        ot = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ide = new javax.swing.JTextField();
        sol1 = new javax.swing.JTextField();
        sol2 = new javax.swing.JTextField();
        ting = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Nama");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 30, 50, 20);
        getContentPane().add(nam);
        nam.setBounds(190, 30, 110, 30);

        jLabel2.setText("Tinggi");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 70, 50, 20);
        getContentPane().add(ber);
        ber.setBounds(190, 110, 110, 30);

        jLabel3.setText("Jenis Kelamin");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 144, 90, 20);

        buttonGroup1.add(pri);
        pri.setText("Pria");
        getContentPane().add(pri);
        pri.setBounds(180, 150, 60, 23);

        buttonGroup1.add(wan);
        wan.setText("Wanita");
        getContentPane().add(wan);
        wan.setBounds(240, 150, 80, 23);

        hit.setText("Count");
        hit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitActionPerformed(evt);
            }
        });
        getContentPane().add(hit);
        hit.setBounds(120, 190, 61, 23);

        res.setText("Reset");
        res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resActionPerformed(evt);
            }
        });
        getContentPane().add(res);
        res.setBounds(210, 190, 61, 23);

        ot.setText("Exit");
        getContentPane().add(ot);
        ot.setBounds(300, 190, 51, 23);

        jLabel4.setText("Berat ideal badan anda adalah                      Kg");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 230, 290, 20);
        getContentPane().add(ide);
        ide.setBounds(250, 230, 50, 30);
        getContentPane().add(sol1);
        sol1.setBounds(70, 270, 350, 30);
        getContentPane().add(sol2);
        sol2.setBounds(70, 320, 350, 30);
        getContentPane().add(ting);
        ting.setBounds(190, 70, 110, 30);

        jLabel5.setText("Berat");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 120, 70, 14);

        setBounds(0, 0, 489, 429);
    }// </editor-fold>//GEN-END:initComponents

    private void hitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitActionPerformed
           if(nam.getText().equals("")||ting.getText().equals("")||ber.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Data harus diisi semua");
        }
        else if (pri.isSelected()||wan.isSelected())
        {
            try
            {
                Proses();
            }
            catch (Exception e)
            {
            JOptionPane.showMessageDialog(null, "Inputan ada yang belum diisi");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "RadioButton harus dipilih");
        }
            
        // TODO add your handling code here:
    }//GEN-LAST:event_hitActionPerformed

    private void resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resActionPerformed
       nam.setText("");
        ting.setText("");
        ber.setText("");
        ide.setText("");
        sol1.setText("");
        sol2.setText("");
        buttonGroup1.clearSelection();

        // TODO add your handling code here:
    }//GEN-LAST:event_resActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ber;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton hit;
    private javax.swing.JTextField ide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nam;
    private javax.swing.JButton ot;
    private javax.swing.JRadioButton pri;
    private javax.swing.JButton res;
    private javax.swing.JTextField sol1;
    private javax.swing.JTextField sol2;
    private javax.swing.JTextField ting;
    private javax.swing.JRadioButton wan;
    // End of variables declaration//GEN-END:variables

    private void Proses() {
       ti = Double.parseDouble(ting.getText());
        bt = Double.parseDouble(ber.getText());
        
        if(pri.isSelected()) {
            h1 = (ti - 104) *1;
        } else if 
            (wan.isSelected()) {
        h1 = (ti - 100) *1;
        }
        temp = Double.toString(h1.intValue());
        
        if (h1 < bt) {
            ide.setText(temp);
            sol1.setText("Maaf " + nam.getText() + ", Sepertinya Anda Overweight");
            sol2.setText("Banyaklah berolahraga dan hindari makanan berkolesterol");
        } else if (h1 > bt) {
            ide.setText(temp);
            sol1.setText("Maaf " + nam.getText() + ", Sepertinya Anda Underweight");
            sol2.setText("Banyaklah mengkonsumsi makanan yang berkarbohidrat");
        } else {
            ide.setText(temp);
            sol1.setText("Hallo " + nam.getText() + ", Serat badan Anda sudah pas");
            sol2.setText("Lanjutkan pola makan teratur dan gaya hidup sehat");
        }
    }
}
      

