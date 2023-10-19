package src;

public class Departamento {

    private String nomeDepartamento;
    private double valorMaximoPedido;

    public Departamento(String nomeDepartamento, double valorMaximoPedido) {

        this.nomeDepartamento = nomeDepartamento;
        this.valorMaximoPedido = valorMaximoPedido;

    }

    public double getValorMaximoPedido() {

        return this.valorMaximoPedido;

    }

}
