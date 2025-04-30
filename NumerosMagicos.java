package Aula13;

import java.util.Random;
import java.util.Scanner;

public class NumerosMagicos {
	
	public static void main(String[] args) {
		
		//DECLARANDO VARIAVEIS
		int numeroMagico;
		int escolha;
		int acertos = 0;
		int erros = 0;
		
		Scanner ler = new Scanner(System.in);
		Random random = new Random();
		
		for (int i = 1; i <= 5; i++) {
			
			numeroMagico = random.nextInt(50);
			
		System.out.println("Tente adivinhar o número: ");
		escolha = ler.nextInt();
		}
		
		if (escolha == numeroMagico) {
			System.out.println("Parabéns, você acertou!");
			acertos++;
		} else  {
			System.out.println("Não foi dessa vez!");
			erros++;
		}
	
		System.out.println("Acertos " + acertos);
		System.out.println("Erros " + erros);
	}
}
