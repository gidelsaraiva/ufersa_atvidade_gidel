/*Construa e use uma função que produz um novo vetor de inteiros com a ordem inversa do vetor original
 *passado por parâmetro*/

import javax.swing.JOptionPane;

public class Questao_27 {
    public static void main(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho do vetor:"));
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da posição " + i + ":"));
        }

        int[] vetorInverso = inverterVetor(vetor);

        JOptionPane.showMessageDialog(null, "Vetor original: " + vetorToString(vetor) + "\nVetor inverso: " + vetorToString(vetorInverso));
    }

    public static int[] inverterVetor(int[] vetor) {
        int tamanho = vetor.length;
        int[] vetorInverso = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetorInverso[i] = vetor[tamanho - i - 1];
        }

        return vetorInverso;
    }

    public static String vetorToString(int[] vetor) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < vetor.length; i++) {
            sb.append(vetor[i] + " ");
        }

        return sb.toString();
    }
}

/*Neste exemplo, o programa primeiro solicita ao usuário o tamanho do vetor e preenche o vetor com os 
 * valores digitados pelo usuário.

Em seguida, o programa chama a função inverterVetor, que recebe o vetor original como parâmetro e produz
um novo vetor com a ordem inversa.

Por fim, o programa exibe o vetor original e o vetor inverso em uma caixa de diálogo usando a função vetorToString, que converte o vetor em uma string formatada para facilitar a visualização.*/
