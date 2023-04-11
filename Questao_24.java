/*Construa um programa que simule uma calculadora. Disponibilize um menu de opções e simule a opção desejada, exibindo novamente o menu,
até que o usuário escolha sair. Menu de opções: 1 - potenciação Dica: utilize a função da biblioteca matemática.
2 - raiz quadrada Dica: utilize a função da biblioteca matemática.
3 - fatorial Dica: crie e utilize uma função com a solução da questão anterior.
0 - sair*/

import java.util.Scanner;

public class Questao_24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        
        while (opcao != 0) {
            System.out.println("Menu de opções:");
            System.out.println("1 - Potenciação");
            System.out.println("2 - Raiz quadrada");
            System.out.println("3 - Fatorial");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite a base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Digite o expoente: ");
                    double expoente = scanner.nextDouble();
                    double resultadoPotencia = Math.pow(base, expoente);
                    System.out.println("Resultado: " + resultadoPotencia);
                    break;
                    
                case 2:
                    System.out.print("Digite o número: ");
                    double numeroRaiz = scanner.nextDouble();
                    double resultadoRaiz = Math.sqrt(numeroRaiz);
                    System.out.println("Resultado: " + resultadoRaiz);
                    break;
                    
                case 3:
                    System.out.print("Digite um número inteiro: ");
                    int numeroFatorial = scanner.nextInt();
                    int resultadoFatorial = calcularFatorial(numeroFatorial);
                    System.out.println("Resultado: " + resultadoFatorial);
                    break;
                    
                case 0:
                    System.out.println("Saindo...");
                    break;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
    
    public static int calcularFatorial(int n) {
        int resultado = 1;
        
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        
        return resultado;
    }

}

/*O algoritmo que simula uma calculadora em Java tem como objetivo disponibilizar um menu de opções para o
 *  usuário realizar operações matemáticas. Ao iniciar o programa, o usuário é apresentado com as opções 
 *  disponíveis: potenciação, raiz quadrada, fatorial e sair.

Cada opção corresponde a uma ação específica do programa. Na opção de potenciação, o usuário deve informar
 a base e o expoente e o programa realiza o cálculo utilizando a função da biblioteca matemática pow().
  Na opção de raiz quadrada, o usuário informa o valor e o programa utiliza a função sqrt() da biblioteca
   matemática para calcular a raiz quadrada.

Já na opção de fatorial, é utilizada uma função criada especificamente para esse cálculo, que utiliza uma
 estrutura de repetição (while) para calcular o resultado.

Após realizar a operação escolhida, o programa exibe o resultado e retorna ao menu de opções, permitindo
ao usuário escolher uma nova operação ou sair do programa.*/

