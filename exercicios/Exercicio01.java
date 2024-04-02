package exercicios02;

/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos,
  meses e dias e escreva a idade dessa pessoa expressa apenas em dias. 
  Considerar ano com 365 dias e mês com 30 dias.
 */
		
import java.util.Scanner;

public class Exercicio01 {
	
	 public static void main(String[] args) {
	       /* Primeira Tentativa
	        * Scanner scanner = new Scanner(System.in);

	        // Leitura da idade da pessoa em anos, meses e dias
	        System.out.println("Digite a idade da pessoa em anos, meses e dias:");
	        
	        System.out.print("Anos: ");
	        int anos = scanner.nextInt();
	       
	        // Cálculo da idade total em dias
	        int idadeEmDias = (anos * 365) + (12 * 30) + 365;

	        // Exibição da idade total em dias
	        System.out.println("A idade da pessoa em dias é: " + idadeEmDias + " dias");

	        scanner.close(); */
		 
		    Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite sua idade completa atual: ");
			int idade = sc.nextInt();
			
			System.out.println("Digite a quantidade de meses que passou do seu último aniverssario: ");
			int mes= sc.nextInt();
			
			System.out.println("digite a quantidade de dias do seu último mesverssario ");
			int dias = sc.nextInt();
			
			int quantidadeDiasVividos= idade*365+mes*30+dias;
			
			System.out.println("A quantidade de dias vividos " + quantidadeDiasVividos);
			
			sc.close();
		 
	    }

}
