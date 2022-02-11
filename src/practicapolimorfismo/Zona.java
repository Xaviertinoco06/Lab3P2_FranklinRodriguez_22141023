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
public class Zona {
    private String nombre;
    private int x, y;
    private int tamano;

    public Zona(){
        
    }
    public Zona(String nombre, int x, int y, int tamano) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Zona{" + "nombre=" + nombre + ", x=" + x + ", y=" + y + ", tamano=" + tamano + '}';
    }
    
    
    
    
}
