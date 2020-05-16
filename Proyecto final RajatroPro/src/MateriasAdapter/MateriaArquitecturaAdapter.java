/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MateriasAdapter;
import BuilderConcreto.MateriaArquitectura;

/**
 *
 * @author Tonny
 */
public class MateriaArquitecturaAdapter extends MateriaAdapter {
    
    final MateriaArquitectura arquitectura = new MateriaArquitectura();

    @Override
    public void creacionAdapter() {
        arquitectura.nombre();
        arquitectura.listaCriterios();
        arquitectura.listaEstudiantes();
        arquitectura.porcentajeMateria();
    }
    
}
