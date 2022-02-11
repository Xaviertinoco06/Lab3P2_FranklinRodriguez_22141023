public class taliban extends Aldeano {
    private cohetes kaboom=new cohetes();
     public taliban(String nombreArma,String apellido,String nombre,int edad,int vida) {
         super(apellido, nombre, edad, vida);
         this.kaboom.setNombre(nombreArma);
     }

    @Override
    public String toString() {
        return "taliban{" + "kaboom=" + kaboom + '}';
    }
    public int daño(Aldeano ataque){
        if(ataque instanceof Herrero)return (int)Math.round(kaboom.getDaño()*0.05);
        if(ataque instanceof Agronomo) return (int)Math.round(kaboom.getDaño()*0.1);
        return kaboom.getDaño();
}

}
