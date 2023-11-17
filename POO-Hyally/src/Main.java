/**
 *
 * @author brunoteodoro
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Telefone e Endereco para serem usadas posteriormente
        telefone telefoneProfessor = new telefone("celular ", "61","123456789");
        Endereco enderecoProfessor = new Endereco("Rua Professor, 123", "Cidade", "Estado");

        // Criando instância de Professor
        Professor professor = new Professor("Prof. Silva", "123.456.789-01", "prof.silva@email.com", telefoneProfessor, enderecoProfessor, 5000.0);

        // Criando instância de Curso
        Curso curso = new Curso("Programação Java");

        // Adicionando o professor ao curso
        curso.setProfessores(Arrays.asList(professor));

        // Criando instância de Aluno
        telefone telefoneAluno = new telefone(" ", "61",  "987654321");
        Endereco enderecoAluno = new Endereco("Rua Aluno, 456", "Cidade", "Estado");
        Aluno aluno = new Aluno("Aluno Silva", "789.012.345-67", "aluno.silva@email.com", telefoneAluno, enderecoAluno, new double[]{8.5, 9.0, 7.5});

        // Criando instância de Disciplina
        Disciplina disciplina = new Disciplina("Java Avançado", Arrays.asList(aluno), Arrays.asList(curso), professor);

        // Imprimindo informações das classes
        System.out.println("--- Informações do Professor ---");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Salário: " + professor.getSalario());
        System.out.println();

        System.out.println("--- Informações do Curso ---");
        System.out.println("Nome do Curso: " + curso.getNome());
        System.out.println("Professores associados:");
        if (curso.getProfessores() != null) {
            for (Professor prof : curso.getProfessores()) {
                System.out.println("- " + prof.getNome());
            }
        }
        System.out.println();

        System.out.println("--- Informações do Aluno ---");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Notas: " + Arrays.toString(aluno.getNotas()));
        System.out.println();

        System.out.println("--- Informações da Disciplina ---");
        System.out.println("Nome da Disciplina: " + disciplina.getNome());
        System.out.println("Alunos matriculados:");
        if (disciplina.getAlunos() != null) {
            for (Aluno a : disciplina.getAlunos()) {
                System.out.println("- " + a.getNome());
            }
        }
        System.out.println("Cursos associados:");
        if (disciplina.getCursos() != null) {
            for (Curso c : disciplina.getCursos()) {
                System.out.println("- " + c.getNome());
            }
        }
        System.out.println("Professor responsável: " + disciplina.getProfessor().getNome());
    }
}

