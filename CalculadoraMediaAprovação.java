package Aula13;

import java.util.Scanner;

public class CalculadoraMediaAprovação {
	
	public static void main(String[] args) {
		
		//DECLARANDO VARIAVEIS
		double nota, soma = 0, media;
		int quantidadeNotas = 0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Digite uma nota (ou número negativo para parar): ");
			nota = ler.nextDouble();
		
			if (nota < 0) {
				break;	
		   }
			if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
                continue;
		}
			soma += nota;
            quantidadeNotas++;
	
		}while (true); 

        if (quantidadeNotas > 0) {
            media = soma / quantidadeNotas;
            System.out.println("A média das notas é: " + media);

            if (media >= 7) {
                System.out.println("Aluno aprovado!");
            } else if (media >= 4) {
                System.out.println("Aluno em recuperação!");
            } else {
                System.out.println("Aluno reprovado!");
            }
        } else {
            System.out.println("Nenhuma nota foi registrada.");
        }

        ler.close();
    }
}

