package br.edu.infnet.fogaca_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.infnet.fogaca_api.model.domain.Paciente;
import br.edu.infnet.fogaca_api.model.domain.Endereco;

public class FogacaApiApplication {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        List<Paciente> listaPacientes = new ArrayList<>();
        boolean rodando = true;

        System.out.println("Sistema Proflex");

        while (rodando) {

            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1 - Cadastrar novo paciente");
            System.out.println("2 - Listar pacientes");
            System.out.println("3 - Buscar paciente por nome");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = in.nextInt();
            in.nextLine(); 

            if (opcao == 1) {

                System.out.println("\nCADASTRO DE PACIENTE");

                System.out.print("Nome: ");
                String nome = in.nextLine();

                System.out.print("Idade: ");
                int idade = in.nextInt();
                in.nextLine();

                System.out.print("Email: ");
                String email = in.nextLine();

                System.out.print("Telefone: ");
                String telefone = in.nextLine();

                System.out.print("Rua: ");
                String rua = in.nextLine();

                System.out.print("Bairro: ");
                String bairro = in.nextLine();

                System.out.print("Cidade: ");
                String cidade = in.nextLine();

                System.out.print("Estado (ex: RJ): ");
                String estado = in.nextLine();

                System.out.print("CEP: ");
                String cep = in.nextLine();

                if (nome.isEmpty() || idade <= 0) {
                    System.out.println("Cadastro inválido. Verifique os dados e tente novamente.");
                } else {
                    Endereco end = new Endereco(rua, bairro, cidade, estado, cep);
                    Paciente novo = new Paciente(nome, idade, email, telefone, true, end);
                    listaPacientes.add(novo);
                    System.out.println("Paciente cadastrado com sucesso!");
                }

            } else if (opcao == 2) {

                System.out.println("\n--- LISTA DE PACIENTES ---");
                if (listaPacientes.isEmpty()) {
                    System.out.println("Nenhum paciente cadastrado ainda.");
                } else {
                    for (Paciente p : listaPacientes) {
                        p.mostrarDados();
                    }
                }

            } else if (opcao == 3) {

                System.out.print("\nDigite o nome do paciente que deseja buscar: ");
                String busca = in.nextLine();
                boolean encontrado = false;

                for (Paciente p : listaPacientes) {
                    if (p.getNome().equalsIgnoreCase(busca)) {
                        System.out.println("Paciente encontrado:");
                        p.mostrarDados();
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Paciente não encontrado.");
                }

            } else if (opcao == 4) {
                System.out.println("Encerrando o sistema...");
                rodando = false;

            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        in.close();
        System.out.println("=== Sistema finalizado ===");
    }
}
