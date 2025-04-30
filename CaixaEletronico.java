package Aula13;

import java.util.Scanner;

public class CaixaEletronico {
	
	public static void main(String[] args) {
		
		//DECLARANDO VARIAVEIS
		int opçao;
		double saldo = 0;
		double saque;
		
		Scanner ler = new Scanner(System.in);
		
		while (true) {
			System.out.println("Bem-Vindo ao caixa eletrônico!");
			System.out.println("(1) Ver Saldo");
			System.out.println("(2) Depositar");
			System.out.println("(3) Sacar");
			System.out.println("(4) Sair");
			System.out.println("Escolha uma das opçoes: ");
			opçao = ler.nextInt();
			
			switch (opçao) {
            case 1:
                System.out.println("Seu saldo é: R$ " + saldo);
                break;
            case 2:
                System.out.print("Digite o valor a ser depositado: R$ ");
                saldo += ler.nextDouble();
                System.out.println("Depósito realizado.");
                break;
            case 3:
                System.out.print("Digite o valor a ser sacado: R$ ");
                saque = ler.nextDouble();
                if (saque <= saldo) {
                    saldo -= saque;
                    System.out.println("Saque realizado.");
                } else {
                    System.out.println("Saldo insuficiente.");
                }
                break;
            case 4:
                System.out.println("Saindo do caixa eletrônico. Até logo!");
                ler.close();
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
        System.out.println(); 
    }
}
}