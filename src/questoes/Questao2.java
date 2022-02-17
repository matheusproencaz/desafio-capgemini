package questoes;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma senha!");
		boolean validation = false;

		// Laço do..while apenas por comodidade para repetir do código caso a senha não for aceita.
		do {
			// Entrada - Ler um valor digitado utilizando Scanner.
			String senha = sc.nextLine();

			if (numMinCaracteres(senha) || !contemCaractereEspecial(senha) || !contemCaractereUpOuLowerCase(senha)) {
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

				System.out.print("\n\nDigite novamente:");
			} else {
				System.out.println("Senha Válida!");
				System.out.println(senha);
				validation = true;
			}

		} while (!validation);

		sc.close();
	}

	// Método para verificar se uma string tem mais que 6 caracteres, retornando um booleano.
	public static boolean numMinCaracteres(String senha) {
		return (senha.length() < 6);
	}

	/*
	 * Método que verifica se uma String tem pelo menos 1 caractere especial utilizando expressões regulares
	 * com o Pattern e Matcher.
	 */
	public static boolean contemCaractereEspecial(String senha) {
		Pattern p = Pattern.compile("^(?=.*[!@#$%^&*()-+]).+$");

		Matcher m = p.matcher(senha);

		return (m.matches());
	}

	// Método que verifica se uma String tem pelo menos 1 caractere de a à z, maiúsculo ou minúsculo.
	public static boolean contemCaractereUpOuLowerCase(String senha) {
		Pattern p = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z]).+$");

		Matcher m = p.matcher(senha);

		return (m.matches());
	}
}