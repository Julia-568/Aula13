package Aula13;

import java.util.Scanner;

public class MiniQuiz {
	
	public static void main(String[] args) {
		
		//DECLARANDO VARIAVEIS
		int escolha1, escolha2, escolha3;
		int acertos = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual é o principal gás responsável pelo aquecimento global?");
		System.out.println("Alternativas:"
				+ "(1) Oxigênio,"
				+ " (2) Gás Hélio,"
				+ " (3) Dióxido de carbono,"
				+ " (4) Hidrogênio");
		escolha1 = ler.nextInt();
		
		switch (escolha1) {
		case 1:
			System.out.println("Errado!");
			break;
		case 2:
			System.out.println("Errado!");
			break;
		case 3:
			System.out.println("Correto!");
			acertos++;
			break;
		case 4:
			System.out.println("Errado!");
			break;
			
			default : System.out.println("Inválido!");
		}
		
		System.out.println("Em qual continente fica a maior floresta tropical do mundo?");
		System.out.println("Alternativas:"
				+ "(1) África,"
				+ " (2) América do Sul,"
				+ " (3) Ásia,"
				+ " (4) Europa");
		escolha2 = ler.nextInt();
		
		switch (escolha2) {
		case 1:
			System.out.println("Errado!");
			break;
		case 2:
			System.out.println("Correto!");
			acertos++;
			break;
		case 3:
			System.out.println("Errado!");
			break;
		case 4:
			System.out.println("Errado!");
			break;
			
		    default : System.out.println("Inválido!");
	    }
		
		System.out.println("Qual dessas palavras está escrita corretamente em inglês?");
		System.out.println("Alternativas:"
				+ "(1) Beutiful,"
				+ " (2) Beautifull,"
				+ " (3) Beautiful,"
				+ " (4) Beautifool");
		escolha3 = ler.nextInt();
		
		switch (escolha3) {
		case 1:
			System.out.println("Errado!");
			break;
		case 2:
			System.out.println("Errado!");
			break;
		case 3:
			System.out.println("Correto!");
			acertos++;
			break;
		case 4:
			System.out.println("Errado!");
			break;
			
		    default : System.out.println("Inválido!");
	    }
		
		System.out.println("O resultado de acertos é " + acertos);
		ler.close();
	
     }
}
