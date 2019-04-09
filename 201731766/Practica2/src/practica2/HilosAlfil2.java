package practica2;

import java.awt.Color;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author luisGonzalez
 */
public class HilosAlfil2 extends TimerTask {
    //variables a usar 
    private int x, y, posX, posY, cantidad;
    private JLabel[][] matrizTablero;
    private int[][] matriz2;
    DatosJugador datos = new DatosJugador();
    PantallaJuego pantallita = new PantallaJuego();
    
    //metodo Run(hilo)
    @Override
    public void run(){
        valorA2();
    }
    
    public void valorA2(){
        if(x>=0 && y>=0){
            if(matriz2[x][y] != 1){
                JOptionPane.showMessageDialog(null, "Has perdido el juego");
                pantallita.dispose();
                datos.setVisible(true);
            } else {
                matrizTablero[x][y].setBackground(Color.red);
            }
        } y--;
        x--;
    }
    
    //mediante parametros se ingresan las variables con las que se trabajaran
    public void valores(int x, int y, int posX, int posY, JLabel[][] matrizTablero, int[][] matriz2){
        this.x = x;
        this.y = y;
        this.posX = posX;
        this.posY = posY; 
        this.matrizTablero = matrizTablero;
        this.matriz2 = matriz2;
    }
}
