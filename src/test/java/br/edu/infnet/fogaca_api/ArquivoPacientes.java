package br.edu.infnet.fogaca_api;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import br.edu.infnet.fogaca_api.model.domain.Paciente;

public class ArquivoPacientes {

    public static void salvar(List<Paciente> pacientes) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("pacientes.txt"))) {

            for (Paciente p : pacientes) {
                bw.write(p.toString());
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo.");
        }
    }
}
