/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductosConcretos;

// se despliega un mensaje dependiendo del tipo de nota del primer periodo que se quiera conocer
import Fabrica_abstracta.*;
import javax.swing.JOptionPane;
public class PrimerPerido implements ServicioNotas{
    
    @Override
    public void NotaQuiz(){
        JOptionPane.showMessageDialog(null,"La nota del quiz primer periodo Es valida");
    }
    @Override
    public void NotaTrabajo(){
        JOptionPane.showMessageDialog(null,"La nota del trabajo primer periodo Es valida");
    }
    
    @Override
    public void NotaParcial(){
        JOptionPane.showMessageDialog(null,"La nota del parcial primer periodo Es valida");
    }
}
