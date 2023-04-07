
/*Inicialize variáveis adequadas para: sua idade, sua altura, primeira letra do seu nome, seu nome 
 *completo. Depois exiba os dados na tela.*/

public class Questao_01 {
    public static void main(String[] args) {
        int idade = 27;
        double altura = 1.75;
        char primeiraLetraNome = 'J';
        String nomeCompleto = "João Silva";
        
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Primeira letra do nome: " + primeiraLetraNome);
        System.out.println("Nome completo: " + nomeCompleto);
    }
}

/*Importa a classe Scanner para permitir a leitura dos dados vindos do teclado.
Cria a classe "Questao_01" com o método main.
Cria um objeto scanner do tipo Scanner para ler os dados do teclado.
Pede ao usuário para digitar sua idade e armazena o valor em uma variável idade do tipo int.
Exibe o valor da idade lido na tela, utilizando a função println() para imprimir uma linha com o valor.
Fecha o objeto scanner para liberar os recursos.*/