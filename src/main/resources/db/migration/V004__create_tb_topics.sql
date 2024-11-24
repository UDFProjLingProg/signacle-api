CREATE TABLE IF NOT EXISTS libras.tb_topics
( 
    id_topic UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    word VARCHAR NOT NULL,
    description VARCHAR,
    image VARCHAR NOT NULL,
    video VARCHAR,
    comment VARCHAR,
    created_date    TIMESTAMP NOT NULL DEFAULT now()
); 

COMMENT ON TABLE libras.tb_topics IS 'Tabela que armazena informações sobre os topicos.';

COMMENT ON COLUMN libras.tb_topics.id_topic IS 'Identificador único do tópico.';
COMMENT ON COLUMN libras.tb_topics.word IS 'Palavra do tópivo.';
COMMENT ON COLUMN libras.tb_topics.description IS 'Descrição da palavra.';
COMMENT ON COLUMN libras.tb_topics.image IS 'Image do tópico.';
COMMENT ON COLUMN libras.tb_topics.comment IS 'Comentário do Tópico';
COMMENT ON COLUMN libras.tb_topics.created_date IS 'Data de criação do registro do usuário.';

alter table libras.tb_topics
    add id_course UUID
        constraint tb_topics_tb_course_id_course_fk
            references libras.tb_course;