public class pacifista {
    private Discurso discurso = new Discurso();

    public pacifista(String nombreArma, String apellido, String nombre, int edad, int vida) {
        super(apellido,nombre, edad, vida);
        this.discurso.setNombre(nombreArma);


    }

    @Override
    public String toString() {
        return "pacifista{" +super.toString()+ "discurso=" + discurso + '}';
    }

    public int daño(Aldeano atacar) {
        return 0;
    }
}
