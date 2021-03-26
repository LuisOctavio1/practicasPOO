package mx.com.softgame.poo1game.personajes;
import mx.com.softgame.poo1game.utils.Utileria;
public abstract class  Personaje{
    protected final int id = Utileria.getID();
    protected String nombre;
    protected int vida;
    public Personaje(String nombre, int vida){
        this.nombre = nombre;
        this.vida = vida;
    }
    public Personaje(String nombre){
        this.nombre = nombre;
        this.vida = 3;
    }

    public final String getIdVida(){
        return vida + " " + id;
    }
    public boolean setVida(int vida){
       
        if (vida > 0 && vida <100){
            this.vida = vida;
            return true;

        }else{
            return false;
        }
    }
    
    public abstract void setNombre(String nombre);
    /*
    contenido del metodo
    return nombre;
    */
    public void saludar(){
        System.out.println("Hola alumno de POO " + nombre);

    }
    public String toString(){
        return "[" + id + "] " + nombre + " (" + vida + ")";

    }
    public void  decVida(){
        decVida(1);

    }
    public void  decVida(int decremento){
        if(decremento <= this.vida){
            this.vida -= decremento;
        }
    }
    public abstract boolean equals(Object b);
        
    
    /*
    contenido del metodo
        if ((b != null) && (b instanceof Personaje)){
            Personaje d = (Personaje) b;
            if ((nombre == d.nombre) && (vida == d.vida)){
                return true;
            }
        }
        return false;
        */
    
}

