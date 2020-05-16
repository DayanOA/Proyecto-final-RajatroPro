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
public class sobrepasoPorcentajeException extends Exception {

    double porcentaje;

    public sobrepasoPorcentajeException(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public String getMessage() {
        return "" + porcentaje;
    }
}
