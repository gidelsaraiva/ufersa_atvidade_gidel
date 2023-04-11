/*Construa um programa pra ler e exibir uma matriz de inteiros. Em tempo de execução, o usuário pode 
 *definir o tamanho da matriz.*/
import javax.swing.JOptionPane;

public class Questao_26 {
    public static void main(String[] args) {
        int linhas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número de linhas da matriz:"));
        int colunas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número de colunas da matriz:"));

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da posição [" + i + "][" + j + "]:"));
            }
        }

        JOptionPane.showMessageDialog(null, "Matriz digitada: \n" + matrizToString(matriz));
    }

    public static String matrizToString(int[][] matriz) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sb.append(matriz[i][j] + " ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}

/*Neste exemplo, o programa primeiro solicita ao usuário o número de linhas e colunas da matriz. Em seguida,
 *cria uma matriz de inteiros com o tamanho definido e preenche cada posição da matriz com o valor digitado
 * pelo usuário.

Por fim, o programa exibe a matriz preenchida em uma caixa de diálogo usando a função matrizToString, que
converte a matriz em uma string formatada para facilitar a visualização.*/

