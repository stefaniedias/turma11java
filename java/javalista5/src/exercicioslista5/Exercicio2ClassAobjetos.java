package exercicioslista5;

public class Exercicio2ClassAobjetos {
	

	public static void main(String[] args) {
		
		
       Aviao av = new Aviao();
		
		av.nome = "Liner";
		av.cor = "branco";
		av.asas = 2;
		av.velocidade = 600;
		
		
		
		System.out.println("nome :"+av.nome );
		System.out.println("Cor :"+av.cor );
		System.out.println("Numero de Asas :"+av.asas );
		System.out.println("Velocidade Atual :"+av.velocidade );
		
		av.voando();
		
		System.out.println("O avião está "+av.estado);

		av.subir();
		
		System.out.println("O avião está "+av.estado);
		
		av.virarDireita();
		
		System.out.println("O avião está "+av.estado);
		

		av.virarEsquerda();
		
		System.out.println("O avião está "+av.estado);

		av.descer();
		
		System.out.println("O avião está "+av.estado);

	}

}
}
