package Aula13;

import java.util.Scanner;

public class NumerosMagicos {
	
	public static void main(String[] args) {
		
		//DECLARANDO VARIAVEIS
		int num;
		int primo = 1;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o número para descobrir se é primo ou não: ");
		num = ler.nextInt();
		
		if (num <= 1) {
			primo = 0;
		}
		
		else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					primo = 0;
					break;
				}
			}
		}
		
		if (primo == 1) {
			System.out.println(num + " é um número primo. ");
		}
		else {
			System.out.println(num + " não é um número primo. ");
		}
		
		ler.close();
	}

}