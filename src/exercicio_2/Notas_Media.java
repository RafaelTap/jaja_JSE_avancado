package exercicio_2;

import javax.swing.JOptionPane;

public class Notas_Media {

	public static void main(String[] args) {

		double[] notas = new double[4];
		double soma = 0;
		double media = 0;

		try {
			for (int i = 0; i <= 4; i++) {
				notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null, (1 + i) + "º Nota"));
				soma += notas[i];
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());

		} finally {
			media = soma / 4;

		}
		JOptionPane.showMessageDialog(null, "Média: " + media);

	}
}
