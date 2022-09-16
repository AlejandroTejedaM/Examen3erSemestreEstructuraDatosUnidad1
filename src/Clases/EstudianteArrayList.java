package Clases;

// @author 21TE0284 y 21TE0704
import Contratos.IEstudianteArrayList;
import java.util.ArrayList;
import java.util.List;

public class EstudianteArrayList implements IEstudianteArrayList {

    List<Estudiante> estudiante;

    public EstudianteArrayList() {
        estudiante = new ArrayList<>();
    }

    @Override
    public void AgregarEstudiante(Estudiante e) {
        estudiante.add(e);
    }

    @Override
    public boolean BuscarEstudiante(String matricula) {
        boolean semaforo = false;
        for (Estudiante estudiante : estudiante) {
            if (estudiante.getMatricula().equalsIgnoreCase(matricula)) {
                semaforo = true;
                break;
            }
        }
        return semaforo;
    }

    @Override
    public String ConocerEstatus(String matricula) {
        String estatus = "";
        for (Estudiante estudiante : estudiante) {
            if (estudiante.getMatricula().equalsIgnoreCase(matricula)) {
                estatus = estudiante.getEstatus();
                break;
            }
        }
        return estatus;
    }

    @Override
    public List<Estudiante> ConsultaEstudiante() {
        return estudiante;
    }

    @Override
    public Estudiante ObtenerEstudiante(String matricula) {
        Estudiante e = null;
        for (Estudiante estudiante : estudiante) {
            if (estudiante.getMatricula().equalsIgnoreCase(matricula)) {
                e = estudiante;
                break;
            }
        }
        return e;
    }

    @Override
    public void ActualizarEstudiante(int indice, Estudiante e) {

        estudiante.set(indice, e);
    }

    @Override
    public void Eliminar(Estudiante e) {
        estudiante.remove(e);
    }

    @Override
    public void Copiar(List<Estudiante> estudiante) {
        this.estudiante = estudiante;
    }

}
