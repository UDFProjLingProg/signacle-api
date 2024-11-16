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

COMMENT ON TABLE libras.tb_topics IS 'Tabela que armazena informações sobre os topicos.';

COMMENT ON COLUMN libras.tb_topics.id_topic IS 'Identificador único do tópico.';
COMMENT ON COLUMN libras.tb_topics.word IS 'Palavra do tópivo.';
COMMENT ON COLUMN libras.tb_topics.description IS 'Descrição da palavra.';
COMMENT ON COLUMN libras.tb_topics.image IS 'Image do tópico.';
COMMENT ON COLUMN libras.tb_topics.comment IS 'Comentário do Tópico';
COMMENT ON COLUMN libras.tb_topics.created_date IS 'Data de criação do registro do usuário.';