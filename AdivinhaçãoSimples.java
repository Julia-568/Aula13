package Aula13;

import java.util.Random;
import java.util.Scanner;

public class AdivinhaçãoSimples {
	
	public static void main(String[] args) {
		
		//DECLARANDO VARIAVEIS
		int numero, escolha;
		
		Scanner ler = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Escolha um numero de 1 a 10: ");
		escolha = ler.nextInt();
		
		numero = random.nextInt(10)+1;
		
		if(escolha > numero) {
			System.out.println("Menor");
		} 
		else if (escolha < numero) {
			System.out.println("Maior");
		}
		else {
			System.out.println("Parabéns, você acertou!");
		}
	ler.close();
	}

}
