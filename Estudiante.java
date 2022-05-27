package Colegio;

public class Estudiante {
    private String nombre;
    private int edad;
    private Curso[] curso;
    private int contador;

    Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

        this.curso = new Curso[3];
        this.contador = 0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    int getEdad() {
        return edad;
    }

    public void setCurso(Curso curso) {

        this.curso[this.contador++] = curso;
    }

    public Curso[] getCurso() {
        return curso;
    }
}
