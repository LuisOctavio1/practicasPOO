package mx.com.softgame.poo1game.pruebas;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import mx.com.softgame.poo1game.personajes.Personaje;
import mx.com.softgame.poo1game.personajes.buenos.Planta;
import mx.com.softgame.poo1game.personajes.malos.Zombie;
public class PruebaIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String file = sc.nextLine();
        String path = System.getProperty("user.home") + "\\" + file.trim();
        System.out.println(path);
        File miArchivo = new File(path);
        if (miArchivo.exists()){
            ArrayList<Personaje> personajes = new ArrayList<Personaje>();
            try{
                FileReader input = new FileReader(miArchivo);
                BufferedReader bufInput = new BufferedReader(input);
                String line = null;
                int cuantos = 0;
                line = bufInput.readLine();
                System.out.println(line);
                int count = Integer.parseInt(line);
                    while((line = bufInput.readLine()) !=null && cuantos < count){
                        cuantos++;
                        System.out.println(line);
                        String [] partes = line.split(",");
                        int cuenta = 0;
                        if(partes[cuenta] == "P"){
                            personajes.add(new Planta(partes[cuenta+1]));
                            cuenta += 2;

                        }else{
                            personajes.add(new Zombie(partes[cuenta+1]));
                            cuenta += 2;
                        }
                        
                    }
                    for(Personaje t: personajes){
                        System.out.println(t);
                    }
                
                bufInput.close();
            }catch (IOException e){
                e.printStackTrace();
            }
            try {
                String ruta = System.getProperty("user.home")+"\\";
                FileOutputStream f = new FileOutputStream ( ruta + "pvsz.out");
                ObjectOutputStream s = new ObjectOutputStream (f);
                for(Personaje t: personajes){
                    s.writeObject (t);
                }
                
                s.close ();
         } catch (IOException e) {
            e.printStackTrace ();
            }

            
        }else{
            System.out.println("No existe, terminando programa");
        }
        

        
    }
    
}
