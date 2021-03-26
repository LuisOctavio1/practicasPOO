package mx.com.softgame.poo1game.personajes.malos;
import mx.com.softgame.poo1game.personajes.Personaje;
public final class Zombie extends Personaje {
    private boolean ataque;

    public Zombie(String nombre,int vida,boolean ataque){
        super(nombre,vida);
        this.ataque = ataque;
    }
    public Zombie(String nombre,boolean ataque){
        super(nombre,3);
        this.ataque = ataque;
    }
    public Zombie(String nombre){
        super(nombre,3);
        this.ataque = false;
    }

    public boolean getAtaque(){
        return ataque;
    }
    public final String getIdVidaAtaque(){
        //el error marca que la clase zombie no puede sobreescribir el metodo ya que este es final
         return  super.getIdVida() + ataque;
    }
    public String toString(){
        return super.toString() + " {" + ataque + "}";
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
    
    public boolean  equals(Object b){
        return (super.equals(b) && b instanceof Zombie && ataque == ((Zombie)b).ataque);
    }    
       
}
