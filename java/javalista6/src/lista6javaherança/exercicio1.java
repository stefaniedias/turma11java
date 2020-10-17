package lista6javaherança;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos 
		 * seletores (getters) e modificadores (setters), e ainda o construtor padrão e pelo menos mais duas opções de construtores 
		 * conforme sua percepção. Atributos: String nome; String endereço; String telefone; 
		 */
		
		ClassPessoa p1 = new ClassPessoa();
		ClassPessoa p2 = new ClassPessoa("Fulano", 'F');
		ClassPessoa p3 = new ClassPessoa("Fabio", "R.Sem fim", "0000-0000", 'M');
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());

		
		
		
	}

}

