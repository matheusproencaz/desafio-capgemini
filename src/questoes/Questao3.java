package questoes;

import java.util.Arrays;

public class Questao3 {

	public static void main(String[] args) {
		
		//Entrada
		String palavra = "ovo";
		
		//Sa�da
		System.out.println(contarAnagramas(palavra));
	}
	
	//M�todo que conta, e passa por todos os pares de anagrama.
	public static int contarAnagramas(String palavra){
		int contador = 0;

		//La�os de repeti��o para achar todos os pares da palavra;
		for(int k = 1; k < palavra.length(); k++) {
			for(int i = 0; i < palavra.length(); i++) {
				for(int j = i + 1; j < palavra.length() - k + 1; j++) {
					/* � interessante pensar neste caso com duas listas de substrings. 
					 * Ex: ovo
					 * 
					 * Os la�os for ir�o basicamente fazer essas duas "listas".
					 * Lista de subStrings 1 : [o, o, v, ov]
					 * Lista de subStrings 2 : [v, o, o, vo]
					 * 
					 * Ent�o se compara os valores das listas na mesma "posi��o", chamando o m�todo eAnagrama().
					 * Se as palavras forem anagramas vai passar no if e adicionar +1 ao contador.
					 * 
					 */
					String subString1 = palavra.substring(i,i+k);
					String subString2 = palavra.substring(j,j+k);

					if(eAnagrama(subString1, subString2)) {
						contador++;
					}
				}
			}
		}
		return contador;
	}
	//M�todo para verificar se uma palavra � anagrama da outra.
	public static boolean eAnagrama(String palavra1, String palavra2) {
		
		//Transforma as Strings em vetores de caracteres.
		char[] char1 = palavra1.toCharArray();
		char[] char2 = palavra2.toCharArray();
		
		//Organizar eles de forma que fiquem iguais caso sejam anagramas.
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		//Se os vetores forem iguais retornar como verdadeiro, caso n�o retornar falso.
		return Arrays.equals(char1,char2);
	}
	
}