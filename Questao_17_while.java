
/*Construa um programa que leia do usuário um número inicial e um número final. Em seguida, exiba na tela uma sequencia apenas com os
números ímpares dentro deste intervalo informado pelo usuário. Exemplo: caso o usuário entre com os números 4 e 10, o resultado seria: 5 7 9
a) Construa este programa utilizando a estrutura while*/



import java.util.Scanner;

public class Questao_17_while {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número inicial: ");
        int inicio = input.nextInt();

        System.out.print("Digite o número final: ");
        int fim = input.nextInt();

        while (inicio <= fim) {
            if (inicio % 2 != 0) {
                System.out.print(inicio + " ");
            }
            inicio++;
        }
    }
}

