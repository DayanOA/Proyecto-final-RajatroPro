/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.ArrayList;

/**
 *
 * @author Tonny
 */
public class Estudiante {

    String nombre;
    ArrayList<Nota> notas = new ArrayList<>();
    ArrayList<notaIdeal> notasIdealea = new ArrayList<>();

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public double calculaNota() {
        double notaCalculada = 0;
        double notaIdealCalculada = 0;

        for (int i = 0; i < notas.size(); i++) {
            notaCalculada = notaCalculada + notas.get(i).valor;
        }
        for (int i = 0; i < notasIdealea.size(); i++) {
            notaIdealCalculada = notaIdealCalculada + notasIdealea.get(i).nota;
        }
        return (notaCalculada * 50) / notaIdealCalculada;
    }

}
