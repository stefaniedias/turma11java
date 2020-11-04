insert into tb_cargo (nome, salario) value
 ("analista de sistemas", "5000.00"),
("Desenvovedor FrontEnd", "8000.00"),
("analista de rh", "4000.00"),
("estagiario", "2000.00"),
("scrum master", "4000"),
("secretario", "3000"),
("desenvolvedor frontEnd", "8000"),
("desenvolvedor backEnd senior"< "12000");

INSERT INTO tb_funcionarios(nome, idade, sexo, id_cargo)values
("marcia", "27", "F", "1"),
("analis", "38", "F", "2"),
("matheus", "23", "M", "3"),
("João", "19", "M", "4"),
("harry", 25, "m ", "5"),
("louis", "21", "M", "6"),
("niall", "28", "M", "7"),
("liam", "28", "M", "8");

SELECT*FROM tb_funcionarios;
SELECT*FROM tb_cargo;

SELECT * FROM tb_funcionarios INNER JOIN tb_cargo WHERE tb_funcionarios.id_cargo = tb_cargo.id_cargo;
