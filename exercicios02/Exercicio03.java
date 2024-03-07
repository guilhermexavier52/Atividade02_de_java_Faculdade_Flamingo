package exercicios02;

/*
 * Escreva um algoritmo para ler o salário mensal atual de um funcionário
 * e o percentual de reajuste. Calcular e escrever o valor do novo salário.
 * */

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do salário mensal atual e do percentual de reajuste
        System.out.println("Digite o salário mensal atual do funcionário:");
        double salarioAtual = scanner.nextDouble();

        System.out.println("Digite o percentual de reajuste:");
        double percentualReajuste = scanner.nextDouble();

        // Cálculo do valor do novo salário
        double novoSalario = salarioAtual + (salarioAtual * (percentualReajuste / 100));

        // Exibição do novo salário
        System.out.printf("O novo salário do funcionário é: R$ %.2f\n", novoSalario);

        scanner.close();
    }

}
