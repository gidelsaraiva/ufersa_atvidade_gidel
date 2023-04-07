
/*Calcular o IMC (índice de massa corporal) de uma pessoa. Produza um alerta em caso de divisão por zero*/
import java.util.Scanner;
public class Questao_08 {

	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double peso, altura, imc;

	        System.out.print("Digite o seu peso em kg: ");
	        peso = sc.nextDouble();

	        System.out.print("Digite a sua altura em metros: ");
	        altura = sc.nextDouble();

	        if (altura == 0) {
	            System.out.println("Não é possível realizar o cálculo do IMC com altura igual a zero!");
	        } else {
	            imc = peso / (altura * altura);
	            System.out.printf("O seu IMC é: %.2f", imc);
	        }
	        sc.close();
	   
	}

}


/*O programa começa importando a classe Scanner, que será utilizada para a leitura dos valores de entrada.
 *  Em seguida, são declaradas as variáveis peso, altura e imc, todas do tipo double.

Na sequência, o programa solicita que o usuário digite o seu peso em kg e a sua altura em metros,
 utilizando o método nextDouble() do objeto Scanner. Em seguida, o programa verifica se a altura 
 é igual a zero. Caso seja, é exibida uma mensagem informando que não é possível realizar o cálculo
  do IMC com altura igual a zero. Caso contrário, o programa realiza o cálculo do IMC, armazenando
   o resultado na variável imc. Por fim, é exibido o valor do IMC com duas casas decimais utilizando
    o método printf() e a formatação %.2f.

Por fim, o programa fecha o objeto Scanner utilizando o método close().*/
