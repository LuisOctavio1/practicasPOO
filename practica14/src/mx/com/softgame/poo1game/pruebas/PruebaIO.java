package mx.com.softgame.poo1game.pruebas;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import mx.com.softgame.poo1game.personajes.Personaje;
import mx.com.softgame.poo1game.personajes.buenos.Planta;
import mx.com.softgame.poo1game.personajes.malos.Zombie;
public class PruebaIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String file = sc.nextLine();
        String path = System.getProperty("user.home") + "\\" + file.trim();
        System.out.println(path);
        File miArchivo = new File(file);
        if (miArchivo.exists()){
            ArrayList<Personaje> personajes = new ArrayList<Personaje>();
            
        }else{
            System.out.println("No existe, terminando programa");
        }
        

        
    }
    
}
