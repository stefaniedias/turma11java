package lista6javaherança;

import lista6javaherança.heranca.Fornecedor;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Considere, como subclasse da classe Pessoa (desenvolvida no exercício anterior) a classe Fornecedor. 
		 * Considere que cada instância da classe Fornecedor tem, para além dos atributos que caracterizam a classe Pessoa, 
		 * os atributos valorCredito (correspondente ao crédito máximo atribuído ao fornecedor) e valorDivida (montante da dívida para com o fornecedor). 
		 * Implemente na classe Fornecedor, para além dos usuais métodos seletores e modificadores, um método obterSaldo() 
		 * que devolve a diferença entre os valores dos atributos valorCredito e valorDivida. Depois de implementada a classe Fornecedor, 
		 * crie um programa de teste adequado que lhe permita verificar o funcionamento dos métodos implementados na classe Fornecedor 
		 * e os herdados da classe Pessoa. 
		 */
		//Construtor padrão
		Fornecedor f1 = new Fornecedor();
		//Métodos mães
		f1.setEndereço("Rua.Carapicuíba");
		f1.setNome("José");
		f1.setTelefone("11111-1111");
		//Métodos Prórpios
		f1.setValorCredito(100000);
		f1.setValorDivida(23000);
		System.out.println(f1.toString());
		System.out.println(f1.obterSaldo());
		
		
		//Construtor da classe mãe
		Fornecedor f2 = new Fornecedor("Fabiano", 'M');
		f2.setValorCredito(200000);
		f2.setValorDivida(100000);
		System.out.println(f2.toString());
		System.out.println(f2.obterSaldo());
		
		//Construtor Próprio
		Fornecedor f3 = new Fornecedor(30000, 4000);
		f3.setEndereço("Rua.Jovial");
		f3.setNome("Paula");
		f3.setTelefone("11111-1111");
		System.out.println(f3.toString());
		System.out.println(f3.obterSaldo());
		
		//Com herança
		Fornecedor f4 = new Fornecedor("Silvia", 'F', 12000.0, 5000);
		f4.setTelefone("3333-3333");
		f4.setEndereço("Rua.Ninguém");
		System.out.println(f4.toString());
		System.out.println(f4.obterSaldo());
		
	}


	}

}
