/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapolimorfismo;

import java.util.Scanner;

/**
 *
 * @author James Josue Molina
 */
public class SuperSoldado extends Soldado{
    private Blanca blanca = new Blanca();
    private Bomba bomba = new Bomba();
    private Escopeta escopeta = new Escopeta();
    private LanzaLlamas lanzaLlamas = new LanzaLlamas();   

    public SuperSoldado() {
    }

    public SuperSoldado(String nombreBlanca, String nombreBomba, String nombreEscopeta, String nombreLanzaLlamas, String nombre, int edad, int timpo, String rango, int vida) {
        super(nombre, edad, timpo, rango, 1000);
        this.blanca.setNombre(nombreBlanca);
        this.bomba.setNombre(nombreBomba);
        this.escopeta.setNombre(nombreEscopeta);
        this.lanzaLlamas.setNombre(nombreLanzaLlamas);
        
    }

    public Blanca getBlanca() {
        return blanca;
    }

    public void setBlanca(Blanca blanca) {
        this.blanca = blanca;
    }

    public Bomba getBomba() {
        return bomba;
    }

    public void setBomba(Bomba bomba) {
        this.bomba = bomba;
    }

    public Escopeta getEscopeta() {
        return escopeta;
    }

    public void setEscopeta(Escopeta escopeta) {
        this.escopeta = escopeta;
    }

    public LanzaLlamas getLanzaLlamas() {
        return lanzaLlamas;
    }

    public void setLanzaLlamas(LanzaLlamas lanzaLlamas) {
        this.lanzaLlamas = lanzaLlamas;
    }

    @Override
    public String toString() {
        return "SuperSoldado{" + super.toString() + "blanca=" + blanca + ", bomba=" + bomba + ", escopeta=" + escopeta + ", lanzaLlamas=" + lanzaLlamas + '}';
    }
    
    public int daño(Soldado atacar){
        System.out.println("1. Arma Blanca");
        System.out.println("2. Bomba");
        System.out.println("3. Escopeta");
        System.out.println("4. LanzaLlamas");
        System.out.print("Escoja una: ");
        int tipo = (new Scanner(System.in)).nextInt();
        Arma escogida = new Arma();
        if(tipo == 1) escogida = blanca;
        else if(tipo == 2) escogida = bomba;
        else if(tipo == 3) escogida = escopeta;
        else if(tipo == 4) escogida = lanzaLlamas;
        
        if(atacar instanceof Capitan) return (int)Math.round(escogida.getDano()*1.3);
        if(atacar instanceof Sargento) return (int)Math.round(escogida.getDano()*1.35);
        if(atacar instanceof InfanteriaPesada) return (int)Math.round(escogida.getDano()*1.4);
        if(atacar instanceof InfanteriaLigera) return (int)Math.round(escogida.getDano()*1.5);
        return escogida.getDano();
    }
   
    
    
}
