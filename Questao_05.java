
/*Calcular e exibir a média aritmética de três números reais*/


import java.util.Scanner;

public class Questao_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();

        double media = (num1 + num2 + num3) / 3.0;

        System.out.println("A média aritmética dos números é: " + media);

        scanner.close();
    }
}

/*Importa a classe Scanner para permitir a leitura dos dados vindos do teclado.
Cria a classe MediaAritmetica com o método main.
Cria um objeto scanner do tipo Scanner para ler os dados do teclado.
Pede ao usuário para digitar os três números e armazena os valores nas variáveis num1, num2 e num3 do tipo double.
Calcula a média aritmética dos números, somando os três valores e dividindo o resultado por 3.0 (usando o valor 3.0 em vez de 3 para garantir que o resultado seja um número decimal).
Exibe o valor da média aritmética na tela, utilizando a função println() para imprimir uma linha com a mensagem e o valor calculado.
Fecha o objeto scanner para liberar os recursos.
*/

