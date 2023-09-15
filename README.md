1. O sistema deverá permitir escolher o usuário atual a qualquer momento. Cada usuário tem um identificador, um
nome e o seu tipo: funcionário ou administrador.
2. A empresa possui diversos departamentos (ex. Financeiro, RH, Engenharia, Manutenção, etc). Cada
departamento tem um valor máximo permitido por pedido. [o sistema deverá iniciar com dados já cadastrados
de pelo menos 5 departamentos; não é necessário implementar funções de inclusão nem exclusão de
departamentos].
3. Cada funcionários está alocado em um destes departamentos. [o sistema deverá iniciar com dados já
cadastrados de pelo menos 15 funcionários, associados aos seus departamentos.]
4. O sistema deverá permitir a um funcionário ou administrador registrar um novo pedido de aquisição.
5. Cada pedido de aquisição deverá conter:
5.1. O funcionário solicitante
5.2. O departamento solicitante (deve ser o mesmo do funcionário no momento do cadastro)
5.3. A data do pedido
5.4. A data de conclusão do pedido (preenchida quando os itens solicitados são entregues)
5.5. O status do pedido (aberto, aprovado, reprovado)
5.6. Lista de itens a serem adquiridos:
5.6.1.Descrição do item, valor unitário, quantidade, total do item
5.7. Valor total do pedido (deve ser igual ou inferior ao limite por pedido do respectivo departamento).
5.8. Somente um administrador pode avaliar um pedido que esteja aberto para aprová-lo ou rejeitá-lo. Permitir
a um administrador
5.8.1. Listar todos os pedidos entre duas datas
5.8.2. Buscar pedidos por funcionário solicitante
5.8.3. Buscar pedidos pela descrição de um item
5.8.4. Visualizar os detalhes de um pedido para aprová-lo ou rejeitá-lo.
6. Não deverá ser possível reabrir um pedido depois de marcado como aprovado/reprovado/concluído.
7. Um pedido ainda aberto poderá ser excluído, mas somente pelo funcionário que o criou.
8. O sistema deverá permitir a um administrador ver estatísticas gerais contendo:
8.1. Número de pedidos total, divididos entre aprovados e reprovados (com percentuais).
8.2. Número de pedidos nos últimos 30 dias e seu valor médio.
8.3. Valor total de cada categoria nos últimos 30 dias.
8.4. Detalhes do pedido de aquisição de maior valor ainda aberto.
