package questoes;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Scanner para ler o valor de n;
		System.out.print("n=");
		int n = sc.nextInt();

		/* La�o for para imprimir a "escada";
		 * 
		 * No primeiro for ele s� ir� aumentar at� chegar no valor digitado, ou seja
		 * ir� de 0 at� n, assim ser� imprimindo um "*" e pulando uma linha por conta do
		 * println. 
		 * 
		 * No segundo for ele ir� de 0 at� i, e por conta do print vai digitar os "*" na
		 * mesma linha.
		 * 
		 * */
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		sc.close();
	}
}