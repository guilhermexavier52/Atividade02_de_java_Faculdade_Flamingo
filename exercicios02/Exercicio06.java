package exercicios02;

/*  Ler uma temperatura em graus Fahrenheit e apresentá-la convertida 
 * em graus Celsius. A fórmula deconversão é C=(F-32)*(5/9), sendo F a 
 * temperatura em Fahrenheit e C a temperatura em Celsius.*/

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da temperatura em Fahrenheit
        System.out.println("Digite a temperatura em graus Fahrenheit:");
        double temperaturaFahrenheit = scanner.nextDouble();

        // Conversão para Celsius usando a fórmula fornecida
        double temperaturaCelsius = (temperaturaFahrenheit - 32) * (5.0 / 9.0);

        // Exibição da temperatura convertida em Celsius
        System.out.printf(temperaturaFahrenheit +  " ºF Graus Fahrenheit "  +"  Graus Celsius equivalem a "+ temperaturaCelsius +"ºC");

        scanner.close();
    }
}
