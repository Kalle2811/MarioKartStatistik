package org.pascal.MarioKartStatistik;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame extends JFrame {

	JLabel label;
	JLabel anzahlSpieler;
	JComboBox eingabeAnzahlSpieler;
	JButton anzahlButton;
	JTextField name1, name2, name3, name4, name5, name6, name7, name8, name9, name10, name11, name12;

	JLabel spieler1, spieler2, spieler3, spieler4, speler5, spieler6, spieler7, spieler8, spieler9, spieler10,
			spieler11, spieler12;

	int anzahlLabel = 0;

	int anzahl;
	String[] anzahlEingabe = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
	String eingabeAnzahl;

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
				anzahlButton.setVisible(false);
				eingabeAnzahlSpieler.setVisible(false);
				anzahlSpieler.setVisible(false);
				System.out.println(anzahl);

				if (anzahlLabel < anzahl) {
					spieler1 = new JLabel("Spieler1");
					spieler1.setBounds(20, 40, 500, 20);
					spieler1.setVisible(true);
					add(spieler1);
					name1 = new JTextField();
					name1.setBounds(20, 60, 100, 25);
					name1.setVisible(true);
					add(name1);

					anzahlLabel++;

					if (anzahlLabel < anzahl) {
						spieler2 = new JLabel("Spieler2");
						spieler2.setBounds(90, 40, 500, 20);
						spieler2.setVisible(true);
						add(spieler2);
						name2 = new JTextField();
						name2.setBounds(130, 60, 100, 25);
						name2.setVisible(true);
						add(name2);

						anzahlLabel++;
						if (anzahlLabel < anzahl) {
							spieler2 = new JLabel("Spieler2");
							spieler2.setBounds(90, 40, 500, 20);
							spieler2.setVisible(true);
							add(spieler2);
							name2 = new JTextField();
							name2.setBounds(220, 60, 100, 25);
							name2.setVisible(true);
							add(name2);

							anzahlLabel++;
							if (anzahlLabel < anzahl) {
								spieler3 = new JLabel("Spieler3");
								spieler3.setBounds(90, 40, 500, 20);
								spieler3.setVisible(true);
								add(spieler3);
								name3 = new JTextField();
								name3.setBounds(350, 60, 100, 25);
								name3.setVisible(true);
								add(name3);

								anzahlLabel++;
								if (anzahlLabel < anzahl) {
									spieler4 = new JLabel("Spieler4");
									spieler4.setBounds(90, 40, 500, 20);
									spieler4.setVisible(true);
									add(spieler4);
									name4 = new JTextField();
									name4.setBounds(450, 60, 100, 25);
									name4.setVisible(true);
									add(name4);

									anzahlLabel++;
									if (anzahlLabel < anzahl) {
										spieler2 = new JLabel("Spieler2");
										spieler2.setBounds(90, 40, 500, 20);
										spieler2.setVisible(true);
										add(spieler2);
										name2 = new JTextField();
										name2.setBounds(130, 60, 100, 25);
										name2.setVisible(true);
										add(name2);

										anzahlLabel++;
										if (anzahlLabel < anzahl) {
											spieler2 = new JLabel("Spieler2");
											spieler2.setBounds(90, 40, 500, 20);
											spieler2.setVisible(true);
											add(spieler2);
											name2 = new JTextField();
											name2.setBounds(130, 60, 100, 25);
											name2.setVisible(true);
											add(name2);

											anzahlLabel++;
											if (anzahlLabel < anzahl) {
												spieler2 = new JLabel("Spieler2");
												spieler2.setBounds(90, 40, 500, 20);
												spieler2.setVisible(true);
												add(spieler2);
												name2 = new JTextField();
												name2.setBounds(130, 60, 100, 25);
												name2.setVisible(true);
												add(name2);

												anzahlLabel++;
											}
										}
									}
								}
							}
						}
					}
				}

			}
		});

	}
}
