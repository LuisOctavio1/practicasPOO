package mx.com.softgame.poo1game.personajes.malos;
import mx.com.softgame.poo1game.personajes.malos.Zombie;
public class ZombieCono extends Zombie {
    public ZombieCono(String nombre){
        super(nombre);
    }
    //el error se debe a que las clases final no puden heredar, y la clase ZombieCono esta intenttando heredar de una 
}
