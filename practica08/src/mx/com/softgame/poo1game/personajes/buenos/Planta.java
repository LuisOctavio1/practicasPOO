package mx.com.softgame.poo1game.personajes.buenos;
import mx.com.softgame.poo1game.personajes.Personaje;
public class Planta extends Personaje{
     private char escudo;

    public Planta(String nombre,int vida,char escudo){
        super(nombre,vida);
        this.escudo = escudo;

    }
    public Planta(String nombre,char escudo){
        super(nombre);
        this.vida = 3;
        this.escudo = escudo;

    }
    public Planta(String nombre,int vida){
        super(nombre,vida);
        this.escudo = 'A';

    }
    public Planta(String nombre){
        super(nombre);
        this.vida = 3;
        this.escudo = 'A';

    }

    public char getEscudo(){
        return escudo;
    }
    public String getDetalle(){
        String detalle = nombre + "\t" + vida + escudo;
        return detalle;

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

