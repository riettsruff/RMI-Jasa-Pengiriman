/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasa_pengiriman.client.view;

import jasa_pengiriman.client.service.DateFormat;
import jasa_pengiriman.client.store.ActiveUser;

/**
 *
 * @author admin
 */
public class MenuUtamaView extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    public MenuUtamaView() {
      initComponents();
      initDataView();
    }
    
    private void initDataView() {
      String terakhirLogin = 
        ActiveUser.get().getTerakhirLogin() == null 
          ? "Belum pernah" 
          : DateFormat.dateToString(
            DateFormat.timestampToDate(ActiveUser.get().getTerakhirLogin()), 
            "dd-MM-yyyy HH:mm:ss"
          );
      terakhirLoginValue.setText(terakhirLogin);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel3 = new javax.swing.JLabel();
    exitButton = new javax.swing.JButton();
    pengirimanButton = new javax.swing.JButton();
    pelacakanButton = new javax.swing.JButton();
    penggunaButton = new javax.swing.JButton();
    cabangButton = new javax.swing.JButton();
    provinsiButton = new javax.swing.JButton();
    kotaButton = new javax.swing.JButton();
    biayaButton = new javax.swing.JButton();
    peranButton = new javax.swing.JButton();
    aksesButton = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    terakhirLoginLabel = new javax.swing.JLabel();
    terakhirLoginValue = new javax.swing.JLabel();

    jLabel3.setText("jLabel3");

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    exitButton.setText("Keluar");
    exitButton.setName("btnKeluar"); // NOI18N
    exitButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        exitButtonActionPerformed(evt);
      }
    });

    pengirimanButton.setText("Pengiriman");
    pengirimanButton.setName("btnPengiriman"); // NOI18N
    pengirimanButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        pengirimanButtonActionPerformed(evt);
      }
    });

    pelacakanButton.setText("Pelacakan");
    pelacakanButton.setName("btnPelacakan"); // NOI18N
    pelacakanButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        pelacakanButtonActionPerformed(evt);
      }
    });

    penggunaButton.setText("Pengguna");
    penggunaButton.setName("btnPengguna"); // NOI18N
    penggunaButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        penggunaButtonActionPerformed(evt);
      }
    });

    cabangButton.setText("Cabang");
    cabangButton.setName("btnCabang"); // NOI18N
    cabangButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cabangButtonActionPerformed(evt);
      }
    });

    provinsiButton.setText("Provinsi");
    provinsiButton.setName("btnProvinsi"); // NOI18N
    provinsiButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        provinsiButtonActionPerformed(evt);
      }
    });

    kotaButton.setText("Kota");
    kotaButton.setName("btnKota"); // NOI18N
    kotaButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        kotaButtonActionPerformed(evt);
      }
    });

    biayaButton.setText("Biaya");
    biayaButton.setName("btnBiaya"); // NOI18N
    biayaButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        biayaButtonActionPerformed(evt);
      }
    });

    peranButton.setText("Peran");
    peranButton.setName("btnPerson"); // NOI18N
    peranButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        peranButtonActionPerformed(evt);
      }
    });

    aksesButton.setText("Akses");
    aksesButton.setName("btnAkses"); // NOI18N
    aksesButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        aksesButtonActionPerformed(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
    jLabel1.setText("LAYANAN");

    jLabel2.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
    jLabel2.setText("MASTER");

    jLabel4.setFont(new java.awt.Font("Bauhaus 93", 0, 36)); // NOI18N
    jLabel4.setText("MENU UTAMA");

    terakhirLoginLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    terakhirLoginLabel.setText("Terakhir Login: ");

    terakhirLoginValue.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(exitButton))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(terakhirLoginLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(terakhirLoginValue))
              .addGroup(layout.createSequentialGroup()
                .addComponent(pengirimanButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pelacakanButton))
              .addGroup(layout.createSequentialGroup()
                .addComponent(penggunaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cabangButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(provinsiButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kotaButton))
              .addGroup(layout.createSequentialGroup()
                .addComponent(biayaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(peranButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aksesButton))
              .addComponent(jLabel1)
              .addComponent(jLabel2))
            .addGap(0, 225, Short.MAX_VALUE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel4)
          .addComponent(exitButton))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(terakhirLoginLabel)
          .addComponent(terakhirLoginValue))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(pelacakanButton)
          .addComponent(pengirimanButton))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(penggunaButton)
          .addComponent(cabangButton)
          .addComponent(provinsiButton)
          .addComponent(kotaButton))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(biayaButton)
          .addComponent(peranButton)
          .addComponent(aksesButton))
        .addGap(20, 20, 20))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void cabangButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cabangButtonActionPerformed
      new CabangView().setVisible(true);
      dispose();
    }//GEN-LAST:event_cabangButtonActionPerformed

    private void kotaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotaButtonActionPerformed
      new KotaView().setVisible(true);
      dispose();
    }//GEN-LAST:event_kotaButtonActionPerformed

  private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
    ActiveUser.remove();
    new LoginView().setVisible(true);
    dispose();
  }//GEN-LAST:event_exitButtonActionPerformed

  private void penggunaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penggunaButtonActionPerformed
    new PenggunaView().setVisible(true);
    dispose();
  }//GEN-LAST:event_penggunaButtonActionPerformed

  private void provinsiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provinsiButtonActionPerformed
    new ProvinsiView().setVisible(true);
    dispose();
  }//GEN-LAST:event_provinsiButtonActionPerformed

  private void biayaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biayaButtonActionPerformed
    new BiayaView().setVisible(true);
    dispose();
  }//GEN-LAST:event_biayaButtonActionPerformed

  private void peranButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peranButtonActionPerformed
    new PeranView().setVisible(true);
    dispose();
  }//GEN-LAST:event_peranButtonActionPerformed

  private void aksesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aksesButtonActionPerformed
    new AksesView().setVisible(true);
    dispose();
  }//GEN-LAST:event_aksesButtonActionPerformed

  private void pengirimanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengirimanButtonActionPerformed
    new PengirimanView().setVisible(true);
    dispose();
  }//GEN-LAST:event_pengirimanButtonActionPerformed

  private void pelacakanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pelacakanButtonActionPerformed
    new PelacakanView().setVisible(true);
    dispose();
  }//GEN-LAST:event_pelacakanButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtamaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtamaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtamaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtamaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtamaView().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton aksesButton;
  private javax.swing.JButton biayaButton;
  private javax.swing.JButton cabangButton;
  private javax.swing.JButton exitButton;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JButton kotaButton;
  private javax.swing.JButton pelacakanButton;
  private javax.swing.JButton penggunaButton;
  private javax.swing.JButton pengirimanButton;
  private javax.swing.JButton peranButton;
  private javax.swing.JButton provinsiButton;
  private javax.swing.JLabel terakhirLoginLabel;
  private javax.swing.JLabel terakhirLoginValue;
  // End of variables declaration//GEN-END:variables
}
