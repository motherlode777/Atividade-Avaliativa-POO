/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brunoteodoro
 */

import java.util.List;
import java.util.Arrays;

public class Aluno extends Pessoa {
    private double[] notas;
    private List<Curso> cursos;

    public Aluno(String nome, String cpf, String email, telefone telefone, Endereco endereco, double[] notas) {
        super(nome, cpf, email, telefone, endereco);
        this.notas = notas;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public void imprimir() {
        System.out.println("Aluno: " + getNome());
        System.out.println("Notas: " + Arrays.toString(notas));
        System.out.println("Cursos matriculados:");

        if (cursos != null) {
            for (Curso curso : cursos) {
                System.out.println("- " + curso.getNome());
            }
        }
    }
}


