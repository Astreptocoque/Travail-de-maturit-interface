
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

	private JFrame frame;
	private JPanel panel = new JPanel();
	public static JLabel ecran = new JLabel();
	private int taillePolice = 11;
	static String IP = "10.0.1.1";
	static int PORT = 1111;

	String[] tab_string = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
			"17", "18", "19", "20", "21", "22", "23", "24" };
	JButton[] tab_button = new JButton[tab_string.length];
	int nombre;

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

	public Affichage() {
		initialize();
	}

	/// Initialise les composants de la fenetre

	private void initialize() {
		final AffichageClient action = new AffichageClient();

		int largeurFenetre = 1360;
		int hauteurFenetre = 300;
		int hauteurEcran = 100;

		frame = new JFrame();
		frame.setBounds(100, 100, largeurFenetre, hauteurFenetre);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		frame.setResizable(true);
		panel.setBounds(20, 0, largeurFenetre, hauteurFenetre);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		Font police = new Font("Arial", Font.BOLD, 50);

		/// initialise l'afficheur de texte
		ecran = new JLabel("Timothée vous souhaite un bon jeu avec Morris");
		ecran.setFont(police);
		ecran.setBounds(20, hauteurFenetre / 2, largeurFenetre, hauteurEcran);
		panel.add(ecran);

		/// boutons
		
		for (int i = 0; i < 24; i++) {
			JButton b1 = new JButton("1");
			b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						Socket socket = new Socket(IP, PORT);
						DataOutputStream out = new DataOutputStream(socket.getOutputStream());
						out.writeInt(i);
					} catch (IOException e1) {
						System.out.println(e1.getMessage());
					}
				}
			});
			b1.setFont(new Font("Lucida Sans Unicode", Font.BOLD, taillePolice));
			b1.setBounds(50, 10, 50, 50);
			panel.add(b1);
		}

	}

	public void bluetoothBouton(int envoi) throws IOException {

		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(1);
		infoRenvoi(socket);
	}

	public void infoRenvoi(Socket socket) throws IOException {
		int nombre;
		DataInputStream in = new DataInputStream(socket.getInputStream());
		nombre = in.readInt();

		switch (nombre) {
		case 1:
			Affichage.ecran.setText("Case occupée ! Veuillez en choisir une autre.");
			break;
		case 2:
			Affichage.ecran.setText("Excellent ! Attendez le bip pour rejouer");
			break;
		case 3:
			Affichage.ecran.setText("Excellent ! Le pion va être manger.");
			break;
		case 4:
			Affichage.ecran.setText("Pas de pion à manger ! Choisissez-en un autre.");

		}

	}
}
