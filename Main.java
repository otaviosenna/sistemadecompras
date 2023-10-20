public class MainLogin {
    
    public static void main (String [] args) {

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
        
        
    }
    
    
}
