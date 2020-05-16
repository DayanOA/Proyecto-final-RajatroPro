/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MateriasAdapter;

import BuilderConcreto.MateriaRedes;

/**
 *
 * @author Tonny
 */
public class MateriaRedesAdapter extends MateriaAdapter{
    
   final MateriaRedes redes = new MateriaRedes();

    @Override
    public void creacionAdapter() {
        redes.nombre();
        redes.listaCriterios();
        redes.listaEstudiantes();
        redes.porcentajeMateria();
    }
}
