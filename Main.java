public class Main {
    
    public static void main (String [] args) {

        //Criando Usuarios do Marketing
        Usuario user1 = new Usuario(1, "João Figueroa", "JF", "Funcionário", d1); 
        Usuario user2 = new Usuario(2, "Maria Valentina", "MV", "Funcionário", d1);
        Usuario user3 = new Usuario(3, "José Bonifácio", "JB", "Administrador", d1);
        
        //Criando Usuarios do Financeiro
        Usuario user4 = new Usuario(4, "Asdrubal Brasil", "AB", "Funcionário", d2); 
        Usuario user5 = new Usuario(5, "Antônia Nunes", "AN", "Funcionário", d2);
        Usuario user6 = new Usuario(6, "Helena Dias", "HD", "Administrador", d2);
        
        //Criando Usuarios do RH
        Usuario user7 = new Usuario(7, "Aristides Mejolaro", "AM", "Funcionário", d3); 
        Usuario user8 = new Usuario(8, "Zilda Antunes", "ZA", "Funcionário", d3);
        Usuario user9 = new Usuario(9, "Ester Gross", "EG", "Administrador", d3);
        
        //Criando Usuarios da Manutenção
        Usuario user10 = new Usuario(10, "Moacir Ramones", "MR", "Funcionário", d4); 
        Usuario user11 = new Usuario(11, "Lauro Quadros", "LQ", "Funcionário", d4);
        Usuario user12 = new Usuario(12, "Tonhão Silva", "TS", "Administrador", d4);

        //Criando Usuarios da Produção
        Usuario user13 = new Usuario(13, "Jackson Pandolfo", "JP", "Funcionário", d5); 
        Usuario user14 = new Usuario(14, "Humberto Eco", "HE", "Funcionário", d5);
        Usuario user15 = new Usuario(15, "Amanda Sefid", "AS", "Administrador", d5);
        
        //Criando Lista de Usuários
        Usuario[] listaUsuarios = {user1, user2, user3, user4, user5, user6, user7, user8, user9, user10, user11, user12, user13, user14, user15}; 
        
        
        //Criando Mapeamento de Usuários
        HashMap<String, Usuario> usuariosMap = new HashMap<>();
        usuariosMap.put("user1", user1);
        usuariosMap.put("user2", user2);
        usuariosMap.put("user3", user3);
        usuariosMap.put("user4", user4);
        usuariosMap.put("user5", user5);
        usuariosMap.put("user6", user6);
        usuariosMap.put("user7", user7);
        usuariosMap.put("user8", user8);
        usuariosMap.put("user9", user9);
        usuariosMap.put("user10", user10);
        usuariosMap.put("user11", user11);
        usuariosMap.put("user12", user12);
        usuariosMap.put("user13", user13);
        usuariosMap.put("user14", user14);
        usuariosMap.put("user15", user15);

      //Criando Método de Fazer Pedido

        public static Pedido fazerPedido(Usuario usuario) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println(---------------------------------------------);
        System.out.println("Insira a descrição do item solicitado: "); 
        String descricao = scanner.nextLine(); 
        
        System.out.println(----------------------------------------------);

        System.out.println("Informe o valor unitário do item: "); 
        double valorUnitario = scanner.nextDouble(); 
        
        System.out.println("");

        System.out.println("Informe a quantidade solicitada: "); 
        int quantidade = scanner.nextInt();         
        
        Pedido novoPedido = new Pedido(usuario, usuario.getNome(), usuario.getDepartamento(), LocalDate.now(), null, "Aberto", descricao, valorUnitario, quantidade);
        
        return novoPedido;
    }

        //Criando método de contar pedidos 
    
        public static int contaPedidos(Pedido[] listaPedidos){
        
            int countPedidosTotais = 0;
        
            for (int i = 0; i < listaPedidos.length; i++) {
        
                countPedidosTotais++;
        
            }
        
            return countPedidosTotais;
        }
    
        public static int contaPedidosAbertos(Pedido[] listaPedidos){
        
            int countPedidosTotais = 0;
        
            for (int i = 0; i < listaPedidos.length; i++) {
            
                if (listaPedidos[i].getStatus().equals("Aberto")) {
            
                    countPedidosTotais++;
                
                }        
            }
        
            return countPedidosTotais;
        }
    
        public static int contaPedidosAprovados(Pedido[] listaPedidos){
        
            int countPedidosTotais = 0;
        
            for (int i = 0; i < listaPedidos.length; i++) {
            
                if (listaPedidos[i].getStatus().equals("Aprovado")) {
            
                    countPedidosTotais++;
                
                }        
            }
        
            return countPedidosTotais;
        }
    
        public static int contaPedidosReprovados(Pedido[] listaPedidos){
        
            int countPedidosTotais = 0;
        
            for (int i = 0; i < listaPedidos.length; i++) {
            
                if (listaPedidos[i].getStatus().equals("Reprovado")) {
            
                countPedidosTotais++;
                
                }        
            }
        
            return countPedidosTotais;
        }
    
    }      
}

