/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderConcreto;

import proyecto1.Materia;
import proyecto1.MateriaBuilder;

/**
 *
 * @author Tonny
 */
public class MateriaRedes extends MateriaBuilder{

    @Override
    public void porcentajeMateria() {
        System.out.println("Porcentaje");
    }

    @Override
    public void listaEstudiantes() {
        System.out.println("Estudiantes");
    }

    @Override
    public void listaCriterios() {
       System.out.println("criterios");
    }

    @Override
    public void nombre() {
        System.out.println("Sociales");
         materia.toString();
    }
    
}
