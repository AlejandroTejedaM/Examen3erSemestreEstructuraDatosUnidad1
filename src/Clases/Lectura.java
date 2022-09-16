package Clases;

import Contratos.ILectura;
import java.io.BufferedReader;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
// @author 21TE0284 y 21TE0704

public class Lectura implements ILectura {

    File archivo;
    FileReader fr;
    BufferedReader br;

    @Override
    public void DefinirPath(String path) {
        try {
            archivo = new File(path);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Estudiante> ObtenerEstudiantesArrayList() {
        List<Estudiante> listaTemp = new ArrayList();
        try {
            String fila = "", temp = "";
            while ((temp = br.readLine()) != null) {
                fila = temp;
                String[] estudianteArray = fila.split(",");

                String id = estudianteArray[0];
                String nombre = estudianteArray[1];
                byte calificacion = Byte.parseByte(estudianteArray[2]);

                Estudiante p = new Estudiante(id, nombre, calificacion);
                listaTemp.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaTemp;
    }

    @Override
    public void CerrarArchivo() {
        try {
            fr.close();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
