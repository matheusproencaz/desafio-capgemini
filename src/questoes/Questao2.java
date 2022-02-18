package questoes;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Classe da Quest�o 2 do Desafio Capgemini.
* @author: Matheus Proen�a
*/

public class Questao2 {

	public static void main(String[] args) {

		//Entrada de dados com Scanner.s
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma senha:");
		
		//Vari�vel booleana inicializada.
		boolean senhaAceita = false;
		
		//Do..While para repetir a verifica��o da senha caso ela n�o seja v�lida
		do {
			String senha = sc.nextLine();
			senhaAceita = verificacao(senha);

		} while (!senhaAceita);
		
		sc.close();
	}

	// M�todo de verica��o para mandar mensagens personalizadas, retornando um
	// booleano para utilizar o la�o do..while e verifica��o nos testes.
	public static boolean verificacao(String senha) {
		
		// if's utilizados para verificar qual texto ser� mostrado quaso a senha n�o seja v�lida.
		if (numMinCaracteres(senha) || !contemCaractereEspecial(senha) || !contemCaractereUpOuLowerCase(senha)
				|| !contemDigito(senha)) {
			System.out.print("Senha Inv�lida!");

			if (numMinCaracteres(senha)) {
				System.out.print(" Digite mais " + (6 - senha.length()) + " digitos.");
			}

			if (!contemCaractereEspecial(senha)) {
				System.out.print(" N�o cont�m caractere especial.");
			}

			if (!contemCaractereUpOuLowerCase(senha)) {
				System.out.print(" N�o cont�m caractere mai�sculo ou min�sculo.");
			}

			if (!contemDigito(senha)) {
				System.out.print(" N�o cont�m nenhum digito.");
			}

			System.out.print("\n\nDigite novamente:");
			return false;
		} else {
			System.out.println("Senha V�lida!");
			System.out.println(senha);
			return true;
		}

	}

	// M�todo para verificar se uma string tem mais que 6 caracteres, retornando um
	// booleano.
	public static boolean numMinCaracteres(String senha) {
		return (senha.length() < 6);
	}

	/*
	 * M�todo que verifica se uma String tem pelo menos 1 caractere especial
	 * utilizando express�es regulares com o Pattern e Matcher.
	 */
	public static boolean contemCaractereEspecial(String senha) {
		Pattern p = Pattern.compile("^(?=.*[!@#$%^&*()-+]).+$");

		Matcher m = p.matcher(senha);

		return (m.matches());
	}

	/*
	 * M�todo que verifica se uma String tem pelo menos 1 digito utilizando
	 * express�es regulares com o Pattern e Matcher.
	 */
	public static boolean contemDigito(String senha) {
		Pattern p = Pattern.compile("^(?=.*[0-9]).+$");

		Matcher m = p.matcher(senha);

		return (m.matches());
	}

	/* M�todo que verifica se uma String tem pelo menos 1 caractere de a � z,
	* mai�sculo ou min�sculo.
	*/
	public static boolean contemCaractereUpOuLowerCase(String senha) {
		Pattern p = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z]).+$");

		Matcher m = p.matcher(senha);

		return (m.matches());
	}
}