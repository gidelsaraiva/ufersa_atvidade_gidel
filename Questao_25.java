/*Construa um programa pra ler e exibir um vetor de inteiros. Em tempo de execução, o usuário pode definir
 * o tamanho do vetor.*/

import java.util.Scanner;

public class Questao_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Solicita ao usuário o tamanho do vetor
        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = input.nextInt();
        
        int[] vetor = new int[tamanho];
        
        // Loop para ler os valores do vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o valor do elemento %d: ", i);
            vetor[i] = input.nextInt();
        }
        
        // Loop para exibir os valores do vetor
        System.out.println("Valores do vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}

/*O programa começa solicitando ao usuário o tamanho do vetor, utilizando a classe Scanner da biblioteca padrão do Java. Em seguida, o programa cria um vetor de inteiros com o tamanho definido pelo usuário.

O programa entra em um loop para ler os valores do vetor, utilizando o método nextInt() da classe Scanner para ler um valor inteiro do teclado. Os valores lidos são armazenados no vetor.

Depois de ler todos os valores do vetor, o programa entra em um novo loop para exibir os valores lidos. Cada valor é exibido utilizando o método println() da classe System.out.

Ao final da execução, o programa é encerrado.*/