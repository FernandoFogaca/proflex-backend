package br.edu.infnet.fogaca_api.model.domain;

public class Paciente extends Pessoa {

    private static int contadorProntuario = 1;

    private final String prontuario;
    private String email;
    private String telefone;
    private boolean ativo;
    private Endereco endereco;
    private Genero genero;
    private int consultasRealizadas;

    public Paciente(String nome, int idade, String email, String telefone,
                    boolean ativo, Endereco endereco, Genero genero) {

        super(nome, idade);

        this.prontuario = gerarProntuario();
        this.email = email;
        this.telefone = telefone;
        this.ativo = ativo;
        this.endereco = endereco;
        this.genero = genero;
        this.consultasRealizadas = 0;
    }

    private static String gerarProntuario() {
        return String.format("PCT-%03d", contadorProntuario++);
    }

    public String getProntuario() {
        return prontuario;
    }

    public void registrarConsulta() {
        consultasRealizadas++;
    }

    public boolean emailValido() {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email inválido");
        }
        return email.contains("@");
    }

    @Override
    public void mostrarDados() {
        System.out.println("Prontuário: " + prontuario);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Ativo: " + ativo);
        System.out.println("Gênero: " + genero);
        System.out.println("Consultas realizadas: " + consultasRealizadas);

        if (endereco != null) {
            endereco.mostrarEndereco();
        }
    }

    @Override
    public String toString() {
        return prontuario + " - " + nome + " (" + idade + " anos)";
    }
}
