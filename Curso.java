package Colegio;

public class Curso {
    private String nombre;

    private Docente[] docente;
    private int contador;

    Curso(String nombre) {

        this.nombre = nombre;
        this.docente = new Docente[2];
        this.contador = 0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    String getNombre() {
        return nombre;
    }

    public void setDocente(Docente docente) {

        this.docente[this.contador] = docente;

        this.contador++;
    }

    public Docente[] getDocente() {
        return docente;
    }

}
