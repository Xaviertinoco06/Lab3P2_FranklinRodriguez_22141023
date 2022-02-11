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
public class Capitan extends Soldado{
    private LanzaLlamas lanzaLlamas = new LanzaLlamas();

    public Capitan() {
    }

    public Capitan(String armaNombre, String nombre, int edad, int timpo, String rango, int vida) {
        super(nombre, edad, timpo, rango, vida);
        this.lanzaLlamas.setNombre(armaNombre);
    }

    @Override
    public String toString() {
        return "Capitan{" + super.toString() + "lanzaLlamas=" + lanzaLlamas + '}';
    }
    
    public int daño(Soldado atacar){
        if(atacar instanceof Sargento)return (int)Math.round(lanzaLlamas.getDano()*1.15);//16.5 -> 110+16.5 = 126.5 = 126
        if(atacar instanceof InfanteriaPesada) return (int)Math.round(lanzaLlamas.getDano()*1.2);
        if(atacar instanceof InfanteriaLigera) return (int)Math.round(lanzaLlamas.getDano()*1.25);
        return lanzaLlamas.getDano();
    }
    

}
