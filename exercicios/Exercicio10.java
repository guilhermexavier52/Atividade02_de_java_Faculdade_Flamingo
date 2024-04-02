 package exercicios02;

 /*Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B,
  *  e efetuar a troca dos valores de forma que a variável A passe a possuir o 
  *  valor da variável B e a variável B passe a possuir o valor da variável A. 
  *  Apresentar os valores trocados.*/
 
import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração e leitura das variáveis A e B
        System.out.println("Digite o valor de A:");
        String A = scanner.next();

        System.out.println("Digite o valor de B:");
        String B = scanner.next();

        // Troca dos valores entre A e B usando uma variável temporária
        String temp = A;
        A = B;
        B = temp;

        // Apresentação dos valores trocados
        System.out.println("Valores trocados:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);

        scanner.close();
    }

}
