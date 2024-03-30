package edu.Applets;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventosApplets extends Applet {

	private static final long serialVersionUID = 1L;

	private Button botao;
	private TextField texto;

	public void init() {
		botao = new Button();
		texto = new TextField(20);

		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.setText("exemplo de evento applets");

			}
		});

	}

}
