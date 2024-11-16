CREATE TABLE if not exists libras.rel_users_roles
(
    id_users uuid NOT NULL,
    id_roles    BIGINT NOT NULL,
    PRIMARY KEY (id_users, id_roles),
    CONSTRAINT fk_users_roles_users FOREIGN KEY (id_users) REFERENCES libras.tb_users (id_user),
    CONSTRAINT fk_users_roles_roles FOREIGN KEY (id_roles) REFERENCES libras.tb_roles (id_role)
);

COMMENT ON COLUMN libras.rel_users_roles.id_roles IS 'Identificador único da role.';
COMMENT ON COLUMN libras.rel_users_roles.id_users IS 'Identificador único do user.';