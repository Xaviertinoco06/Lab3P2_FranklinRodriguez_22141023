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
public class Sargento extends Soldado{
    private Escopeta escopeta = new Escopeta();

    public Sargento() {
    }

    public Sargento(String nombreArma, String nombre, int edad, int timpo, String rango, int vida) {
        super(nombre, edad, timpo, rango, vida);
        this.escopeta.setNombre(nombreArma);
    }

    @Override
    public String toString() {
        return "Sargento{" + super.toString() + "escopeta=" + escopeta + '}';
    }
    
    public int daño(Soldado atacar){
        if(atacar instanceof InfanteriaPesada) return (int)Math.round(escopeta.getDano()*1.1);
        if(atacar instanceof InfanteriaLigera) return (int)Math.round(escopeta.getDano()*1.15);
        return escopeta.getDano();
    }
    
   
}
