public class Armas {
    private String nombre;
    private int dano;

    public Armas(int dano) {
        this.dano = dano;
    }

    public Armas(String nombre, int dano) {
        this.nombre = nombre;
        this.dano = dano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    @Override
    public String toString() {
        return "Arma{" + "nombre=" + nombre + ", dano=" + dano + '}';
    }
}
