package lista6javaheran�a;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos 
		 * seletores (getters) e modificadores (setters), e ainda o construtor padr�o e pelo menos mais duas op��es de construtores 
		 * conforme sua percep��o. Atributos: String nome; String endere�o; String telefone; 
		 */
		
		ClassPessoa p1 = new ClassPessoa();
		ClassPessoa p2 = new ClassPessoa("Fulano", 'F');
		ClassPessoa p3 = new ClassPessoa("Fabio", "R.Sem fim", "0000-0000", 'M');
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());

		
		
		
	}

}

