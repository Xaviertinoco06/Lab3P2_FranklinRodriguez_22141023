import java.util.Random;
public class Herrero extends Aldeano{
    Random random = new Random();
    private int armaAleatoria;

    public Herrero(String apellido,String nombre,int edad,int vida ) {
        super(nombre, apellido, edad,(int)Math.round(vida*0.5));
        armaAleatoria = random.nextInt(500-200)+200;
    }

    public String toString() {
        return "Herrero: "+super.toString()+" Ataque: "+armaAleatoria;
    }

    public int daño(Aldeano ataque){
        if(ataque instanceof Agronomo)return (int)Math.round(armaAleatoria*0.1);
        if(ataque instanceof pacifista)return (int)Math.round(armaAleatoria*0.05);
        return armaAleatoria;
    }
}


