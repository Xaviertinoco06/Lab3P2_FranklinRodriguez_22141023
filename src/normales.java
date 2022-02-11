public class normales extends Aldeano{

    private puño castañazo=new puño();

    public normales (String nombreArma,String apellidos,String nombre,int edad,int vida){
        super(apellidos,nombre,edad,vida);
        this.castañazo.setNombre(nombreArma);
    }

    @Override
    public String toString() {
        return "normales{" + "castañazo=" + castañazo + '}';
    }
    public int daño(Aldeano ataque){
        if(ataque instanceof pacifista)return(int)Math.round(castañazo.getDaño()*0.05);
        return castañazo.getDaño();
    }
}
