/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;

/** 
 * @author Luis Diego Aleman
 * @author Valeria Quesada
 * @author Marlen Solano 
 */
public class RegistrarEmpresa extends javax.swing.JFrame { 
  /** Constructor */
  public RegistrarEmpresa() {
      initComponents();
  }
 
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    telEmp = new javax.swing.JTextField();
    dir = new javax.swing.JTextField();
    nameEmp = new javax.swing.JTextField();
    telSuper = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    puestSuper = new javax.swing.JTextField();
    nameSup = new javax.swing.JTextField();
    correoSup = new javax.swing.JTextField();
    regist = new javax.swing.JButton();
    exit = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel1.setText("REGISTRAR");

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel2.setText("Tel");

    jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel3.setText("Direccion");

    jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel4.setText("Nombre");

    jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel5.setText("Tel");

    telEmp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    telEmp.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        telEmpActionPerformed(evt);
      }
    });

    dir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    dir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        dirActionPerformed(evt);
      }
    });

    nameEmp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    nameEmp.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        nameEmpActionPerformed(evt);
      }
    });

    telSuper.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    telSuper.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        telSuperActionPerformed(evt);
      }
    });

    jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel6.setText("Supervisor");

    jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel7.setText("Puesto");

    jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel8.setText("Nombre");

    jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel9.setText("Correo");

    puestSuper.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    puestSuper.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        puestSuperActionPerformed(evt);
      }
    });

    nameSup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    nameSup.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        nameSupActionPerformed(evt);
      }
    });

    correoSup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    correoSup.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        correoSupActionPerformed(evt);
      }
    });

    regist.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    regist.setText("Registrar Empresa");

    exit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    exit.setText("Cancelar");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(regist))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
              .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                      .addComponent(jLabel4)
                      .addComponent(jLabel3)
                      .addComponent(jLabel8)
                      .addComponent(jLabel9))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(dir, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addComponent(nameEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addComponent(nameSup, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addComponent(correoSup, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addGroup(layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(exit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabel2)
              .addComponent(jLabel7)
              .addComponent(jLabel5))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(telEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(puestSuper, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(telSuper, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addGap(43, 43, 43))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(jLabel1)
        .addGap(338, 338, 338))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(29, 29, 29)
        .addComponent(jLabel1)
        .addGap(39, 39, 39)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel2)
            .addComponent(telEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel4)
              .addComponent(nameEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20, 20, 20)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(dir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel3))
            .addGap(53, 53, 53)
            .addComponent(jLabel6)
            .addGap(37, 37, 37)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel8)
              .addComponent(nameSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(telSuper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel5))
            .addGap(29, 29, 29)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabel9)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(correoSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel7)
                .addComponent(puestSuper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(regist)
          .addComponent(exit))
        .addGap(49, 49, 49))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void telEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telEmpActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_telEmpActionPerformed

  private void dirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dirActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_dirActionPerformed

  private void nameEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameEmpActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_nameEmpActionPerformed

  private void telSuperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telSuperActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_telSuperActionPerformed

  private void puestSuperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puestSuperActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_puestSuperActionPerformed

  private void nameSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameSupActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_nameSupActionPerformed

  private void correoSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoSupActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_correoSupActionPerformed

  public boolean logInDatosCorrectos(){  
    if (correoSup.getText().length() == 0 || telEmp.getText().length() == 0){
      return false;
    }
    else{
      return true;
    }
  }
    
  // Variables declaration - do not modify//GEN-BEGIN:variables
  public javax.swing.JTextField correoSup;
  public javax.swing.JTextField dir;
  public javax.swing.JButton exit;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  public javax.swing.JTextField nameEmp;
  public javax.swing.JTextField nameSup;
  public javax.swing.JTextField puestSuper;
  public javax.swing.JButton regist;
  public javax.swing.JTextField telEmp;
  public javax.swing.JTextField telSuper;
  // End of variables declaration//GEN-END:variables

}
