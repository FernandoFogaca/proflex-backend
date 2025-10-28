package br.edu.infnet.fogaca_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import br.edu.infnet.fogaca_api.model.domain.Paciente;
import br.edu.infnet.fogaca_api.model.domain.Endereco;
import java.util.Scanner;

@SpringBootApplication
public class FogacaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FogacaApiApplication.class, args);

        Endereco end1 = new Endereco("Rua das Flores", "Centro", "Campos", "RJ", "28000-000");
        Endereco end2 = new Endereco("Av. Brasil", "Copacabana", "Rio de Janeiro", "RJ", "22000-000");

        Paciente p1 = new Paciente("Luciana", 35, "luciana@proflex.com", "(22)2222-2325", true, end1);
        Paciente p2 = new Paciente("Carlos", 42, "carlos@proflex.com", "(11)9999-8888", false, end2);

        System.out.println("\n=== Pacientes já cadastrados ===");
        p1.mostrarDados();
        p2.mostrarDados();

        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== Novo Cadastro de Paciente ===");

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        if (nome.isEmpty()) {
            System.out.println("Nome não pode estar em branco.");
        }

        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        if (idade <= 0 || idade > 120) {
            System.out.println("Idade inválida. Deve estar entre 1 e 120.");
        } else if (idade < 18) {
            System.out.println("Paciente menor de idade.");
        }

        System.out.print("Email: ");
        String email = sc.nextLine();
        if (!email.contains("@") || !email.contains(".")) {
            System.out.println("Email inválido. Verifique o formato.");
        }

        System.out.print("Telefone: ");
        String telefone = sc.nextLine();
        if (telefone.length() < 8) {
            System.out.println("Telefone muito curto.");
        }

        System.out.print("O paciente está ativo? (true/false): ");
        boolean ativo = sc.nextBoolean();
        sc.nextLine();

        System.out.print("Rua: ");
        String rua = sc.nextLine();
        if (rua.isEmpty()) {
            System.out.println("Rua não pode estar vazia.");
        }

        System.out.print("Bairro: ");
        String bairro = sc.nextLine();
        if (bairro.isEmpty()) {
            System.out.println("Bairro é obrigatório.");
        }

        System.out.print("Cidade: ");
        String cidade = sc.nextLine();
        if (cidade.isEmpty()) {
            System.out.println("Cidade é obrigatória.");
        }

        System.out.print("Estado: ");
        String estado = sc.nextLine();
        if (estado.length() != 2) {
            System.out.println("Estado deve conter 2 letras (ex: RJ).");
        }

        System.out.print("CEP: ");
        String cep = sc.nextLine();
        if (cep.length() != 9) {
            System.out.println("CEP inválido. Use o formato 00000-000.");
        }

        Endereco endNovo = new Endereco(rua, bairro, cidade, estado, cep);
        Paciente novoPaciente = new Paciente(nome, idade, email, telefone, ativo, endNovo);

        System.out.println("\n--- Paciente cadastrado com sucesso ---");
        novoPaciente.mostrarDados();

        sc.close();
        System.out.println("\n=== Fim do programa ===");
    }
}
