create table usuario(
  idUsuario serial primary key,
  nomeUsuario varchar(50),
  idCidade int,
  foreign key (idCidade) references cidade (idCidade)
);
select * from usuario


create table post(
  idPost serial primary key,
  tipo varchar(30),
  descricao text,
  idCidade int,
  idUsuario int,
  foreign key (idUsuario) references usuario (idUsuario),
  foreign key (idCidade) references cidade (idCidade)
);
select * from post


create table cidade(
  idCidade serial primary key,
  nomeCidade varchar(50),
  ufCidade varchar(2)
);
select * from cidade
