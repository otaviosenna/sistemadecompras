import java.util.Scanner;
import java.util.HashMap;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Main {
    
    public static void main (String [] args) {

        // Criando departamentos
        Departamento d1 = new Departamento("Marketing", 100); 
        Departamento d2 = new Departamento("Financeiro", 200);
        Departamento d3 = new Departamento("RH", 300);        
        Departamento d4 = new Departamento("Manutenção", 400);
        Departamento d5 = new Departamento("Produção", 500);
        
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
        
        
        //Criando Pedidos
        Pedido p1 = new Pedido(user1, user1.getNome(), user1.getDepartamento(), LocalDate.of(2022, 10, 1), null, "Aberto", "Folha de Ofício UN", 1.99, 40);   
        Pedido p2 = new Pedido(user2, user2.getNome(), user2.getDepartamento(), LocalDate.of(2023, 1, 20), null, "Reprovado", "Monitor HD", 1500.00, 1);
        Pedido p3 = new Pedido(user3, user3.getNome(), user3.getDepartamento(), LocalDate.of(2023, 3, 15), LocalDate.of(2023, 10, 3), "Aprovado", "Lápis de Cor", 0.50, 30);
        Pedido p4 = new Pedido(user4, user4.getNome(), user4.getDepartamento(), LocalDate.of(2019, 2, 2), null, "Aberto", "Calculadora", 150, 1);   
        Pedido p5 = new Pedido(user5, user5.getNome(), user5.getDepartamento(), LocalDate.of(2022, 5, 17), null, "Reprovado", "Licença Excel", 300, 5);
        Pedido p6 = new Pedido(user6, user6.getNome(), user6.getDepartamento(), LocalDate.of(2020, 4, 19), LocalDate.of(2023, 10, 3), "Aprovado", "Licença ERP", 50, 4);
        Pedido p7 = new Pedido(user7, user7.getNome(), user7.getDepartamento(), LocalDate.of(2019, 2, 2), null, "Aberto", "Calculadora", 150, 1);   
        Pedido p8 = new Pedido(user8, user8.getNome(), user8.getDepartamento(), LocalDate.of(2022, 5, 17), null, "Reprovado", "Licença Excel", 300, 5);
        Pedido p9 = new Pedido(user9, user9.getNome(), user9.getDepartamento(), LocalDate.of(2020, 4, 19), LocalDate.of(2023, 10, 3), "Aprovado", "Licença ERP", 50, 4);

        //Criando Lista de Pedidos
        Pedido[] listaPedidos = {p1, p2, p3, p4, p5, p6}; 
        
        
        //Criando Sistema de Identificação do Usuário
        
        int menuOption = 3;
        
        while (menuOption == 3) {
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("");
            System.out.println("---------------------------------------------");
            System.out.println("Olá, seja bem vindo ao sistema de pedidos!"); 
            System.out.println("---------------------------------------------");
            System.out.println("");
            System.out.println("Informe o login do usuário para prosseguir (ex.: user1, user2, user3...): ");
            
            String loginUsuario = scanner.nextLine();
            
            Usuario usuario = usuariosMap.get(loginUsuario);
            
            System.out.println("");
            System.out.println("Bem vindo, " + usuario.getNome() +"!");
            System.out.println(usuario.getIniciais() + ", escolha uma das opções para seguir:");
            System.out.println("");
            
            if (usuario.getTipo().equals("Funcionário")) {
                
                System.out.println("---------------------------------------------");
                System.out.println("Menu de Ações para Funcionários:");
                System.out.println("---------------------------------------------");
                System.out.println("");
                System.out.println("# Digite 1 - Fazer Pedido");
                System.out.println("# Digite 2 - Excluir Pedido");
                System.out.println("# Digite 3 - Mudar de Usuário");
                
                menuOption = scanner.nextInt();  
                    
                    if (menuOption == 1) {
                        
                        Pedido novoPedido = fazerPedido(usuario);
                        Departamento departamento = usuario.getDepartamento();
                        
                            if ( novoPedido.getValorTotal() > departamento.getValorMaximoPedido() ) {
                                
                                System.out.println("");
                                System.out.println("### Pedido não realizado. O valor total excede o valor máximo permitido para o departamento. :(");
                                
                            }
                        
                            else {
                                
                                System.out.println("");
                                System.out.println("### Pedido realizado com sucesso! :) ");

                            }
                    
                    }
                    
                    else if (menuOption == 2) {
                        
                        System.out.println("");
                        System.out.println("### Escolha um dos pedidos para excluir: ");
                        System.out.println("");
                        
                        for (int i = 0; i < listaPedidos.length; i++) {
                            System.out.println((i + 1) + ") " + listaPedidos[i].getDataDoPedido() + " | " + listaPedidos[i].getDescricao() + " | " + listaPedidos[i].getNomeDoUsuario() 
                            + " | Valor total do pedido: R$ " + listaPedidos[i].getValorTotal() );
                        }
                        
                        int escolha = (scanner.nextInt() - 1);
                        listaPedidos[escolha] = null; 
                        
                        System.out.println("");
                        System.out.println("### Pedido excluído com sucesso! :) ");
                    }
                
                
            }
            
            else {
                
                System.out.println("---------------------------------------------");
                System.out.println("Menu de Ações para Administradores:");
                System.out.println("---------------------------------------------");
                System.out.println("");
                System.out.println("# Digite 1 - Fazer Pedido");
                System.out.println("# Digite 2 - Excluir Pedido");
                System.out.println("# Digite 3 - Mudar de Usuário");
                System.out.println("# Digite 4 - Listar Pedidos");
                System.out.println("# Digite 5 - Procurar Pedidos");
                System.out.println("# Digite 6 - Aprovar Pedidos");
                System.out.println("# Digite 7 - Ver Estatísticas");
                
                menuOption = scanner.nextInt();  
                
                    if (menuOption == 1) {
                        
                        Pedido novoPedido = fazerPedido(usuario);
                        Departamento departamento = usuario.getDepartamento();
                        
                            if ( novoPedido.getValorTotal() > departamento.getValorMaximoPedido() ) {
                                
                                System.out.println("");
                                System.out.println("### Pedido não realizado. O valor total excede o valor máximo permitido para o departamento. :(");
                                
                            }
                        
                            else {
                                
                                System.out.println("");
                                System.out.println("### Pedido realizado com sucesso! :) ");

                            }
                    
                    }
                    
                    else if (menuOption == 2) {
                        
                        System.out.println("");
                        System.out.println("### Escolha um dos pedidos para excluir: ");
                        System.out.println("");
                        
                        for (int i = 0; i < listaPedidos.length; i++) {
                            System.out.println((i + 1) + ") " + listaPedidos[i].getDataDoPedido() + " | " + listaPedidos[i].getDescricao() + " | " + listaPedidos[i].getNomeDoUsuario()
                            + " | Valor total do pedido: R$ " + listaPedidos[i].getValorTotal() );
                        }
                        
                        int escolha = (scanner.nextInt() - 1) ;
                        listaPedidos[escolha] = null; 
                        
                        System.out.println("");
                        System.out.println("### Pedido excluído com sucesso! :) ");
                    }
                    
                    else if (menuOption == 4) {

                        scanner.nextLine();
 
                        System.out.println("");
                        System.out.println("### Escolha a data de pedido inicial (dd/mm/aaaa):");
                        String dataInicial = scanner.nextLine().trim();                        
                       
                        System.out.println("");
                        System.out.println("### Escolha a data de pedido final (dd/mm/aaaa):");
                        String dataFinal = scanner.nextLine().trim();
                        
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        
                        LocalDate dataInicialFormatada = LocalDate.parse(dataInicial, formatter); 
                        LocalDate dataFinalFormatada = LocalDate.parse(dataFinal, formatter); 
                        
                        System.out.println("");
                        
                        for (int i = 0; i < listaPedidos.length; i++) {
                            
                            if ( (listaPedidos[i].getDataDoPedido().isAfter(dataInicialFormatada)) && (listaPedidos[i].getDataDoPedido().isBefore(dataFinalFormatada)) ) {  
                            
                            System.out.println((i + 1) + ") " + listaPedidos[i].getDataDoPedido() + " | " + listaPedidos[i].getDescricao() + " | " + listaPedidos[i].getNomeDoUsuario() 
                            + " | Valor total do pedido: R$ " + listaPedidos[i].getValorTotal() );
                            }
                        }
                        
                    }
                    
                    else if (menuOption == 5) {
                        
                        System.out.println("");
                        System.out.println("### Escolha o usuário do qual você quer ver os pedidos: ");
                        System.out.println("");
                        
                        for (int i = 0; i < listaUsuarios.length; i++) {
                            System.out.println((i + 1) + ") " + listaUsuarios[i].getNome() );
                        }
                    
                        int escolha = ( scanner.nextInt() - 1 );
                        
                        for (int i = 0; i < listaPedidos.length; i++) {
                            
                            if ( (listaPedidos[i].getNomeDoUsuario().equals(listaUsuarios[escolha].getNome())) ) {  
                            
                            System.out.println((i + 1) + ") " + listaPedidos[i].getDataDoPedido() + " | " + listaPedidos[i].getDescricao() + " | " + listaPedidos[i].getNomeDoUsuario() 
                            + " | Valor total do pedido: R$ " + listaPedidos[i].getValorTotal() );
                            }
                        }
                                                
                        
                        
                    }
                    
                    else if (menuOption == 6) {
                        
                        System.out.println("");
                        System.out.println("### Escolha o pedido que você quer aprovar");
                        System.out.println("");
                        
                        for (int i = 0; i < listaPedidos.length; i++) {
                            
                            if ( (listaPedidos[i].getStatus().equals("Aberto"))) {  
                            
                            System.out.println((i + 1) + ") " + listaPedidos[i].getDataDoPedido() + " | " + "Status do pedido: " + listaPedidos[i].getStatus() + " | "
                            + listaPedidos[i].getDescricao() + " | " + listaPedidos[i].getNomeDoUsuario() 
                            + " | Valor total do pedido: R$ " + listaPedidos[i].getValorTotal() );
                            }
                        }
                    
                        
                        listaPedidos[(scanner.nextInt() - 1 )].setStatus("Aprovado");
            
                        System.out.println("");
                        System.out.println("### Pedido aprovado com sucesso! :) ");                        
                        
                        
                    }
                    
                    else if (menuOption == 7) {
                        
                        double pedidosAprovados = contaPedidosAprovados(listaPedidos);
                        double pedidosReprovados = contaPedidosReprovados(listaPedidos);
                        double pedidosAbertos = contaPedidosAbertos(listaPedidos);
                        double totalDePedidos = contaPedidos(listaPedidos);
                        
                        double percentualAprovados = (pedidosAprovados/totalDePedidos)*100; 
                        double percentualReprovados = (pedidosReprovados/totalDePedidos)*100; 
                        double percentualAbertos = (pedidosAbertos/totalDePedidos)*100;
                        
                        
                        double valorAprovados = somaValorAprovados(listaPedidos);
                        double valorReprovados = somaValorReprovados(listaPedidos);
                        double valorAbertos = somaValorAbertos(listaPedidos);
                        double valorTotal = somaValorTotal(listaPedidos);
                        
                        double percentualValorAprovados = (valorAprovados/valorTotal)*100;
                        double percentualValorReprovados = (valorReprovados/valorTotal)*100;
                        double percentualValorAbertos = (valorAbertos/valorTotal)*100;
                        
                        System.out.println("");
                        System.out.println("Atualmente a empresa possui um total de [" + contaPedidos(listaPedidos) + "] pedidos em seu banco de dados, divididos da seguinte forma: ");
                        System.out.println("");
                        System.out.println("---------------------------------------------");
                        System.out.println("• " + contaPedidosAprovados(listaPedidos) + " pedidos aprovados (" + percentualAprovados + "%)");
                        System.out.println("• " + contaPedidosReprovados(listaPedidos) + " pedidos reprovados (" + percentualReprovados + "%)");
                        System.out.println("• " + contaPedidosAbertos(listaPedidos) + " pedidos abertos (" + percentualAbertos + "%)");
                        System.out.println("---------------------------------------------");
                        
                        
                        System.out.println("");
                        System.out.println("Atualmente a empresa possui um total de [R$ " + valorTotal + "] em pedidos no seu banco de dados, divididos da seguinte forma: ");
                        System.out.println("");
                        System.out.println("---------------------------------------------");
                        System.out.println("• R$ " + valorAprovados + " em pedidos aprovados (" + percentualValorAprovados + "%)");
                        System.out.println("• R$ " + valorReprovados + " em pedidos reprovados (" + percentualValorReprovados + "%)");
                        System.out.println("• R$ " + valorAbertos + " em pedidos abertos (" + percentualValorAbertos + "%)");
                        System.out.println("---------------------------------------------");
                    }
                    
                    
                    
            }
        }
        
        System.out.println("Saiu do while");
        
    }
    
    //Criando método de fazer pedidos 
    
    public static Pedido fazerPedido(Usuario usuario) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("### Insira a descrição do item solicitado: "); 
        String descricao = scanner.nextLine(); 
        
        System.out.println("");

        System.out.println("### Informe o valor unitário do item: "); 
        double valorUnitario = scanner.nextDouble(); 
        
        System.out.println("");

        System.out.println("### Informe a quantidade solicitada: "); 
        int quantidade = scanner.nextInt();         
        
        Pedido novoPedido = new Pedido(usuario, usuario.getNome(), usuario.getDepartamento(), LocalDate.now(), null, "Aberto", descricao, valorUnitario, quantidade);
        
        return novoPedido;
    }
    
    //Criando método de contar pedidos 
    
    public static int contaPedidos(Pedido[] listaPedidos){
        
        int countPedidos = 0;
        
        for (int i = 0; i < listaPedidos.length; i++) {
        
            countPedidos++;
        
        }
        
        return countPedidos;
    }
    
    public static int contaPedidosAbertos(Pedido[] listaPedidos){
        
        int countPedidos = 0;
        
        for (int i = 0; i < listaPedidos.length; i++) {
            
            if (listaPedidos[i].getStatus().equals("Aberto")) {
            
                countPedidos++;
                
            }        
        }
        
        return countPedidos;
    }
    
    public static int contaPedidosAprovados(Pedido[] listaPedidos){
        
        int countPedidos = 0;
        
        for (int i = 0; i < listaPedidos.length; i++) {
            
            if (listaPedidos[i].getStatus().equals("Aprovado")) {
            
                countPedidos++;
                
            }        
        }
        
        return countPedidos;
    }
    
    public static int contaPedidosReprovados(Pedido[] listaPedidos){
        
        int countPedidos = 0;
        
        for (int i = 0; i < listaPedidos.length; i++) {
            
            if (listaPedidos[i].getStatus().equals("Reprovado")) {
            
                countPedidos++;
                
            }        
        }
        
        return countPedidos;
    }
    
    
    // Criando métodos para somar valor total dos pedidos
    
    public static double somaValorTotal(Pedido[] listaPedidos){
        
        double somaPedidos = 0;
        
        for (int i = 0; i < listaPedidos.length; i++) {
            
            somaPedidos = somaPedidos + listaPedidos[i].getValorTotal();
     
        }
        
        return somaPedidos;
    }
    
    public static double somaValorAbertos(Pedido[] listaPedidos){
        
        double somaPedidos = 0;
        
        for (int i = 0; i < listaPedidos.length; i++) {
            
            if (listaPedidos[i].getStatus().equals("Aberto")) {
            
                somaPedidos = somaPedidos + listaPedidos[i].getValorTotal();
                
            }
        }
        
        return somaPedidos;
    }
    
    public static double somaValorAprovados(Pedido[] listaPedidos){
        
        double somaPedidos = 0;
        
        for (int i = 0; i < listaPedidos.length; i++) {
            
            if (listaPedidos[i].getStatus().equals("Aprovado")) {
            
                somaPedidos = somaPedidos + listaPedidos[i].getValorTotal();
                
            }
        }
        
        return somaPedidos;
    }
    
    public static double somaValorReprovados(Pedido[] listaPedidos){
        
        double somaPedidos = 0;
        
        for (int i = 0; i < listaPedidos.length; i++) {
            
            if (listaPedidos[i].getStatus().equals("Reprovado")) {
            
                somaPedidos = somaPedidos + listaPedidos[i].getValorTotal();
                
            }
        }
        
        return somaPedidos;
    }
}