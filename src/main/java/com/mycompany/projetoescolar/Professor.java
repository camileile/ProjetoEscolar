package com.mycompany.projetoescolar;


import java.util.ArrayList; 
import java.util.List;

public class Professor {

    private String nome;
    private String cpf;
    private int idade;
    private String genero;
    private double salario;

    private List<Disciplina> disciplinas;
    private List<Turma> turmas;
    private List<Aluno> alunos;

   
    public Professor(String nome, String cpf, int idade, String genero, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
        this.salario = salario;
        
        
        this.disciplinas = new ArrayList<>();
        this.turmas = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }


    
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public String getGenero() {
        return genero;
    }

    public double getSalario() {
        return salario;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

 
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }


    public void verificarDisciplinas() {
        System.out.println("Disciplinas ministradas por " + nome + ":");
        
    }

    public void inserirNotas(Aluno aluno, double[] notas) {
        
        aluno.setNotas(notas); 
        System.out.println("Notas inseridas para o aluno " + aluno.getNome());
    }

    public void colocarPresenca(Aluno aluno) {
        System.out.println("Presença registrada para o aluno " + aluno.getNome());
    }

    public void verificarCronogramaDisciplinas() {
        System.out.println("Verificando cronograma de aulas...");
    }

    public void verificarPresenca(Aluno aluno) {
        System.out.println("Verificando frequencia do aluno " + aluno.getNome());
    }

    public void definirSituacaoAcademica(Aluno aluno) {
        System.out.println("Situação academica de " + aluno.getNome() + " definida.");
    }
}
