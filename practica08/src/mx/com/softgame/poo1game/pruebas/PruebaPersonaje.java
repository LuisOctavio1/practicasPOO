//inicio 7:42
//fin 

package mx.com.softgame.poo1game.pruebas;
import mx.com.softgame.poo1game.personajes.Personaje;
public class PruebaPersonaje {
    public static void main(String[]args){
        Personaje per01 = new Personaje("Aline");
        Personaje per02 = new Personaje("Erick");
        Personaje per03 = new Personaje("Alan");
        Personaje per04 = new Personaje("Lesly");
        Personaje per05 = new Personaje("Brian");
        outfor:
            for(int i=0;i<3;i++){
                int ed = ((int)(Math.random()*250));
            
                if (!per01.setEdad(ed)){
                    System.out.println(per01.getDetalle() + " sin modificacion en edad a " + ed);
                }else{
                    System.out.println(per01.getDetalle() + " se modifico la edad");
                }
                ed = ((int)(Math.random()*250));
                per02.setEdad(ed);
                if (!per02.setEdad(ed)){
                    System.out.println(per02.getDetalle() + " sin modificacion en edad a " + ed);
                }else{
                    System.out.println(per02.getDetalle() + " se modifico la edad");
                }
                per03.setEdad(ed);
                if (!per03.setEdad(ed)){
                    System.out.println(per03.getDetalle() + " sin modificacion en edad a " + ed);
                }else{
                    System.out.println(per03.getDetalle() + " se modifico la edad");
                }
            
                do {
                    ed = ((int)(Math.random()*500));
                    if(ed == 250){
                        System.out.println("***Bingo***");
                        continue outfor;
                    }
                }while(!per04.setEdad(ed));
                System.out.println(per04.getDetalle());


        }

    }
    
}
