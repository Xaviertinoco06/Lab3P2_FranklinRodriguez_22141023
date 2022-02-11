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
public class Arma {
    private String nombre;
    private int dano;
    
    public Arma(){}

    public Arma(int dano){
        this.dano = dano;
    }
    
    public Arma(String nombre, int dano) {
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
