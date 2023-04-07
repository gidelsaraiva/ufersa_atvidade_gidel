
/*Construa um programa que leia um número inteiro digitado pelo usuário. Caso o número pertença ao intervalo de 1 a 5, exiba o número por
extenso. Caso o número não pertença a este intervalo, exiba a mensagem "valor invalido".
*/

import java.util.Scanner;

public class Questão_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro entre 1 e 5: ");
        int numero = input.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Três");
                break;
            case 4:
                System.out.println("Quatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }

        input.close();
    }
}

/*Nesse código, utilizamos um bloco switch para verificar se o número digitado pelo usuário está no 
 * intervalo de 1 a 5. Caso esteja, o programa exibe o número por extenso. Caso contrário, o programa
 *  exibe a mensagem "valor inválido". É importante notar que utilizamos o comando break após cada case
 *   para sair do bloco switch e evitar que o programa execute o código dos casos seguintes. Por fim,
 *   fechamos o objeto Scanner com o método close().*/
