

/*Construa um programa que leia do usuário um número inicial e um número final. Em seguida, exiba na tela uma sequencia apenas com os
números ímpares dentro deste intervalo informado pelo usuário. Exemplo: caso o usuário entre com os números 4 e 10, o resultado seria: 5 7 9
a) Construa este programa utilizando a estrutura do for*/

import java.util.Scanner;

public class Questao_17_for {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inicio, fim;
        
        System.out.print("Digite o número inicial: ");
        inicio = input.nextInt();
        
        System.out.print("Digite o número final: ");
        fim = input.nextInt();
        
        System.out.print("Números ímpares no intervalo [" + inicio + ", " + fim + "]: ");
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

}

/*Nesse exemplo, o programa utiliza um laço for para percorrer os números no intervalo informado e exibir 
 * na tela apenas os números ímpares.
Primeiro, o programa lê o número inicial e o número final digitados pelo usuário. Em seguida, o programa
 utiliza o laço for para percorrer os números no intervalo informado e verifica se cada número é ímpar.
  Se o número for ímpar, o programa exibe o número na tela.*/

