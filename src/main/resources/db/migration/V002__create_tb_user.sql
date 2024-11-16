CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS libras.tb_users
(
    id_user         UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    first_name      VARCHAR,
    last_name       VARCHAR,
    email           VARCHAR NOT NULL UNIQUE,
    password        VARCHAR,
    account_locked  BOOLEAN,
    enabled         BOOLEAN,
    created_date    TIMESTAMP NOT NULL DEFAULT now()
);

COMMENT ON TABLE libras.tb_users IS 'Tabela que armazena informações sobre os usuários.';

COMMENT ON COLUMN libras.tb_users.id_user IS 'Identificador único do usuário.';
COMMENT ON COLUMN libras.tb_users.first_name IS 'Primeiro nome do usuário.';
COMMENT ON COLUMN libras.tb_users.last_name IS 'Sobrenome do usuário.';
COMMENT ON COLUMN libras.tb_users.email IS 'Endereço de email do usuário.';
COMMENT ON COLUMN libras.tb_users.account_locked IS 'Verificação se a conta do usuário está blockeada.';
COMMENT ON COLUMN libras.tb_users.enabled IS 'Verificação se a conta do usuário está ativada.';
COMMENT ON COLUMN libras.tb_users.password IS 'Senha de acesso do usuário (armazenada de forma segura, em hash).';
COMMENT ON COLUMN libras.tb_users.created_date IS 'Data de criação do registro do usuário.';
