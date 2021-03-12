package mx.com.softgame.poo1game.personajes;
public class Personaje{
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

    public int getVida(){
        return vida;
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
        return nombre + "\t" + vida;

    }
    public void  decVida(){
        decVida(1);

    }
    public void  decVida(int decremento){
        if(decremento <= this.vida){
            this.vida -= decremento;
        }
    }
    public booleand iguales(object b){
        if(a.equals(b)){
            return true;
        }
        return false;

    }
    


}