package mx.com.softgame.poo1game.personajes.malos;
import mx.com.softgame.poo1game.personajes.Personaje;
public class Zombie extends Personaje {
    private boolean ataque;

    public Zombie(String nombre,int vida,boolean ataque){
        super(nombre,vida);
        this.ataque = ataque;
    }
    public Zombie(String nombre,boolean ataque){
        super(nombre);
        this.vida = 3;
        this.ataque = ataque;
    }
    public Zombie(String nombre){
        super(nombre);
        this.vida = 3;
        this.ataque = false;
    }

    public boolean getAtaque(){
        return ataque;
    }
    public void  decVida(){
        int multiplo = 1;
        if(!ataque){
            multiplo = 3;
        }else{
            multiplo = 2;
        }
        if(this.vida > multiplo){
            this.vida = this.vida - (multiplo);
        }

    }
    public void  decVida(int decremento){
        int multiplo = 1;
        if(!ataque){
            multiplo = 3;
        }else{
            multiplo = 2;
        }
        if(decremento * multiplo <= this.vida){
            this.vida -= (decremento * multiplo);
        }
    }
    
}
