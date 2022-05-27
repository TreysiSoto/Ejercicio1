package Colegio;

public class Matricula {
    private String semestre;
    private int codigo;
    private Estudiante[] estudiante;
    private int contador;

    public Matricula(String semestre, int codigo) {
        this.semestre = semestre;
        this.codigo = codigo;
        this.estudiante = new Estudiante[1];
        this.contador = 0;

    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante[this.contador] = estudiante;
        this.contador++;
    }

    public Estudiante[] getEstudiante() {
        return estudiante;
    }

}
