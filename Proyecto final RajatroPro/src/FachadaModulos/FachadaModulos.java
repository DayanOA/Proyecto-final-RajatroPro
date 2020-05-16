/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FachadaModulos;
import Excepciones.materiaNoExisteException;
import proyecto1.MateriaBuilder;
import proyecto1.Registro;

/**
 *
 * @author Tonny
 */
public class FachadaModulos {
    
    public Registro fachadaregistro;
    
    public FachadaModulos(){
        
        this.fachadaregistro = new Registro();
    }
    
    public void inicioMetodos(MateriaBuilder a,String MateriaEstudiante, String NombreAgregar,String NombreElemento, String MateriaElemento, double Porcentaje,
            String ElementoCaificar, String MateriaCalificar, String EstudianteCalificar, double nota,String NombreNota, String MateriaNota,String MateriaPromedio) 
            throws materiaNoExisteException{
    
        fachadaregistro.crearMateria(a, "");
        fachadaregistro.crearEstudiante(MateriaEstudiante, NombreAgregar);
        fachadaregistro.agregarElemento(NombreElemento, MateriaElemento, Porcentaje);
        fachadaregistro.evaluarEstudiante(ElementoCaificar, MateriaCalificar, EstudianteCalificar, nota);
        fachadaregistro.DarNotaFinal(NombreNota, MateriaNota);
        fachadaregistro.DarInformacionFinal(MateriaPromedio);
                
    
    }
    
}
