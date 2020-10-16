package lista6javaheran�a;

import lista6javaheran�a.heranca.Fornecedor;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Considere, como subclasse da classe Pessoa (desenvolvida no exerc�cio anterior) a classe Fornecedor. 
		 * Considere que cada inst�ncia da classe Fornecedor tem, para al�m dos atributos que caracterizam a classe Pessoa, 
		 * os atributos valorCredito (correspondente ao cr�dito m�ximo atribu�do ao fornecedor) e valorDivida (montante da d�vida para com o fornecedor). 
		 * Implemente na classe Fornecedor, para al�m dos usuais m�todos seletores e modificadores, um m�todo obterSaldo() 
		 * que devolve a diferen�a entre os valores dos atributos valorCredito e valorDivida. Depois de implementada a classe Fornecedor, 
		 * crie um programa de teste adequado que lhe permita verificar o funcionamento dos m�todos implementados na classe Fornecedor 
		 * e os herdados da classe Pessoa. 
		 */
		//Construtor padr�o
		Fornecedor f1 = new Fornecedor();
		//M�todos m�es
		f1.setEndere�o("Rua.Carapicu�ba");
		f1.setNome("Jos�");
		f1.setTelefone("11111-1111");
		//M�todos Pr�rpios
		f1.setValorCredito(100000);
		f1.setValorDivida(23000);
		System.out.println(f1.toString());
		System.out.println(f1.obterSaldo());
		
		
		//Construtor da classe m�e
		Fornecedor f2 = new Fornecedor("Fabiano", 'M');
		f2.setValorCredito(200000);
		f2.setValorDivida(100000);
		System.out.println(f2.toString());
		System.out.println(f2.obterSaldo());
		
		//Construtor Pr�prio
		Fornecedor f3 = new Fornecedor(30000, 4000);
		f3.setEndere�o("Rua.Jovial");
		f3.setNome("Paula");
		f3.setTelefone("11111-1111");
		System.out.println(f3.toString());
		System.out.println(f3.obterSaldo());
		
		//Com heran�a
		Fornecedor f4 = new Fornecedor("Silvia", 'F', 12000.0, 5000);
		f4.setTelefone("3333-3333");
		f4.setEndere�o("Rua.Ningu�m");
		System.out.println(f4.toString());
		System.out.println(f4.obterSaldo());
		
	}


	}

}
