package practica2;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author luisGonzalez
 */
public class PantallaJuego extends javax.swing.JFrame {
    
    //variables a usar
    private JLabel[][] matrizTablero;
    private int x, y;
    public int casillas;
    private int[][] matriz2;
    private int contador;
    ImageIcon imagen1 = new ImageIcon("/home/luisitopapurey/Escritorio/PRACTICA 2 IPC1 2019/Practica2/src/practica2/imagenes/vector-de-dibujos-animados-de-ajedrez-individual-altura-torre-400-35883246.jpg");
    ImageIcon imagen2 = new ImageIcon("/home/luisitopapurey/Escritorio/PRACTICA 2 IPC1 2019/Practica2/src/practica2/imagenes/Alfil.png");
    
    //valores y caracteristicas iniciales a la ventana
    public PantallaJuego() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Pantalla de juego");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelJuego = new javax.swing.JPanel();
        crear = new javax.swing.JButton();
        ingresarCantidad = new javax.swing.JTextField();
        pedirCantidad = new javax.swing.JLabel();
        punteo = new javax.swing.JLabel();
        mostrarPunteo = new javax.swing.JLabel();
        mostrarDimension = new javax.swing.JLabel();
        punteo2 = new javax.swing.JLabel();
        movimientos = new javax.swing.JLabel();
        movimientos2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelJuego.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelJuego.setForeground(new java.awt.Color(102, 255, 204));

        javax.swing.GroupLayout panelJuegoLayout = new javax.swing.GroupLayout(panelJuego);
        panelJuego.setLayout(panelJuegoLayout);
        panelJuegoLayout.setHorizontalGroup(
            panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        panelJuegoLayout.setVerticalGroup(
            panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        getContentPane().add(panelJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 79, -1, -1));

        crear.setText("Crear");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
        getContentPane().add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 50, -1, -1));

        ingresarCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarCantidadActionPerformed(evt);
            }
        });
        getContentPane().add(ingresarCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 64, -1));

        pedirCantidad.setForeground(new java.awt.Color(0, 0, 0));
        pedirCantidad.setText("Defina tamaño de su tablero:");
        getContentPane().add(pedirCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 55, 210, -1));

        punteo.setForeground(new java.awt.Color(0, 0, 0));
        punteo.setText("Punteo:");
        getContentPane().add(punteo, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 12, -1, -1));
        getContentPane().add(mostrarPunteo, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 12, 66, -1));
        getContentPane().add(mostrarDimension, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 12, -1, -1));

        punteo2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(punteo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 12, 34, 14));

        movimientos.setForeground(new java.awt.Color(0, 0, 0));
        movimientos.setText("Cant. Mov.");
        getContentPane().add(movimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        movimientos2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(movimientos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 47, 14));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica2/imagenes/piezas-ajedrez-gigante-plastico-escacs-xadrez_l.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarCantidadActionPerformed

    }//GEN-LAST:event_ingresarCantidadActionPerformed
    
    //acciones que generara el boton CREAR
    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        this.casillas = Integer.parseInt(ingresarCantidad.getText());
        this.matrizTablero = new JLabel[casillas][casillas];
        this.matriz2 = new int[casillas][casillas];
        panelJuego.setLayout(new GridLayout(casillas, casillas));
        for (x = 0; x < casillas; x++) {    //doble for para la creacion de la matriz de labels
            for (y = 0; y < casillas; y++) {
                matriz2[x][y] = 1;
                JLabel matriz = new JLabel();   //se inicializa el label unitario y se le dan caracteristicas iniciales
                matriz.setOpaque(true);
                matriz.setBackground(Color.WHITE);
                matrizTablero[x][y] = matriz;
                contador = 0;
                matrizTablero[x][y].addMouseListener(new MouseAdapter() {   //evento mouseListener para que cada casilla pueda ser clickable
                    @Override
                    public void mouseClicked(MouseEvent event) {
                        for (int posX = 0; posX < x; posX++) {
                            for (int posY = 0; posY < y; posY++) {
                                if (matriz == matrizTablero[posX][posY]) {
                                    Click(matriz, posX, posY);

                                }
                            }
                        }
                    }
                });
                panelJuego.add(matrizTablero[x][y]);    //por ultimo se dibuja el panel completo
                dibujar();
            }
        }
    }//GEN-LAST:event_crearActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crear;
    private javax.swing.JTextField ingresarCantidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mostrarDimension;
    private javax.swing.JLabel mostrarPunteo;
    private javax.swing.JLabel movimientos;
    private javax.swing.JLabel movimientos2;
    private javax.swing.JPanel panelJuego;
    private javax.swing.JLabel pedirCantidad;
    private javax.swing.JLabel punteo;
    private javax.swing.JLabel punteo2;
    // End of variables declaration//GEN-END:variables

    public void dibujar() {
        panelJuego.validate();
        panelJuego.repaint();
    }

    public int Click(JLabel matriz, int posX, int posY) {   //metodo que genera las acciones a realizar si una casilla es clickable
        int torreAlfil;
        Icon torre = new ImageIcon(imagen1.getImage().getScaledInstance(matriz.getWidth(), matriz.getHeight(), Image.SCALE_DEFAULT));
        Icon alfil = new ImageIcon(imagen2.getImage().getScaledInstance(matriz.getWidth(), matriz.getHeight(), Image.SCALE_DEFAULT));
        torreAlfil = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea colocar una torre o un alfil\n"  //se le pregunta a cada casilla que tipo de movimiento desea
                + "1. Torre\n"
                + "2. Alfil"));
        switch (torreAlfil) {
            case 1:
                JOptionPane.showMessageDialog(null, "A elegido una torre"); 
                if (matriz.getIcon() == null && Color.WHITE.equals(matriz.getBackground())) {
                    matriz.setIcon(torre);  //si elige una torre se inserta una imagen torre en esa posicion
                    movTorre(posX, posY, matriz);   //se procede a realizar las acciones especificas del movimiento tipo torre
                    JOptionPane.showMessageDialog(null, "continuar");
                    matriz2[posX][posY] = 2;    //al momento de insertarse una imagen la matriz cambia a estado OCUPADA lo que genera que pueda ser atacada
                    contador++; //contador define el numero de turnos que se lleguen a realizar
                } else {
                    JOptionPane.showMessageDialog(null, "Esta casilla ya posee una pieza o ya ha sido atacada");
                }
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "A elegido un alfil");
                if (matriz.getIcon() == null && Color.WHITE.equals(matriz.getBackground())) {
                    matriz.setIcon(alfil);  //si elige una torre se inserta una imagen alfil en esa posicion
                    movAlfil(posX, posY, matriz);   //se procede a realizar las acciones especificas del movimiento tipo alfil
                    JOptionPane.showMessageDialog(null, "continuar");
                    matriz2[posX][posY] = 2;
                    contador++;
                } else {
                    JOptionPane.showMessageDialog(null, "Esta casilla ya posee una pieza o ya ha sido atacada");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "A escrito un valor fuera de los parametros establecidos");
                break;
        }
        punteo2.setText(String.valueOf(contador*10));   //se define el numero de puntos que se da por cada movimiento
        movimientos2.setText(String.valueOf(contador));
        try{
        DatosJugador.obtenerPuntuacion.setText(punteo2.getText());  //esos datos se envian a otro frame donde seran mostrados al momento de finalizar 
        DatosJugador.totalMov.setText(movimientos2.getText());
        } catch(NullPointerException e)
        {
            
        }
        return torreAlfil;
    }

    public void movTorre(int posX, int posY, JLabel matriz) {   //acciones del movimiento tipo TORRE
        Timer timer = new Timer();
        int xs = posX;
        int ys = posY;
        Icon torre = new ImageIcon(imagen1.getImage().getScaledInstance(matriz.getWidth(), matriz.getHeight(), Image.SCALE_DEFAULT));
        HilosTorre torre1 = new HilosTorre();
        HilosTorre2 torre2 = new HilosTorre2();
        HilosTorre3 torre3 = new HilosTorre3();
        HilosTorre4 torre4 = new HilosTorre4();
        torre1.valores(xs, ys, posX, posY, casillas, matrizTablero, matriz2);           //mediante hilos generar un movimiento secuencial
        torre2.valores(xs, ys, posX, posY, matrizTablero, matriz2);
        torre3.valores(xs, ys, posX, posY, casillas, matrizTablero, matriz2);
        torre4.valores(xs, ys, posX, posY, matrizTablero, matriz2);
        timer.schedule(torre3, 0, 1000);    //repetir accion del objeto torre 3 a cada segundo(1000 milisegundos)
        timer.schedule(torre4, 0, 1000);
        timer.schedule(torre2, 0, 1000);
        timer.schedule(torre1, 0, 1000);
    }

    public void movAlfil(int posX, int posY, JLabel matriz) {   //acciones del movimiento tipo ALFIL
        Timer timer = new Timer();
        HilosAlfil alfil1 = new HilosAlfil();
        HilosAlfil2 alfil2 = new HilosAlfil2();
        HilosAlfil3 alfil3 = new HilosAlfil3();
        HilosAlfil4 alfil4 = new HilosAlfil4();
        int xs = posX;
        int ys = posY;
        alfil1.valores(xs, ys, posX, posY, casillas, matrizTablero, matriz, matriz2);
        alfil2.valores(xs, ys, posX, posY, matrizTablero, matriz2);
        alfil3.valores(xs, ys, posX, posY, matrizTablero, matriz2);
        alfil4.valores(xs, ys, posX, posY, casillas, matrizTablero, matriz2);
        timer.schedule(alfil1, 0, 1000);
        timer.schedule(alfil2, 0, 1000);
        timer.schedule(alfil3, 0, 1000);
        timer.schedule(alfil4, 0, 1000);
    }

}
