CREATE TABLE Cadastro 
( 
 Código INT PRIMARY KEY AUTO_INCREMENT,
 Nome Completo VARCHAR(n),
 E-mail VARCHAR(n) NOT NULL,
 Senha VARCHAR(n) NOT NULL,
); 

CREATE TABLE Login 
( 
 E-mail INT,
 Senha INT,
); 

CREATE TABLE Cursos 
( 
 cd_curso INT PRIMARY KEY AUTO_INCREMENT,
 Nome_curso VARCHAR(n) NOT NULL,
 Imagem_curso VARCHAR(n) NOT NULL,
 Vídeo_curso VARCHAR(n) NOT NULL,
 cd_curso_topicos INT,
); 

CREATE TABLE Tópicos 
( 
 cd_topico INT PRIMARY KEY AUTO_INCREMENT,
 Palavra VARCHAR(n) NOT NULL,
 Explicacao_palavra VARCHAR(n),
 Imagem VARCHAR(n) NOT NULL,
 Vídeo INT NOT NULL,
 Comentário VARCHAR(n) NOT NULL,
); 

ALTER TABLE Login ADD FOREIGN KEY(E-mail) REFERENCES Cadastro (E-mail)
ALTER TABLE Login ADD FOREIGN KEY(Senha) REFERENCES Cadastro (Senha)
ALTER TABLE Cursos ADD FOREIGN KEY(cd_curso_topicos) REFERENCES Cadastro (cd_curso_topicos)
