




import java.util.Scanner;

public class Questao_13 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a nota da primeira prova: ");
        double nota1 = input.nextDouble();
        
        System.out.print("Digite a nota da segunda prova: ");
        double nota2 = input.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        double notaRecuperacao = 14.0 - media;
        
        if (media >= 7.0) {
            System.out.println("Parabéns, você foi aprovado com média " + media);
        } else if (media < 7.0) {
            System.out.println("Infelizmente você foi reprovado");
            System.out.println("Sua Media foi  " + media);
            System.out.println("Você precisa tirar pelo menos " + notaRecuperacao + " na prova de recuperação para ser aprovado");
        } else {
            System.out.println("Você está em recuperação com média " + media);
            notaRecuperacao = 14.0 - media;
            System.out.println("Você precisa tirar pelo menos " + notaRecuperacao + " na prova de recuperação para ser aprovado");
        }
        
        input.close();
    }

}

