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
        if(personajes[idx] = null){
            return true;
        }
        return false;
    }
    public static boolean delPersonaje(){
        if(personajes.remove(idx)){
            return true;
        }
    }


    
}
