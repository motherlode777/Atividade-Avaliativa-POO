/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brunoteodoro
 */
import java.util.List;

public class Professor extends Pessoa {
    private Double salario;
    private List<Curso> cursos; 

    public Professor(String nome, String cpf, String email, telefone telefone, Endereco endereco, Double salario) {
        super(nome, cpf, email, telefone, endereco);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public void imprimir() {
        System.out.println("Professor: " + getNome());
        System.out.println("Salário: " + salario);

        System.out.println("Cursos associados:");
        if (cursos != null) {
            for (Curso curso : cursos) {
                System.out.println("- " + curso.getNome());
            }
        }
    }
}
