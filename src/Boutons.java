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
			Affichage.ecran.setText("Occupied Square! Choose another one.");
			break;
		case 2:
			Affichage.ecran.setText("Excellent ! Wait for the 'bip' to play again.");
			break;
		case 3:
			Affichage.ecran.setText("Arrrg ! I have to eat my own piece !");
			break;
		case 4:
			Affichage.ecran.setText("No piece to eat ! Choose another one.");
			break;
		case 5:
			Affichage.ecran.setText("There is no piece to move here !");
			break;
		case 6:
			Affichage.ecran.setText("Now choose on which square you want to move it.");
			break;
		case 7:
			Affichage.ecran.setText("You can't move your piece here !");
			break;
		case 8:
			Affichage.ecran.setText("Wait for the 'bip', then  choose another one to eat");
			break;
		}
		
		/// pour changer l'affichage si c'est le 3
		if(nombre == 3){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Affichage.ecran.setText("Wait for the 'bip' to play again.");
		}
	}

	public int getNombreBouton() {
		return this.nombre;
	}
}
