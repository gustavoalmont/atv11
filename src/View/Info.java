/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Aluno;

/**
 * @author Julia Araujo Calazans - 11211102258@alunos.umc.br
 * @author Gustavo de Almeida Monteiro - 11211100223@alunos.umc.br
 */
public class Info extends javax.swing.JFrame {

    /**
     * Creates new form Info
     */
    public Info() {
        initComponents();
         
    }
    
    public void Exibir (Aluno A){
        jLabel2.setText(A.getNome());
        jLabel12.setText(A.getSexo());
        jLabel8.setText(A.getCurso());
        jLabel10.setText(A.getSnome());
        jLabel4.setText(A.getData());
        jLabel6.setText(String.valueOf(A.getRGM()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setMinimumSize(new java.awt.Dimension(46, 17));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Data");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("RGM");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Curso");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("jLabel6");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Sobrenome");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("jLabel2");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Sexo");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    // End of variables declaration//GEN-END:variables
}
