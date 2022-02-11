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
public class InfanteriaPesada extends Soldado{
    private Bomba bomba = new Bomba();

    public InfanteriaPesada() {
    }

    public InfanteriaPesada(String nombreArma, String nombre, int edad, int timpo, String rango, int vida) {
        super(nombre, edad, timpo, rango, vida);
        this.bomba.setNombre(nombreArma);
    }

    public Bomba getBomba() {
        return bomba;
    }

    public void setBomba(Bomba bomba) {
        this.bomba = bomba;
    }

    @Override
    public String toString() {
        return "InfanteriaPesada{" + super.toString() + "bomba=" + bomba + '}';
    }
    
    
    public int daño(Soldado atacar){
        if(atacar instanceof InfanteriaLigera) return (int)Math.round(bomba.getDano()*1.05);
        
        return bomba.getDano();
    }
    
    
}
