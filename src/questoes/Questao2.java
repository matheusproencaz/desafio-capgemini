package questoes;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Classe da Questão 2 do Desafio Capgemini.
* @author: Matheus Proença
*/

public class Questao2 {

	public static void main(String[] args) {

		//Entrada de dados com Scanner.s
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma senha:");
		
		//Variável booleana inicializada.
		boolean senhaAceita = false;
		
		//Do..While para repetir a verificação da senha caso ela não seja válida
		do {
			String senha = sc.nextLine();
			senhaAceita = verificacao(senha);

		} while (!senhaAceita);
		
		sc.close();
	}

	// Método de vericação para mandar mensagens personalizadas, retornando um
	// booleano para utilizar o laço do..while e verificação nos testes.
	public static boolean verificacao(String senha) {
		
		// if's utilizados para verificar qual texto será mostrado quaso a senha não seja válida.
		if (numMinCaracteres(senha) || !contemCaractereEspecial(senha) || !contemCaractereUpOuLowerCase(senha)
				|| !contemDigito(senha)) {
			System.out.print("Senha Inválida!");

			if (numMinCaracteres(senha)) {
				System.out.print(" Digite mais " + (6 - senha.length()) + " digitos.");
			}

			if (!contemCaractereEspecial(senha)) {
				System.out.print(" Não contém caractere especial.");
			}

			if (!contemCaractereUpOuLowerCase(senha)) {
				System.out.print(" Não contém caractere maiúsculo ou minúsculo.");
			}

			if (!contemDigito(senha)) {
				System.out.print(" Não contém nenhum digito.");
			}

			System.out.print("\n\nDigite novamente:");
			return false;
		} else {
			System.out.println("Senha Válida!");
			System.out.println(senha);
			return true;
		}

	}

	// Método para verificar se uma string tem mais que 6 caracteres, retornando um
	// booleano.
	public static boolean numMinCaracteres(String senha) {
		return (senha.length() < 6);
	}

	/*
	 * Método que verifica se uma String tem pelo menos 1 caractere especial
	 * utilizando expressões regulares com o Pattern e Matcher.
	 */
	public static boolean contemCaractereEspecial(String senha) {
		Pattern p = Pattern.compile("^(?=.*[!@#$%^&*()-+]).+$");

		Matcher m = p.matcher(senha);

		return (m.matches());
	}

	/*
	 * Método que verifica se uma String tem pelo menos 1 digito utilizando
	 * expressões regulares com o Pattern e Matcher.
	 */
	public static boolean contemDigito(String senha) {
		Pattern p = Pattern.compile("^(?=.*[0-9]).+$");

		Matcher m = p.matcher(senha);

		return (m.matches());
	}

	/* Método que verifica se uma String tem pelo menos 1 caractere de a à z,
	* maiúsculo ou minúsculo.
	*/
	public static boolean contemCaractereUpOuLowerCase(String senha) {
		Pattern p = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z]).+$");

		Matcher m = p.matcher(senha);

		return (m.matches());
	}
}