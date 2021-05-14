package mx.com.softgame.poo1game.hilos;
import javax.swing.JLabel;

public class Hilo extends Thread{
    JLabel etiqueta;
    String name;

    public Hilo(String name,JLabel etiqueta){
        name = this.name;
        etiqueta = this.etiqueta;

    }

    public void run(){
        String str="";
        for(int i = 0; i<30;i++){
            str = etiqueta.getText();
            char c = str.charAt(str.length()-1);
            str += c;
            etiqueta.setText(str);
            int n = (int) (Math.random()*1001);
            try{
                Thread.sleep(n);
            }catch(InterruptedException e){
                System.err.println(e);

            }
             
        }
        str += "HECHO";
        etiqueta.setText(str);
    }
}