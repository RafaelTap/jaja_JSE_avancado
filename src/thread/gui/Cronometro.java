package thread.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class Cronometro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private Thread t;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cronometro frame = new Cronometro();
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
	public Cronometro() {
		setTitle("cronômetro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		//botao iniciar
		
		JButton btnNewButton = new JButton("iniciar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				t = new Thread(new Runnable() {

					public void run() {

						try {
							for (int i = 0; i < 50; i++) {
								textField.setText(new Date().toString());
								Thread.sleep(1000);
							}

						} catch (Exception e) {

						}
					}

				});
				t.start();
			}
		});
		btnNewButton.setBounds(24, 36, 89, 23);
		contentPane.add(btnNewButton);

		//botao fechar 
		
		JButton btnNewButton_1 = new JButton("fechar");
		btnNewButton_1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				/* aqui esta o codigo para parar a thread do botao iniciar, para isso precisamos
				 * declarar a thread fora do botao iniciar.
				 */
				if (t != null) {
					t.stop(); // marca para informa que o metodo é de alto risco.
				}
				
				
				
			}
		});
		btnNewButton_1.setBounds(24, 69, 89, 23);
		contentPane.add(btnNewButton_1);

		textField = new JTextField();
		textField.setBounds(123, 37, 245, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
