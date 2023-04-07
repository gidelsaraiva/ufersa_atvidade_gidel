
/*Crie um algorítimo em java utilizando a for, que leia do usuário um número inicial e um número final. 
 * Em seguida, exiba na tela uma sequência com os números desse*/


import java.util.Scanner;
public class Questao_16_for {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o número inicial: ");
    int numInicial = scanner.nextInt();
    System.out.print("Digite o número final: ");
    int numFinal = scanner.nextInt();

    for (int i = numInicial; i <= numFinal; i++) {
      System.out.print(i + " ");
    }
  }
}

/*Importamos a classe Scanner para permitir a leitura de dados do usuário.
Criamos um objeto Scanner chamado "scanner".
Solicitamos ao usuário que digite o número inicial e armazenamos o valor digitado na variável "numInicial".
Solicitamos ao usuário que digite o número final e armazenamos o valor digitado na variável "numFinal".
Iniciamos a estrutura de repetição "for", com uma variável "i" inicializada com o valor de "numInicial", uma condição de que "i" seja menor ou igual a "numFinal", e um incremento de 1 a cada iteração.
Dentro do bloco de repetição, exibimos o valor de "i" seguido de um espaço em branco.
Ao final do loop, a sequência de números será exibida na tela.*/
