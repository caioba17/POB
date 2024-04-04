package br.escola;

public class Main {
    public static void main(String[] args) {

        String nome = "";
        String matricula = "";
        String cpf = "";
        String email = "";

        System.out.println("Hello world!");

        Aluno aluno = new Aluno();

        aluno.setNome("Fulano");
        aluno.setCpf("192.138.982-03");
        aluno.setEmail("fulano@gmail.com");
        aluno.setMatricula("252525");

        System.out.println(aluno.getNome());
        System.out.println(aluno.getCpf());
        System.out.println(aluno.getMatricula());
        System.out.println(aluno.getEmail());

        Disciplina disciplina = new Disciplina();

        disciplina.setNome("Programação Orientada a Objetos");
        disciplina.setSigla("POB");
        disciplina.setCargaHoraria("50 horas");
        disciplina.setSemestre("Terceiro semestre");

        System.out.println(disciplina.getNome());
        System.out.println(disciplina.getSigla());
        System.out.println(disciplina.getCargaHoraria());
        System.out.println(disciplina.getSemestre());

    }
}