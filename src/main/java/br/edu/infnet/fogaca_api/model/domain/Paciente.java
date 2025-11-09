package br.edu.infnet.fogaca_api.model.domain;

public class Paciente {

    String nome;
    int idade;
    String email;
    String telefone;
    boolean ativo;
    Endereco endereco; 

    public Paciente(String nome, int idade, String email, String telefone, boolean ativo, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
        this.ativo = ativo;
        this.endereco = endereco;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Ativo: " + ativo);
        System.out.println("--- Endereço ---");
        endereco.mostrarEndereco();
        System.out.println("---------------------------");
    }

    public String getNome() {
        return nome;
    }
}
