package practica2;

import java.awt.Color;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author luisGonzalez
 */
public class HilosTorre2 extends TimerTask{

    private int x, y, posX, posY, cantidad;
    private JLabel[][] matrizTablero;
    private int[][] matriz2;
    PantallaJuego pantallita = new PantallaJuego();
    DatosJugador datos = new DatosJugador();
   
    @Override 
    public void run(){       
        valor2();                      
    }
    
    public void valor2(){
        y = posY;
        if(x>=0){
            if(matriz2[x][y] != 1){
                JOptionPane.showMessageDialog(null, "Has perdido");
                  pantallita.dispose();
                datos.setVisible(true);
            } else {
                matrizTablero[x][y].setBackground(Color.green);
            }
           } x--;
    }
    
    public void valores(int x, int y, int posX, int posY, JLabel[][] matrizTablero, int[][] matriz2){
        this.x = x;
        this.y = y;
        this.posX = posX;
        this.posY = posY;
        this.matrizTablero = matrizTablero;
        this.matriz2 = matriz2;
    }
}
