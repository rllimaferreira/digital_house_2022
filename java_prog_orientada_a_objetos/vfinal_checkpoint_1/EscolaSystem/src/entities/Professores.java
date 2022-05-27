package entities;

public class Professores extends Administracao {

    private String disciplina;
    private String notaProf;
    private String turmaProfessor;

    private boolean statusAluno;

    public Professores() {
    }

    public Professores(String matriculaAluno, String nomeAluno, String disciplina, String notaProf, String turmaProfessor, boolean statusAluno) {
        super(matriculaAluno, nomeAluno);
        this.disciplina = disciplina;
        this.notaProf = notaProf;
        this.turmaProfessor = turmaProfessor;
        this.statusAluno = statusAluno;

        this.getMatriculaAluno();
        this.getNomeAluno();
    }

    // Getters
    public String getDisciplina() {
        return disciplina;
    }

    public String getNotaProf() {
        return notaProf;
    }

    public String getTurmaProfessor() {
        return turmaProfessor;
    }

    public boolean isStatusAluno() {
        return statusAluno;
    }

    // Setters
    public void setStatusAluno(boolean statusAluno) {
        this.statusAluno = statusAluno;
    }

    @Override
    public String  toString() {
        return "Professores{" +
                "disciplina='" + disciplina + '\'' +
                ", notaProf='" + notaProf + '\'' +
                ", turmaProfessor='" + turmaProfessor + '\'' +
                ", statusAluno=" + statusAluno +
                '}';
    }
}

