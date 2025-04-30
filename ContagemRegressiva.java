package Aula13;

public class ContagemRegressiva {
	
	public static void main(String[] args) {
		
		int contador = 100; 
		
		System.out.println("Contagem regressiva de 100 a 0! ");
		
		while (contador >= 0) {
			System.out.println(contador);
			contador -= 10;
		}
	}
}
