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
public class Materia {

    double totalPorcentaje;
    protected String nombre;
    ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    ArrayList<Criterio> listaCriterios = new ArrayList<>();
    
//      public Materia(String nombre) {
//        this.nombre = nombre;
//    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTotalPorcentaje(double totalPorcentaje) {
        this.totalPorcentaje = totalPorcentaje;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public void setListaCriterios(ArrayList<Criterio> listaCriterios) {
        this.listaCriterios = listaCriterios;
    }

    @Override
    public String toString() {
        return "Materia{" + "nombre=" + nombre + '}';
    }
    

}
