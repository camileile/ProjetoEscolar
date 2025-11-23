package com.mycompany.projetoescolar;

import java.util.ArrayList; 
import java.util.List;

public class Disciplina { 
    
    private String nome;
    private String horario;

    
    private List<Professor> professores; 
    private List<Turma> turmas;
    private List<Aluno> alunos; 

    
    public Disciplina(String nome, String horario) {
        this.nome = nome;
        this.horario = horario;
        
        
        this.professores = new ArrayList<>();
        this.turmas = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }



    
    public String getNome() { 
        return nome;
    }

    public String getHorario() {
        return horario;
    }

    public List<Professor> getProfessores() {
        return professores;
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

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }



    public void exibirGradeDeHorario() {
        System.out.println("Disciplina: " + nome + " - Horário: " + horario);
        
    }

    public void exibirProfessores() {
        System.out.println("Professores da disciplina " + nome + ":");
        if (professores.isEmpty()) {
            System.out.println("Nenhum professor cadastrado.");
            return;
        }
        for (Professor p : professores) {
             
            System.out.println("- " + p.getNome()); 
        }
    }
}

