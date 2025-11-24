package com.mycompany.projetoescolar;


public class Colaborador { 
    
    private String nome;
    private String cpf;
    private int idade;
    private String genero;
    private String cargo;
    private double salario;

    
    public Colaborador(String nome, String cpf, int idade, String genero, String cargo, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
        this.cargo = cargo;
        this.salario = salario;
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

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
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

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    

    public void verificarEscalaDeTrabalho() {
        // Corrigi a concatenação de strings para adicionar um espaço
        System.out.println("Escala do colaborador " + nome + " ainda não definida."); 
    }

    public void baterPonto() {
        System.out.println(nome + " bateu o ponto com sucesso.");
    }
}
