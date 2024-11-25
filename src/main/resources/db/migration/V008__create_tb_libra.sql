CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS libras.tb_libra
(
    id_libra        UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    name            VARCHAR,
    description     VARCHAR,
    url_image       VARCHAR,
    url_video       VARCHAR,
    id_topic        UUID NOT NULL,
    created_date    TIMESTAMP NOT NULL,
    CONSTRAINT fk_topic FOREIGN KEY (id_topic) REFERENCES libras.tb_topics (id_topic)
);

COMMENT ON TABLE libras.tb_libra IS 'Tabela que armazena informações sobre as libras.';

COMMENT ON COLUMN libras.tb_libra.id_libra IS 'Identificador único da libra.';
COMMENT ON COLUMN libras.tb_libra.name IS 'Nome da libra';
COMMENT ON COLUMN libras.tb_libra.description IS 'Descrição da libra';
COMMENT ON COLUMN libras.tb_libra.url_image IS 'Url onde a imagem está hospedada.';
COMMENT ON COLUMN libras.tb_libra.url_video IS 'Url onde o vídeo está hospedada.';
COMMENT ON COLUMN libras.tb_libra.id_topic IS 'FK do topico.';
COMMENT ON COLUMN libras.tb_libra.created_date IS 'Data de criação do registro da libra.';