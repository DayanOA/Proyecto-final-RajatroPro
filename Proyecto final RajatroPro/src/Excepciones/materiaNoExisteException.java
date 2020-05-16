/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Tonny
 */
public class materiaNoExisteException extends Exception {

    String nombreMateria;

    public materiaNoExisteException(String nombreMateria) {
        this.nombreMateria = nombreMateria;

    }

    @Override
    public String getMessage() {
        return " " + nombreMateria;
    }
}
