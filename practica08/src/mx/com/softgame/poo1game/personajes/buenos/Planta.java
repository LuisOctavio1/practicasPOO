public class Planta extends Personaje{
    private char escudo;

    public Planta(String nombre,int vida,char escudo){
        this.nombre = nombre;
        this.vida = vida;
        this.escudo = escudo;

    }
    public Planta(String nombre,char escudo){
        this.nombre = nombre;
        this.vida = 3;
        this.escudo = escudo;

    }
    public Planta(String nombre,int vida){
        this.nombre = nombre;
        this.vida = vida;
        this.escudo = 'A';

    }
    public Planta(String nombre{
        this.nombre = nombre;
        this.vida = 3;
        this.escudo = 'A';

    }

    public char getEscudo(){
        return escudo;
    }
    public String getDetalle(){
        String detalle = nombre + "\t" + vida + escudo;
        return detalle;

    }
    public void  decVida(){
        int multiplo = 1;
        if(escudo == 'A'){
            multiplo = 2;
        }
        if(this.vida > 0){
            this.vida = this.vida - (1 * multiplo);
        }

    }
    public void  decVida(int decremento){
        int multiplo = 1;
        if(escudo == 'A'){
            multiplo = 2;
        }
        if(decremento * multiplo <= this.vida){
            this.vida -= decremento;
        }
    }
    
    
}
