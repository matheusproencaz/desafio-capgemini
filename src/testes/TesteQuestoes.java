package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import questoes.Questao1;
import questoes.Questao2;
import questoes.Questao3;

/* Classe de Testes do Desafio Capgemini.
 * @author: Matheus Proença
 */

class TesteQuestoes {
	
	//Teste para verificar se com um número negativo aconteceria algum erro.
	@Test
	void deveriaRetornarStringVaziaComMenos1Degraus() {
		Questao1 q1 = new Questao1();
		assertEquals("", q1.gerarEscada(-1));
	}

	//Teste para verificar se com 0 aconteceria algum erro.
	@Test
	void deveriaRetornarStringVaziaCom0Degraus() {
		Questao1 q1 = new Questao1();
		assertEquals("", q1.gerarEscada(0));
	}
	
	//Teste para verificar o retorno de uma escada com 3 degraus.
	@Test
	void deveriaRetornarStringDeEscadaCom3Degraus() {
		Questao1 q1 = new Questao1();
		assertEquals("  *\n **\n***\n", q1.gerarEscada(3));
	}
	
	//Teste para verificar o retorno de uma escada com 6 degraus.
	@Test
	void deveriaRetornarStringDeEscadaCom6Degraus() {
		Questao1 q1 = new Questao1();
		assertEquals("     *\n    **\n   ***\n  ****\n *****\n******\n", q1.gerarEscada(6));
	}
	
	//Teste para verificar uma senha com menos de seis caracteres
	@Test
	void deveriaRetornarFalsoSenhaMenorQueSeisCaracteres() {
		Questao2 q2  = new Questao2();
		assertEquals(false, q2.verificacao("Y@3a"));
	}
	
	//Teste para verificar uma senha sem caracteres especiais
	@Test
	void deveriaRetornarFalsoSenhaSemCaractereEspecial() {
		Questao2 q2  = new Questao2();
		assertEquals(false, q2.verificacao("Ya3lol"));
	}
	
	//Teste para verificar uma senha sem digitos
	@Test
	void deveriaRetornarFalsoSenhaSemDigito() {
		Questao2 q2  = new Questao2();
		assertEquals(false, q2.verificacao("Ya@lol"));
	}
	
	//Teste para verificar uma senha sem letras maiúsculas
	@Test
	void deveriaRetornarFalsoSenhaSemLetraMaiuscula() {
		Questao2 q2  = new Questao2();
		assertEquals(false, q2.verificacao("ya3@ol"));
	}
	
	//Teste para verificar uma senha sem letras minúsculas
	@Test
	void deveriaRetornarFalsoSenhaSemLetraMinuscula() {
		Questao2 q2  = new Questao2();
		assertEquals(false, q2.verificacao("YA3@OL"));
	}
	
	//Teste para verificar uma senha com todos as requisições atendidas
	@Test
	void deveriaRetornarVerdadeiroVerificacaoSenhaCorreta() {
		Questao2 q2  = new Questao2();
		assertEquals(true, q2.verificacao("Ya3&ba"));
	}
	
	//Teste de contagem de anagramas da palavra "ovo"
	@Test
	void deveriaRetornar2ContagemAnagrama() {
		Questao3 q3 = new Questao3();
		assertEquals(2, q3.contarAnagramas("ovo"));
	}
	
	//Teste de contagem de anagramas da palavra "ifailuhkqq"
	@Test
	void deveriaRetornar3ContagemAnagrama() {
		Questao3 q3 = new Questao3();
		assertEquals(3, q3.contarAnagramas("ifailuhkqq"));
	}
	
	//Teste para verificar se "ov" e "vo" são anagramas retornando verdadeiro
	@Test
	void deveriaRetornarVerdadeiroEAnagramas() {
		Questao3 q3 = new Questao3();
		assertEquals(true, q3.eAnagrama("ov", "vo"));
	}
	
	//Teste para verificar se "la" e "ar" são anagramas retornando falso
	@Test
	void deveriaRetornarFalsoEAnagramas() {
		Questao3 q3 = new Questao3();
		assertEquals(false, q3.eAnagrama("la", "ar"));
	}
	
	//Teste para verificar se "Ov" e "vo" são anagramas retornando verdadeiro
	@Test
	void deveriaRetornarVerdadeiroEAnagramasComCaracteresDiferentes() {
		Questao3 q3 = new Questao3();
		assertEquals(true, q3.eAnagrama("Ov", "vo"));
	}
	
	//Teste para verificar se os digitos "123" e "321" são anagramas retornando verdadeiro
	@Test
	void deveriaRetornarVerdadeiroEAnagramasComDigitos() {
		Questao3 q3 = new Questao3();
		assertEquals(true, q3.eAnagrama("123", "321"));
	}
}