CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS libras.user
(
    id_user        UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    username            VARCHAR   NOT NULL,
    password    VARCHAR,
    name      VARCHAR,
    created_date     TIMESTAMP NOT NULL,
);

COMMENT ON TABLE libras.user IS 'Tabela que armazena os dados do usuário.';

COMMENT ON COLUMN libras.user.id_user IS 'Identificador único do usuário.';
COMMENT ON COLUMN libras.user.username IS 'Username do usuário.';
COMMENT ON COLUMN libras.user.password IS 'Senha do usuário.';
COMMENT ON COLUMN libras.user.name IS 'Nome do usuário.';
