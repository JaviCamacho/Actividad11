/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Javi
 */
public class Result extends javax.swing.JFrame {

    public static Triangle tr = new Triangle(0, 0);
    public static Square sq = null;
    public static Circle cl = null;

    /**
     * Creates new form Result
     */
    public Result() {
        initComponents();
        if (!Figuras.datoPSacar) {
            switch (Figuras.shape) {
                case 0:
                    resultado.setText(tr.getArea());
                    break;
                case 1:
                    resultado.setText(cl.getArea());
                    break;
                case 2:
                    resultado.setText(sq.getArea());
                    break;
            }
        } else {
            switch (Figuras.shape) {
                case 0:
                    resultado.setText(tr.getPerimeter());
                    break;
                case 1:
                    resultado.setText(cl.getPerimeter());
                    break;
                case 2:
                    resultado.setText(sq.getPerimeter());
                    break;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setText("Go Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        resultado.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultado.setText("Yo soy el resultado UwU");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(566, 614, Short.MAX_VALUE))
            .addComponent(resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(160, 160, 160)
                .addComponent(resultado)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        Interfaz mpu = new Interfaz();
        mpu.setVisible(true);
        mpu.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel resultado;
    // End of variables declaration//GEN-END:variables
}
