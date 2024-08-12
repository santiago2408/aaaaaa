/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_abstract_factory;

import FabricaConcreta.SegundoConcreto;
import FabricaConcreta.TercerConcreto;
import FabricaConcreta.primerConcreto;
import Fabrica_abstracta.ServicioFactory;
import Fabrica_abstracta.ServicioNotas;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class practica_abstract_factory {
     private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       int op;
        do{
            op=menu();//pegunta por el periodo elegido
            switch(op){
                case 1:
                    Periodo(new primerConcreto());//llamado al metodo periodo
                    break; //se le pasa una factoria concreta
                case 2:
                    Periodo(new SegundoConcreto());
                    break;
                case 3:
                    Periodo(new TercerConcreto());
                    break;
                case 4:
                    System.out.println("Cerrando Programa");
                    System.exit(0);
                 default :
                    System.out.println(".....Opcion invalida....");
            }//cierra switchn\n
            //System.out.println("\n\n");
        }while(op!=4);
     
       
       
     }
    
    public static void Periodo(ServicioFactory Notas){
        ServicioNotas  servicio= Notas.crearNota();//Notas que es una referencia a la intefaz
        servicio.NotaParcial();   //ejecuta la fabrica de producto concreto seleccionada1
        servicio.NotaQuiz();
        servicio.NotaTrabajo();
        
    }//fin metodov Periodo
    
    public static int  menu(){
        System.out.println(
                "MENU DE OPCIONES\n"
                + "1.   Solicitar Notas Primer Perido. \n"
                + "2.   Solicitar Notas Segundo Perido. \n"
                + "3.   Solicitar Notas tercer periodo. \n"
                + "4.   Cerrar programa. \n\n"
                + "Seleccion opcion..."
        );
        return Integer.parseInt(sc.nextLine());
    }
}//cierra menu

