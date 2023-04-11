/*Verificar se a senha, informada durante a execução, é correta. Quando a senha estiver correta, exiba “senha correta” e o programa é encerrado.
Quando a senha estiver errada, exiba “senha incorreta”, e permita a entrada novamente da senha, repetindo esse processo até que a senha entrada
utilizando a estrutura while*/

import java.util.Scanner;

public class Questao_18_while {
    public static void main(String[] args) {
        // Definir a senha correta
        String senhaCorreta = "12345";
        
        // Criar um Scanner para receber a senha informada pelo usuário
        Scanner scanner = new Scanner(System.in);
        
        // Loop para verificar a senha informada pelo usuário
        while (true) {
            // Pedir que o usuário informe a senha
            System.out.print("Digite a senha: ");
            String senhaInformada = scanner.nextLine();
            
            // Verificar se a senha está correta
            if (senhaInformada.equals(senhaCorreta)) {
                System.out.println("Senha correta");
                break; // encerrar o programa
            } else {
                System.out.println("Senha incorreta");
            }
        }
        
        // Fechar o Scanner
        scanner.close();
    }
}

/*Na primeira linha, importamos a classe Scanner, que será usada para receber a senha informada pelo usuário.
Em seguida, criamos uma classe chamada VerificarSenha e um método main.
Definimos a senha correta na variável senhaCorreta.
Criamos um objeto Scanner chamado scanner.
Iniciamos um loop infinito com a instrução while (true).
Dentro do loop, pedimos que o usuário informe a senha e recebemos a senha informada com o método nextLine do Scanner.
Verificamos se a senha informada é igual à senha correta usando o método equals.
Se a senha estiver correta, exibimos "Senha correta" com o método println e encerramos o loop com a instrução break.
Se a senha estiver incorreta, exibimos "Senha incorreta" com o método println.
Fora do loop, fechamos o objeto Scanner com o método close.*/

