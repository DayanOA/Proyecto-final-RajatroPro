/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author Tonny
 */
public abstract class MateriaBuilder {
    
    protected Materia materia;

    public Materia getMateria() {
        return materia;
    }

    public void crearNuevaMateria() {
         materia = new Materia();
    }
    
    public abstract void nombre();
    public abstract void porcentajeMateria();
    public abstract void listaEstudiantes();
    public abstract void listaCriterios();
}
