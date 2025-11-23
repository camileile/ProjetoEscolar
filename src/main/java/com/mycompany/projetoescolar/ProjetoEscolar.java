package com.mycompany.projetoescolar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProjetoEscolar {

    public static void main(String[] args) {
        
        System.out.println("PROJETO ESCOLAR ");
        
        Escola minhaEscola = new Escola("Colegio Modelo", "Dr. Pedro Diretor");
        System.out.println("\n1. CRIANDO ESCOLA ");
        System.out.println("Escola criada: " + minhaEscola.getNome() + " (Diretor: " + minhaEscola.getDiretor() + ")");
        
        Aluno alunoMaria = new Aluno("Maria da Silva", "111.111.111-11", 16, "F", "Joao Roberto", "2024001");
        
        Professor profCarlos = new Professor("Prof. Carlos Matos", "222.222.222-22", 40, "M", 6000.00);
        
        Colaborador colaAna = new Colaborador("Ana Souza", "333.333.333-33", 35, "F", "Secretaria", 2500.00);
        
        Disciplina discMatematica = new Disciplina("Matematica", "Seg/Qua 10:00");
        Disciplina discPortugues = new Disciplina("Portugues", "Ter/Qui 08:00");
        
        Turma turma3A = new Turma("3A - Medio", "Manha", "Sala 301");
        
        System.out.println("\n METODOS DA ESCOLA (" + minhaEscola.getNome() + ")");
        
        minhaEscola.matricularAluno(alunoMaria);
        minhaEscola.orientarAluno(alunoMaria);

        minhaEscola.contratarProfessor(profCarlos);
        minhaEscola.suspenderProfessor(profCarlos);
        minhaEscola.demitirProfessor(profCarlos);
        minhaEscola.contratarProfessor(profCarlos);

        minhaEscola.contratarColaborador(colaAna);
        minhaEscola.definirEscalaColaborador(colaAna);
        minhaEscola.suspenderColaborador(colaAna);
        minhaEscola.demitirColaborador(colaAna);
        minhaEscola.contratarColaborador(colaAna);
        
        List<Professor> professoresMat = new ArrayList<>();
        professoresMat.add(profCarlos);
        discMatematica.setProfessores(professoresMat);
        
        turma3A.inserirAlunosNaTurma(alunoMaria);
        turma3A.inserirProfessoresNaTurma(profCarlos);
        
        alunoMaria.setTurma(turma3A);
        List<Disciplina> disciplinasMaria = Arrays.asList(discMatematica, discPortugues);
        alunoMaria.setDisciplinas(disciplinasMaria);
        
        System.out.println("\n METODOS DO ALUNO (" + alunoMaria.getNome() + ")");
        
        alunoMaria.consultarComprovanteMatricula();
        alunoMaria.consultarFrequencias();
        alunoMaria.consultarGradeDeHorario();
        alunoMaria.consultarHistorico();
        alunoMaria.verSuasNotas();
        
        System.out.println("\n METODOS DO PROFESSOR (" + profCarlos.getNome() + ")");
        
        profCarlos.verificarDisciplinas();
        profCarlos.verificarCronogramaDisciplinas();
        
        double[] notasAluno = {8.0, 7.5, 9.0, 8.5};
        profCarlos.inserirNotas(alunoMaria, notasAluno);
        
        profCarlos.colocarPresenca(alunoMaria);
        profCarlos.verificarPresenca(alunoMaria);
        profCarlos.definirSituacaoAcademica(alunoMaria);
        
        System.out.println("\nNotas de Maria apos inserir:");
        alunoMaria.verSuasNotas();
        
        System.out.println("\n METODOS DO COLABORADOR (" + colaAna.getNome() + ")");
        
        colaAna.baterPonto();
        colaAna.verificarEscalaDeTrabalho();
        
        System.out.println("\n METODOS DA DISCIPLINA E TURMA ");
        
        discMatematica.exibirGradeDeHorario();
        discMatematica.exibirProfessores();
        
        turma3A.definirLimiteDeAlunos();
        turma3A.removerAlunosNaTurma(alunoMaria);
        
        System.out.println("SISTEMA FINALIZADO");
    }
}
