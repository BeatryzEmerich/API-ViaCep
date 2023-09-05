# API de Clientes com Padrão de Projeto Facade

## Descrição

Este projeto demonstra a criação de uma API RESTful de gerenciamento de clientes, utilizando o padrão de projeto Facade. A API permite a criação, recuperação, atualização e exclusão de clientes, bem como a consulta de clientes por ID. Além disso, a API utiliza integrações com um banco de dados H2 e a API do ViaCEP para fornecer informações de endereço.

## Funcionalidades

- **Listagem de Clientes**: Consulta a lista de todos os clientes cadastrados.

- **Consulta por ID**: Recupera os detalhes de um cliente com base em seu ID.

- **Cadastro de Clientes**: Permite a criação de novos clientes com nome e endereço.

- **Atualização de Clientes**: Atualiza os dados de um cliente existente com base em seu ID.

- **Exclusão de Clientes**: Remove um cliente do sistema com base em seu ID.

## Tecnologias Utilizadas

- **Spring Boot**: Para o desenvolvimento da API REST.

- **H2 Database**: Para armazenamento de dados em memória.

- **Spring Data JPA**: Para a camada de persistência.

- **Spring Cloud OpenFeign**: Para integração com a API do ViaCEP.

## Padrão de Projeto

O projeto utiliza o padrão de projeto Facade para abstrair a complexidade das operações de integração com o banco de dados e a API do ViaCEP. A classe `ClienteServiceImpl` atua como a fachada, fornecendo uma interface simples e coesa para as operações relacionadas a clientes.

## Como Testar

A API pode ser testada usando uma ferramenta como o Postman. Consulte a documentação para obter exemplos de solicitações e respostas.

Para executar localmente, siga as instruções no README do projeto.

## Observação

Este projeto foi criado para fins educacionais e de demonstração e pode ser usado como base para o desenvolvimento de sistemas mais complexos de gerenciamento de clientes. Certifique-se de ajustar e estender conforme necessário para atender aos requisitos específicos do seu projeto.

Sinta-se à vontade para contribuir, relatar problemas ou fazer melhorias neste projeto. Seu feedback é sempre bem-vindo!

