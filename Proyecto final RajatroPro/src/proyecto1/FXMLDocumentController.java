/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import BuilderConcreto.MateriaRedes;
import BuilderConcreto.MateriaArquitectura;
import Excepciones.materiaNoExisteException;
import FachadaModulos.FachadaModulos;
import MateriasAdapter.MateriaArquitecturaAdapter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import static proyecto1.Registro.NOTAFINAL;
import static proyecto1.Registro.PROMEDIO;

/**
 *
 * @author Tonny
 */
public class FXMLDocumentController implements Initializable {

   //Registro registro = new Registro();
    FachadaModulos fregistro = new FachadaModulos();
    

    @FXML
    private TextField Curso;
    @FXML
    private TextField MateriaPromedio;
    @FXML
    private TextArea AreaCursos;
    @FXML
    private TextField MateriaLista;
    @FXML
    private TextArea AreaEstudiantes;
    @FXML
    private TextArea AreaNormalizar;
    @FXML
    private TextField MateriaNormalizar;
    @FXML
    private TextField NombreNota;
    @FXML
    private TextField MateriaNota;
    @FXML
    private TextField Nota;
    @FXML
    private TextField NotaFinal;
    @FXML
    private TextField MateriaEstudiante;
    @FXML
    private TextField NombreAgregar;
    @FXML
    private TextField MateriaCalificar;
    @FXML
    private TextField EstudianteCalificar;
    @FXML
    private TextField ElementoCaificar;
    @FXML
    private TextField NombreElemento;
    @FXML
    private TextField MateriaElemento;
    @FXML
    private TextField Porcentaje;
    @FXML
    private TextField Promedio;
    @FXML
    private TextField Desviacion;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void AgregarCurso(ActionEvent event) {
       // registro.crearMateria(Curso.getText());
        switch(Curso.getText().trim()){
            case "Español":{
                fregistro.fachadaregistro.crearMateria(new MateriaArquitectura(), Curso.getText().trim());
             //   fregistro.fachadaregistro.crearMateria(new MateriaArquitecturaAdapter()., Curso.getText().trim());
                break;
            }
            
            case "Sociales":{
                fregistro.fachadaregistro.crearMateria(new MateriaRedes(), Curso.getText().trim());
                break;
            }
            default:{
                System.out.println("fallo");
            }
        }
        AreaCursos.setText(AreaCursos.getText() + "\n" + Curso.getText());
        Curso.clear();
    }

    @FXML
    private void AgregarEstudiante(ActionEvent event) {
        try {
            fregistro.fachadaregistro.crearEstudiante(MateriaEstudiante.getText(), NombreAgregar.getText());
        } catch (materiaNoExisteException ex) {
            JOptionPane.showMessageDialog(null, "La materia" + ex.getMessage() + " no existe");
        }
        MateriaEstudiante.clear();
        NombreAgregar.clear();
    }

    @FXML
    private void AgregarElemento(ActionEvent event) {
        double porcentaje = Integer.parseInt(Porcentaje.getText());
        try {
            fregistro.fachadaregistro.agregarElemento(NombreElemento.getText(), MateriaElemento.getText(), porcentaje);
        } catch (materiaNoExisteException ex) {
            JOptionPane.showMessageDialog(null, "La materia" + ex.getMessage() + " no existe");
        }
        NombreElemento.clear();
        MateriaElemento.clear();
        Porcentaje.clear();
    }

    @FXML
    private void MostrarListaEstudiantes(ActionEvent event) {
        mostrarEstudiantes(MateriaLista.getText());
        MateriaLista.clear();
    }

    @FXML
    private void VerNormalizacion(ActionEvent event) {

    }

    @FXML
    private void NotaFinal(ActionEvent event) {

        try {
            fregistro.fachadaregistro.DarNotaFinal(NombreNota.getText(), MateriaNota.getText());
        } catch (materiaNoExisteException ex) {
            JOptionPane.showMessageDialog(null, "La materia " + ex.getMessage() + " no existe");
        }
        NotaFinal.setText("" + NOTAFINAL);
    }

    @FXML
    private void EvaluarEstudiante(ActionEvent event) {
        double nota = Integer.parseInt(Nota.getText());
        try {
            fregistro.fachadaregistro.evaluarEstudiante(ElementoCaificar.getText(), MateriaCalificar.getText(), EstudianteCalificar.getText(), nota);
        } catch (materiaNoExisteException ex) {
            JOptionPane.showMessageDialog(null, "La materia " + ex.getMessage() + " no existe.");
        }
        ElementoCaificar.clear();
        MateriaCalificar.clear();
        EstudianteCalificar.clear();
        Nota.clear();
    }

    void mostrarEstudiantes(String MateriaLista) {
        int contador = 0;

        for (int i = 0; i < fregistro.fachadaregistro.materias.size(); i++) {
            if (MateriaLista.equals(fregistro.fachadaregistro.materias.get(i).nombre)) {
                darEstudiantes(fregistro.fachadaregistro.materias.get(i));
                contador++;
            }
        }

    }

    void darEstudiantes(Materia materia) {
        AreaEstudiantes.clear();
        for (int i = 0; i < materia.listaEstudiantes.size(); i++) {

            AreaEstudiantes.setText(AreaEstudiantes.getText() + "\n" + materia.listaEstudiantes.get(i));
        }

    }

    @FXML
    private void InformacionTotal(ActionEvent event) {
        fregistro.fachadaregistro.DarInformacionFinal(MateriaPromedio.getText());
        Promedio.setText("" + PROMEDIO);
    }
}
