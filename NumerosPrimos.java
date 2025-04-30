package Aula13;

import java.util.Scanner;

public class NumerosPrimos {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
        int numero = ler.nextInt();
        
        if (numero <= 1) {
            System.out.println(numero + " não é um número primo.");
        } else {
            boolean primo = true; 

            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false; 
                    break; 
                }
            }

            if (primo) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
            }
        }
        
        ler.close();
    }
}