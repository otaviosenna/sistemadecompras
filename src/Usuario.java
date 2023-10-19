package src;

public class Usuario {

    // Atributos

    private int id;
    private String nome;
    private String iniciais;
    private String tipo;
    private Departamento departamento;

    // Construtor

    public Usuario(int id, String nome, String iniciais, String tipo, Departamento departamento) {

        this.id = id;
        this.nome = nome;
        this.iniciais = iniciais;
        this.tipo = tipo;
        this.departamento = departamento;

    }

    // Métodos

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String setNome(String nome) {
        return this.nome = nome;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String setTipo(String tipo) {
        return this.tipo = tipo;
    }

    public String getIniciais() {
        return this.iniciais;
    }

    public String setIniciais(String iniciais) {
        return this.iniciais = iniciais;
    }

    public Departamento getDepartamento() {
        return this.departamento;
    }

    public Departamento setDepartamento(Departamento departamento) {
        return this.departamento = departamento;
    }

}