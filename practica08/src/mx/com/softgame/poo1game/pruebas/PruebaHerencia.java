package mx.com.softgame.poo1game.pruebas;
import mx.com.softgame.poo1game.personajes.Personaje;
import mx.com.softgame.poo1game.personajes.buenos.Planta;
import mx.com.softgame.poo1game.personajes.malos.Zombie;
public class PruebaHerencia {
    public static void main(String[] args) {
        Personaje per01 = new Personaje("Valeria",99);
        Personaje per02 = new Personaje("Octavio");
        Planta plan01 = new Planta("Wendy",10,'B');
        Planta plan02 = new Planta("Ricardo",50);
        Planta plan03 = new Planta("Vania",'C');
        Planta plan04 = new Planta("Alan");
        Zombie zomb01 = new Zombie("Karen",80,true);
        Zombie zomb02 = new Zombie("Eduardo",true);
        Zombie zomb01 = new Zombie("Esmeralda");

        
    }
}
