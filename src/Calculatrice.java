import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculatrice extends JFrame {
	private JPanel container = new JPanel();
	// Tableau stockant les éléments à afficher dans la calculatrice

	String[] tab_string = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
			"17", "18", "19", "20", "21", "22", "23", "24" };

	// Un bouton par élément à afficher
	JButton[] tab_button = new JButton[tab_string.length];
	private JLabel ecran = new JLabel();
	private Dimension dim = new Dimension(50, 40);

	public Calculatrice() {
		this.setSize(500, 420);
		this.setTitle("Jeu du char");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		// On initialise le conteneur avec tous les composants
		initComposant();
		// On ajoute le conteneur
		this.setContentPane(container);
		this.setVisible(true);
	}

	private void initComposant() {
		// On définit la police d'écriture à utiliser
		Font police = new Font("Arial", Font.BOLD, 50);
		ecran = new JLabel("0");
		ecran.setFont(police);
		// On aligne les informations à droite dans le JLabel
		ecran.setHorizontalAlignment(JLabel.RIGHT);
		ecran.setPreferredSize(new Dimension(220, 60));
		JPanel operateur = new JPanel();
		operateur.setPreferredSize(new Dimension(55, 225));
		JPanel chiffre = new JPanel();
		chiffre.setPreferredSize(new Dimension(200, 400));
		JPanel panEcran = new JPanel();
		panEcran.setPreferredSize(new Dimension(220, 60));

		// On parcourt le tableau initialisé
		// afin de créer nos boutons
		for (int i = 0; i < tab_string.length; i++) {
			tab_button[i] = new JButton(tab_string[i]);
			tab_button[i].setPreferredSize(dim);

			chiffre.add(tab_button[i]);
			tab_button[i].addActionListener(new ChiffreListener());

		}
		panEcran.add(ecran);
		panEcran.setBorder(BorderFactory.createLineBorder(Color.black));
		container.add(panEcran, BorderLayout.NORTH);
		container.add(chiffre, BorderLayout.EAST);
	}

	// Listener utilisé pour les chiffres
	// Permet de stocker les chiffres et de les afficher
	class ChiffreListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// On affiche le chiffre additionnel dans le label
			String str = ((JButton) e.getSource()).getText();

			ecran.setText(str);
		}
	}
}
