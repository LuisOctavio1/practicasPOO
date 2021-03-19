package mx.com.softgame.poo1game.personajes;
import mx.com.softgame.poo1game.personajes.utils.Utileria;
public class Personaje{
    private final int id;
    private String nombre;
    private int vida;
    public Personaje(String nombre, int vida){
        this.nombre = nombre;
        this.vida = vida;
        id = Utileria.getID();
    }
    public Personaje(String nombre){
        this.nombre = nombre;
        this.vida = 3;
    }

    public final int getVida(){
        return vida + id;
    }
    public boolean setVida(int vida){
       
        if (vida > 0 && vida <100){
            this.vida = vida;
            return true;

        }else{
            return false;
        }
    }
    public void setNombre(String nombre){
       int caracteres = this.nombre.length();
        if (caracteres > 3 && caracteres < 10){
            this.nombre = nombre;

        }
        
    }
    public String getNombre(){
        return nombre;
    }
    public void saludar(){
        System.out.println("Hola alumno de POO " + nombre);

    }
    public String toString(){
        return id + " " + nombre + " " + vida;

    }
    public void  decVida(){
        decVida(1);

    }
    public void  decVida(int decremento){
        if(decremento <= this.vida){
            this.vida -= decremento;
        }
    }
    public boolean equals(Object b){
        if ((b != null) && (b instanceof Personaje)){
            Personaje d = (Personaje) b;
            if ((nombre == d.nombre) && (vida == d.vida)){
                return true;
            }
        }
        return false;
    }
    
}

