package questoes;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Classe da Quest�o 1 do Desafio Capgemini.
* @author: Matheus Proen�a
*/

public class Questao1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Scanner para ler o valor de n;
		System.out.print("n=");
		//Try catch para impedir do usu�rio digitar algum caractere que n�o seja n�mero.
		try {
			int n = sc.nextInt();
			System.out.println(gerarEscada(n).toString());
		}catch(InputMismatchException e) {
			System.out.println("Digite um n�mero!"); 
		}
		sc.close();
	}
	/*
	 * La�os de repeti��o "for" basicamente o que eles fazem � dada um n�mero
	 * "n" de degraus � imprimido o n�mero de espa�os menos  a vari�vel de incremento
	 * do primeiro for, dessa forma o n�mero de espa�os ir� diminuir a cada "degrau"
	 * j� os aster�sticos aumentam conforme i aumenta.
	 * println no final para pular para o pr�xima linha/"degrau".
	 * StringBuilder utilizado para poder retornar o m�todo com string.
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