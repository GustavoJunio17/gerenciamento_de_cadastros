CREATE Database cadastro_fornecedor;

USE cadastro_fornecedor;

CREATE TABLE uf (
	id INT AUTO_INCREMENT PRIMARY KEY,
    uf VARCHAR(2) UNIQUE);
    
CREATE TABLE fornecedor (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    endereco VARCHAR(100) NOT NULL,
    uf VARCHAR(2) NOT NULL,
    telefone VARCHAR(11) NOT NULL,
    cnpj VARCHAR(13) NOT NULL,
    inscricao_estadual VARCHAR(30) NOT NULL,
    nome_fantasia VARCHAR(100) NOT NULL,
    categoria VARCHAR(100) NOT NULL,
    FOREIGN KEY (uf) REFERENCES uf(uf));
    
INSERT INTO uf (uf) VALUES ('SP'), ('RJ'), ('MG'), ('ES'), ('BA');

INSERT INTO fornecedor (nome, email, endereco, uf, telefone, cnpj, inscricao_estadual, nome_fantasia, categoria)
VALUES ('Empresa X', 'email@exemplo.com', 'Rua A, 123', 'XX', '12345678901', '1234567890123', '1234567890', 'Empresa Fantasia', 'Tecnologia');

INSERT INTO fornecedor (nome, email, endereco, uf, telefone, cnpj, inscricao_estadual, nome_fantasia, categoria)
VALUES ('Empresa X', 'email@exemplo.com', 'Rua A, 123', 'SP', '12345678901', '1234567890123', '1234567890', 'Empresa Fantasia', 'Tecnologia');

