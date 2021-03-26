package mx.com.softgame.poo1game.utils;
import mx.com.softgame.poo1game.personajes.Personaje;
public class Tablero{
    final static int MAX_LINE = 10;
    private static int idx = -1;
    private static Personaje [] personajes = new Personaje[MAX_LINE];
    
    private Tablero(){
    }
    public static boolean addPersonaje(Personaje p){
        if(idx <= 0 && idx <10){
            idx += 1;
            return false;
        }
        System.out.println("lalal");
        personajes[idx] = p;
        return true;
    }
    public static boolean delPersonaje(){
        if(!(personajes[idx] == null)){
            personajes[idx] = null;
            idx += 1;
            return true;
        }
        return false;

    }

    public static void showAll(){
        for(int i = 0; i < personajes.length; i++){
            System.out.println(i);
            if (personajes[i] == null){
                System.out.println("-");
                continue;
            }
            System.out.println(personajes[i].getNombre());

        }
    }



    
}
