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
       this.escudo = escudo;

   }
   public Planta(String nombre,int vida){
       super(nombre,vida);
       this.escudo = 'A';

   }
   public Planta(String nombre){
       super(nombre);
       this.escudo = 'A';

   }

   public char getEscudo(){
       return escudo;
   }
   public String toString(){
       return nombre + " " + vida + " " + escudo;

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

   public boolean  iguales(Object b){
        if ((b != null) && (b instanceof Planta)){
            Planta d = (Planta) b;
            if ((nombre == d.nombre) && (vida == d.vida) && (escudo == d.escudo)){
                return true;
            }
        }
        return false;
    } 
   
   
}
