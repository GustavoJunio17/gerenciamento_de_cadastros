CREATE DATABASE cadastro;

USE cadastro;

CREATE TABLE `cadastro`.`cadastro_pessoa` (
  `id`       INT          NOT NULL AUTO_INCREMENT COMMENT '',
  `nome`     VARCHAR(100) NOT NULL                COMMENT '',
  `endereco` VARCHAR(100) NOT NULL                COMMENT '',
  `email`    VARCHAR(100)     NULL                COMMENT '',
  `telefone` VARCHAR(17)      NULL                COMMENT '',
  PRIMARY KEY (`id`)                              COMMENT '');

CREATE TABLE `cadastro`.`uf` (
	id    INT         AUTO_INCREMENT PRIMARY KEY COMMENT '',
    nome  VARCHAR(40) UNIQUE                     COMMENT '',
    sigla VARCHAR(2)  UNIQUE                     COMMENT '');
    
CREATE TABLE `cadastro`.`cadastro_fornecedor` (
	id                 INT          AUTO_INCREMENT PRIMARY KEY COMMENT '', 
    nome               VARCHAR(100) NOT NULL                   COMMENT '',
    email              VARCHAR(100) UNIQUE NOT NULL            COMMENT '',
    endereco           VARCHAR(100) NOT NULL                   COMMENT '',
    uf                 VARCHAR(2)   NOT NULL                   COMMENT '',
    telefone           VARCHAR(11)  NOT NULL                   COMMENT '',
    cnpj               VARCHAR(13)  NOT NULL                   COMMENT '',
    inscricao_estadual VARCHAR(30)  NOT NULL                   COMMENT '',
    nome_fantasia      VARCHAR(100) NOT NULL                   COMMENT '',
    categoria          VARCHAR(100) NOT NULL                   COMMENT '',
    FOREIGN KEY (uf)   REFERENCES `uf`(sigla));
