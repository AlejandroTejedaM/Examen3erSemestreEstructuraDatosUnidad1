package Contratos;

// @author 21TE0284 y 21TE0704
import Clases.Estudiante;
import java.util.List;

public interface IEstudianteArrayList {

    void AgregarEstudiante(Estudiante e);

    boolean BuscarEstudiante(String matricula);

    String ConocerEstatus(String matricula);

    void ActualizarEstudiante(int indice, Estudiante e);

    List<Estudiante> ConsultaEstudiante();

    Estudiante ObtenerEstudiante(String matricula);

    void Eliminar(Estudiante e);

    void Copiar(List<Estudiante> productos);

}
