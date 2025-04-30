package Aula13;

import java.util.Scanner;

public class SequenciaFibonacci {
	
	public static void main(String[] args) {
		
		//DECLARANDO VARIAVEIS
		int a = 0, b = 1, c, N;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Bem-Vindo a sequência Fibonacci!");
		System.out.println("Digite a quantidade de termos da sequência de Fibonacci: ");
		N = ler.nextInt();
		
		System.out.println(a + " " + b + " ");
		
		for(int i = 2; i <= N; i++) {
			c = a + b;	
		    System.out.println(c + " ");
		    a = b;
		    b = c;
		}
		ler.close();
	}
}