/*Construa um programa que leia do usuário um número inicial e um número final. Em seguida, exiba na tela uma sequencia apenas com os
números ímpares dentro deste intervalo informado pelo usuário. Exemplo: caso o usuário entre com os números 4 e 10, o resultado seria: 5 7 9
a) Construa este programa utilizando a estrutura do while*/



import java.util.Scanner;

public class Questao_17_do_while {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inicio, fim;
        
        do {
            System.out.print("Digite o número inicial: ");
            inicio = input.nextInt();
            
            System.out.print("Digite o número final: ");
            fim = input.nextInt();
            
            if (inicio >= fim) {
                System.out.println("Erro: o número inicial deve ser menor que o número final.");
            }
        } while (inicio >= fim);
        
        System.out.print("Números ímpares no intervalo [" + inicio + ", " + fim + "]: ");
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

}
