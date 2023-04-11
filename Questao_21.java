/*Construa um programa que identifique se um número é primo.*/


import java.util.Scanner;

public class Questao_21 {
    public static void main(String[] args) {
        // Criar um Scanner para receber as entradas do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Pedir que o usuário informe o número a ser verificado
        System.out.print("Informe um número inteiro positivo: ");
        int numero = scanner.nextInt();
        
        // Verificar se o número é primo
        boolean ehPrimo = true;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                ehPrimo = false;
                break;
            }
        }
        
        // Exibir o resultado
        if (ehPrimo && numero > 1) {
            System.out.printf("%d é primo.\n", numero);
        } else {
            System.out.printf("%d não é primo.\n", numero);
        }
        
        // Fechar o Scanner
        scanner.close();
    }
}

/*Na primeira linha, importamos a classe Scanner, que será usada para receber as entradas do usuário.
Em seguida, criamos uma classe chamada NumeroPrimo e um método main.
Criamos um objeto Scanner chamado scanner.
Pedimos que o usuário informe um número inteiro positivo.
Recebemos o número com o método correspondente do Scanner.
Inicializamos a variável ehPrimo como true.
Iniciamos um loop for que vai de 2 até a raiz quadrada do número informado.
Dentro do loop, verificamos se o número é divisível por i usando o operador %. Se for divisível, o número não é primo, e a variável ehPrimo é setada para false. Também usamos o comando break para sair do loop.
Fora do loop, verificamos se o número é maior que 1 e se a variável ehPrimo é true. Se sim, exibimos a mensagem que o número é primo. Se não, exibimos a mensagem que o número não é primo.
Fechamos o objeto Scanner com o método close.*/

