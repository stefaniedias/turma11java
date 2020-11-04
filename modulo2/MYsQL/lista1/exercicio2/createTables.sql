use db_rh2;

create table tb_cargo(
id_cargo int not null auto_increment, 
nome varchar(50),
salario decimal (8,2),
primary key (id_cargo)
)engine= innoDB; 

create table tb_funcionarios(
id_funcionarios int not null auto_increment,
nome varchar(50),
idade int,
sexo enum ("M", "F", "outros"),
id_cargo int,
constraint fk_funcionarios_cargo foreign key(id_cargo) references tb_cargo(id_cargo)
) 


