package practica2;
import java.awt.Color;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author luisGonzalez
 */
public class HilosTorre4 extends TimerTask{    
    
    private int x, y, posX, posY;
    private JLabel[][] matrizTablero;
    private int[][] matriz2;
    PantallaJuego pantallita = new PantallaJuego();
    DatosJugador datos = new DatosJugador();
   
    @Override 
    public void run(){    
        valor4();                      
    }
    
    public void valor4(){
        x = posX;
        if(y>=0){
            if(matriz2[x][y] != 1){             
                JOptionPane.showMessageDialog(null, "Has perdido");
                pantallita.setVisible(false);
                datos.setVisible(true);
            } else {
                matrizTablero[x][y].setBackground(Color.green); 
            }
        } y--;    
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
