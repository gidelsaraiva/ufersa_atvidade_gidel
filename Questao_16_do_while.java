/*Crie um algorítimo em java utilizando a do-while, que leia do usuário um número inicial e um número final.
 *  Em seguida, exiba na tela uma sequência com os números desse*/

import java.util.Scanner;

public class Questao_16_do_while {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numInicial, numFinal;

    do {
      System.out.print("Digite o número inicial: ");
      numInicial = scanner.nextInt();
      System.out.print("Digite o número final: ");
      numFinal = scanner.nextInt();

      if (numFinal < numInicial) {
        System.out.println("O número final deve ser maior ou igual ao número inicial!");
      }
    } while (numFinal < numInicial);

    int contador = numInicial;
    while (contador <= numFinal) {
      System.out.print(contador + " ");
      contador++;
    }
  }
}

/*Importamos a classe Scanner para permitir a leitura de dados do usuário.
Criamos um objeto Scanner chamado "scanner".
Declaramos as variáveis "numInicial" e "numFinal" sem atribuir valores.
Iniciamos a estrutura de repetição "do-while".
Dentro do bloco de repetição, solicitamos ao usuário que digite o número inicial e o número final, e armazenamos os valores nas variáveis "numInicial" e "numFinal", respectivamente.
Verificamos se o "numFinal" é menor que o "numInicial". Se for, exibimos uma mensagem de erro na tela.
Encerramos o bloco de condição.
A condição do loop "do-while" é que "numFinal" seja maior ou igual a "numInicial". Se a condição não for satisfeita, o loop será repetido.
Inicializamos a variável "contador" com o valor de "numInicial".
Iniciamos a estrutura de repetição "while", com a condição de que o "contador" seja menor ou igual a "numFinal".
Dentro do bloco de repetição, exibimos o valor do "contador" seguido de um espaço em branco.
Incrementamos o valor do "contador" em 1.
Ao final do loop, a sequência de números será exibida na tela.

*/
