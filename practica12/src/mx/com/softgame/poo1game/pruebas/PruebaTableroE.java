package mx.com.softgame.poo1game.pruebas;
import mx.com.softgame.poo1game.personajes.Personaje;
import mx.com.softgame.poo1game.personajes.buenos.Planta;
import mx.com.softgame.poo1game.personajes.malos.Zombie;
import mx.com.softgame.poo1game.utils.Tablero;
import mx.com.softgame.poo1game.utils.TheException;

public class PruebaTableroE {
    public static void main(String[] args)throws TheException{
        Personaje [] arr = {new Planta("Giovanna",50),
        new Zombie("Miguel", false), 
        new Zombie("Karen", true),
        new Planta("Leonardo", 99), 
        new Planta("Sebastian", 30), 
        new Zombie("Hanna"), 
        new Planta("Oscar"),
        new Zombie("Brian",false), 
        new Planta("Lesly", 9), 
        new Planta("Vania",10), 
        new Zombie("Erick", 20, false),
        new Planta("Aline", 40)            
        };
        //COMENTARIO : El error indica que la exception no es reportada y que deberia ser atrapada, asi que se arreglara reportandola al principio del main
        try{
            for(Personaje t: arr){
                Tablero.addPersonaje(t);
            }
            
            Tablero.delPersonaje();
            
            Tablero.showAll();
    
            for(int i = 0; i<14; i++){
                Tablero.delPersonaje();
                
            }

        }catch(TheException e){
            System.err.println(e + " " + e.getPoss());
        }
        
        
    }
    
}
