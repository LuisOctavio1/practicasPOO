package mx.com.softgame.poo1game.pruebas;
import java.util.TreeSet;
import java.util.Collections;
import java.util.LinkedList;
import mx.com.softgame.poo1game.personajes.Personaje;
import mx.com.softgame.poo1game.personajes.buenos.Planta;
import mx.com.softgame.poo1game.personajes.malos.Zombie;
import mx.com.softgame.poo1game.utils.SortId;
public class PruebaSort {
    public static void main(String[] args) {
        TreeSet <Personaje>ts = new TreeSet<Personaje>();
        ts.add(new Planta("Cristian",70));
        ts.add(new Planta("Karen",59));
        ts.add(new Zombie("Hanna",80,false));
        ts.add(new Zombie("Erick",false));
        ts.add(new Zombie("Esmeralda",80,false));
        ts.add(new Planta("Miguel",99));
        ts.add(new Planta("Jaime",50));
        ts.add(new Zombie("Cristian",80,false));
        ts.add(new Zombie("Miguel",80,false));
        ts.add(new Planta("Karen",50));

        for(Personaje t: ts){
            System.out.println(t);
        }
        System.out.println("********");
        LinkedList <Personaje> is = new LinkedList<Personaje>();
        ts.add(new Planta("Cristian",70));
        ts.add(new Planta("Karen",59));
        ts.add(new Zombie("Hanna",80,false));
        ts.add(new Zombie("Erick",false));
        ts.add(new Zombie("Esmeralda",80,false));
        ts.add(new Planta("Miguel",99));
        ts.add(new Planta("Jaime",50));
        ts.add(new Zombie("Cristian",80,false));
        ts.add(new Zombie("Miguel",80,false));
        ts.add(new Planta("Karen",50));
        Collections.sort(is,new SortId());

        for(Personaje t: is){
            System.out.println(t);
        }

    }
    
    

}

