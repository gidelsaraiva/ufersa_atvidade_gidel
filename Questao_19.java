/*Construa um programa para exibir a tabuada de qualquer número “n” (1 a 9), sendo “n” um número fornecido
*pelo usuário. Utilize estrutura de
repetição*/


import java.util.Scanner;

public class Questao_19 {
    public static void main(String[] args) {
        // Criar um Scanner para receber o número fornecido pelo usuário
        Scanner scanner = new Scanner(System.in);
        
        // Pedir que o usuário informe o número
        System.out.print("Digite um número (1 a 9): ");
        int numero = scanner.nextInt();
        
        // Verificar se o número está dentro do intervalo válido
        if (numero < 1 || numero > 9) {
            System.out.println("Número inválido");
        } else {
            // Exibir a tabuada usando um loop for
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.printf("%d x %d = %d\n", numero, i, resultado);
            }
        }
        
        // Fechar o Scanner
        scanner.close();
    }
}

/*Na primeira linha, importamos a classe Scanner, que será usada para receber o número fornecido pelo usuário.
Em seguida, criamos uma classe chamada Tabuada e um método main.
Criamos um objeto Scanner chamado scanner.
Pedimos que o usuário informe o número e recebemos o número com o método nextInt do Scanner.
Verificamos se o número está dentro do intervalo válido (1 a 9).
Se o número for inválido, exibimos "Número inválido" com o método println.
Se o número for válido, iniciamos um loop for que vai de 1 a 10.
Dentro do loop, calculamos o resultado da multiplicação entre o número fornecido pelo usuário e o contador do loop.
Exibimos a operação e o resultado com o método printf.
Fora do loop, fechamos o objeto Scanner com o método close.*/

