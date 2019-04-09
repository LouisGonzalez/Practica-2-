package practica2;
import java.awt.Color;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author luisGonzalez
 */
public class HilosAlfil4 extends TimerTask {
    
    private int x, y, posX, posY, cantidad;
    JLabel[][] matrizTablero;
    private int[][] matriz2;
    PantallaJuego pantallita = new PantallaJuego();
    DatosJugador datos = new DatosJugador();
   
    @Override
    public void run(){
        valorA4();
    }
    
    public void valorA4(){
        try{
        if(x<cantidad){
            if(matriz2[x][y] != 1){
                JOptionPane.showMessageDialog(null, "Has perdido");
                 pantallita.dispose();
                datos.setVisible(true);
            } else {
                matrizTablero[x][y].setBackground(Color.red);
            }
        } x++;
        y--;
        } catch(ArrayIndexOutOfBoundsException e)
        {
            
        }
    }
    
    public void valores(int x, int y, int posX, int posY, int cantidad, JLabel[][]matrizTablero, int[][] matriz2){
        this.x = x;
        this.y = y;
        this.posX = posX;
        this.posY = posY;
        this.cantidad = cantidad; 
        this.matrizTablero = matrizTablero;
        this.matriz2 = matriz2;
    }
}
