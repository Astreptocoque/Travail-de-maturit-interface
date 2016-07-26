import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JButton;

public class Boutons {
	static String IP = "10.0.1.1";
	static int PORT = 1111;
	private int taillePolice = 11;

	int nombre;
	int emplacementX;
	int tailleBoutons;

	public Boutons(int nombre, int x, int tailleBoutons) {
		this.nombre = nombre;
		this.emplacementX = x;
		this.tailleBoutons = tailleBoutons;
		bouton();
	}

	public void bouton() {
		/// boutons
		JButton b1 = new JButton(String.valueOf(this.nombre));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Socket socket = new Socket(IP, PORT);
					DataOutputStream out = new DataOutputStream(socket.getOutputStream());
					out.writeInt(getNombreBouton());
					infoRenvoi(socket);
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		b1.setFont(new Font("Lucida Sans Unicode", Font.BOLD, taillePolice));
		b1.setBounds(emplacementX, 10, tailleBoutons, tailleBoutons);
		Affichage.panel.add(b1);
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
			Affichage.ecran.setText("Case occupée ! Choisis-en une autre.");
			break;
		case 2:
			Affichage.ecran.setText("Excellent ! Attends le bip pour rejouer");
			break;
		case 3:
			Affichage.ecran.setText("Arrrg ! Je dois manger mon propre pion !");
			break;
		case 4:
			Affichage.ecran.setText("Pas de pion à manger ! Choissis-en un autre.");
			break;
		case 5:
			Affichage.ecran.setText("Il n'y a pas de pion à déplacer ici !");
			break;
		case 6:
			Affichage.ecran.setText("Choisis maintenant sur quelle case le déplacer...");
			break;
		case 7:
			Affichage.ecran.setText("Impossible de déplacer ton pion ici !");
			break;
		case 8:
			Affichage.ecran.setText("Attends le bip, puis choisis un pion à manger");
			break;
		}
	}

	public int getNombreBouton() {
		return this.nombre;
	}
}
