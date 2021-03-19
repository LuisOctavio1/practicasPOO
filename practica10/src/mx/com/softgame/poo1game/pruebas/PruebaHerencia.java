package mx.com.softgame.poo1game.pruebas;
import mx.com.softgame.poo1game.personajes.Personaje;
import mx.com.softgame.poo1game.personajes.buenos.Planta;
import mx.com.softgame.poo1game.personajes.malos.Zombie;
public class PruebaHerencia {
    public static void main(String[] args) {
        /*
        Personaje per01 = new Personaje("Valeria",99);
        Personaje per02 = new Personaje("Octavio");
        Planta plan01 = new Planta("Wendy",10,'B');
        Planta plan02 = new Planta("Ricardo",50);
        Planta plan03 = new Planta("Vania",'C');
        Planta plan04 = new Planta("Alan");
        Zombie zomb01 = new Zombie("Karen",80,true);
        Zombie zomb02 = new Zombie("Eduardo",true);
        Zombie zomb03 = new Zombie("Esmeralda");
        */

        Personaje personajes[] = {new Personaje("omar", 99),
        new Planta("Karen", 50),
        new Zombie("Hanna", 80,false),

        new Personaje("omar", 99),
        new Planta("Karen", 50),
        new Zombie("Hanna", 80,false),
        new Planta("Hanna", 80, 'A')
        };
        System.out.println(personajes[3].getIdVida());
        int i = 0;
        while(i < personajes.length){
            for(Personaje p : personajes){
                if (p == personajes[i]){
                    System.out.println("*** " + p + " es identico a " + personajes[i] + " son el mismo objeto***");
                    continue;
                }
                if (p.equals(personajes[i])){
                    System.out.println("** " + p + " es igual a " + personajes[i] + " son diferentes objetos**");
                    continue;
                }
                System.out.println( p + " != " + personajes[i]);
                    
            }
            System.out.println();
            i ++;    
                
        }
        
    }

        /*
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
        */
    
}

