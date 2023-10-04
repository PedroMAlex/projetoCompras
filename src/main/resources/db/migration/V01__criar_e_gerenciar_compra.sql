CREATE TABLE compra (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO compra (nome) values ('Lazer');
INSERT INTO compra (nome) values ('Alimentação');
INSERT INTO compra (nome) values ('Supermercado');
INSERT INTO compra (nome) values ('Farmácia');
INSERT INTO compra (nome) values ('Outros');