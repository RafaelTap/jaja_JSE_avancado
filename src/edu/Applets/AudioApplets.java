package edu.Applets;

import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AudioClip;
import java.net.URL;

public class AudioApplets extends Applet {

	private AudioClip clip;
	private AppletContext contexto;

	@Override
	public void init() {
		contexto = this.getAppletContext();
		String audioUrl = this.getParameter("Audio");
		if (audioUrl == null) {
			audioUrl = "default.au";
		}
		try {
			URL url = new URL(this.getDocumentBase(), audioUrl);

		} catch (Exception e) {
			e.printStackTrace();
			contexto.showStatus("não foi possível excutar o áudio");
		}
	}

	public void start() {
		if (clip != null) {
			clip.loop();
		}
	}

	public void stop() {
		if (clip != null) {
			clip.loop();
		}

	}

}
