package Clases;

// @author 21TE0284 y 21TE0704
public class Estudiante {

    private String matricula;
    private String nombre;
    private byte calificacion;
    private String estatus;

    public Estudiante(String matricula, String nombre,
            byte calificacion) {
        setMatricula(matricula);
        setNombre(nombre);
        setCalificacion(calificacion);
        setEstatus(calificacion);
    }

    @Override
    public String toString() {
        return matricula + "," + nombre + "," + calificacion + "," + estatus;
    }

    public String InfoEstudiante() {
        return "Matricula: " + getMatricula()
                + " Nombre: " + getNombre() + " Calificacion: " + getCalificacion()
                + " Estatus: " + getEstatus() + "\n";
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(byte calificacion) {
        if (calificacion == 100) {
            this.estatus = "Excelente";
        } else {
            if (calificacion >= 70 && calificacion <= 99) {
                this.estatus = "Bueno";
            } else {
                this.estatus = "Reprobado";
            }

        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(byte calificacion) {
        this.calificacion = calificacion >= 0 && calificacion <= 100 ? calificacion : null;
    }

}
