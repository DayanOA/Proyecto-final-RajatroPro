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
public class criterioNoExisteException extends Exception {

    String nombreCriterio;

    public criterioNoExisteException(String nombreCriterio) {
        this.nombreCriterio = nombreCriterio;

    }

    @Override
    public String getMessage() {
        return " " + nombreCriterio;
    }
}
