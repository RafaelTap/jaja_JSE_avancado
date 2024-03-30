package edu.Applets;

import java.applet.Applet;
import java.awt.Graphics;

public class ParametrosApplets extends Applet {

	public void paint(Graphics g) {
		String nome = getParameter("Nome");
		String email = getParameter("email");
		g.drawString("Nome: " + nome + "E-mail: " + email, 25, 50);
	}

}
