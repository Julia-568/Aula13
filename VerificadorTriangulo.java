package Aula13;

import java.util.Scanner;

public class VerificadorTriangulo {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o comprimento do primeiro lado: ");
        double lado1 = ler.nextDouble();

        System.out.print("Digite o comprimento do segundo lado: ");
        double lado2 = ler.nextDouble();

        System.out.print("Digite o comprimento do terceiro lado: ");
        double lado3 = ler.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Os lados formam um triângulo.");

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triângulo é equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("O triângulo é isósceles.");
            } else {
                System.out.println("O triângulo é escaleno.");
            }
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }

        ler.close();
    }
}
