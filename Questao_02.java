
/*Atribua com valores vindos do teclado variáveis adequadas para: sua idade, sua altura, primeira letra do
*seu nome, seu nome completo. Depois exiba os dados na tela.*/


import java.util.Scanner;

public class Questao_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite a primeira letra do seu nome: ");
        char primeiraLetra = scanner.next().charAt(0);

        scanner.nextLine(); // Consome o \n deixado pelo next()

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Sua idade é: " + idade);
        System.out.println("Sua altura é: " + altura + " metros");
        System.out.println("A primeira letra do seu nome é: " + primeiraLetra);
        System.out.println("Seu nome completo é: " + nomeCompleto);

        scanner.close();
    }
}

