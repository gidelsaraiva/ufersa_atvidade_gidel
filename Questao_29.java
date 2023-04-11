
/* Construa um programa que mova o número da última posição de um vetor para a primeira posição. 
 * Faça isso gradativamente: use uma estrutura
de repetição, e em cada iteração do loop mova esse número apenas uma posição, ou seja, troque esse
 número da posição n por n-1.*/


import javax.swing.JOptionPane;

public class Questao_29 {
    public static void main(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho do vetor:"));
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da posição " + i + ":"));
        }

        JOptionPane.showMessageDialog(null, "Vetor original: " + imprimirVetor(vetor));

        for (int i = tamanho - 1; i > 0; i--) {
            int temp = vetor[i];
            vetor[i] = vetor[i-1];
            vetor[i-1] = temp;

            JOptionPane.showMessageDialog(null, "Vetor após " + (tamanho - i) + " iteração(ões): " + imprimirVetor(vetor));
        }
    }

    public static String imprimirVetor(int[] vetor) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < vetor.length; i++) {
            sb.append(vetor[i]).append(" ");
        }
        return sb.toString();
    }
}

/*Neste exemplo, o programa primeiro solicita ao usuário o tamanho do vetor e preenche o vetor com os
 *  valores digitados pelo usuário.

Em seguida, o programa imprime o vetor original usando a função imprimirVetor.

O programa então entra em um loop que percorre o vetor de trás para frente (da última posição até a
 segunda posição). A cada iteração, o número da posição atual (i) é trocado com o número da posição
  anterior (i-1). O programa então imprime o vetor após a iteração usando a função imprimirVetor.

O loop é executado tamanho - 1 vezes, movendo o número da última posição para a primeira posição
 gradativamente.

Por fim, o programa imprime o vetor final após todas as iterações.*/
