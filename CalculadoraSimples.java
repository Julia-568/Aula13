package Aula13;

import java.util.Scanner;

public class CalculadoraSimples {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Calculadora Simples");
        System.out.println("Escolha uma operação (+, -, *, /):");
        String operacao = ler.next();

        System.out.print("Digite o primeiro número: ");
        double num1 = ler.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = ler.nextDouble();

        double resultado;

        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println("Resultado: " + num1 + " - " + num2 + " = " + resultado);
                break;
            case "*":
                resultado = num1 * num2;
                System.out.println("Resultado: " + num1 + " * " + num2 + " = " + resultado);
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + num1 + " / " + num2 + " = " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida! Por favor, escolha +, -, * ou /.");
                break;
        }

        ler.close();
    }
}
