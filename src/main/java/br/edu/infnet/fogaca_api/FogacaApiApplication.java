package br.edu.infnet.fogaca_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.infnet.fogaca_api.model.domain.Endereco;
import br.edu.infnet.fogaca_api.model.domain.Genero;
import br.edu.infnet.fogaca_api.model.domain.Paciente;

public class FogacaApiApplication {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        List<Paciente> listaPacientes = new ArrayList<>();
        boolean rodando = true;

        System.out.println("Sistema Proflex");

        while (rodando) {

            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1 - Cadastrar novo paciente");
            System.out.println("2 - Listar pacientes (resumo)");
            System.out.println("3 - Buscar paciente por nome");
            System.out.println("4 - Registrar nova consulta");
            System.out.println("5 - Sair");
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

                System.out.print("Gênero (M/F/O): ");
                String generoDigitado = in.nextLine().trim().toUpperCase();
                Genero genero = Genero.OUTRO;
                if (generoDigitado.equals("M")) {
                    genero = Genero.MASCULINO;
                } else if (generoDigitado.equals("F")) {
                    genero = Genero.FEMININO;
                }

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
                    Paciente novo = new Paciente(nome, idade, email, telefone, true, end, genero);

                    if (!novo.emailValido()) {
                        System.out.println("Aviso: o email parece inválido.");
                    }

                    listaPacientes.add(novo);
                    System.out.println("Paciente cadastrado com sucesso!");
                    System.out.println("Prontuário gerado: " + novo.getProntuario());
                }

            } else if (opcao == 2) {

                System.out.println("\n--- LISTA DE PACIENTES ---");
                if (listaPacientes.isEmpty()) {
                    System.out.println("Nenhum paciente cadastrado ainda.");
                } else {
                    for (Paciente p : listaPacientes) {
                        p.resumoRapido();
                        System.out.println("Consultas: " + p.getConsultasRealizadas());
                        System.out.println("---------------------------");
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

                System.out.print("\nDigite o nome do paciente para registrar consulta: ");
                String busca = in.nextLine();
                boolean encontrado = false;

                for (Paciente p : listaPacientes) {
                    if (p.getNome().equalsIgnoreCase(busca)) {
                        p.registrarConsulta();
                        System.out.println("Consulta registrada para o paciente " + p.getNome());
                        System.out.println("Total de consultas: " + p.getConsultasRealizadas());
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Paciente não encontrado.");
                }

            } else if (opcao == 5) {
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
