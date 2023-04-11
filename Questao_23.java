
/*Construa um programa que calcule o fatorial de um número. Use uma estrutura de repetição. Fatorial: n! = n (n − 1)!
Exemplo: 5! = 5 x 4 x 3 x 2 x 1 = 120 ou 5! = 1 x 2 x 3 x 4 x 5 = 120*/

import java.util.Scanner;

public class Questao_23 {
    public static void main(String[] args) {
        // Criar um Scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pedir que o usuário informe um número inteiro positivo
        System.out.print("Informe um número inteiro positivo: ");
        int n = scanner.nextInt();

        // Validar a entrada do usuário
        while (n < 0) {
            System.out.print("O número informado é inválido. Por favor, informe um número inteiro positivo: ");
            n = scanner.nextInt();
        }

        // Calcular o fatorial do número informado
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        // Exibir o resultado
        System.out.printf("%d! = %d\n", n, fatorial);

        // Fechar o Scanner
        scanner.close();
    }
}

/*Na primeira linha, importamos a classe Scanner, que será usada para receber a entrada do usuário.
Em seguida, criamos uma classe chamada Fatorial e um método main.
Criamos um objeto Scanner chamado scanner.
Pedimos que o usuário informe um número inteiro positivo.
Recebemos o número com o método correspondente do Scanner.
Validamos a entrada do usuário com um loop while que pede uma nova entrada enquanto o número informado for menor que 0.
Inicializamos a variável fatorial como 1.
Iniciamos um loop for que vai de 1 até n.
Dentro do loop, multiplicamos fatorial pelo número atual com o operador *=.
Fora do loop, exibimos o resultado usando o método printf.
Fechamos o objeto Scanner com o método close.*/

