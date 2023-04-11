/*Construa um programa que inverta a frase digitada pelo usuário. Por exemplo, se string1 for “bom dia”,
 *então string2 será “aid mob”.*/

import javax.swing.JOptionPane;

	public class Questao_30 {
	    public static void main(String[] args) {
	        String frase = JOptionPane.showInputDialog(null, "Digite uma frase:");

	        JOptionPane.showMessageDialog(null, "Frase original: " + frase);

	        String fraseInvertida = inverterFrase(frase);

	        JOptionPane.showMessageDialog(null, "Frase invertida: " + fraseInvertida);
	    }

	    public static String inverterFrase(String frase) {
	        StringBuilder sb = new StringBuilder(frase);
	        sb.reverse();
	        return sb.toString();
	    }
	}


/*o programa solicita ao usuário que digite uma frase usando a função JOptionPane.showInputDialog.

O programa então imprime a frase original usando a função JOptionPane.showMessageDialog.

A função inverterFrase recebe a frase como parâmetro, cria um StringBuilder a partir da string da frase
e usa o método reverse para inverter a ordem dos caracteres na string. A função então converte o 
StringBuilder em uma string usando o método toString e retorna a string invertida.

O programa então imprime a frase invertida usando a função JOptionPane.showMessageDialog.





*/