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
public class crearMateria {
    private MateriaBuilder materiaBuilder;
    
    public crearMateria(){
    }

    public Materia getMateria() {
        return materiaBuilder.getMateria();
    }

    public void setMateriaBuilder(MateriaBuilder mb) {
        this.materiaBuilder = mb;
    }
    
    
    public void ConstruirMateria(String materia){
        materiaBuilder.crearNuevaMateria();
        materiaBuilder.getMateria().nombre = materia;
        //materiaBuilder.porcentajeMateria();
        //materiaBuilder.listaCriterios();
        //materiaBuilder.listaEstudiantes();
        materiaBuilder.nombre();    
    
    }
    
}
