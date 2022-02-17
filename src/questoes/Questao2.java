package questoes;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma senha!");
		boolean validation = false;

		// La�o do..while apenas por comodidade para repetir do c�digo caso a senha n�o for aceita.
		do {
			// Entrada - Ler um valor digitado utilizando Scanner.
			String senha = sc.nextLine();

			if (numMinCaracteres(senha) || !contemCaractereEspecial(senha) || !contemCaractereUpOuLowerCase(senha)) {
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

				System.out.print("\n\nDigite novamente:");
			} else {
				System.out.println("Senha V�lida!");
				System.out.println(senha);
				validation = true;
			}

		} while (!validation);

		sc.close();
	}

	// M�todo para verificar se uma string tem mais que 6 caracteres, retornando um booleano.
	public static boolean numMinCaracteres(String senha) {
		return (senha.length() < 6);
	}

	/*
	 * M�todo que verifica se uma String tem pelo menos 1 caractere especial utilizando express�es regulares
	 * com o Pattern e Matcher.
	 */
	public static boolean contemCaractereEspecial(String senha) {
		Pattern p = Pattern.compile("^(?=.*[!@#$%^&*()-+]).+$");

		Matcher m = p.matcher(senha);

		return (m.matches());
	}

	// M�todo que verifica se uma String tem pelo menos 1 caractere de a � z, mai�sculo ou min�sculo.
	public static boolean contemCaractereUpOuLowerCase(String senha) {
		Pattern p = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z]).+$");

		Matcher m = p.matcher(senha);

		return (m.matches());
	}
}