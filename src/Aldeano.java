import practicapolimorfismo.Soldado;

import javax.naming.ldap.LdapName;

public  abstract class  Aldeano {
    private String apellido;
    private String nombre;
    private int edad;
    private int vida;


    public Aldeano(String apellido,String nombre, int edad, int vida) {
        this.apellido=apellido;
        this.nombre = nombre;
        this.edad = edad;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;


    }

    @Override
    public String toString() {
        return "Aldeano{" + "nombre='" + nombre + '\'' + ", edad=" + edad + ", vida=" + vida ;
    }

    public abstract int daño(Aldeano ataque);
}
