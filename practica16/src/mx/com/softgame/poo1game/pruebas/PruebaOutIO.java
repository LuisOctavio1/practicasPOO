package mx.com.softgame.poo1game.pruebas;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import mx.com.softgame.poo1game.personajes.Personaje;
public class PruebaOutIO {
    public static void main(String[] args) {
        try{
            String ruta = System.getProperty("user.home")+"\\";
            FileInputStream input = new FileInputStream(ruta + "pvsz.out");
            ObjectInputStream bufInput = new ObjectInputStream(input);
            Object obj;
            while((obj = bufInput.readObject()) != null){
                Personaje p = (Personaje) obj;
                System.out.println(p);
            }
            bufInput.close();
        }catch (IOException e){
            System.err.println(e);
        }catch(ClassNotFoundException e){
            System.err.println(e);

        }
    }
}
