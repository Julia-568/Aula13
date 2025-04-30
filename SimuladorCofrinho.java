package Aula13;

import java.util.Scanner;

public class SimuladorCofrinho {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double total = 0.0;
        int quantidadeMoedas = 0;
        double valor;

        do {
            System.out.print("Insira o valor da moeda (ou digite um valor negativo para parar): ");
            valor = ler.nextDouble();

            if (valor >= 0) {
                total += valor;
                quantidadeMoedas++;
            } else {
                System.out.println("Você escolheu parar.");
            }
        } while (valor >= 0);

        System.out.println("Total de moedas inseridas: " + quantidadeMoedas);
        System.out.printf("Total acumulado R$ " + total);

        ler.close();
	}

}
