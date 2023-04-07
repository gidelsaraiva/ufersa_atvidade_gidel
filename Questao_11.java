/*Construa um programa que simule uma transferência bancária, entre duas contas. Primeiro, inicialize cada conta com R$ 100. Depois, permita
que o usuário defina quanto deve transferir, da conta1 para a conta2, porém a transferência só deve ser realizada caso haja saldo suficiente.*/

import java.util.Scanner;

public class Questao_11 {

    public static void main(String[] args) {
        
        double saldoConta1 = 100.0;
        double saldoConta2 = 100.0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor a ser transferido da conta 1 para a conta 2: ");
        double valorTransferencia = input.nextDouble();
        
        if (valorTransferencia > saldoConta1) {
            System.out.println("Saldo insuficiente na conta 1 para realizar a transferência.");
        } else {
            saldoConta1 -= valorTransferencia;
            saldoConta2 += valorTransferencia;
            System.out.println("Transferência realizada com sucesso!");
            System.out.println("Saldo atual na conta 1: R$ " + saldoConta1);
            System.out.println("Saldo atual na conta 2: R$ " + saldoConta2);
        }
        
        input.close();
    }

}
/*As variáveis saldoConta1 e saldoConta2 são inicializadas com o valor de R$ 100,00 cada;
A classe Scanner é utilizada para obter o valor da transferência a ser realizada a partir da entrada do usuário;
A transferência só será realizada caso o valor seja menor ou igual ao saldo disponível na conta 1. Se o valor for maior, será exibida uma mensagem de "Saldo insuficiente";
Caso a transferência seja realizada com sucesso, os saldos das duas contas são atualizados e exibidos na tela.
É importante ressaltar que este algoritmo é apenas um exemplo simplificado e não deve ser utilizado em um ambiente de produção real, já que existem diversas outras questões a serem consideradas, como autenticação do usuário, validação dos dados de entrada, segurança da transação, entre outros.




José Gidel Saraiva
Crie um algorítimo em java, que distinguir, com base na média 7 do aluno, se ele está aprovado, reprovado ou na final.
Segue abaixo um algoritmo em Java que calcula a média de um aluno e o classifica como aprovado, reprovado ou na final com base em uma média de corte de 7.0:



*/
