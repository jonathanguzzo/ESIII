create table Cidade(
	idCidade serial primary key,
	nomeCidade varchar(50),
	uf varchar(2),
	post text
);

insert into Cidade(nomeCidade, uf, post)
values
('Porto Alegre', 'RS', 'Porto Alegre é que tem um jeito legal, é la que as gurias etc e tal...');

insert into Cidade(nomeCidade, uf, post)
values
('Alvorada', 'RS', 'Aqui o pipoco é louco... Agatha vagal...');

insert into Cidade(nomeCidade, uf, post)
values
('Viamão', 'RS', 'mais ou menos, mais ou menos');

select * from Cidade;