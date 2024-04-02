package exercicios02;

/*
 *  O custo de um carro novo ao consumidor é a soma do custo de fábrica com
 *   a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
 *    Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, 
 *    escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever 
 *    o custo final ao consumidor.
 * */

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do custo de fábrica do carro
        System.out.println("Digite o custo de fábrica do carro:");
        double custoFabrica = scanner.nextDouble();

        // Percentual do distribuidor e dos impostos
        double percentualDistribuidor = 0.28; // 28%
        double percentualImpostos = 0.45; // 45%

        // Cálculo do custo final ao consumidor
        double custoDistribuidor = custoFabrica * percentualDistribuidor;
        double custoImpostos = custoFabrica * percentualImpostos;
        double custoConsumidor = custoFabrica + custoDistribuidor + custoImpostos;

        // Exibição do custo final ao consumidor
        System.out.printf("O custo final ao consumidor é: R$ %.2f\n", custoConsumidor);

        scanner.close();
    }
}
