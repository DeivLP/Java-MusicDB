/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Views.Interfaz;
import Views.Selector;

/**
 *
 * @author David Lemos Pombal
 */
public class ControladorReproductor {
    //vamos a instanciar la interfaz principal
    private Interfaz iz;
    private Selector se;
    
    //Hacemos constructor con parámetros
    //Recibimos la interfaz princifal y la asignamos
    public ControladorReproductor(Interfaz inter, Selector sele){
        this.iz = inter;
        this.se = sele;//añadimos esto para poder abrir la lista desde la interfaz reproductor.
        iniciar();
    }
        //lo llamamos aqui por que al ser privado no podriamos usarlo de otra forma en otro sitios
    //creamos metodo privado para la interfaz principal
    
    private void iniciar(){
        //diseño del formulario ya no haria falta el del main de reproductor.s
        this.iz.setSize(500, 250);
        this.iz.setVisible(true);
        this.iz.setLocationRelativeTo(null);
    }
    
    
}
