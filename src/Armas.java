public class Armas {
    private String nombre;
    private int daño;

    public Armas(int daño) {
        this.daño = daño;
    }

    public Armas(String nombre, int dano) {
        this.nombre = nombre;
        this.daño = dano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int dano) {
        this.daño = dano;
    }

    @Override
    public String toString() {
        return "Arma{" + "nombre=" + nombre + ", daño=" + daño + '}';
    }
}
