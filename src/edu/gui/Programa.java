package edu.gui;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Programa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private String sexo [] = {"masculino", "feminino"};
	private JTextField textField_1;
	private JTextField textField_2;
 	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Programa frame = new Programa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Programa() {
		setTitle("Cadastro de aluno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(100, 100, 100, 100));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 11, 47, 25);
		contentPane.add(lblNome);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(269, 11, 33, 25);
		contentPane.add(lblSexo);
		
		textField = new JTextField();
		textField.setBounds(51, 13, 191, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("salvar");
		btnNewButton.setBounds(234, 303, 89, 23);
		contentPane.add(btnNewButton);
		
		JComboBox <String> comboBox = new JComboBox <>(sexo);
		comboBox.setBounds(304, 12, 200, 22);
		contentPane.add(comboBox);
		
		JLabel lblCpf = new JLabel("cpf");
		lblCpf.setBounds(275, 47, 27, 14);
		contentPane.add(lblCpf);
		
		textField_1 = new JTextField();
		textField_1.setBounds(87, 44, 155, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNascimento = new JLabel("Nascimento");
		lblNascimento.setBounds(10, 47, 76, 14);
		contentPane.add(lblNascimento);
		
		textField_2 = new JTextField();
		textField_2.setBounds(304, 45, 200, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}
}
