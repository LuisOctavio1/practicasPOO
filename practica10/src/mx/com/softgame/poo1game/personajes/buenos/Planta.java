package mx.com.softgame.poo1game.personajes.buenos;
import mx.com.softgame.poo1game.personajes.Personaje;
public class Planta extends Personaje{
    private char escudo;

   public Planta(String nombre,int vida,char escudo){
       super(nombre,vida);
       this.escudo = escudo;

   }
   public Planta(String nombre,char escudo){
       super(nombre,3);
       this.escudo = escudo;

   }
   public Planta(String nombre,int vida){
       super(nombre,vida);
       this.escudo = 'A';

   }
   public Planta(String nombre){
       super(nombre,3);
       this.escudo = 'A';

   }
   public final String getIdVidaEscudo(){
       //el error marca que la clase planta no puede sobreescribir el metodo ya que este es final
        return  super.getIdVida() + " " + escudo;
    }

   public char getEscudo(){
       return escudo;
   }
   public String toString(){
       return super.toString() + escudo;

   }
   public void  decVida(){
       decVida(1);

   }
   public void  decVida(int decremento){
       if(escudo == 'A'){
           super.decVida(decremento * 2);
       }else{
            super.decVida(decremento);
       }
      
   }

   public boolean  equals(Object b){
        return (super.equals(b) && b instanceof Planta && escudo == ((Planta)b).escudo);
   }
   
   

}
