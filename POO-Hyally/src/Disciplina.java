/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brunoteodoro
 */
import java.util.List;

public class Disciplina {
    private String nome;
    private List<Aluno> alunos; 
    private List<Curso> cursos; 
    private Professor professor; 

    public Disciplina(String nome, List<Aluno> alunos, List<Curso> cursos, Professor professor) {
        this.nome = nome;
        this.alunos = alunos;
        this.cursos = cursos;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void imprimirConteudo() {
        System.out.println("Disciplina: " + nome);
        System.out.println("Alunos matriculados:");

        if (alunos != null) {
            for (Aluno aluno : alunos) {
                System.out.println("- " + aluno.getNome());
            }
        }

        System.out.println("Cursos associados:");
        if (cursos != null) {
            for (Curso curso : cursos) {
                System.out.println("- " + curso.getNome());
            }
        }

        System.out.println("Professor responsável: " + professor.getNome());
    }
}

