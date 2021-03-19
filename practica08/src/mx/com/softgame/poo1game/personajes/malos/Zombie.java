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

    public String getDetalle(){
        return super.getDetalle() + ataque;
     }

    public boolean getAtaque(){
        return ataque;
    }
    public void  decVida(){
        if(ataque){
            super.decVida(2);
        }else{
            super.decVida(3);
        }

    }
    public void  decVida(int decremento){
        if(ataque){
            super.decVida(decremento*2);
        }else{
            super.decVida(decremento*3);
        }
    }
    
}
