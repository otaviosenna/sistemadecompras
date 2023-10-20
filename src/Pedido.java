package src;

import java.time.LocalDate;

public class Pedido {

    private Usuario usuario;
    private String nomeDoUsuario;
    private Departamento departamento;
    private LocalDate dataDoPedido;
    private LocalDate dataDaConclusao;
    private String status;
    private String descricao;
    private double valorUnitario;
    private int quantidade;
    private double valorTotal;

    public Pedido(Usuario usuario, String nomeDoUsuario, Departamento departamento, LocalDate dataDoPedido,
            LocalDate dataDaConclusao, String status, String descricao, double valorUnitario, int quantidade) {

        this.usuario = usuario;
        this.nomeDoUsuario = nomeDoUsuario;
        this.departamento = departamento;
        this.dataDoPedido = dataDoPedido;
        this.dataDaConclusao = dataDaConclusao;
        this.status = status;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
        this.valorTotal = valorUnitario * quantidade;

    }

    public String getStatus() {
        return this.status;
    }

    public double getValorTotal() {
        return this.valorTotal;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String getNomeDoUsuario() {
        return this.nomeDoUsuario;
    }

    public LocalDate getDataDoPedido() {
        return this.dataDoPedido;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
