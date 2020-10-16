package lista6javaherança;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Empregado emp = new Empregado("Maria", "R.Cafuné", "8888-8888",'O', 89, 1500.00 );
		
		System.out.println("O salário com desconto de impostos é de: "+ emp.calcularSalario(emp));
		
		
		emp.setNome("Mary");
		
		System.out.println(emp.toString());
	}

}


