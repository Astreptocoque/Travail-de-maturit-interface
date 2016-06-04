package com.src.test2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class AffichageClient {
	static String IP = "10.0.1.1";
	static int PORT = 1111;
	// Affichage affiche = new Affichage();

	public void bluetoothBouton1() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(1);
		infoRenvoi(socket);
	}

	public void bluetoothBouton2() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(2);
		infoRenvoi(socket);
	}

	public void bluetoothBouton3() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(3);
		infoRenvoi(socket);
	}

	public void bluetoothBouton4() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(4);
		infoRenvoi(socket);
	}

	public void bluetoothBouton5() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(5);
		infoRenvoi(socket);
	}

	public void bluetoothBouton6() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(6);
		infoRenvoi(socket);
	}

	public void bluetoothBouton7() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(7);
		infoRenvoi(socket);
	}

	public void bluetoothBouton8() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(8);
		infoRenvoi(socket);
	}

	public void bluetoothBouton9() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(9);
		infoRenvoi(socket);
	}

	public void bluetoothBouton10() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(10);
		infoRenvoi(socket);
	}

	public void bluetoothBouton11() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(11);
		infoRenvoi(socket);
	}

	public void bluetoothBouton12() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(12);
		infoRenvoi(socket);
	}

	public void bluetoothBouton13() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(13);
		infoRenvoi(socket);
	}

	public void bluetoothBouton14() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(14);
		infoRenvoi(socket);
	}

	public void bluetoothBouton15() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(15);
		infoRenvoi(socket);
	}

	public void bluetoothBouton16() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(16);
		infoRenvoi(socket);
	}

	public void bluetoothBouton17() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(17);
		infoRenvoi(socket);
	}

	public void bluetoothBouton18() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(18);
		infoRenvoi(socket);
	}

	public void bluetoothBouton19() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(19);
		infoRenvoi(socket);
	}

	public void bluetoothBouton20() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(20);
		infoRenvoi(socket);
	}

	public void bluetoothBouton21() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(21);
		infoRenvoi(socket);
	}

	public void bluetoothBouton22() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(22);
		infoRenvoi(socket);
	}

	public void bluetoothBouton23() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(23);
		infoRenvoi(socket);
	}

	public void bluetoothBouton24() throws IOException {
		Socket socket = new Socket(IP, PORT);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeInt(24);
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
