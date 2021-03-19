package mx.com.softgame.poo1game.personajes.utils;
public class Utileria {
    static int contadorID;
    private Utileria(){ //que sea privado significa que las demas cases no podran acceder a el 


    }
    public static int getID(){
        int getID = contadorID++;

    }
}
