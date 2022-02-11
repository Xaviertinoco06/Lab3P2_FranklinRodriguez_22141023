public class Agronomo extends Aldeano{
    private Rastrillo rastrillo=new Rastrillo();

        public Agronomo(String nombreArma,String apellido, String nombre, int edad, int vida) {
            super(nombre,apellido,edad,vida);
            this.rastrillo.setNombre(nombreArma);
        }

    @Override
    public String toString() {
        return "Agronomo{" +super.toString()+ "rastrillo=" + rastrillo + '}';

        public abstract int daño(Aldeano ataque){
            if (ataque instanceof pacifista)return (int)Math.round(rastrillo.getDaño()*0.05);
             if (ataque instanceof normales)return (int)Math.round(rastrillo.getDaño()*0.01);
        }

        }



        }











