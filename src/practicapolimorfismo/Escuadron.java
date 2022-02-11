/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapolimorfismo;

import java.util.ArrayList;

/**
 *
 * @author James Josue Molina
 */
public class Escuadron {
    private String nombre;
    private ArrayList<Zona> conquistadas = new ArrayList();
    private ArrayList<Soldado> soldados = new ArrayList();

    public Escuadron(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Zona> getConquistadas() {
        return conquistadas;
    }

    public void setConquistadas(ArrayList<Zona> conquistadas) {
        this.conquistadas = conquistadas;
    }

    public ArrayList<Soldado> getSoldados() {
        return soldados;
    }

    public void setSoldados(ArrayList<Soldado> soldados) {
        this.soldados = soldados;
    }
    
    public void setConquisada(Zona conquistada){
       conquistadas.add(conquistada);
    }

    @Override
    public String toString() {
        return "Escuadron{" + "nombre=" + nombre + ", conquistadas=" + conquistadas + ", soldados=" + soldados + '}';
    }
    
    
    
}
