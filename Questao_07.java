
/*Calcular uma divisão entre dois números reais. Produza um alerta em caso de divisão por zero.*/
	import java.util.Scanner;

	public class Questao_07 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double numerador, denominador, resultado;

	        System.out.print("Digite o numerador: ");
	        numerador = sc.nextDouble();

	        System.out.print("Digite o denominador: ");
	        denominador = sc.nextDouble();

	        if (denominador == 0) {
	            System.out.println("Não é possível realizar a divisão por zero!");
	        } else {
	            resultado = numerador / denominador;
	            System.out.printf("O resultado da divisão é: %.2f", resultado);
	        }
	        sc.close();
	    }
	}
	
	/*
	 O programa começa importando a classe Scanner, que será utilizada para a leitura dos valores de entrada.
	 Em seguida, são declaradas as variáveis numerador, denominador e resultado, todas do tipo double.
     Na sequência, o programa solicita que o usuário digite o valor do numerador e do denominador, utilizando o
     método nextDouble() do objeto Scanner. Em seguida, o programa verifica se o denominador é igual a zero. 
     Caso seja, é exibida uma mensagem informando que não é possível realizar a divisão por zero. Caso contrário, 
     o programa realiza a divisão entre o numerador e o denominador e armazena o resultado na variável resultado. 
     Por fim, é exibido o resultado da divisão com duas casas decimais utilizando o método printf() e a formatação
      %.2f. Por fim, o programa fecha o objeto Scanner utilizando o método close().
	 */


