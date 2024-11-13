CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS signacle.tb_course
(
    id_course       UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    name            VARCHAR,
    url_image       VARCHAR,
    url_video       VARCHAR,
    created_date    TIMESTAMP NOT NULL,
);

COMMENT ON TABLE signacle.tb_course IS 'Tabela que armazena informações sobre os cursos.';

COMMENT ON COLUMN signacle.tb_course.id_course IS 'Identificador único do curso.';
COMMENT ON COLUMN signacle.tb_course.name IS 'Nome do curso';
COMMENT ON COLUMN signacle.tb_course.url_image IS 'Url onde a imagem está hospedada.';
COMMENT ON COLUMN signacle.tb_course.url_video IS 'Url onde o vídeo está hospedada.';
COMMENT ON COLUMN signacle.tb_course.created_date IS 'Data de criação do registro do curso.';