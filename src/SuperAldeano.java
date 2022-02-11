public class SuperAldeano extends Aldeano{

    private SuperPuño superPuño= new SuperPuño();

    public SuperAldeano(String nombreArma,String apellido,String nombre,int edad,String vida){
        super(apellido,nombre,edad,1000);
        this.superPuño.setNombre(nombreArma);

    }

    @Override
    public String toString() {
        return "SuperAldeano{" + "superPuño=" + superPuño + '}';
    }
    public int daño(Aldeano ataque){
        if(ataque instanceof Herrero)return (int)Math.round(superPuño.getDaño()*1.15);
        if(ataque instanceof taliban)return (int)Math.round(superPuño.getDaño()*1.2);
        return superPuño.getDaño();

    }
}
