/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductosConcretos;

/**
 *
 * @author jorge malaver
 */

// se despliega un mensaje dependiendo del tipo de nota del segundo periodo que se quiera conocer
import Fabrica_abstracta.*;
import javax.swing.JOptionPane;
public class SegundoPeriodo implements ServicioNotas{
   
       @Override
    public void NotaQuiz(){
       JOptionPane.showMessageDialog(null,"La nota del quiz segundo periodo Es valida");
    }
    @Override
    public void NotaTrabajo(){
        JOptionPane.showMessageDialog(null,"La nota del trabajo segundo periodo Es valida");
    }
    
    @Override
    public void NotaParcial(){
        JOptionPane.showMessageDialog(null,"La nota del parcial primer periodo Es valida");
    }
}
