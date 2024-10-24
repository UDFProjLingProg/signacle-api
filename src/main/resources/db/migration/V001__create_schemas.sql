CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE SCHEMA IF NOT EXISTS libras;

CREATE TABLE IF NOT EXISTS libras.tb_dicionario_libras
(
    id_video        UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    name_video            VARCHAR   NOT NULL,
    url_video    VARCHAR,
    description      VARCHAR,
    created_date     TIMESTAMP NOT NULL,
);

COMMENT ON TABLE libras.tb_dicionario_libras IS 'Tabela que armazena o dicionário de libras';

COMMENT ON COLUMN libras.tb_dicionario_libras.id_video IS 'Identificador único da libra.';
COMMENT ON COLUMN libras.tb_dicionario_libras.name_video IS 'Nome da libra.';
COMMENT ON COLUMN libras.tb_dicionario_libras.url_video IS 'URL da libra';
COMMENT ON COLUMN libras.tb_dicionario_libras.description IS 'Descrição detalhada da libra.';
