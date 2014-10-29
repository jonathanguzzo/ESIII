create table usuario(
  idUsuario serial primary key,
  nomeUsuario varchar(50),
  idCidade int,
  foreign key (idCidade) references cidade (idCidade)
);

update usuario set nomeUsuario = 'Wanderson Lagartixa ' where idUsuario = 3;
select * from usuario

select (usuario.nomeUsuario, cidade.NomeCidade)
from usuario, cidade
where usuario.idCidade = cidade.idCidade and cidade.idCidade=1;

insert into usuario (nomeUsuario, idCidade) values ('Já era o Sauro', 3);

---------------------------------------------------------------------------------------------

create table post(
  idPost serial primary key,
  tipo varchar(30),
  descricao text,
  idCidade int,
  idUsuario int,
  foreign key (idUsuario) references usuario (idUsuario),
  foreign key (idCidade) references cidade (idCidade)
);
select * from post order by idPost
insert into post (tipo, descricao, idCidade, idUsuario, titulo) 
values ('texto', 'Por trás das câmeras: Rick é um homem de palavra. Prometeu, cumpriu.', 3, 3, 'The Walking Dead');

select (usuario.nomeUsuario,
	post.tipo, post.descricao,
	cidade.nomeCidade)
	from usuario, post, cidade
	where (post.idCidade = cidade.idCidade and post.idUsuario = usuario.idUsuario and post.idCidade = 2);

update post set descricao = 'Começou a Mostratec 2014! Nessa edição, o Senac está sendo representado pelos alunos do curso Técnico em Segurança do Trabalho'
where idPost = 3;

update post set titulo = 'Só hoje,promoção de jogos' where idPost = 1;

alter table post add column titulo varchar(30);


--------------------------------------------------------------------------------------------------------------------------------------------------------------------

create table cidade(
  idCidade serial primary key,
  nomeCidade varchar(50),
  ufCidade varchar(2)
);
select * from cidade

insert into cidade(nomeCidade, ufCidade) values ('Alvorada', 'RS');
