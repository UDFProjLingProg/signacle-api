CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS libras.tb_roles
(
  
    id_role         SERIAL PRIMARY KEY,
    name            VARCHAR NOT NULL UNIQUE,
    created_date    TIMESTAMP NOT NULL DEFAULT now()

);

COMMENT ON TABLE libras.tb_roles IS 'Tabela que armazena informações sobre os usuários.';

COMMENT ON COLUMN libras.tb_roles.id_role IS 'Identificador único da role.';
COMMENT ON COLUMN libras.tb_roles.name IS 'Nome da Role.';
COMMENT ON COLUMN libras.tb_roles.created_date IS 'Data de criação do registro da Role.';

INSERT INTO libras.tb_roles (name)
VALUES ('USER')
ON CONFLICT (name) DO NOTHING;

