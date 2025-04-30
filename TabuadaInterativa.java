package Aula13;

import java.util.Scanner;

public class TabuadaInterativa {
	
	public static void main(String[] args) {
		
		//DECLARANDO VARIAVEIS
		int numero, resultado;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Bem-Vindo, vamos aprender a tabuada!");
		System.out.println("Informe um número: ");
		numero = ler.nextInt();
		
		System.out.println("A tabuada é: ");
		for (int i = 1; i <= 10; i++) {
			resultado = numero*i;
			
		System.out.println(i + "x" + numero + " = " + resultado);
		}
		ler.close();		
	}
}
