package lista7java;

public class gato extends animal {

	public gato(String nome, int idade) {
		super(nome,idade);
		
	}
	
	@Override
	public void emitirSom () {
		System.out.println("miau miau miau");
	}
	
	public void correr () {
		System.out.println("pulando em objetos");


	}

}
