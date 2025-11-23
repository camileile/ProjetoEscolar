package com.mycompany.projetoescolar;

import java.util.List;

public class Aluno { 

    private String nome;
    private String cpf;
    private int idade;
    private String genero;
    private String responsavel;
    private double[] notas = new double[4];
    private String matricula;

    
    private List<Disciplina> disciplinas; 
    private Turma turma;

   
    public Aluno(String nome, String cpf, int idade, String genero, String responsavel, String matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
        this.responsavel = responsavel;
        this.matricula = matricula;
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

    public String getResponsavel() {
        return responsavel;
    }

    public double[] getNotas() {
        return notas;
    }

    public String getMatricula() {
        return matricula;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public Turma getTurma() {
        return turma;
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

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    

    public void verSuasNotas() {
        System.out.println("Notas de " + nome + ":");
        for (double n : notas) {
            System.out.println(n);
        }
    }

    public void consultarFrequencias() {
        System.out.println("Frequências do aluno " + nome + ":");
        if (disciplinas == null) {
            System.out.println("Nenhuma disciplina cadastrada.");
            return;
        }
        for (Disciplina d : disciplinas) {
            System.out.println(d.getNome() + ": frequência não registrada."); 
        }
    }

    public void consultarHistorico() {
        System.out.println("Histórico de " + nome + ":");
    }

    public void consultarComprovanteMatricula() {
        System.out.println("COMPROVANTE DE MATRÍCULA");
        System.out.println("Aluno: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Responsável: " + responsavel);
        System.out.println("Turma: " + (turma != null ? turma.getIdentificador() : "Nenhuma")); 
    }

    public void consultarGradeDeHorario() {
        System.out.println("Grade de Horários de " + nome + ":");
        
    }
}
