package questoes;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Classe da Questão 1 do Desafio Capgemini.
* @author: Matheus Proença
*/

public class Questao1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Scanner para ler o valor de n;
		System.out.print("n=");
		//Try catch para impedir do usuário digitar algum caractere que não seja número.
		try {
			int n = sc.nextInt();
			System.out.println(gerarEscada(n).toString());
		}catch(InputMismatchException e) {
			System.out.println("Digite um número!"); 
		}
		sc.close();
	}
	/*
	 * Laços de repetição "for" basicamente o que eles fazem é dada um número
	 * "n" de degraus é imprimido o número de espaços menos  a variável de incremento
	 * do primeiro for, dessa forma o número de espaços irá diminuir a cada "degrau"
	 * já os asterísticos aumentam conforme i aumenta.
	 * println no final para pular para o próxima linha/"degrau".
	 * StringBuilder utilizado para poder retornar o método com string.
	 */
	public static String gerarEscada(int n) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= n; i++) {
			int x = n - i;
			for(int j = 0; j < x; j++) {
				sb.append(" ");
			}
			for(int k = 0; k < i; k++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}