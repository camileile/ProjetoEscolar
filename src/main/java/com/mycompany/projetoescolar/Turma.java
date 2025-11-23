package com.mycompany.projetoescolar;

import java.util.ArrayList; 
import java.util.List;

public class Turma { 

    private String identificador;
    private List<Aluno> alunos; 
    private String horario;
    private String local;
    private List<Professor> professores; 

   
    public Turma(String identificador, String horario, String local) {
        this.identificador = identificador;
        this.horario = horario;
        this.local = local;
        
   
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
    }



   
    public String getIdentificador() { 
        return identificador;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public String getHorario() {
        return horario;
    }

    public String getLocal() {
        return local;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

   
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setLocal(String local) {
        this.local = local;
    }



    public void definirLimiteDeAlunos() {
       
    }

    public void inserirProfessoresNaTurma(Professor professor) {
        professores.add(professor);
    }

    public void inserirAlunosNaTurma(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerProfessoresNaTurma(Professor professor) {
        professores.remove(professor);
    }

    public void removerAlunosNaTurma(Aluno aluno) {
        alunos.remove(aluno);
    }
}
