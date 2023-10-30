package Colegio;

public class Profesor extends Persona {
    private String materia;

    public Profesor() {
    }

    public Profesor(String materia) {
        super();
        super.setEdad(MetodosSueltos.generarNumeroAleatorio(25, 50));
        this.materia = Constantes.MATERIAS[MetodosSueltos.generarNumeroAleatorio(0, 2)];
    }

    @Override
    public void disponibilidad() {
        int prob = MetodosSueltos.generarNumeroAleatorio(0, 100);
        if (prob < 20) {
            super.setAsistencia(false);
        } else {
            super.setAsistencia(true);
        }
    }

    @Override
    public String toString() {
        return "Profesor: Nombre:" + super.getNombre() + " Sexo: " + super.getSexo() + "[materia=" + materia
                + "]";
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

}