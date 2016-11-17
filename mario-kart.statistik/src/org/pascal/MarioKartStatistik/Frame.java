package org.pascal.MarioKartStatistik;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame {

	JLabel label;
	JLabel anzahlSpieler;
	JComboBox eingabeAnzahlSpieler;
	JButton anzahlButton;

	int anzahlLabel = 0;

	int anzahl;
	String[] anzahlEingabe = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
	String eingabeAnzahl;
	JLabel spieler1;
	JLabel spieler2;

	public Frame() {

		setVisible(true);
		setTitle("Statistik");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		anzahlSpieler = new JLabel("Bitte geben Sie die Anzahl der Spieler an.");
		anzahlSpieler.setBounds(175, 50, 500, 20);
		Font schrift = (anzahlSpieler.getFont().deriveFont(Font.BOLD, 15));
		anzahlSpieler.setFont(schrift);
		add(anzahlSpieler);

		eingabeAnzahlSpieler = new JComboBox<>(anzahlEingabe);
		eingabeAnzahlSpieler.setBounds(250, 80, 100, 25);
		eingabeAnzahlSpieler.setVisible(true);
		add(eingabeAnzahlSpieler);

		anzahlButton = new JButton("OK!");
		anzahlButton.setBounds(250, 110, 100, 25);
		add(anzahlButton);
		anzahlButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eingabeAnzahl = (String) eingabeAnzahlSpieler.getSelectedItem();
				anzahl = Integer.valueOf(eingabeAnzahl);
				System.out.println(anzahl);

				if (anzahlLabel < anzahl) {
					spieler1 = new JLabel();
					spieler1.setBounds(0, 100, 500, 20);
					add(spieler1);
					anzahlLabel++;
				}

			}
		});

	}
}
