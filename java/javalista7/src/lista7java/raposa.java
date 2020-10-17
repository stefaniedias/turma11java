package lista7java;

public class raposa extends animal {
	
	public raposa(String nome, int idade) {
		super(nome, idade);
		
	}
	
	@Override
	public void emitirSom () {
		System.out.println("regougar");
	}
	
	public void correr () {
		System.out.println("correndo");
	}

}
}
