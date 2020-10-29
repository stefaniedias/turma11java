SELECT *FROM tb_produto WHERE preco > 50.00;

SELECT *FROM tb_produto WHERE preco < 60.00 and preco > 3.00;

SELECT *FROM tb_produto WHERE nome like "%ci%";

SELECT *FROM tb_produto INNER JOIN tb_categoria ON tb_produto.id_categoria = tb_categoria.id_categoria;

SELECT *FROM tb_produto INNER JOIN tb_categoria ON tb_produto.id_categoria = tb_categoria.id_categoria WHERE tb_categoria.nome="bovinos";
