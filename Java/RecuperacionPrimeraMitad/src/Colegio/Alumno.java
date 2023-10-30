package Colegio;

public class Alumno extends Persona {
    private double calificacion;

    public Alumno(double calificacion) {
        super();
        calificacion = MetodosSueltos.generarNumeroAleatorio(0, 10);
        super.setEdad(MetodosSueltos.generarNumeroAleatorio(12, 15));
        this.calificacion = calificacion;
    }

    @Override
    public void disponibilidad() {
        int prob = MetodosSueltos.generarNumeroAleatorio(0, 100);
        if (prob < 50) {
            super.setAsistencia(false);
        } else {
            super.setAsistencia(true);
        }
    }

    @Override
    public String toString() {
        return "Alumno: Nombre:" + super.getNombre() + " Sexo: " + super.getSexo() + "[calificacion=" + calificacion+"]";
    }

}