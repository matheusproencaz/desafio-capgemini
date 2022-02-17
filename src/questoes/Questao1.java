package questoes;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Scanner para ler o valor de n;
		System.out.print("n=");
		int n = sc.nextInt();
		/*
		 * La�os de repeti��o "for" basicamente o que eles fazem � dada um n�mero
		 * "n" de degraus � imprimido o n�mero de espa�os menos  a vari�vel de incremento
		 * do primeiro for, dessa forma o n�mero de espa�os ir� diminuir a cada "degrau"
		 * j� os aster�sticos aumentam conforme i aumenta.
		 * println no final para pular para o pr�xima linha/"degrau".
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











