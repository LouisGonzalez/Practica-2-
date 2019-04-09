package practica2;
import java.awt.Color;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author luisGonzalez
 */
public class HilosAlfil3 extends TimerTask {
    
    private int x, y, posX, posY, cantidad;
    private JLabel[][] matrizTablero;
    private int[][] matriz2;
    DatosJugador datos = new DatosJugador(); 
    PantallaJuego pantallita = new PantallaJuego();
   
    @Override
    public void run(){
        valorA3();
    }
    
    public void valorA3(){
        try {
        if(x>=0){
            if(matriz2[x][y] != 1){
                JOptionPane.showMessageDialog(null, "Has perdido");
                pantallita.setVisible(false);
                datos.setVisible(true);
            } else {
                matrizTablero[x][y].setBackground(Color.red);
            }
        } x--;
        y++;   
        } catch (ArrayIndexOutOfBoundsException e)
        {
            
        }
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
