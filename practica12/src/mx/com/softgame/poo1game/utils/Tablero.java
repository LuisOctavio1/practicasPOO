package mx.com.softgame.poo1game.utils;
import mx.com.softgame.poo1game.personajes.Personaje;
public class Tablero{
    final static int MAX_LINE = 10;
    private static int idx = -1;
    private static Personaje [] personajes = new Personaje[MAX_LINE];
    
    private Tablero(){
    }
    public static void addPersonaje(Personaje p)
    throws TheException{
        if((idx + 1 < MAX_LINE)){
            idx +=1;
            personajes[idx] = p;
            
        }
        throw new TheException("No es posible insertar el personaje", idx);
        
        
    }
    public static void delPersonaje()
    throws TheException{
        if((idx - 1 >= 0)){
            personajes[idx] = null;
            idx -=1;

        }
        throw new TheException("No es posible borrar el personaje", idx);

    }
        

    public static void showAll(){
        for(int i = 0; i < personajes.length; i++){
            if (personajes[i] == null){
                System.out.println("-");
                continue;
            }
            System.out.println(personajes[i].getNombre());

        }
    }



    
}
