//Torres Trujillo Luis Octavio
package mx.com.softgame.poo1game.personajes;

public class Personaje{
    private String nombre;
    private int edad;
    public Personaje(String nombre){
        this.nombre = nombre;
        int edad = 0;
    }

    public int getEdad(){
        return edad;
    }
    public boolean setEdad(int edad){
        if (edad > 0 && edad <120){
            this.edad = edad;
            return true;

        }else{
            return false;
        }
    }
    public void setNombre(String nombre){
       int caracteres = this.nombre.length();
        if (caracteres > 3 && caracteres < 10){
            this.nombre = nombre;

        }else{

        }
        
    }
    public String getNombre(){
        return nombre;
    }
    public void saludar(){
        System.out.println("Hola alumno de POO " + nombre);

    }
    public String getDetalle(){
        String detalle = (nombre + "\t" + edad);
        return detalle;

    } 


}