/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptosbasicos;

import ico.fes.Automovil;
import java.awt.Color;

/**
 *
 * @author carlos
 */
public class ConceptosBasicos { //Conceptos basicos es el cliente y hace uso de nuestros objetos y metodos

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // ctrl + space = import
        Automovil miBocho = new Automovil(); // nuevo objeto
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedan"); //Atributos
        miBocho.setModelo(1970);
        miBocho.setColor(Color.blue);
        // Primer objeto
        
        System.out.println(miBocho);
        
        // Tarea = programar los objetos miAkura y miMustang
        
        Automovil miAkura = new Automovil();
        
    }
    
}
