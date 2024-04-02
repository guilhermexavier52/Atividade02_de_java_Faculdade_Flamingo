package exercicios02;

/*
 * Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é 
 * F = (9*C + 160)/5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
 * */

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da temperatura em Celsius
        System.out.println("Digite a temperatura em graus Celsius:");
        double temperaturaCelsius = scanner.nextDouble();

        // Conversão para Fahrenheit usando a fórmula fornecida
        double temperaturaFahrenheit = (9 * temperaturaCelsius + 160) / 5;

        // Exibição da temperatura convertida em Fahrenheit
        System.out.printf( temperaturaCelsius +" ºC Graus Celsius equivalem a " + temperaturaFahrenheit +  " ºF Graus Fahrenheit" );;

        scanner.close();
    }

}
