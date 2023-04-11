/*Construa um programa que calcule o somatório dos números inteiros de um intervalo, definido por um 
 * número inicial e um número final. Exemplo: caso as entradas fossem 4 e 9, o resultado seria: 39*/

import java.util.Scanner;

public class Questao_22 {
    public static void main(String[] args) {
        // Criar um Scanner para receber as entradas do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Pedir que o usuário informe os números do intervalo
        System.out.print("Informe o número inicial do intervalo: ");
        int inicio = scanner.nextInt();
        System.out.print("Informe o número final do intervalo: ");
        int fim = scanner.nextInt();
        
        // Calcular o somatório dos números do intervalo
        int soma = 0;
        for (int i = inicio; i <= fim; i++) {
            soma += i;
        }
        
        // Exibir o resultado
        System.out.printf("O somatório dos números de %d a %d é %d.\n", inicio, fim, soma);
        
        // Fechar o Scanner
        scanner.close();
    }
}

/*Na primeira linha, importamos a classe Scanner, que será usada para receber as entradas do usuário.
Em seguida, criamos uma classe chamada SomatorioIntervalo e um método main.
Criamos um objeto Scanner chamado scanner.
Pedimos que o usuário informe o número inicial do intervalo.
Recebemos o número inicial com o método correspondente do Scanner.
Pedimos que o usuário informe o número final do intervalo.
Recebemos o número final com o método correspondente do Scanner.
Inicializamos a variável soma como 0.
Iniciamos um loop for que vai de inicio até fim.
Dentro do loop, adicionamos cada número ao somatório com o operador +=.
Fora do loop, exibimos o resultado usando o método printf.
Fechamos o objeto Scanner com o método close.*/



