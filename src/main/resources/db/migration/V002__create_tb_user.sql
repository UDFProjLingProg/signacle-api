CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS signacle.tb_users
(
    id_user         UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    first_name      VARCHAR,
    last_name       VARCHAR,
    email           VARCHAR,
    password        VARCHAR,
    created_date     TIMESTAMP NOT NULL,
);

COMMENT ON TABLE signacle.tb_users IS 'Tabela que armazena informações sobre os usuarios.';

COMMENT ON COLUMN signacle.tb_users.id_user IS 'Identificador único do usuário.';
COMMENT ON COLUMN signacle.tb_users.first_name IS 'Primeiro nome do usuário.';
COMMENT ON COLUMN signacle.tb_users.last_name IS 'Sobrenome do usuário.';
COMMENT ON COLUMN signacle.tb_users.email IS 'Endereço de email do usuário.';
COMMENT ON COLUMN signacle.tb_users.password IS 'Senha de acesso do usuário (armazenada de forma segura, em hash).';
COMMENT ON COLUMN signacle.tb_users.created_date IS 'Data de criação do registro do usuário.';