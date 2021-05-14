package mx.com.softgame.poo1game.hilos;
import java.util.Random;
import javax.swing.JLabel;

public class Hilo extends Thread{
    JLabel etiqueta;
    String name;

    public Hilo(String name,JLabel etiqueta){
        name = this.name;
        etiqueta = this.etiqueta;

    }

    public void run(){
        String str;
        for(int i = 0; i<10;i++){
            str = etiqueta;
            char c = charAt(str.length()-1);
            str += c;
            etiqueta = str;
            int n = Math.random()*1001;
            hilo.sleep(n); 
        }
        str += "HECHO";
        etiqueta = str;
    }
}