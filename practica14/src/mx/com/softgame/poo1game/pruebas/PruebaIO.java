package mx.com.softgame.poo1game.pruebas;
import java.util.Scanner;
public class PruebaIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String file = sc.nextLine();
        String path = System.getProperty("user.home") + "\\" + file.trim();
        System.out.println(path);

        
    }
    
}
