SELECT * FROM tb_funcionarios INNER JOIN tb_cargo 
WHERE tb_funcionarios.id_cargo = tb_cargo.id_cargo and tb_cargo.salario > 2000.00;

SELECT * FROM tb_funcionarios INNER JOIN tb_cargo 
WHERE tb_funcionarios.id_cargo = tb_cargo.id_cargo and tb_cargo.salario > 1000.00 and tb_cargo.salario < 2000.00 ;

SELECT * FROM tb_funcionarios WHERE nome like 'C%';
