package src;

import java.util.Scanner;
import java.time.LocalDate;
import java.util.HashMap;

public class Main {

        public static void main(String[] args) {

                // Criando departamentos
                Departamento d1 = new Departamento("Marketing", 100);
                Departamento d2 = new Departamento("Financeiro", 200);
                Departamento d3 = new Departamento("RH", 300);
                Departamento d4 = new Departamento("Manutenção", 400);
                Departamento d5 = new Departamento("Produção", 500);

                // Criando Lista de Usuários
                Usuario user1 = new Usuario(1, "João Figueroa", "JF", "Funcionário", d1);
                Usuario user2 = new Usuario(2, "Maria Valentina", "MV", "Funcionário", d1);
                Usuario user3 = new Usuario(3, "José Bonifácio", "JB", "Administrador", d1);
                Usuario user4 = new Usuario(4, "Asdrubal Brasil", "AB", "Funcionário", d2);
                Usuario user5 = new Usuario(5, "Antônia Nunes", "AN", "Funcionário", d2);
                Usuario user6 = new Usuario(6, "Helena Dias", "HD", "Administrador", d2);
                Usuario user7 = new Usuario(7, "Aristides Mejolaro", "AM", "Funcionário", d3);
                Usuario user8 = new Usuario(8, "Zilda Antunes", "ZA", "Funcionário", d3);
                Usuario user9 = new Usuario(9, "Ester Gross", "EG", "Administrador", d3);
                Usuario user10 = new Usuario(10, "Moacir Ramones", "MR", "Funcionário", d4);
                Usuario user11 = new Usuario(11, "Lauro Quadros", "LQ", "Funcionário", d4);
                Usuario user12 = new Usuario(12, "Tonhão Silva", "TS", "Administrador", d4);
                Usuario user13 = new Usuario(13, "Jackson Pandolfo", "JP", "Funcionário", d5);
                Usuario user14 = new Usuario(14, "Humberto Eco", "HE", "Funcionário", d5);
                Usuario user15 = new Usuario(15, "Amanda Sefid", "AS", "Administrador", d5);

                // Criando Pedidos
                Pedido p1 = new Pedido(user1, user1.getNome(), user1.getDepartamento(), LocalDate.of(2022, 10, 1), null,
                                "Aberto", "Folha de Ofício UN", 1.99, 40);
                Pedido p2 = new Pedido(user2, user2.getNome(), user2.getDepartamento(), LocalDate.of(2023, 1, 20), null,
                                "Reprovado", "Monitor HD", 1500.00, 1);
                Pedido p3 = new Pedido(user3, user3.getNome(), user3.getDepartamento(), LocalDate.of(2023, 3, 15),
                                LocalDate.of(2023, 10, 3), "Aprovado", "Lápis de Cor", 0.50, 30);
                Pedido p4 = new Pedido(user4, user4.getNome(), user4.getDepartamento(), LocalDate.of(2019, 2, 2), null,
                                "Aberto", "Calculadora", 150, 1);
                Pedido p5 = new Pedido(user5, user5.getNome(), user5.getDepartamento(), LocalDate.of(2022, 5, 17), null,
                                "Reprovado", "Licença Excel", 300, 5);
                Pedido p6 = new Pedido(user6, user6.getNome(), user6.getDepartamento(), LocalDate.of(2020, 4, 19),
                                LocalDate.of(2023, 10, 3), "Aprovado", "Licença ERP", 50, 4);

                // Criando Lista de Pedidos
                Pedido[] listaPedidos = { p1, p2, p3, p4, p5, p6 };

                // Criando Mapeamento de Usuários
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
        }

        // Aqui estão os métodos de contagem de pedidos
        public static int contaPedidos(Pedido[] listaPedidos) {
                int countPedidos = listaPedidos.length;
                return countPedidos;
        }

        public static int contaPedidosAbertos(Pedido[] listaPedidos) {
                int countPedidos = 0;
                for (int i = 0; i < listaPedidos.length; i++) {
                        if (listaPedidos[i].getStatus().equals("Aberto")) {
                                countPedidos++;
                        }
                }
                return countPedidos;
        }

        public static int contaPedidosAprovados(Pedido[] listaPedidos) {
                int countPedidos = 0;
                for (int i = 0; i < listaPedidos.length; i++) {
                        if (listaPedidos[i].getStatus().equals("Aprovado")) {
                                countPedidos++;
                        }
                }
                return countPedidos;
        }

        public static int contaPedidosReprovados(Pedido[] listaPedidos) {
                int countPedidos = 0;
                for (int i = 0; i < listaPedidos.length; i++) {
                        if (listaPedidos[i].getStatus().equals("Reprovado")) {
                                countPedidos++;
                        }
                }
                return countPedidos;
        }
}