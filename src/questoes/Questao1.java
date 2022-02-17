package questoes;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Scanner para ler o valor de n;
		System.out.print("n=");
		int n = sc.nextInt();
		/*
		 * Laços de repetição "for" basicamente o que eles fazem é dada um número
		 * "n" de degraus é imprimido o número de espaços menos  a variável de incremento
		 * do primeiro for, dessa forma o número de espaços irá diminuir a cada "degrau"
		 * já os asterísticos aumentam conforme i aumenta.
		 * println no final para pular para o próxima linha/"degrau".
		 */
		
		for(int i = 1; i <= n; i++) {
			int x = n - i;
			
			for(int j = 0; j < x; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}











