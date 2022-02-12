import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static Scanner scan=new Scanner(System.in);
    ArrayList<Aldeano>pelea=new ArrayList();
    ArrayList<familia>familia=new ArrayList();
    public static void main(String[] args) {
        int opcion;
        do{

            System.out.println("1.Crear Familia\n2.Crear Aldeano\n3.Imprimir Familias\n4.Jugar\n5.Salir\nIngresar la opcion que desea: ");
            opcion=scan.nextInt();
            switch (opcion){
                case 1:
                    CrearFamilia();
                break;
                case 2:

                break;

                case 3:
                    break;

                case 4:
                    break;
                case 5:
                    System.out.println("Gracias por utlizar el programacionm");

                    break;
                default:
                    System.err.println("\nNumero ingresado no existe entre las opciones\n");
                    break;


            }

        }while(opcion != 5);
        public static void CrearFamilia(){
            System.out.println("Familia");
            String familia = scan.next();
            if(encontrarFamilia(familia)==true) {
                familia.add(new familia(familia));
                System.out.println("Bienvida a la familia" + familia);
            }else{
                System.err.println("Ya existe ");

            }
            public static boolean encontrarFamilia(String familia){
                for(Familias familias:familias){
                    if(familias.equals(familias.getNombre())){
                        return true;

                    }
                }
                return false;


            }
            public static void agregarFamiliaw(){
                familia.add(new familia("Tinoco"));
                familia.add(new familia("Montesco"));
                familia.add(new familia("Capuleto"));


                peleador(new Herrero("Tinoco", "Skelter", 17, 490));
                peleador(new normales("Elbicho", "tinoco", 24, 1001));
                peleador(new Agronomo("Messi", "tinoco", 64, 1000));
                peleador(new Herrero("Franklin", "tinoco", 60, 700));

                peleador(new SuperAldeano("Romeo", "Montesco",19);
                peleador(new taliban("Helter", "Montesco", 40, 780));
                peleador(new Agronomo("Sepa", "Montesco", 70, 990));

                peleador(new normales("Julieta", "Capuleto", 3, 350));
                peleador(new pacifista("Ana", "Capuleto", 50, 500, "600","No pelien 0_o"));
                peleador(new taliban("Dorff", "Capuleto", 8,70));


            }


        }




    }




}
