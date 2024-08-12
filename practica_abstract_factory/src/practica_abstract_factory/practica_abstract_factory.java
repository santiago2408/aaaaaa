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
import interfaz.InterfazGrafica;
import java.util.Scanner;
import javax.swing.SwingUtilities;

/**
 *
 * @author Estudiantes
 */
public class practica_abstract_factory {
     private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        InterfazGrafica vista = new InterfazGrafica();
        vista.setVisible(true);
        

     
       

     }
    
    public static void Periodo(ServicioFactory Notas){
        ServicioNotas  servicio= Notas.crearNota();//Notas que es una referencia a la intefaz
        servicio.NotaParcial();   //ejecuta la fabrica de producto concreto seleccionada1
        servicio.NotaQuiz();
        servicio.NotaTrabajo();
        
    }//fin metodov Periodo
    

    
}//cierra menu

