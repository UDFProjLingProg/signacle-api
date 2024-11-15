CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS libras.tb_roles
(
    id_role         UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    name            VARCHAR,
    created_date    TIMESTAMP NOT NULL
);

COMMENT ON TABLE libras.tb_roles IS 'Tabela que armazena informações sobre os usuários.';

COMMENT ON COLUMN libras.tb_roles.id_role IS 'Identificador único da role.';
COMMENT ON COLUMN libras.tb_roles.name IS 'Nome da Role.';
COMMENT ON COLUMN libras.tb_roles.created_date IS 'Data de criação do registro da Role.';
