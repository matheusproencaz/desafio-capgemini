<div align="center">
  <img alt="Academia-Capgemini" src="https://capgemini.proway.com.br/assets/img/logo-capgemini.png"/>
</div>

## Programas necessários:

<div>
  <img align="center" width="50" height="50" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg" />
  <img align="center" width="40" height="40" src="https://seeklogo.com/images/E/eclipse-logo-85FE4BEA34-seeklogo.com.png" />
</div>

# Desafio

O Desafio de programação é a terceira etapa do processo de seleção para a Academia Capgemin 2022. O objetivo é testar os conhecimentos em lógica de programação.
Ele foi separado em 3 questões diferentes as quais foram implementadas em JAVA.

**Na pasta src > testes, tem-se uma classe com diversos testes das questões.**

## Questão 1

Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere *
e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter
nenhum espaço.

**Exemplo:**

**Entrada**
```java
n = 6
```
**Saída**
```
     *
    **
   ***
  ****
 *****
******
```

- **Solução - Testes**

<div>
<img src="https://i.imgur.com/gDJN09T.png" title="source: imgur.com" />
</div>


## Questão 2

Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A
página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser
forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:

- Possui no mínimo 6 caracteres.
- Contém no mínimo 1 digito.
- Contém no mínimo 1 letra em minúsculo.
- Contém no mínimo 1 letra em maiúsculo.
- Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+

Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma
senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de
caracteres que devem ser adicionados para uma string qualquer ser considerada segura.

**Exemplo:**
 
**Entrada:**

```
Ya3
```

**Saída**

```
3
```
**Explicação:**
Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab, transformando
a senha em Ya3&ab. 2 caracteres não são suficientes visto que a senha precisa ter um tamanho
mínimo de 6 caracteres.

- **Solução - Testes**

- Teste 1
<div>
<img src="https://i.imgur.com/pMk6yHL.png" title="source: imgur.com" />
</div>

- Teste 2

<div>
<img src="https://i.imgur.com/njQNMk8.png" title="source: imgur.com" />
</div>

## Questão 3

Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra
podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um
algoritmo que encontre o número de pares de substrings que são anagramas.

**Exemplo:**

**Entrada**

```
ifailuhkqq
```
**Saída**
```
3
```
**Explicação**
A lista de todos os anagramas pares são: [i, i], [q, q] e [ifa, fai] que estão nas posições [[0, 3]],
[[8, 9]] e [[0, 1, 2], [1, 2, 3]].

- **Solução - Teste**

<div>
<img src="https://i.imgur.com/NLKTeLD.png" title="source: imgur.com" />
</div>

## Instação do Open JDK 17 - Windows

1. Baixar o openjdk-17.0.1;

2. Copiar o caminho da instalção do java. Ex: C:\Program Files\Java\jdk-17.0.1

3. Ir para o Editar as variáveis de ambiente do sistema

4. Clicar no botão "Variáveis de Ambiente..."

5. Clicar em Novo...

6. No campo "Nome da variável" digitar JAVA_HOME

7. No campo "Valor da variável" digitar o caminho de instalação. Ex: C:\Program Files\Java\jdk-17.0.1

8. Se a variável já existir clicar em Editar e mudar o valor da variável com o caminho

9. Conferir se a variável Path, o valor precisa estar %JAVA_HOME%\bin

## Após a instalação de todos os programas:

File > Open Projects from File System... > Directory... > Selecione a pasta com os arquivos baixados > Finish.
Com o projeto aberto, abrir o pacote questoes e clicar com o botão esquerdo na classe das questões ir em, Run as, Java Application.
