package mx.com.softgame.poo1game.personajes.malos;
import mx.com.softgame.poo1game.personajes.Personaje;
public class Zombie extends Personaje {
    private boolean ataque;

    public Zombie(String nombre,int vida,boolean ataque){
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }
    public Zombie(String nombre,boolean ataque){
        this.nombre = nombre;
        this.vida = 3;
        this.ataque = ataque;
    }
    public Zombie(String nombre){
        this.nombre = nombre;
        this.vida = 3;
        this.ataque = false;
    }

    public boolean getAtaque(){
        return ataque;
    }
    public void  decVida(){
        int multiplo = 1;
        if(escudo == 'A'){
            multiplo = 2;
        }
        if(this.vida > 0){
            this.vida = this.vida - (1 * multiplo);
        }

    }
    public void  decVida(int decremento){
        int multiplo = 1;
        if(escudo == 'A'){
            multiplo = 2;
        }
        if(decremento * multiplo <= this.vida){
            this.vida -= decremento;
        }
    }
    
}
