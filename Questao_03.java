
/*Receba do teclado dois números inteiros, calcule e exiba os resultados das seguintes operações: 
 *adição, subtração, multiplicação, quociente da divisão e o resto da divisão.*/



import java.util.Scanner;

public class Questao_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        int quociente = num1 / num2;
        int resto = num1 % num2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Quociente da divisão: " + quociente);
        System.out.println("Resto da divisão: " + resto);

        scanner.close();
    }
}

/*Importa a classe Scanner para permitir a leitura dos dados vindos do teclado.
Cria a classe "Questao_03 com o método main.
Cria um objeto scanner do tipo Scanner para ler os dados do teclado.
Pede ao usuário para digitar os dois números e armazena os valores nas variáveis num1 e num2 do tipo int.
Calcula as operações aritméticas (soma, subtração, multiplicação, divisão e resto) e armazena cada resultado em uma variável correspondente.
Exibe os resultados na tela, utilizando a função println() para imprimir uma linha com o valor de cada operação.
Fecha o objeto scanner para liberar os recursos.*/

