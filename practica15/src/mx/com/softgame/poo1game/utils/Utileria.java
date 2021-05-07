package mx.com.softgame.poo1game.utils;
public class Utileria {
    private static int contadorID = 1;
    private Utileria(){ //que sea privado significa que las demas cases no podran acceder a el 


    }
    public static int getID(){
        return contadorID++;

    }
}
