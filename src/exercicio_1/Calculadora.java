package exercicio_1;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {

		try {
			String op1 = JOptionPane.showInputDialog(null, "primeiro número");
			String op2 = JOptionPane.showInputDialog(null, "segundo número");
			String operacao = JOptionPane.showInputDialog(null,
					"1 - somar\n2 - subtrair\n3 - multiplicar\n4 - dividir");
			int operador = Integer.parseInt(operacao);

			JOptionPane.showInternalMessageDialog(null, "resultado: " + calcular(op1, op2, operador));
		} catch (Exception e) {
			JOptionPane.showInternalMessageDialog(null, e.getMessage());

		}

	}

	public static int calcular(String op1, String op2, int operador) {

		int num1 =0;
		int num2 =0;
		int resultado = 0;

		try {
			num1 = Integer.parseInt(op1);
			num2 = Integer.parseInt(op2);
			if (operador < 1 || operador > 4) {
				throw new ArithmeticException("Operação inválida");
			}
			switch (operador) {
			case 1:
				resultado = num1 + num2;
				break;
			case 2:
				resultado = num1 - num2;
				break;
			case 3:
				resultado = num1 * num2;
				break;
			case 4:
				resultado = num1 / num2;
				break;

			}

		} catch (NumberFormatException e) {
			e.getMessage();

		}catch (ArithmeticException e) {
			e.getMessage();
		}
		return resultado;
	}

}
