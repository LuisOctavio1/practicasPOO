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
        Zombie zomb03 = new Zombie("Esmeralda");
        System.out.println(plan01.getEscudo());


        Personaje personajes[] = new Personaje [9];
        personajes[0] = per01;
        personajes[1] = per02;
        personajes[2] = plan01;
        personajes[3] = plan02;
        personajes[4] = plan03;
        personajes[5] = plan04;
        personajes[6] = zomb01;
        personajes[7] = zomb02;
        personajes[8] = zomb03;


        for (Personaje t: personajes){
            System.out.println(t.getDetalle());
            if(t instanceof Planta){
                Planta m = (Planta) t;
                System.out.println("Soy una planta " + m.getEscudo() );
            }
            if(t instanceof Zombie){
                Zombie m = (Zombie) t;
                System.out.println("Soy un zombie " + m.getAtaque() );
            }
            t.decVida((int)((Math.random()*10)));
            System.out.println(t.getDetalle());
        }

    
    }
}
