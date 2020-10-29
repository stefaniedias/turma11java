create database db_cidade_das_carnes;
USE  db_cidade_das_carnes;
 
 CREATE TABLE tb_categoria
( id_categoria int not null auto_increment primary key,
nome varchar(50),
marca varchar(50)
);

CREATE TABLE tb_produto
( id_produto int not null auto_increment primary key,
nome varchar(50),
quantidade int,
id_categoria int,
peso DECIMAL(5,3),
tipo varchar(50),
constraint fk_produto_categoria foreign key(id_categoria) references tb_categoria(id_categoria)
);