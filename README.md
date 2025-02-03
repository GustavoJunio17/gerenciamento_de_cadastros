# Cadastro de Fornecedor - InterfaceGrafica3

Este repositório contém a implementação do cadastro de fornecedores na aplicação **InterfaceGrafica3**. O trabalho foi realizado em grupo e envolveu a criação de uma nova funcionalidade para cadastrar fornecedores, seguindo os requisitos especificados.

## Integrantes do Grupo

- Gustavo Junio Ferreira Rodrigues
- Juan Pablo Botelho
- Kauan Alexandre Dias Silva
- Santiago Paiva Rosa Borges
- Thiago Alves Ramos Oliveira

## Funcionalidades Implementadas

1. **Menu na Tela Principal**:
   - Adicionado um novo item no menu para acessar o cadastro de fornecedores.

2. **Tela de Cadastro de Fornecedor**:
   - Criada uma nova interface gráfica para o cadastro de fornecedores.

3. **Modelo de Fornecedor**:
   - Criada a classe `Fornecedor` que estende a classe `PessoaJuridica` e que estende de `Uf`.
   - Atributos da classe:
     - `idFornecedor` (int)
     - `nome` (String)
     - `email` (String)
     - `endereco` (String)
     - `telefone` (String)
   - Outros atributos herdados de `PessoaJuridica`:
     - `cnpj` (String)
     - `inscricaoEstadual` (String)
     - `nomeFantasia` (String)
   - Outros atributos herdados de `Uf`:
     - `Nome` (String)
     - `Sigla` (String)

4. **Banco de Dados**:
   - Tabela `cadastro_pessoa` criada com os seguintes campos:
     - `id` (chave primária)
     - `nome`
     - `endereco`
     - `email`
     - `telefone`
  
   - Tabela `uf` criada com os seguintes campos:
     - `id` (chave primária)
     - `nome`
     - `sigla`

   - Tabela `cadastro_fornecedor` criada com os seguintes campos:
     - `id` (chave primária)
     - `nome`
     - `email`
     - `endereco`
     - `uf` (chave estrangeira referenciando a tabela de UFs)
     - `telefone`
     - `cnpj`
     - `inscricao_estadual`
     - `nome_fantasia`
     - `categoria`
