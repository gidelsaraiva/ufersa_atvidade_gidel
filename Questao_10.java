/* Construa um programa que leia um número inteiro e identifique se ele é par ou ímpar.
*/
	import java.util.Scanner; // Importa a classe Scanner

	public class Questao_10 {
	
	  public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
	    int numero;

	    // Solicita ao usuário o número inteiro
	    System.out.print("Digite um número inteiro: ");
	    numero = entrada.nextInt();

	    // Verifica se o número é par ou ímpar
	    if (numero % 2 == 0) {
	      System.out.println("O número " + numero + " é par.");
	    } else {
	      System.out.println("O número " + numero + " é ímpar.");
	    }

	    entrada.close(); // Fecha o objeto Scanner
	  }
	}
/*A classe Scanner é importada para ler a entrada do usuário.
O programa solicita ao usuário um número inteiro e armazena-o na variável numero.
O programa verifica se o número é par ou ímpar usando o operador %, que retorna o resto da divisão inteira
 entre dois números. Se o resto da divisão de numero por 2 for igual a zero, o número é par. Caso contrário, 
 ele é ímpar. O programa exibe o resultado para o usuário.
O objeto Scanner é fechado para liberar os recursos do sistema.*/

