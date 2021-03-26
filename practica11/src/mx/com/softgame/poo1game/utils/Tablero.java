package mx.com.softgame.poo1game.utils;
import mx.com.softgame.poo1game.personajes.Personaje;
public class Tablero{
    final static int MAX_LINE = 10;
    private static int idx = -1;
    private static Personaje [] personajes = new Personaje[MAX_LINE];
    
    private Tablero(){
    }
    public static boolean addPersonaje(Personaje p){
        personajes[idx] = p;
        if(!(personajes[idx] == p)){
            idx -= 1 ;
            return true;
        }
        return false;
    }
    public static boolean delPersonaje(){
        if(!(personajes[idx] == null)){
            personajes[idx] = null;
            return true;
        }
        idx += 1;
        return false;

    }

    public static void showAll(){
        for(int i = idx; i <= personajes.length; i++){
            if (personajes[i] == null){
                System.out.println("-");
                continue;
            }
            System.out.println(personajes[i].getNombre());

        }
    }



    
}
