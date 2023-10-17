public class Usuario {
    
    // Atributos
    
    private int id;
    private String nome;
    private String iniciais; 
    private String tipo;
    private Departamento departamento;
    
    // Construtor

    public Usuario (int id, String nome, String iniciais, String tipo, Departamento departamento) {
        
        this.id = id; 
        this.nome = nome; 
        this.iniciais = iniciais;
        this.tipo = tipo;
        this.departamento = departamento;
        
    }
    
    // Métodos

    public int getIdUsuario(){
        return this.id; 
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getTipo() {
        return this.tipo;
    }

    public String getIniciais() {
        return this.iniciais;
    }
    
    public Departamento getDepartamento() {
        return this.departamento;
    }

    
}