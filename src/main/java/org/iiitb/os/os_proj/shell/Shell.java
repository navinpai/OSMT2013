package org.iiitb.os.os_proj.shell;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Shell extends JFrame {

	JPanel shellPanel;
	JTextArea shellArea;
	JTextArea command;

	public Shell() {
		shellPanel = new JPanel();
		shellPanel.setBackground(new Color(0, 0, 0));

		shellArea = new JTextArea(26, 44);
		shellArea.setEditable(false);
		shellArea.setBackground(new Color(0, 0, 0));
		shellArea.setForeground(new Color(255, 255, 255));

		command = new JTextArea(5, 44);
		command.setForeground(new Color(255, 255, 255));
		command.setBackground(new Color(0, 0, 0));
		command.requestFocus();

		shellPanel.add(command);
		shellPanel.add(shellArea);

		Font font = new Font("Arial",Font.PLAIN,12);
		Canvas c = new Canvas();
		FontMetrics fm = c.getFontMetrics(font);
		System.out.println(fm.stringWidth("LineMetrics does not what I want... I've looked into it a hundred times. Can I"));
		this.add(shellPanel);
		shellArea.requestFocusInWindow();
	}

}
