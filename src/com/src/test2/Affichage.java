package com.src.test2;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Affichage {

	private JFrame frame;
	private JPanel panel = new JPanel();
	public static JLabel ecran = new JLabel();
	private int taillePolice = 11;

	String[] tab_string = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
			"17", "18", "19", "20", "21", "22", "23", "24" };
	JButton[] tab_button = new JButton[tab_string.length];
	int nombre;

	public static void main(String[] args) throws IOException {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Affichage window = new Affichage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/// Crée l'application

	public Affichage() throws IOException {
		initialize();
	}

	/// Initialise les composants de la fenetre

	private void initialize() throws IOException {
		final AffichageClient action = new AffichageClient();

		int largeurFenetre = 1360;
		int hauteurFenetre = 300;
		int hauteurEcran = 100;

		frame = new JFrame();
		frame.setSize(1600,1000);
//		frame.setBounds(100, 100, largeurFenetre, hauteurFenetre);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		frame.setResizable(true);
		panel.setBounds(20, 0, largeurFenetre, hauteurFenetre);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		/// importe l'image
//		String path = "ImageCases2.jpg";
//		BufferedImage image = ImageIO.read(new File(path));
//		Image contentPane = new Image(image);
//		frame.setContentPane(contentPane);
		
		Font police = new Font("Arial", Font.BOLD, 50);

		/// initialise l'afficheur de texte
		ecran = new JLabel("Nous vous souhaitons un bon jeu !");
		ecran.setFont(police);
		ecran.setBounds(20, hauteurFenetre / 2, largeurFenetre, hauteurEcran);
		panel.add(ecran);

		/// boutons
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					action.bluetoothBouton1();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		b1.setFont(new Font("Lucida Sans Unicode", Font.BOLD, taillePolice));
		b1.setBounds(50, 10, 50, 50);
		panel.add(b1);

		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					action.bluetoothBouton2();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		b2.setFont(new Font("Lucida Sans Unicode", Font.BOLD, taillePolice));
		b2.setBounds(100, 10, 50, 50);
		panel.add(b2);

		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					action.bluetoothBouton3();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		b3.setFont(new Font("Lucida Sans Unicode", Font.BOLD, taillePolice));
		b3.setBounds(150, 10, 50, 50);
		panel.add(b3);

		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					action.bluetoothBouton4();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		b4.setFont(new Font("Lucida Sans Unicode", Font.BOLD, taillePolice));
		b4.setBounds(200, 10, 50, 50);
		panel.add(b4);

		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					action.bluetoothBouton5();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		b5.setFont(new Font("Lucida Sans Unicode", Font.BOLD, taillePolice));
		b5.setBounds(250, 10, 50, 50);
		panel.add(b5);

		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					action.bluetoothBouton6();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		b6.setFont(new Font("Lucida Sans Unicode", Font.BOLD, taillePolice));
		b6.setBounds(300, 10, 50, 50);
		panel.add(b6);

		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					action.bluetoothBouton7();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		b7.setFont(new Font("Lucida Sans Unicode", Font.BOLD, taillePolice));
		b7.setBounds(350, 10, 50, 50);
		panel.add(b7);

		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					action.bluetoothBouton8();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		b8.setFont(new Font("Lucida Sans Unicode", Font.BOLD, taillePolice));
		b8.setBounds(400, 10, 50, 50);
		panel.add(b8);

		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					action.bluetoothBouton9();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		b9.setFont(new Font("Lucida Sans Unicode", Font.BOLD, taillePolice));
		b9.setBounds(450, 10, 50, 50);
		panel.add(b9);

		JButton b10 = new JButton("10");
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					action.bluetoothBouton10();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		b10.setFont(new Font("Lucida Sans Unicode", Font.BOLD, taillePolice));
		b10.setBounds(500, 10, 50, 50);
		panel.add(b10);

		JButton b11 = new JButton("11");
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					action.bluetoothBouton11();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		b11.setFont(new Font("Lucida Sans Unicode", Font.BOLD, taillePolice));
		b11.setBounds(550, 10, 50, 50);
		panel.add(b11);

		JButton b12 = new JButton("12");
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					action.bluetoothBouton12();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		b12.setFont(new Font("Lucida Sans Unicode", Font.BOLD, taillePolice));
		b12.setBounds(600, 10, 50, 50);
		panel.add(b12);

		JButton b13 = new JButton("13");
		b13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					action.bluetoothBouton13();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		b13.setFont(new Font("Lucida Sans Unicode", Font.BOLD, taillePolice));
		b13.setBounds(650, 10, 50, 50);
		panel.add(b13);

		JButton b14 = new JButton("14");
		b14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					action.bluetoothBouton14();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		b14.setFont(new Font("Lucida Sans Unicode", Font.BOLD, taillePolice));
		b14.setBounds(700, 10, 50, 50);
		panel.add(b14);

		JButton b15 = new JButton("15");
		b15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					action.bluetoothBouton15();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		b15.setFont(new Font("Lucida Sans Unicode", Font.BOLD, taillePolice));
		b15.setBounds(750, 10, 50, 50);
		panel.add(b15);

		JButton b16 = new JButton("16");
		b16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					action.bluetoothBouton16();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		b16.setFont(new Font("Lucida Sans Unicode", Font.BOLD, taillePolice));
		b16.setBounds(800, 10, 50, 50);
		panel.add(b16);

		JButton b17 = new JButton("17");
		b17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					action.bluetoothBouton17();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		b17.setFont(new Font("Lucida Sans Unicode", Font.BOLD, taillePolice));
		b17.setBounds(850, 10, 50, 50);
		panel.add(b17);

		JButton b18 = new JButton("18");
		b18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					action.bluetoothBouton18();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		b18.setFont(new Font("Lucida Sans Unicode", Font.BOLD, taillePolice));
		b18.setBounds(900, 10, 50, 50);
		panel.add(b18);

		JButton b19 = new JButton("19");
		b19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					action.bluetoothBouton19();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		b19.setFont(new Font("Lucida Sans Unicode", Font.BOLD, taillePolice));
		b19.setBounds(950, 10, 50, 50);
		panel.add(b19);

		JButton b20 = new JButton("20");
		b20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					action.bluetoothBouton20();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		b20.setFont(new Font("Lucida Sans Unicode", Font.BOLD, taillePolice));
		b20.setBounds(1000, 10, 50, 50);
		panel.add(b20);

		JButton b21 = new JButton("21");
		b21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					action.bluetoothBouton21();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		b21.setFont(new Font("Lucida Sans Unicode", Font.BOLD, taillePolice));
		b21.setBounds(1050, 10, 50, 50);
		panel.add(b21);

		JButton b22 = new JButton("22");
		b22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					action.bluetoothBouton22();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		b22.setFont(new Font("Lucida Sans Unicode", Font.BOLD, taillePolice));
		b22.setBounds(1100, 10, 50, 50);
		panel.add(b22);

		JButton b23 = new JButton("23");
		b23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					action.bluetoothBouton23();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		b23.setFont(new Font("Lucida Sans Unicode", Font.BOLD, taillePolice));
		b23.setBounds(1150, 10, 50, 50);
		panel.add(b23);

		JButton b24 = new JButton("24");
		b24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					action.bluetoothBouton24();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		b24.setFont(new Font("Lucida Sans Unicode", Font.BOLD, taillePolice));
		b24.setBounds(1200, 10, 50, 50);
		panel.add(b24);

	}

}
