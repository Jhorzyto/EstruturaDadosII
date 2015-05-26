package Aula1;

public class Aluno {

    private String nome;
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, String mat) {

        this.nome = nome;
        this.matricula = mat;

    }

    public String toString() {
        return "Aluno{" + "nome=" + nome + ", matricula=" + matricula + '}';
    }
}
