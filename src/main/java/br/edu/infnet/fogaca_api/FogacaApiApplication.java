package br.edu.infnet.fogaca_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.infnet.fogaca_api.model.domain.*;
import br.edu.infnet.fogaca_api.ArquivoPacientes;

public class FogacaApiApplication {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        List<Paciente> listaPacientes = new ArrayList<>();
        boolean rodando = true;

        while (rodando) {

            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar paciente");
            System.out.println("2 - Listar pacientes");
            System.out.println("3 - Registrar consulta");
            System.out.println("4 - Salvar pacientes em arquivo");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");

            int opcao = in.nextInt();
            in.nextLine();

            try {

                switch (opcao) {

                    case 1:
                        System.out.print("Nome: ");
                        String nome = in.nextLine();

                        System.out.print("Idade: ");
                        int idade = in.nextInt();
                        in.nextLine();

                        System.out.print("Email: ");
                        String email = in.nextLine();

                        System.out.print("Telefone: ");
                        String telefone = in.nextLine();

                        Endereco end = new Endereco(
                                "Rua A", "Centro", "Cidade", "UF", "00000-000"
                        );

                        Paciente p = new Paciente(
                                nome, idade, email, telefone, true, end, Genero.OUTRO
                        );

                        listaPacientes.add(p);
                        System.out.println("Paciente cadastrado.");
                        break;

                    case 2:
                        for (Paciente pac : listaPacientes) {
                            System.out.println(pac);
                        }
                        break;

                    case 3:
                        System.out.print("Nome do paciente: ");
                        String busca = in.nextLine();
                        boolean achou = false;

                        for (Paciente pac : listaPacientes) {
                            if (pac.getNome().equalsIgnoreCase(busca)) {
                                pac.registrarConsulta();
                                System.out.println("Consulta registrada.");
                                achou = true;
                                break;
                            }
                        }

                        if (!achou) {
                            System.out.println("Paciente não encontrado.");
                        }
                        break;

                    case 4:
                        ArquivoPacientes.salvar(listaPacientes);
                        System.out.println("Pacientes salvos em arquivo.");
                        break;

                    case 5:
                        rodando = false;
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        in.close();
        System.out.println("Sistema finalizado.");
    }
}
