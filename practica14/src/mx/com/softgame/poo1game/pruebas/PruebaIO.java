package mx.com.softgame.poo1game.pruebas;
import java.io.File;
import java.util.Scanner;
public class PruebaIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String file = sc.nextLine();
        String path = System.getProperty("user.home") + "\\" + file.trim();
        System.out.println(path);
        File miArchivo = new File(file);
        if (miArchivo.exists()){
            System.out.println("Si existe");
        }else{
            System.out.println("No existe, terminando programa");
        }
        

        
    }
    
}
