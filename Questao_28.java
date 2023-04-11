/*Crie um algorítimo em java, com a Classe JOptionPane, que*/

import javax.swing.JOptionPane;

/*Crie um algorítimo em java, com a Classe JOptionPane, que*/
public class Questao_28 {
    public static void main(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho do vetor:"));
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da posição " + i + ":"));
        }

        int maior = encontrarMaior(vetor);
        int menor = encontrarMenor(vetor);

        JOptionPane.showMessageDialog(null, "Maior: " + maior + "\nMenor: " + menor);
    }

    public static int encontrarMaior(int[] vetor) {
        int maior = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        return maior;
    }

    public static int encontrarMenor(int[] vetor) {
        int menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        return menor;
    }
}

/*Neste exemplo, o programa primeiro solicita ao usuário o tamanho do vetor e preenche o vetor com os 
 * valores digitados pelo usuário.

Em seguida, o programa chama as funções encontrarMaior e encontrarMenor, que recebem o vetor original
 como parâmetro e percorrem o vetor em busca do maior e do menor número, respectivamente.

Por fim, o programa exibe o maior e o menor número em uma caixa de diálogo usando a Classe 
JOptionPane. */
