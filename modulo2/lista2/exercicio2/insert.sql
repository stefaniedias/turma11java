INSERT INTO tb_categoria (nome, marca) VALUES
("frangos", "sadia"),
("bovinos", "friboi"),
("peixes", "barramar"),
("ovos", "ono"),
("veganos", "seara");

Select*from tb_categoria;

INSERT INTO tb_produto (nome, quantidade, id_categoria, peso, tipo, preco) VALUES
("coxa de frango", "01", "1", "2", "frangos","24.00"),
("frango inteiro", "02", "1", "40", "frangos","49.00"),
("alcatra", "03", "2", "50", "bovinos","64.00"),
("atum", "3", "3", "20", "peixes","27.00"),
("sardinha", "03", "3", "25", "peixes","30.00"),
("ovos de codorna", "12", "4", "10", "ovos","15.00"),
("ovos vermelhos", "12", "4", "13", "ovos","20.00"),
("carne de soja", "01", "5", "3", "veganos","30.00");

Select*from tb_produto;


