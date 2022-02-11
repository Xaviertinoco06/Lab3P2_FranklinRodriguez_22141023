import javax.naming.ldap.LdapName;

public  abstract class  Aldeano {
    private String nombre;
    private int edad;
    private int vida;
    private int daño;

    public Aldeano(String nombre, int edad, int tiempo, String rango, int vida,int daño) {
        this.nombre = nombre;
        this.edad = edad;
        this.daño= daño;
        this.vida = vida;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public int getVida() {
        return vida;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public void setVida(int vida) {
        this.vida = vida;


    }

    @Override
    public String toString() {
        return "Aldeano{" + "nombre='" + nombre + '\'' + ", edad=" + edad + ", vida=" + vida + ", daño=" + daño + '}';
    }
}
