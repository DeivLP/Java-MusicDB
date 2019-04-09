/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Views.Selector;

/**
 *
 * @author David Lemos Pombal
 */
public class ControladorSelector {
    
    private Selector sl;

    public ControladorSelector(Selector sl) {
        this.sl = sl;
        iniciar();
    }
    
    public void iniciar(){
        sl.setSize(500, 500);
       // sl.setVisible(true); Lo comentamos por que solo queremos verlo cuando accedemos a la lista.
        sl.setLocationRelativeTo(null);
    }
    
    
    
}
