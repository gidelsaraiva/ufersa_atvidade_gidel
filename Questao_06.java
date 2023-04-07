/*Construa um programa que gerencia a conta de uma pizzaria.
Preço do refrigerante: R$ 1,50. Preço da fatia de pizza: R$ 3,00. Taxa do garçom: 10%.
Receba do usuário: a quantidade de refrigerantes, a quantidade de fatias e a quantidade de pessoas na mesa.
Calcule e exiba: o total sem a taxa, o total com a taxa, o rateio por pessoa com a taxa.*/


import java.util.Scanner;
public class Questao_06 {

		    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Preços dos itens
	        final double PRECO_REFRI = 1.50;
	        final double PRECO_PIZZA = 3.00;
	        final double TAXA_GARCOM = 0.10;

	        // Leitura dos dados do usuário
	        System.out.print("Quantidade de refrigerantes: ");
	        int qtdRefri = scanner.nextInt();

	        System.out.print("Quantidade de fatias de pizza: ");
	        int qtdPizza = scanner.nextInt();

	        System.out.print("Quantidade de pessoas na mesa: ");
	        int qtdPessoas = scanner.nextInt();

	        // Cálculo dos valores
	        double totalSemTaxa = qtdRefri * PRECO_REFRI + qtdPizza * PRECO_PIZZA;
	        double taxaGarcom = totalSemTaxa * TAXA_GARCOM;
	        double totalComTaxa = totalSemTaxa + taxaGarcom;
	        double rateio = totalComTaxa / qtdPessoas;

	        // Exibição dos resultados
	        System.out.printf("Total sem taxa: R$ %.2f\n", totalSemTaxa);
	        System.out.printf("Total com taxa (incluindo 10%% de taxa do garçom): R$ %.2f\n", totalComTaxa);
	        System.out.printf("Rateio por pessoa (incluindo 10%% de taxa do garçom): R$ %.2f\n", rateio);

	        scanner.close();
	    }
	}

/*Cria a classe Pizzaria com o método main.
Cria as constantes PRECO_REFRI, PRECO_PIZZA e TAXA_GARCOM para armazenar os preços dos itens e a taxa do
 garçom (em porcentagem). Cria um objeto scanner do tipo Scanner para ler os dados do teclado.
Pede ao usuário para digitar a quantidade de refrigerantes, a quantidade de fatias de pizza e a quantidade 
de pessoas na mesa, armazenando os valores nas variáveis qtdRefri, qtdPizza e qtdPessoas.
Calcula o total da conta sem a taxa, multiplicando a quantidade de refrigerantes pelo preço do 
refrigerante e a quantidade de fatias de pizza pelo preço da fatia, e armazena o resultado na variável 
totalSemTaxa. Calcula a taxa do garçom, multiplicando o total da conta sem a taxa pela taxa do garçom, e 
armazena o resultado na variável taxaGarcom. Calcula o total da conta com a taxa, somando o total da conta 
sem a taxa e a taxa do garçom, e armazena o resultado na variável totalComTaxa.
Calcula o rateio por pessoa, dividindo o total da conta com a taxa pela quantidade de pessoas na mesa, e 
armazena o resultado na variável rateio.
Exibe os resultados na tela, utilizando a função printf() para formatar as mensagens e os valores 
de acordo com o padrão especificado.*/