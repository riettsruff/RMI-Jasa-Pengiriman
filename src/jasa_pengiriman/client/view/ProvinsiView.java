/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasa_pengiriman.client.view;

import jasa_pengiriman.JasaPengiriman;
import jasa_pengiriman.client.config.RMI;
import jasa_pengiriman.client.service.BasicValidation;
import jasa_pengiriman.client.service.Table;
import jasa_pengiriman.client.store.ActiveUser;
import jasa_pengiriman.model.Kota;
import jasa_pengiriman.model.Provinsi;
import jasa_pengiriman.server.service.KotaService;
import jasa_pengiriman.server.service.ProvinsiService;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class ProvinsiView extends javax.swing.JFrame {
    private ProvinsiService provinsiService;
    private KotaService kotaService;
    /**
     * Creates new form ProvinsiView
     */
    public ProvinsiView() {
      if(ActiveUser.get() != null) {
        initRMIServices();
        initComponents();
        initInputData();
        initProvinsiTableData();
        initKotaTableData(-1);
      } else {
        try {
          JasaPengiriman.main(null);
        } catch (RemoteException ex) {
          Logger.getLogger(ProvinsiView.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    }
    
    private void initRMIServices() {
      try {
        this.provinsiService = (ProvinsiService) RMI.getService("ProvinsiService");
        this.kotaService = (KotaService) RMI.getService("KotaService");
      } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Internal Server Error", "Oops!", JOptionPane.ERROR_MESSAGE);
        System.exit(1);
      }
    }
    
    private void initInputData() {
      namaProvinsiTextField.setText("");
    }
    
    private void initProvinsiTableData() {
      try {
        List<Provinsi> provinsiList = provinsiService.getAll();
        String[] fieldsData = {"No.", "Id Provinsi", "Nama Provinsi"};
        
        Object[][] rowsData = new Object[provinsiList.size()][fieldsData.length];
        
        for(int i=0; i < provinsiList.size(); ++i) {
          rowsData[i][0] = (i + 1) + ".";
          rowsData[i][1] = provinsiList.get(i).getIdProvinsi();
          rowsData[i][2] = provinsiList.get(i).getNamaProvinsi();
        }
        
        Table.setModel(provinsiTable, rowsData, fieldsData, false);
        Table.setColumnWidths(provinsiTable, 50);
        Table.setCellsHorizontalAlignment(provinsiTable, new HashMap<Integer, Integer>(){{
          put(0, JLabel.CENTER);
        }});
        Table.removeColumns(provinsiTable, 1);
      } catch (RemoteException ex) {
        Logger.getLogger(ProvinsiView.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    
    private void initKotaTableData(int idProvinsi) {
      String[] fieldsData = {"No.", "Id Kota", "Nama Kota"};
      Object[][] rowsData = null;
      
      if(idProvinsi == -1) {
        Table.setModel(kotaTable, rowsData, fieldsData, false);
      } else {
        try {
          List<Kota> kotaList = kotaService.getByIdProvinsi(idProvinsi);
          rowsData = new Object[kotaList.size()][fieldsData.length];
          
          for(int i=0; i < kotaList.size(); ++i) {
            rowsData[i][0] = (i + 1) + ".";
            rowsData[i][1] = kotaList.get(i).getIdKota();
            rowsData[i][2] = kotaList.get(i).getNamaKota();
          }
          
          Table.setModel(kotaTable, rowsData, fieldsData, false);
        } catch (RemoteException ex) {
          Logger.getLogger(ProvinsiView.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
      
      Table.setCellsHorizontalAlignment(kotaTable, new HashMap<Integer, Integer>(){{
        put(0, JLabel.CENTER);
      }});
      Table.setColumnWidths(kotaTable, 50);
      Table.removeColumns(kotaTable, 1);
    }
    
    private Provinsi getInputDataProvinsi() {
      String namaProvinsi = namaProvinsiTextField.getText();
      
      Provinsi provinsi = new Provinsi();
      provinsi.setNamaProvinsi(namaProvinsi);
      
      return provinsi;
    }
    
    private boolean isDataProvinsiValid(Provinsi provinsi) {
      HashMap<HashMap<String, Object>, List<String>> data = 
        new HashMap<HashMap<String, Object>, List<String>>(){{
          put(
            new HashMap<String, Object>(){{ put("Nama Provinsi", provinsi.getNamaProvinsi()); }},
            new ArrayList<String>(){{ add("REQUIRED"); }}
          );
        }};
      
      return BasicValidation.isValid(data);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    menuUtamaButton = new javax.swing.JButton();
    keluarButton = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    namaProvinsiTextField = new javax.swing.JTextField();
    simpanButton = new javax.swing.JButton();
    updateButton = new javax.swing.JButton();
    hapusButton = new javax.swing.JButton();
    jLabel3 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    kotaTable = new javax.swing.JTable();
    jScrollPane2 = new javax.swing.JScrollPane();
    provinsiTable = new javax.swing.JTable();
    refreshButton = new javax.swing.JButton();
    resetButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    menuUtamaButton.setText("Menu Utama");
    menuUtamaButton.setName("btnMenuUtama"); // NOI18N
    menuUtamaButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuUtamaButtonActionPerformed(evt);
      }
    });

    keluarButton.setText("Keluar");
    keluarButton.setName("btnKeluar"); // NOI18N
    keluarButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        keluarButtonActionPerformed(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
    jLabel1.setText("Provinsi");

    jLabel2.setText("Nama Provinsi");

    namaProvinsiTextField.setText(" ");
    namaProvinsiTextField.setName("txtNamaProvinsi"); // NOI18N

    simpanButton.setText("Simpan");
    simpanButton.setName("btnSimpan"); // NOI18N
    simpanButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        simpanButtonActionPerformed(evt);
      }
    });

    updateButton.setText("Update");
    updateButton.setName("btnUpdate"); // NOI18N
    updateButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        updateButtonActionPerformed(evt);
      }
    });

    hapusButton.setText("Hapus");
    hapusButton.setName("btnHapus"); // NOI18N
    hapusButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        hapusButtonActionPerformed(evt);
      }
    });

    jLabel3.setText("Daftar Kota");

    kotaTable.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    kotaTable.setEnabled(false);
    kotaTable.setName("tblKota"); // NOI18N
    jScrollPane1.setViewportView(kotaTable);

    provinsiTable.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    provinsiTable.setName("tblProvinsi"); // NOI18N
    provinsiTable.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        provinsiTableMouseClicked(evt);
      }
    });
    jScrollPane2.setViewportView(provinsiTable);

    refreshButton.setText("Refresh");
    refreshButton.setName("btnRefresh"); // NOI18N
    refreshButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        refreshButtonActionPerformed(evt);
      }
    });

    resetButton.setText("Reset");
    resetButton.setName("btnHapus"); // NOI18N
    resetButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        resetButtonActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane2)
          .addGroup(layout.createSequentialGroup()
            .addComponent(menuUtamaButton)
            .addGap(158, 158, 158)
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(keluarButton))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(namaProvinsiTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
              .addGroup(layout.createSequentialGroup()
                .addComponent(simpanButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hapusButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resetButton)
                .addGap(0, 0, Short.MAX_VALUE)))
            .addGap(62, 62, 62)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel3)))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(refreshButton)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(menuUtamaButton)
          .addComponent(keluarButton)
          .addComponent(jLabel1))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(26, 26, 26)
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel2)
              .addComponent(namaProvinsiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(simpanButton)
              .addComponent(updateButton)
              .addComponent(hapusButton)
              .addComponent(resetButton))))
        .addGap(18, 18, 18)
        .addComponent(refreshButton)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(30, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void menuUtamaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUtamaButtonActionPerformed
    new MenuUtamaView().setVisible(true);
    dispose();
  }//GEN-LAST:event_menuUtamaButtonActionPerformed

  private void keluarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarButtonActionPerformed
    ActiveUser.remove();
    new LoginView().setVisible(true);
    dispose();
  }//GEN-LAST:event_keluarButtonActionPerformed

  private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
    initProvinsiTableData();
    initKotaTableData(-1);
  }//GEN-LAST:event_refreshButtonActionPerformed

  private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
    initInputData();
    
    provinsiTable.getSelectionModel().clearSelection();
    Table.deleteAllRows(kotaTable);
  }//GEN-LAST:event_resetButtonActionPerformed

  private void provinsiTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_provinsiTableMouseClicked
    int selectedRow = provinsiTable.getSelectedRow();
    
    namaProvinsiTextField.setText(Table.getValue(provinsiTable, selectedRow, 2).toString());
    
    initKotaTableData((int) Table.getValue(provinsiTable, selectedRow, 1));
  }//GEN-LAST:event_provinsiTableMouseClicked

  private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
    Provinsi provinsi = getInputDataProvinsi();
    
    if(isDataProvinsiValid(provinsi)) {
      try {
        if(provinsiService.insert(provinsi)) {
          JOptionPane
            .showMessageDialog(this, "Provinsi berhasil ditambahkan.", "Sukses!", JOptionPane.INFORMATION_MESSAGE);
          initInputData();
          initProvinsiTableData();
        } else {
          JOptionPane
            .showMessageDialog(this, "Provinsi gagal ditambahkan.", "Oops!", JOptionPane.ERROR_MESSAGE);
        }
      } catch (RemoteException ex) {
        Logger.getLogger(ProvinsiView.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }//GEN-LAST:event_simpanButtonActionPerformed

  private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
    Provinsi provinsi = getInputDataProvinsi();
    int selectedRow = provinsiTable.getSelectedRow();
    
    if(selectedRow == -1) {
      JOptionPane
        .showMessageDialog(this, "Pilihlah salah provinsi terlebih dahulu.", "Oops!", JOptionPane.ERROR_MESSAGE);
    } else {
      provinsi.setIdProvinsi((int) Table.getValue(provinsiTable, selectedRow, 1));
      
      if(isDataProvinsiValid(provinsi)) {
        try {
          if(provinsiService.update(provinsi)) {
            JOptionPane
              .showMessageDialog(this, "Provinsi berhasil diupdate.", "Sukses!", JOptionPane.INFORMATION_MESSAGE);
            initInputData();
            initProvinsiTableData();
          } else {
            JOptionPane
              .showMessageDialog(this, "Provinsi gagal diupdate.", "Oops!", JOptionPane.ERROR_MESSAGE);
          }
        } catch (RemoteException ex) {
          Logger.getLogger(ProvinsiView.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    }
  }//GEN-LAST:event_updateButtonActionPerformed

  private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
    int selectedRow = provinsiTable.getSelectedRow();
    
    if(selectedRow == -1) {
      JOptionPane
        .showMessageDialog(this, "Pilihlah salah provinsi terlebih dahulu.", "Oops!", JOptionPane.ERROR_MESSAGE);
    } else {
      int idProvinsi = (int) Table.getValue(provinsiTable, selectedRow, 1);
      
      try {
        if(provinsiService.deleteByIdProvinsi(idProvinsi)) {
          JOptionPane
            .showMessageDialog(this, "Provinsi berhasil dihapus.", "Sukses!", JOptionPane.INFORMATION_MESSAGE);
          initInputData();
          initProvinsiTableData();
        } else {
          JOptionPane
            .showMessageDialog(this, "Provinsi gagal dihapus.", "Oops!", JOptionPane.ERROR_MESSAGE);
        }
      } catch (RemoteException ex) {
        Logger.getLogger(ProvinsiView.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }//GEN-LAST:event_hapusButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ProvinsiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProvinsiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProvinsiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProvinsiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              new ProvinsiView().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton hapusButton;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JButton keluarButton;
  private javax.swing.JTable kotaTable;
  private javax.swing.JButton menuUtamaButton;
  private javax.swing.JTextField namaProvinsiTextField;
  private javax.swing.JTable provinsiTable;
  private javax.swing.JButton refreshButton;
  private javax.swing.JButton resetButton;
  private javax.swing.JButton simpanButton;
  private javax.swing.JButton updateButton;
  // End of variables declaration//GEN-END:variables
}
