/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricaConcreta;


// Se importan las interfaces que se van a implementar
import Fabrica_abstracta.ServicioFactory;
import Fabrica_abstracta.ServicioNotas;
import ProductosConcretos.SegundoPeriodo;
public class SegundoConcreto implements ServicioFactory{
    
    @Override // se sobreescribe el metodo, con respecto a las notas del segundo periodo
    public ServicioNotas crearNota(){
      return new SegundoPeriodo();  
    }
}
