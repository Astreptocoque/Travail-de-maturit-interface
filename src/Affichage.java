
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Affichage {

	public JFrame frame;
	public static JPanel panel = new JPanel();
	public static JLabel ecran = new JLabel();

	String[] tab_string = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
			"17", "18", "19", "20", "21", "22", "23", "24" };
	JButton[] tab_button = new JButton[tab_string.length];

	public static void main(String[] args) {
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
		int tailleBoutons = 60;
		int largeurFenetre = tailleBoutons * 24;
		int hauteurFenetre = 300;
		int hauteurEcran = 100;
		int emplacementX = 0;


		frame = new JFrame();
		frame.setBounds(100, 100, largeurFenetre + tailleBoutons, hauteurFenetre);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		frame.setResizable(false);
		panel.setBounds(20, 0, largeurFenetre, hauteurFenetre);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		Font police = new Font("Microsoft JhengHei UI", Font.BOLD, 50);

		/// initialise l'afficheur de texte
		ecran = new JLabel("Good luck, dear oppenent !");
		ecran.setFont(police);
		ecran.setBounds(20, hauteurFenetre / 2, largeurFenetre, hauteurEcran);
		panel.add(ecran);

		for (int i = 0; i < 24; i++) {
			Boutons bouton = new Boutons(i + 1, emplacementX, tailleBoutons);
			emplacementX += tailleBoutons;
		}
		
		
	}
}