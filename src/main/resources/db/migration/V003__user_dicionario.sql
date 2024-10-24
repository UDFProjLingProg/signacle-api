CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS libras.user_dicionario
(
    id_user        UUID,
    id_dicionario  UUID,
    created_date     TIMESTAMP NOT NULL,
);

COMMENT ON TABLE libras.user_dicionario IS 'Tabela que armazena os dados do usuário.';

COMMENT ON COLUMN libras.user_dicionario.id_user IS 'Identificador único do usuário.';
COMMENT ON COLUMN libras.user_dicionario.username IS 'Username do usuário.';
COMMENT ON COLUMN libras.user_dicionario.password IS 'Senha do usuário.';
COMMENT ON COLUMN libras.user_dicionario.name IS 'Nome do usuário.';
