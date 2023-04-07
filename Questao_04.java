
/*Calcular e exibir a média aritmética de três números inteiros*/
import java.util.Scanner;

public class Questao_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        double media = (num1 + num2 + num3) / 3.0;

        System.out.println("A média aritmética dos números é: " + media);

        scanner.close();
    }
}
/*Importa a classe Scanner para permitir a leitura dos dados vindos do teclado.
Cria a classe "Questao_04" com o método main.
Cria um objeto scanner do tipo Scanner para ler os dados do teclado.
Pede ao usuário para digitar os três números e armazena os valores nas variáveis num1, num2 e num3 do tipo int.
Calcula a média aritmética dos números, somando os três valores e dividindo o resultado por 3.0 (usando o valor 3.0 em vez de 3 para garantir que o resultado seja um número decimal).
Exibe o valor da média aritmética na tela, utilizando a função println() para imprimir uma linha com a mensagem e o valor calculado.
Fecha o objeto scanner para liberar os recursos.*/

