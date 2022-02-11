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
public class InfanteriaLigera extends Soldado{
    private Blanca arma = new Blanca();

    public InfanteriaLigera() {
    }

    public InfanteriaLigera(String nombre, int edad, int timpo, String rango, int vida) {
        super(nombre, edad, timpo, rango, vida);
    }

    public InfanteriaLigera(String armaNombre, String nombre, int edad, int timpo, String rango, int vida) {
        super(nombre, edad, timpo, rango, vida);
        this.arma.setNombre(armaNombre);
    }
    
    public Blanca getArma() {
        return arma;
    }

    public void setArma(Blanca arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "InfanteriaLigera{" + super.toString() + "arma=" + arma + '}';
    }
    
    public int daño(Soldado atacar){
        return arma.getDano();
    }
    
}
