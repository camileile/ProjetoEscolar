package com.mycompany.projetoescolar;

import java.util.ArrayList; 
import java.util.List;

public class Escola { 

   
    private List<Professor> professores; 
    private List<Turma> turmas;
    private List<Aluno> alunos;
    private List<Colaborador> colaboradores;
    
    private String nome;
    private String diretor;

   
    public Escola(String nome, String diretor) {
        this.nome = nome;
        this.diretor = diretor;
        
        
        this.professores = new ArrayList<>();
        this.turmas = new ArrayList<>();
        this.alunos = new ArrayList<>();
        this.colaboradores = new ArrayList<>();
    }


    
   
    public String getNome() {
        return nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }



    public void matricularAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno " + aluno.getNome() + " matriculado na escola " + nome);
    }

    public void expulsarAluno(Aluno aluno) {
        alunos.remove(aluno);
        System.out.println("Aluno " + aluno.getNome() + " removido do cadastro");
    }

    public void orientarAluno(Aluno aluno) {
        System.out.println("Orientação fornecida ao aluno " + aluno.getNome() + ".");
    }

    public void contratarProfessor(Professor professor) {
        professores.add(professor);
        System.out.println("Professor " + professor.getNome() + " contratado");
    }

    public void demitirProfessor(Professor professor) {
        professores.remove(professor);
        System.out.println("Professor " + professor.getNome() + " demitido");
    }

    public void suspenderProfessor(Professor professor) {
        System.out.println("Professor " + professor.getNome() + " suspenso");
    }

    public void contratarColaborador(Colaborador colaborador) {
        colaboradores.add(colaborador);
        System.out.println("Colaborador " + colaborador.getNome() + " contratado");
    }

    public void demitirColaborador(Colaborador colaborador) {
        colaboradores.remove(colaborador);
        System.out.println("Colaborador " + colaborador.getNome() + " demitido");
    }

    public void suspenderColaborador(Colaborador colaborador) {
        System.out.println("Colaborador " + colaborador.getNome() + " suspenso");
    }

    public void definirEscalaColaborador(Colaborador colaborador) {
        System.out.println("Escala definida para o colaborador " + colaborador.getNome());
    }
}
