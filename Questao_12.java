
/*Distinguir, com base na média parcial do aluno, se ele está aprovado, reprovado ou na final. Aplique as regras da UFERSA.
*/

import java.util.Scanner;

public class Questao_12 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota do aluno: ");
        double nota1 = input.nextDouble();
        
        System.out.print("Digite a segunda nota do aluno: ");
        double nota2 = input.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        System.out.println("Média do aluno: " + media);
        
        if (media >= 7.0) {
            System.out.println("Aluno aprovado!");
        } else if (media < 4.0) {
            System.out.println("Aluno reprovado!");
        } else {
            System.out.println("Aluno em final!");
        }
        
        input.close();
    }

}
/*As variáveis nota1 e nota2 são utilizadas para obter as notas do aluno a partir da entrada do usuário;
A média do aluno é calculada através da média aritmética das duas notas;
A média é então comparada com a média de corte de 7.0 para classificar o aluno como aprovado, reprovado ou na final. Se a média for maior ou igual a 7.0, o aluno é aprovado. Se a média for menor que 4.0, o aluno é reprovado. Caso contrário, o aluno está na final;
A mensagem correspondente à classificação do aluno é exibida na tela.
Mais uma vez, é importante lembrar que este algoritmo é apenas um exemplo simplificado e não leva em consideração outras questões importantes, como a validação dos dados de entrada e a definição de critérios para a aprovação na final.*/
