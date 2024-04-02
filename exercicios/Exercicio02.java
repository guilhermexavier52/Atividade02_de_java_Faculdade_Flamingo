package exercicios02;

/*
 * Escreva um algoritmo para ler o número total de eleitores de um município, 
 * o número de votos brancos, nulos e válidos. Calcular e escrever o percentual 
 * que cada um representa em relação ao total de eleitores.
 * */

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
       /* Primeira Tentativa de logica
        * Scanner scanner = new Scanner(System.in);

        // Leitura do número total de eleitores, votos brancos, nulos e válidos
        System.out.println("Digite o número total de eleitores:");
        int totalEleitores = scanner.nextInt();

        System.out.println("Digite o número de votos brancos:");
        int votosBrancos = scanner.nextInt();

        System.out.println("Digite o número de votos nulos:");
        int votosNulos = scanner.nextInt();

        System.out.println("Digite o número de votos válidos:");
        int votosValidos = scanner.nextInt();
        
        // Cálculo dos percentuais
        double percentualBrancos = (double) votosBrancos / totalEleitores * 100;
        double percentualNulos = (double) votosNulos / totalEleitores * 100;
        double percentualValidos = (double) votosValidos / totalEleitores * 100;

        // Exibição dos resultados
        System.out.printf("Percentual de votos brancos: %.2f%%\n", percentualBrancos);
        System.out.printf("Percentual de votos nulos: %.2f%%\n", percentualNulos);
        System.out.printf("Percentual de votos válidos: %.2f%%\n", percentualValidos);

        scanner.close(); */
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o total de votos Brancos: ");
		float votosBrancos = sc.nextFloat();
		System.out.println("Digite o total de votos Nulos: ");
		float votosNutos = sc.nextFloat();
		System.out.println("Digite o total de votos Validos: ");
		float votosValidos = sc.nextFloat();
		
		float totalEleitores = votosBrancos + votosNutos + votosValidos;
		float percBranco = votosBrancos / totalEleitores *100;
		float percNulos = votosNutos/totalEleitores *100;
		float percValidos = votosValidos/totalEleitores *100;
		
		System.out.println("O total de Eleitores " + totalEleitores);
		
		System.out.println("O percentual de votos Brancos " + percBranco + " %");
		System.out.println("O percentual de votos Nulos " + percNulos + " %");
		System.out.println("O percentual de votos Validos " + percValidos + " %");
		
		sc.close();
    }

}
