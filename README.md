🍔 Sistema de Restaurante
📌 Sobre o projeto
Este projeto consiste em um sistema de gerenciamento de pedidos de um restaurante, desenvolvido em Java como exercício de programação orientada a objetos e padrões de projeto.

O sistema permite cadastrar pedidos, escolher e personalizar lanches, adicionar complementos, consultar e modificar pedidos e calcular o total do dia.
🚀 Funcionalidades
- Cadastro de pedidos: registra pedidos associados ao nome do cliente.
- Cardápio: disponibiliza X-Burger, X-Salada e X-Bacon.
- Personalização de lanches: permite retirar queijo, cebola, tomate e alface.
- Adicionais: permite adicionar cheddar e bacon extra aos lanches.
- Listagem de pedidos: exibe os pedidos cadastrados, seus itens e valores.
- Modificação de pedidos: permite adicionar itens, remover itens e cancelar pedidos.
- Fechamento do dia: calcula o valor total dos pedidos e apresenta as descrições dos itens sem repetições.
- Validação de dados: verifica condições como nome de lanche inválido e preço negativo.
- Tratamento de entradas inválidas: utiliza tratamento de exceções para lidar com entradas numéricas incorretas no menu.
🛠️ Tecnologias utilizadas
- Java — linguagem de programação.
- Programação Orientada a Objetos (POO) — organização do sistema em classes e objetos.
- Collections Framework — utilização de ArrayList, HashMap e HashSet.
- JUnit — testes automatizados.
🏗️ Organização do projeto
O código foi organizado em classes com responsabilidades específicas.
Classe	Responsabilidade
Main	Controla o fluxo principal da aplicação.
MenuConsole	Exibe os menus, recebe as opções e apresenta informações ao usuário.
RestauranteFacade	Centraliza e coordena as operações do sistema.
Lanche	Representa um lanche, seu preço e seus ingredientes.
ItemCardapio	Define os métodos de descrição e preço dos itens do cardápio.
LancheFactory	Centraliza a criação dos lanches disponíveis.
ComCheddar	Adiciona cheddar e seu valor ao item do cardápio.
ComBaconExtra	Adiciona bacon extra e seu valor ao item do cardápio.
Pedido	Armazena os itens de um pedido e calcula seu valor total.
GerenciadorPedidos	Armazena, consulta e remove pedidos, além de calcular o total do dia.
LancheTest	Contém testes automatizados relacionados a preços e validações.🧩 Padrões de projeto
Factory
Implementado na classe LancheFactory, concentra a criação dos lanches disponíveis no cardápio.

Isso evita espalhar a lógica de criação desses objetos por diferentes partes do sistema.
Facade
Implementado na classe RestauranteFacade, oferece um ponto central para acessar as operações do restaurante e coordena a comunicação entre as classes responsáveis.
Decorator
Implementado nas classes ComCheddar e ComBaconExtra, permite adicionar complementos aos itens do cardápio e atualizar seus preços sem precisar criar uma classe para cada combinação de ingredientes e adicionais.
🧪 Testes automatizados
Os testes foram desenvolvidos com JUnit.

Atualmente, incluem verificações para:
- Confirmar que um X-Bacon com cheddar custa R$ 26,00.
- Confirmar que a criação de um lanche com preço negativo lança uma IllegalArgumentException.
▶️ Como executar o projeto
1. Clone ou baixe este repositório.
2. Abra o projeto em uma IDE compatível com Java, como IntelliJ IDEA ou Eclipse.
3. Verifique se o Java está instalado e configurado.
4. Execute a classe Main.
5. Utilize as opções exibidas no console para interagir com o sistema.
Para executar os testes: abra a classe LancheTest e execute os testes com o suporte a JUnit da sua IDE.
Observação: a execução dos testes depende de o JUnit estar configurado nas dependências do projeto.

📚 Conceitos praticados
- Programação Orientada a Objetos.
- Encapsulamento e validação de dados.
- Interfaces.
- Listas e coleções.
- Tratamento de exceções.
- Separação de responsabilidades.
- Padrões de projeto Factory, Facade e Decorator.
- Testes automatizados com JUnit.
🎯 Objetivo de aprendizagem
O objetivo deste projeto é praticar o desenvolvimento de aplicações Java organizadas, aplicando conceitos de orientação a objetos, coleções, padrões de projeto e testes automatizados.

Projeto desenvolvido para fins educacionais.
