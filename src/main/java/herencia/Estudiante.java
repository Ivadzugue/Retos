package herencia;

public class Estudiante extends Persona {

    private String codEstdiante;
    private String curso;

    public Estudiante(){
    }

    public String getCodEstdiante() {
        return codEstdiante;
    }

    public void setCodEstdiante(String codEstdiante) {
        this.codEstdiante = codEstdiante;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
