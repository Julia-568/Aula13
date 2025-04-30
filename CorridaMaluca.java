package Aula13;

import java.util.Random;
import java.util.Scanner;

public class CorridaMaluca {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Random random = new Random();
		
		String corredor1, corredor2, corredor3;
		int posicao1 = 0;
		int posicao2 = 0;
		int posicao3 = 0;
		
		System.out.println("Bem-vindo a Corrida Maluca!");
		System.out.println("Informe o nome do 1º corredor: ");
		corredor1 = ler.next();
		
		System.out.println("Informe o nome do 2º corredor: ");
		corredor2 = ler.next();
		
		System.out.println("Informe o nome do 3º corredor: ");
		corredor3 = ler.next();
		
		for (int i = 1; i <= 5; i++) {
			posicao1 += random.nextInt(3)+1;
			posicao2 += random.nextInt(3)+1;
			posicao3 += random.nextInt(3)+1;
			
		}
		
		if (posicao1 < posicao2 && posicao1 < posicao3) {
			System.out.println("O corredor " + corredor1 + " é o vencedor!");
		}
		
		else if (posicao2 < posicao1 && posicao2 < posicao3) {
			System.out.println("O corredor " + corredor2 + " é o vencedor!");
		}
		
		else {
			System.out.println("O corredor " + corredor3 + " é o vencedor!");
		}
		
		ler.close();
		
	}

}