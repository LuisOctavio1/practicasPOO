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

        Personaje arreglo[] = new Personaje[8];
        arreglo[0] = per01;
        arreglo[1] = per02;
        arreglo[2] = plan01;
        arreglo[3] = plan02;
        arreglo[4] = plan03;
        arreglo[5] = plan04;
        arreglo[6] = zomb01;
        arreglo[7] = zomb02;
        arreglo[8] = zomb03;

        for (Personaje t: arreglo){
            System.out.println(t.getDetalle());
            if(t instanceof Planta){
                System.out.println("Soy una planta");
            }
            if(t instanceof Zombie){
                System.out.println("Soy un zombie");
            }
            t.decVida((int)((Math.random()*10)));
            System.out.println(t.getDetalle());
        }

    
    }
}
