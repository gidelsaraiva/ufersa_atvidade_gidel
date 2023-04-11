/*Construa um programa que calcule o rendimento mensal de um investimento em poupança. 
*Variáveis: investimento inicial, investimento
mensal, quantidade de meses, saldo acumulado, taxa de juros mensal, rendimento mensal.*/

import java.util.Scanner;

public class Questao_20 {
    public static void main(String[] args) {
        // Criar um Scanner para receber as entradas do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Pedir que o usuário informe as variáveis
        System.out.print("Informe o investimento inicial: ");
        double investimentoInicial = scanner.nextDouble();
        
        System.out.print("Informe o investimento mensal: ");
        double investimentoMensal = scanner.nextDouble();
        
        System.out.print("Informe a quantidade de meses: ");
        int quantidadeMeses = scanner.nextInt();
        
        System.out.print("Informe a taxa de juros mensal (%): ");
        double taxaJurosMensal = scanner.nextDouble();
        
        // Converter a taxa de juros para decimal
        taxaJurosMensal /= 100.0;
        
        // Inicializar a variável de saldo acumulado
        double saldoAcumulado = investimentoInicial;
        
        // Loop para calcular o saldo acumulado e o rendimento mensal
        for (int i = 1; i <= quantidadeMeses; i++) {
            saldoAcumulado += investimentoMensal;
            double rendimentoMensal = saldoAcumulado * taxaJurosMensal;
            saldoAcumulado += rendimentoMensal;
            System.out.printf("Mês %d: saldo = R$%.2f, rendimento = R$%.2f\n", i, saldoAcumulado, rendimentoMensal);
        }
        
        // Exibir o saldo acumulado ao final do período
        System.out.printf("Saldo acumulado após %d meses: R$%.2f\n", quantidadeMeses, saldoAcumulado);
        
        // Fechar o Scanner
        scanner.close();
    }
}

/*Na primeira linha, importamos a classe Scanner, que será usada para receber as entradas do usuário.
Em seguida, criamos uma classe chamada Poupanca e um método main.
Criamos um objeto Scanner chamado scanner.
Pedimos que o usuário informe o investimento inicial, investimento mensal, quantidade de meses e taxa de juros mensal.
Recebemos as variáveis com os métodos correspondentes do Scanner.
Convertemos a taxa de juros para decimal, dividindo-a por 100.
Inicializamos a variável saldoAcumulado com o valor do investimento inicial.
Iniciamos um loop for que vai de 1 até a quantidade de meses informada pelo usuário.
Dentro do loop, somamos o investimento mensal ao saldo acumulado e calculamos o rendimento mensal, que é o saldo acumulado multiplicado pela taxa de juros mensal.
Somamos o rendimento mensal ao saldo acumulado.
Exibimos o saldo acumulado e o rendimento mensal com o método printf.
Fora do loop, exibimos o saldo acumulado ao final do período com o método printf.
Fechamos o objeto Scanner com o método close.*/

