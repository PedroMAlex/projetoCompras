CREATE TABLE Pessoa(
	nome TEXT  NOT NULL,
	email TEXT NOT NULL,
	senha TEXT NOT NULL,
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
	ativo boolean,
	diabetico boolean,
	pressaoAlta boolean,
	recomendarDoces boolean,
	recomendarSalgados boolean,
	restricoesAlimentares boolean 
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO Pessoa (nome,email,senha,ativo,diabetico,pressaoAlta,recomendarDoces,recomendarSalgados,restricoesAlimentares) VALUES ("Pedro",
"pedromelo16072004@gmail.com","83367867", 1, 1, 0,0,0,1);
INSERT INTO Pessoa (nome,email,senha,ativo,diabetico,pressaoAlta,recomendarDoces,recomendarSalgados,restricoesAlimentares) VALUES ("Pedro",
"pedromelo16072004@gmail.com","83367867", 1, 1, 0,0,0,1);
INSERT INTO Pessoa (nome,email,senha,ativo,diabetico,pressaoAlta,recomendarDoces,recomendarSalgados,restricoesAlimentares) VALUES ("Pedro",
"pedromelo16072004@gmail.com","83367867", 1, 1, 0,0,0,1);
INSERT INTO Pessoa (nome,email,senha,ativo,diabetico,pressaoAlta,recomendarDoces,recomendarSalgados,restricoesAlimentares) VALUES ("Pedro",
"pedromelo16072004@gmail.com","83367867", 1, 1, 0,0,0,1);
INSERT INTO Pessoa (nome,email,senha,ativo,diabetico,pressaoAlta,recomendarDoces,recomendarSalgados,restricoesAlimentares) VALUES ("Pedro",
"pedromelo16072004@gmail.com","83367867", 1, 1, 0,0,0,1);
