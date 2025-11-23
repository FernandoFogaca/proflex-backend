package br.edu.infnet.fogaca_api.model.domain;

public class Paciente {

    private static int contadorProntuario = 1;

    private String prontuario;
    private String nome;
    private int idade;
    private String email;
    private String telefone;
    private boolean ativo;
    private Endereco endereco;
    private Genero genero;
    private int consultasRealizadas;

    public Paciente() {
        this.prontuario = gerarProntuario();
    }

    private static String gerarProntuario() {
        String codigo = String.format("PCT-%03d", contadorProntuario);
        contadorProntuario++;
        return codigo;
    }

    public Paciente(String nome, int idade, String email, String telefone, boolean ativo, Endereco endereco, Genero genero) {
        this.prontuario = gerarProntuario();
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
        this.ativo = ativo;
        this.endereco = endereco;
        this.genero = genero;
        this.consultasRealizadas = 0;
    }

    public String getProntuario() {
        return prontuario;
    }

    public String getNome() {
        return nome;
    }

    public int getConsultasRealizadas() {
        return consultasRealizadas;
    }

    public void registrarConsulta() {
        consultasRealizadas++;
    }

    public boolean emailValido() {
        if (email == null) {
            return false;
        }
        return email.contains("@") && email.contains(".");
    }

    public void resumoRapido() {
        System.out.println(prontuario + " - " + nome + " (" + idade + " anos, " + genero + ")");
    }

    public void mostrarDados() {
        System.out.println("Prontuário: " + prontuario);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Ativo: " + ativo);
        System.out.println("Gênero: " + genero);
        System.out.println("Consultas realizadas: " + consultasRealizadas);
        System.out.println("--- Endereço ---");
        if (endereco != null) {
            endereco.mostrarEndereco();
        }
        System.out.println("---------------------------");
    }
}
