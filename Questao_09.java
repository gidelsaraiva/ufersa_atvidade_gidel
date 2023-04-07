/*Construa um programa que calcule a área de um círculo, tendo como entrada o valor do raio, que deve 
 * ser positivo. Use o valor da constante PI vindo da biblioteca matemática.
*/
	import java.util.Scanner; // Importa a classe Scanner
	import java.lang.Math; // Importa a classe Math

	public class Questao_09 {
	
	  public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
	    double raio, area;
	    final double PI = Math.PI; // Define a constante PI

	    // Solicita ao usuário o valor do raio
	    System.out.print("Digite o valor do raio (positivo): ");
	    raio = entrada.nextDouble();

	    // Verifica se o valor do raio é positivo
	    if (raio < 0) {
	      System.out.println("O raio deve ser um valor positivo!");
	    } else {
	      // Calcula a área do círculo
	      area = PI * Math.pow(raio, 2);

	      // Exibe o resultado
	      System.out.println("A área do círculo é: " + area);
	    }

	    entrada.close(); // Fecha o objeto Scanner
	  }
	}
	
	
	/*A classe Scanner é importada para ler a entrada do usuário.
A classe Math é importada para obter o valor da constante PI.
O programa solicita ao usuário o valor do raio e armazena-o na variável raio.
O programa verifica se o valor do raio é positivo. Se não for, exibe uma mensagem de erro.
Se o valor do raio for positivo, o programa calcula a área do círculo usando a fórmula area = PI * raio^2 e 
armazena-o na variável area. O programa exibe o resultado para o usuário.
O objeto Scanner é fechado para liberar os recursos do sistema.
	 * 
	 * 
	 * */


