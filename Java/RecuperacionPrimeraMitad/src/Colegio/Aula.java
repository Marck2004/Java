package Colegio;

public class Aula {
    private int id;
    private String materia;
    private Profesor profesor;
    private Alumno[] alumnos;

   

    public Aula(int id, String materia, Profesor profesor, Alumno[] alumnos) {
        this.id = id;
        this.materia = materia;
        this.profesor = new Profesor();
        this.alumnos = alumnos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEstudiantesMax() {
        return estudiantesMax;
    }

    public void setEstudiantesMax(int estudiantesMax) {
        this.estudiantesMax = estudiantesMax;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

}