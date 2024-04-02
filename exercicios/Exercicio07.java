package exercicios02;

/*Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: Volume = π*Raio2*Altura*/

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Valor de pi
        double pi = Math.PI;

        // Leitura do raio e altura da lata
        System.out.println("Digite o raio da lata (em centímetros):");
        double raio = scanner.nextDouble();

        System.out.println("Digite a altura da lata (em centímetros):");
        double altura = scanner.nextDouble();

        // Cálculo do volume da lata
        double volume = pi * Math.pow(raio, 2) * altura;

        // Exibição do volume da lata
        System.out.println("O volume da lata de óleo é: " + volume + " centímetros cúbicos.");

        scanner.close();
    }
	
}
