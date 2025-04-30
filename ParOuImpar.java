package Aula13;

import java.util.Random;
import java.util.Scanner;

public class ParOuImpar {
	
	public static void main(String[] args) {
		
		//DECLARANDO VARIAVEIS
		int numero, soma, aleatorio, escolha;
		
		Scanner ler = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Bem-Vindo ao melhor jogo de números!");
		System.out.println("Escolha 1 para par ou 2 para ímpar: ");
		escolha = ler.nextInt();
		
		System.out.println("Digite um número: ");
		numero = ler.nextInt();
		
		aleatorio = random.nextInt(11);
		
		System.out.println("Número aleatório gerado: " + aleatorio);
		
		soma = numero + aleatorio;
		
		if ((soma % 2 == 0 && escolha == 1) || (soma % 2 != 0 && escolha == 2)) {
            System.out.println("Você ganhou!");
        } else {
            System.out.println("Você perdeu!");
        }
		
		ler.close();
	
	}

}
