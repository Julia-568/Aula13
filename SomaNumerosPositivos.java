package Aula13;

import java.util.Scanner;

public class SomaNumerosPositivos {
	
	public static void main(String[] args) {
		
		//DECLARANDO VARIAVEIS
		int soma = 0, numero;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Informe um número positivo (negativo para sair): ");
			numero = ler.nextInt();
			
			soma = soma + numero;
			
		} while (numero > 0);
		
		soma = soma - numero;
		
		System.out.println("A soma é igual a " + soma);
		
		ler.close();
		}
	}
