/*Construa um programa que calcule uma equação do 2º grau.*/


import java.util.Scanner;

public class Questao_14 {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Pedimos ao usuário que digite os valores dos coeficientes a, b e c
	        System.out.print("Digite o valor de a: ");
	        double a = input.nextDouble();

	        System.out.print("Digite o valor de b: ");
	        double b = input.nextDouble();

	        System.out.print("Digite o valor de c: ");
	        double c = input.nextDouble();

	        // Calculamos o valor do delta
	        double delta = b * b - 4 * a * c;

	        // Verificamos se a equação possui raízes reais
	        if (delta < 0) {
	            System.out.println("A equação não possui raízes reais.");
	        	 System.out.println("delta é "+delta);
	        } else if (delta == 0) {
	            double raiz = -b / (2 * a);
	            System.out.printf("A equação possui uma única raiz: %.2f\n", raiz);
	            System.out.println("delta é "+delta);
	        } else {
	            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
	            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
	            System.out.printf("A equação possui duas raízes: %.2f e %.2f\n", raiz1, raiz2);
	            System.out.println("delta é "+delta);
	        }

	        input.close();
	    }
	}




/*Nesse código, pedimos ao usuário que digite os valores dos coeficientes a, b e c da equação. Em seguida, 
 * calculamos o delta da equação utilizando a fórmula delta = b^2 - 4ac.
Depois, verificamos se a equação possui raízes reais, e imprimimos o resultado na tela. 
Se delta for negativo, a equação não possui raízes reais. Se delta for igual a zero,
 a equação possui uma única raiz real. Caso contrário, a equação possui duas raízes reais.*/
