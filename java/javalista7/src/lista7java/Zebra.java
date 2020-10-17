package lista7java;

public class Zebra extends animal {
	
	public Zebra(String nome, int idade) {
		super(nome, idade);
		
	}
	
	@Override
	public void emitirSom () {
		System.out.println("zurrar");
	}
	
	public void correr () {
		System.out.println("correndo");
	}

}

}
