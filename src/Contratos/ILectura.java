package Contratos;

// @author 21TE0284 y 21TE0704
import Clases.Estudiante;
import java.util.List;

public interface ILectura {

    void DefinirPath(String path);

    List<Estudiante> ObtenerEstudiantesArrayList();

    void CerrarArchivo();
}
