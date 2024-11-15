CREATE TABLE libras.tb_topicos
( 
 id_topico UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
 palavra VARCHAR NOT NULL,
 explicacao_palavra VARCHAR,
 imagem VARCHAR NOT NULL,
 Vídeo INT NOT NULL,
 Comentário VARCHAR NOT NULL
); 
