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
public class PracticaPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Soldado capitan = new SuperSoldado("armaJuan", "armaJuan2", "armaJuan3","armaJuan4", "Juan", 51, 5, "Cabo", 400);
        Soldado sargento = new Sargento("armaPamela", "Pamela", 20, 14, "Cadete",500);
        int ataqueSargento, ataqueCapitan; 
        while(capitan.getVida() > 0 && sargento.getVida() > 0){
            ataqueSargento = sargento.daño(capitan);
            capitan.setVida( capitan.getVida() - ataqueSargento );
            System.out.println(sargento.getNombre() + " ha atacado a " + capitan.getNombre() + " haciendole " + ataqueSargento + " dejandolo con " + capitan.getVida() + " de vida "  ); 
            if(capitan.getVida() <= 0){
                System.out.println("HA GANADO " + sargento.getNombre());
            }else{
                ataqueCapitan = capitan.daño(sargento);
                sargento.setVida( sargento.getVida() - ataqueCapitan);
                System.out.println(capitan.getNombre() + " ha atacado a " + sargento.getNombre() + " haciendole " + ataqueCapitan + " dejandolo con " + sargento.getVida() + " de vida "  );        
                if(sargento.getVida() <= 0){
                    System.out.println("HA GANADO " + capitan.getNombre());
                }
            }
        }
    }
    
}
