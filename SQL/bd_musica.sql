create database if not exists bd_musica;
use bd_musica;

drop table if exists canciones;

create table if not exists canciones
(
	id_cancion int(2) unsigned zerofill auto_increment not null,
	Titulo varchar(40) not null,
	Genero varchar(40) not null,
	Grupo varchar(40) not null,
	Favorito varchar(1) not null,
	
	primary key (id_cancion)
	
	
)engine innodb
auto_increment 500
max_rows 1000;