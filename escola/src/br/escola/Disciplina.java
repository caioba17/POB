package br.escola;

public class Disciplina {
    private String nome;
    private String sigla;
    private String cargaHoraria;
    private String semestre;

    public Disciplina(String nome, String sigla, String cargaHoraria, String semestre) {
        this.nome = nome;
        this.sigla = sigla;
        this.cargaHoraria = cargaHoraria;
        this.semestre = semestre;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public String getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public String getSemestre() {
        return semestre;
    }
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
}

