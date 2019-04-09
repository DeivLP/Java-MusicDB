/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reproductor;
//ALL MADE WITH JMF.
import Controladores.ControladorReproductor;
import Views.Selector;
import Views.Interfaz;
import Controladores.ControladorSelector;
/**
 *
 * @author David Lemos Pombal
 */
public class Reproductor {


    public static void main(String[] args) {
        
        //Instancias de las interfaces
        Interfaz principal = new Interfaz();//parte de la interfaz principal
        Selector sel = new Selector(); //parte del selector
        
        //ponemos los modificadopres de visibilidad de las interfaces en público
        //por que así probamos a usar este main para codificar mejor que usar el codigo de las interfaces
        //repito solo por probar.
        
        //Instancias de los controladores
        ControladorReproductor cr = new ControladorReproductor(principal, sel);
        ControladorSelector cs = new ControladorSelector(sel);
        
    }
    
}
