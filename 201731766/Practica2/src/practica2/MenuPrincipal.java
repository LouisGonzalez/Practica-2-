package practica2;
/**
 *
 * @author luisGonzalez
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
    //se inicializan las caracteristicas del frame en el constructor
    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Menu principal");
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPrincipal = new javax.swing.JLabel();
        jugarTablero = new javax.swing.JButton();
        puntuaciones = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        menuPrincipal.setText("Menu Principal");
        menuPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(menuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        jugarTablero.setText("JUGAR!");
        jugarTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarTableroActionPerformed(evt);
            }
        });
        getContentPane().add(jugarTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        puntuaciones.setText("Puntuaciones");
        puntuaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntuacionesActionPerformed(evt);
            }
        });
        getContentPane().add(puntuaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/luisitopapurey/Imágenes/wood-chess-pieces-board-box-combo-1.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //accion del boton que lleva hacia el frame JUGAR
    private void jugarTableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarTableroActionPerformed
        PantallaJuego nuevo = new PantallaJuego();
        nuevo.setVisible(true);
        dispose();
    }//GEN-LAST:event_jugarTableroActionPerformed
    
    //accion del boton que lleva hacia el frame PUNTUACIONES
    private void puntuacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntuacionesActionPerformed
        Puntuaciones reportes = new Puntuaciones();
        reportes.setVisible(true);
        dispose();
    }//GEN-LAST:event_puntuacionesActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jugarTablero;
    private javax.swing.JLabel menuPrincipal;
    private javax.swing.JButton puntuaciones;
    // End of variables declaration//GEN-END:variables
}
