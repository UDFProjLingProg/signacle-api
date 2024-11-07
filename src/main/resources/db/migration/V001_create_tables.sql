CREATE table if not exists ti(
	codigo serial primary key,
	assunto varchar(255) not null,
	palavra varchar(255) not null,
	icone bytea not null,
	video varchar(255) not null,
	comentario varchar(255) not null
);
