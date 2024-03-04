## Projeto API
O projeto consiste em uma API desenvolvida em Java utilizando o framework Spring Boot e a tecnologia JPA/Hibernate para persistência de dados. Essa API visa fornecer um sistema de gerenciamento de pedidos e produtos, onde os usuários podem criar pedidos, adicionar produtos aos pedidos, realizar pagamentos e administrar categorias de produtos.

## Objetivos
Os objetivos do projeto incluem:

- Criar uma API RESTful para gerenciamento de pedidos e produtos.

- Implementar operações de CRUD (Create, Retrieve, Update, Delete) para as entidades relacionadas, como pedidos, produtos, categorias, usuários e pagamentos.

- Permitir que os usuários registrem pedidos, adicionem produtos a esses pedidos, realizem pagamentos e gerenciem categorias de produtos.

## Tecnologias Utilizadas
- **Spring Boot:** Utilizado como base do projeto, facilitando a configuração e inicialização da aplicação.

- **Spring Data JPA:** Utilizado para simplificar as operações de acesso e manipulação de dados no banco de dados, permitindo a utilização de interfaces para definir consultas personalizadas.

- **Hibernate:** Framework de mapeamento objeto-relacional (ORM) utilizado para realizar a persistência das entidades Java no banco de dados relacional.

## Arquitetura da Aplicação
A aplicação segue uma arquitetura baseada no padrão MVC (Model-View-Controller), onde:

- **Modelo (Model):** Representado pelas entidades Java que mapeiam as categorias de produtos, pedidos, produtos, usuários, pagamentos, etc.

- **Visão (View):** Embora não seja explicitamente definida devido ao caráter de API RESTful da aplicação, a "visão" pode ser considerada como as respostas JSON retornadas pelos endpoints da API.

- **Controlador (Controller):** Representado por classes que definem os endpoints RESTful da API e tratam as requisições HTTP relacionadas às entidades de domínio.

## Estrutura do Projeto
A estrutura do projeto inclui classes separadas para cada camada da aplicação:

- **Entidades (Entities):** Representam as entidades do modelo de domínio, como pedidos, produtos, categorias, usuários e pagamentos.

- **Repositórios (Repositories):** Contêm as interfaces que estendem as funcionalidades do Spring Data JPA para acesso aos dados das entidades.

- **Serviços (Services):** Implementam a lógica de negócios da aplicação e coordenam as operações entre os controladores e os repositórios.

- **Controladores (Controllers):** Definem os endpoints RESTful da API e tratam as requisições HTTP relacionadas às entidades do modelo de domínio.

## Exemplo de Funcionalidades Implementadas
**Registro de Pedidos:** Os usuários podem criar novos pedidos, fornecendo informações como produtos selecionados e dados de entrega.

**Adição de Produtos aos Pedidos:** Os usuários podem adicionar produtos específicos aos pedidos existentes, indicando a quantidade desejada.

**Realização de Pagamentos:** Os usuários podem efetuar pagamentos para os pedidos registrados, fornecendo informações de pagamento válidas.

**Gerenciamento de Categorias de Produtos:** Os usuários com permissões de administrador podem criar, atualizar e excluir categorias de produtos.

## Modelo de Domínio
O modelo de domínio da aplicação inclui as seguintes entidades: Category, Order, OrderItem, Payment, Product e User. Cada uma dessas entidades possui atributos e relacionamentos específicos que definem sua estrutura e comportamento.
![image](https://github.com/CodeByTeusSilva/First-Spring-Application/assets/130092876/f958c3ae-1a61-4afd-ae21-98042c3eab26)


## Uso de Boas Práticas
O projeto segue boas práticas de desenvolvimento, como o uso de injeção de dependência para obter instâncias dos serviços necessários e a utilização de respostas HTTP apropriadas para fornecer feedback ao cliente sobre o resultado das operações. Além disso, a API segue convenções RESTful ao utilizar os métodos HTTP padrão e URLs semânticas para definir os endpoints relacionados às entidades do modelo de domínio.


## Conclusão
O projeto proporcionou uma experiência significativa no desenvolvimento de uma API robusta para gerenciamento de pedidos e produtos, utilizando tecnologias modernas e seguindo boas práticas de desenvolvimento. Ao implementar operações de CRUD para entidades fundamentais como pedidos, produtos e categorias, foi possível construir uma aplicação flexível e escalável, capaz de atender às necessidades dos usuários em um ambiente de comércio eletrônico.

A arquitetura MVC adotada facilitou a organização do código-fonte e a separação de responsabilidades entre as diferentes camadas da aplicação, proporcionando uma estrutura clara e de fácil manutenção. Além disso, o modelo de domínio bem definido permitiu uma representação precisa das entidades e seus relacionamentos, garantindo a consistência dos dados e a integridade do sistema como um todo.

Por fim, a aplicação demonstrou o uso eficaz das tecnologias Spring Boot e Spring Data JPA, proporcionando uma experiência de desenvolvimento ágil e eficiente. Com a implementação de funcionalidades essenciais, como registro de pedidos, adição de produtos, realização de pagamentos e gerenciamento de categorias, o projeto está pronto para ser expandido e customizado conforme as necessidades específicas dos usuários e do negócio.
