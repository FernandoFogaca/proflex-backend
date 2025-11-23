package br.edu.infnet.fogaca_api.model.domain;

public class Consulta {

    private String data;
    private String horario;
    private TipoConsulta tipo;
    private String observacao;

    public Consulta() {
    }

    public Consulta(String data, String horario, TipoConsulta tipo, String observacao) {
        this.data = data;
        this.horario = horario;
        this.tipo = tipo;
        this.observacao = observacao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public TipoConsulta getTipo() {
        return tipo;
    }

    public void setTipo(TipoConsulta tipo) {
        this.tipo = tipo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void mostrarResumo() {
        System.out.println("Consulta em " + data + " às " + horario + " - " + tipo);
        if (observacao != null && !observacao.isBlank()) {
            System.out.println("Observação: " + observacao);
        }
    }

    @Override
    public String toString() {
        return data + " " + horario + " - " + tipo;
    }
}
