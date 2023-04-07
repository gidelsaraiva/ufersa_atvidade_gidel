/* Construa um programa que leia do usuário um número inicial e um número final. Em seguida, exiba na tela uma sequencia com os números desse
intervalo informado pelo usuário. Exemplo: caso o usuário entre com os números 4 e 10, o resultado do programa seria: 4 5 6 7 8 9 10
a) Construa este programa utilizando a estrutura while*/

import java.util.Scanner;

public class Questao_16_while {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o número inicial: ");
    int numInicial = scanner.nextInt();
    System.out.print("Digite o número final: ");
    int numFinal = scanner.nextInt();

    int contador = numInicial;
    while (contador <= numFinal) {
      System.out.print(contador + " ");
      contador++;
    }
  }
}

/*Importamos a classe Scanner para permitir a leitura de dados do usuário.
Criamos um objeto Scanner chamado "scanner".
Solicitamos ao usuário que digite o número inicial e armazenamos o valor digitado na variável "numInicial".
Solicitamos ao usuário que digite o número final e armazenamos o valor digitado na variável "numFinal".
Criamos uma variável "contador" inicializada com o valor de "numInicial".
Iniciamos a estrutura de repetição "while", com a condição de que o "contador" seja menor ou igual a "numFinal".
Dentro do bloco de repetição, exibimos o valor do "contador" seguido de um espaço em branco.
Incrementamos o valor do "contador" em 1.
Ao final do loop, a sequência de números será exibida na tela.*/

