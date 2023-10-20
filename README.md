# Sistema de Compras

O "Sistema de Compras" é uma aplicação destinada à gestão e controle de pedidos de aquisição em uma organização.

## Processo de Branching

### Master Branch (Mestre)
- `main`

### Develop Branch (Desenvolvimento)
- `develop`

### Feature Branches (Características)
- `feature/` seguido pelo nome da funcionalidade ou ação.
  - Exemplos:
    - `feature/add-new-order`
    - `feature/view-order-details`
    - `feature/update-user-profile`

## Requisitos do Sistema

### 1. Seleção de Usuário
- Identificador único
- Nome
- Tipo (funcionário ou administrador)

### 2. Departamentos
- Mínimo de 5 departamentos pré-cadastrados
- Valor máximo permitido por pedido para cada departamento

### 3. Funcionários
- Mínimo de 15 funcionários pré-cadastrados
- Alocados em um dos departamentos pré-cadastrados

### 4. Registro de Pedido de Aquisição
- Acesso por funcionário ou administrador
- Detalhes do Pedido de Aquisição:
  - Funcionário solicitante
  - Departamento solicitante
  - Data do pedido
  - Data de conclusão
  - Status do pedido (opções: aberto, aprovado, reprovado)
  - Lista de itens a serem adquiridos:
    - Descrição
    - Valor unitário
    - Quantidade
    - Total do item
  - Valor total do pedido
  - Limitação do valor total conforme o limite do departamento
  - Avaliação de pedido por administrador com funcionalidades de:
    - Listagem de todos os pedidos em um intervalo de datas
    - Busca de pedidos por funcionário solicitante
    - Busca de pedidos por descrição de item
    - Visualização detalhada para aprovação ou rejeição de pedido

### 5. Condição de Reabertura de Pedido
- Impossibilidade de reabertura após status aprovado, reprovado ou concluído

### 6. Exclusão de Pedido
- Permissão exclusiva do funcionário criador enquanto o status estiver "aberto"

### 7. Estatísticas (Acesso exclusivo para Administradores)
- Contagem total de pedidos (aprovados, reprovados) com percentuais
- Contagem e valor médio de pedidos nos últimos 30 dias
- Valor total por categoria nos últimos 30 dias
- Detalhamento do pedido aberto de maior valor

## Observações:
- O sistema deve iniciar com dados já cadastrados conforme os requisitos especificados nos pontos 2 e 3.
- As funcionalidades devem respeitar as permissões e restrições de acesso de acordo com o tipo de usuário (funcionário ou administrador).
