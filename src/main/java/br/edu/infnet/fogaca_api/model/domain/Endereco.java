package br.edu.infnet.fogaca_api.model.domain;

public class Endereco {

    String rua;
    String bairro;
    String cidade;
    String estado;
    String cep;

    public Endereco(String rua, String bairro, String cidade, String estado, String cep) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public void mostrarEndereco() {
        System.out.println("Rua: " + rua);
        System.out.println("Bairro: " + bairro);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("CEP: " + cep);
    }
}
