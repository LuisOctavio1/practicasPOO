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
                FileReader fr = new FileReader(miArchivo);
                BufferedReader br = new BufferedReader(fr);
                String line = null;
                int cuantos = 0;
                line = br.readLine();
                System.out.println(line);
                int count = Integer.parseInt(line);
                    while((line = br.readLine()) !=null && cuantos < count){
                        cuantos++;
                        System.out.println(line);
                        String [] partes = line.split(",");
                        if(partes[0].equals("P") ){
                            personajes.add(new Planta(partes[1]));

                        }else{
                            personajes.add(new Zombie(partes[1]));
                        }
                        
                    }
                    for(Personaje t: personajes){
                        System.out.println(t);
                    }
                    
                
                br.close();
            }catch (IOException e){
                e.printStackTrace();
            }
            try {
                String ruta = System.getProperty("user.home")+"\\";
                FileOutputStream f = new FileOutputStream ( ruta + "pvsz.out");
                ObjectOutputStream s = new ObjectOutputStream (f);
                for(Personaje t: personajes){
                    s.writeObject(t);
                    System.out.println(t);
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
