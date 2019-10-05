create table cidade
(
   id_cidade integer not null,
   nome_cidade varchar(255) not null,
   nome_simples varchar(255) not null,
   uf varchar(2) not null,
   ddd integer not null,
   cod_ibge integer not null,
   cep_min varchar(8) not null,
   cep_max varchar(8) not null
);
