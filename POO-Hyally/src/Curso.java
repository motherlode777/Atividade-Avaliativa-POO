/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brunoteodoro
 */
import java.util.List;

public class Curso {
    private String nome;
    private List<Professor> professores; 

    public Curso(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public void imprimirConteudo() {
        System.out.println("Curso: " + nome);
        System.out.println("Professores associados:");

        if (professores != null) {
            for (Professor professor : professores) {
                System.out.println("- " + professor.getNome());
            }
        }
    }
}

