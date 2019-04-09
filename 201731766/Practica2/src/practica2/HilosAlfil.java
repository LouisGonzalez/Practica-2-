package practica2;
import java.awt.Color;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author luisGonzalez
 */
public class HilosAlfil extends TimerTask {
    //variables a usar
    private int x, y, cantidad, posX, posY;
    private JLabel[][] matrizTablero;
    private JLabel matriz;
    private int[][] matriz2;
    DatosJugador datos = new DatosJugador();
    PantallaJuego pantallita = new PantallaJuego();
    
    //metodo run(hilo) 
    @Override
    public void run(){
        valorA1();
    }
    
    //secuencia de movimientos 
    public void valorA1() {
        if(x<cantidad && y<cantidad){   
            if(matriz2[x][y] != 1){
                JOptionPane.showMessageDialog(null, "Has perdido");
                pantallita.dispose();
                datos.setVisible(true);               
            } else {
                matrizTablero[x][y].setBackground(Color.red);
            }
        } y++;
        x++;  
    }
    
    //mediante parametros el metodo se encarga de hacer la secuencia de movimiento
    public void valores(int x, int y, int posX, int posY, int cantidad, JLabel[][] matrizTablero, JLabel matriz, int[][] matriz2){
        this.x = x;
        this.y = y;
        this.cantidad = cantidad;
        this.posX = posX;
        this.posY  = posY;
        this.matrizTablero = matrizTablero;
        this.matriz = matriz;
        this.matriz2 = matriz2;
    }
}
