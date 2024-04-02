package exercicios02;

/* Efetuar o cálculo e a apresentação do valor de uma prestação em atraso,
 *  utilizando a fórmula PRESTACAO=VALOR+(VALOR*TAXA/100)*TEMPO).*/

import java.util.Scanner;

public class Exercicio09 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Leitura do valor da prestação, taxa de juros e tempo de atraso
	        System.out.println("Digite o valor da prestação:");
	        double valorPrestacao = scanner.nextDouble();

	        System.out.println("Digite a taxa de juros (em %):");
	        double taxaJuros = scanner.nextDouble();

	        System.out.println("Digite o tempo de atraso (em meses):");
	        double tempoAtraso = scanner.nextDouble();

	        // Cálculo do valor da prestação em atraso
	        double prestacaoAtraso = valorPrestacao + (valorPrestacao * taxaJuros / 100) * tempoAtraso;

	        // Exibição do valor da prestação em atraso
	        System.out.printf("O valor da prestação em atraso é: R$ %.2f\n", prestacaoAtraso);

	        scanner.close();
	    }
}
