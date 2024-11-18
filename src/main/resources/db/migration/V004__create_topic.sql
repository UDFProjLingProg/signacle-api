CREATE TABLE IF NOT EXISTS libras.tb_topics
( 
    id_topic UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    word VARCHAR NOT NULL,
    description VARCHAR,
    image VARCHAR NOT NULL,
    video INT NOT NULL,
    comment VARCHAR NOT NULL,
    created_date    TIMESTAMP NOT NULL
); 

<<<<<<< HEAD
COMMENT ON TABLE libras.tb_topics IS 'Tabela que armazena informações sobre os topicos.';

=======
<<<<<<< HEAD
COMMENT ON TABLE libras.tb_topicos IS 'Tabela que armazena informações sobre os topicos.';

COMMENT ON COLUMN libras.tb_topicos.id_topic IS 'Identificador único do tópico.';
COMMENT ON COLUMN libras.tb_topicos.word IS 'Palavra do tópivo.';
COMMENT ON COLUMN libras.tb_topicos.description IS 'Descrição da palavra.';
COMMENT ON COLUMN libras.tb_topicos.image IS 'Image do tópico.';
COMMENT ON COLUMN libras.tb_topicos.comment IS 'Comentário do Tópico';
COMMENT ON COLUMN libras.tb_topicos.created_date IS 'Data de criação do registro do usuário.';
=======
COMMENT ON TABLE libras.tb_topics IS 'Tabela que armazena informações sobre os topicos.';

>>>>>>> main
COMMENT ON COLUMN libras.tb_topics.id_topic IS 'Identificador único do tópico.';
COMMENT ON COLUMN libras.tb_topics.word IS 'Palavra do tópivo.';
COMMENT ON COLUMN libras.tb_topics.description IS 'Descrição da palavra.';
COMMENT ON COLUMN libras.tb_topics.image IS 'Image do tópico.';
COMMENT ON COLUMN libras.tb_topics.comment IS 'Comentário do Tópico';
COMMENT ON COLUMN libras.tb_topics.created_date IS 'Data de criação do registro do usuário.';
<<<<<<< HEAD
=======
>>>>>>> 9b0a2cbff9ea2a222e43500a94516e7411e1ce7b
>>>>>>> main
