/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapolimorfismo;

/**
 *
 * @author James Josue Molina
 */
public abstract class Soldado {
    //n nombre, edad, tiempo en el ejército, rango, puntosde vida (100-400). 
    private String nombre;
    private int edad;
    private int timpo;
    private String rango;
    private int vida;

    public Soldado(){}
    
    public Soldado(String nombre, int edad, int timpo, String rango, int vida) {
        this.nombre = nombre;
        this.edad = edad;
        this.timpo = timpo;
        this.rango = rango;
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

    public int getTimpo() {
        return timpo;
    }

    public void setTimpo(int timpo) {
        this.timpo = timpo;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Soldado{" + "nombre=" + nombre + ", edad=" + edad + ", timpo=" + timpo + ", rango=" + rango + ", vida=" + vida + '}';
    }
    
    public abstract int daño(Soldado atacar);
    
    
    
}
