package exercicios02;

/*Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto

(TEMPO) e a velocidade média (VELOCIDADE) durante a viagem. Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA=TEMPO * VELOCIDADE. Possuindo o valor da

distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula LITROS_USADOS=DISTANCIA/12. Ao final, o programa deve apresentar os valores da velocidade

média (VELOCIDADE), tempo gasto na viagem (TEMPO), a distancia percorrida (DISTANCIA) e a quantidade de litros (LITROS_USADOS) utilizada na viagem.*/

import java.util.Scanner;

public class Exercicio08 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Taxa de consumo do carro em km/litro
	        double taxaConsumo = 12.0;

	        // Leitura do tempo gasto na viagem em horas
	        System.out.println("Digite o tempo gasto na viagem (em horas):");
	        double tempoViagem = scanner.nextDouble();

	        // Leitura da velocidade média durante a viagem em km/h
	        System.out.println("Digite a velocidade média durante a viagem (em km/h):");
	        double velocidadeMedia = scanner.nextDouble();

	        // Cálculo da distância percorrida
	        double distancia = tempoViagem * velocidadeMedia;

	        // Cálculo da quantidade de litros de combustível usada na viagem
	        double litrosUsados = distancia / taxaConsumo;

	        // Exibição dos resultados
	        System.out.println("Velocidade média: " + velocidadeMedia + " km/h");
	        System.out.println("Tempo gasto na viagem: " + tempoViagem + " horas");
	        System.out.println("Distância percorrida: " + distancia + " km");
	        System.out.println("Quantidade de litros de combustível usada na viagem: " + litrosUsados + " litros");

	        scanner.close();
	    }
}
