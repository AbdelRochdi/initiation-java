package com.rochdi.lsv;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {

	private static JFrame frame;

	private static JPanel panel;

	private static JLabel intro;

	private static JLabel fact;

	private static JLabel fImage;

	private static JButton button;

	private static ImageIcon factImage;

	private static int random;

	private static int r;
	private static int g;
	private static int b;

	public static void main(String[] args) {

		Facts.addFact("LES CACHALOTS DORMENT DEBOUT", "1.gif");
		Facts.addFact("LE MUSCLE LE PLUS PUISSANT DU CORPS EST LA LANGUE", "2.gif");
		Facts.addFact("L’ARBRE DU KIWI EST APPELÉ L’ACTINIDIA", "3.jpg");
		Facts.addFact("LES NOIX DE COCO TUENT PLUS DE GENS QUE LES REQUINS", "4.jpg");
		Facts.addFact("SI ON METTAIT LES POUMONS À PLAT ILS COUVRIRAIENT 140M2 (LA MOITIÉ D’UN TERRAIN DE TENNIS)",
				"5.gif");
		Facts.addFact("IL Y A 26 OS DANS UN PIED", "6.gif");
		Facts.addFact(
				"SQUELETTE, LETTE ET QUINTETTE SONT LES SEULS MOTS MASCULINS DE LA LANGUE FRANÇAISE QUI FINISSENT PAR « ETTE »",
				"7.jpg");
		Facts.addFact("CE SONT LES HIPPOCAMPES MÂLES QUI PORTENT LES BÉBÉS DANS LEUR VENTRE", "8.jpg");
		Facts.addFact("IL FAUDRAIT À UN HOMME PLUS DE 30 ANS POUR POUVOIR COMPTER JUSQU'À 1 MILLIARD", "9.gif");
		Facts.addFact("L'OURS POLAIRE A LA PEAU TOUTE NOIRE SOUS SA FOURRURE BLANCHE", "10.jpg");
		Facts.addFact("UNE PIEUVRE POSSÈDE 3 CŒURS", "11.jpg");
		Facts.addFact("LE COLIBRI NE PEUT PAS MARCHER, MAIS C'EST LE SEUL OISEAU À POUVOIR VOLER EN MARCHE ARRIÈRE",
				"12.jpg");
		Facts.addFact("LE CORNICHON EST UN FRUIT", "13.gif");
		Facts.addFact("LE DAUPHIN NAGE EN DORMANT, TOUT COMME LE REQUIN", "14.gif");
		Facts.addFact("LA GROSSESSE (LA GESTATION) D’UN ÉLÉPHANT DURE ENTRE 18 ET 22 MOIS", "15.jpg");
		Facts.addFact("LA JOCONDE A BIEN DES SOURCILS ET DES CILS (ON NE LES VOIT PLUS CAR LE TABLEAU EST TROP ANCIEN)",
				"16.jpg");
		Facts.addFact(
				"LES MOUTONS PRATIQUENT L'AUTOMÉDICATION. LORSQU'ILS SONT MALADES, ILS CHANGENT LEUR ALIMENTATION ET CONSOMMENT DES PLANTES BONNES POUR EUX.",
				"17.gif");
		Facts.addFact(
				"LA HAUTEUR DE LA TOUR EIFFEL PEUT VARIER DE 15 CM SELON LA TEMPÉRATURE (ELLE EST PLUS PETITE QUAND IL FAIT FROID)",
				"18.jpg");
		Facts.addFact("LE PLUS PETIT CHIEN DU MONDE EST UN CHIHUAHUA QUI MESURE 6,53 CM", "19.gif");
		Facts.addFact(
				"DANS L'ESPACE, LES ASTRONAUTES NE PEUVENT PAS PLEURER, CAR IL N'Y A PAS DE GRAVITÉ ET LES LARMES NE PEUVENT PAS COULER",
				"20.gif");

		random = (int) (Math.random() * (Facts.getFactsText().size()));

		r = (int) (Math.random() * 255);
		g = (int) (Math.random() * 255);
		b = (int) (Math.random() * 255);

		frame = new JFrame();

		panel = new JPanel();

		intro = new JLabel();

		fact = new JLabel();

		fImage = new JLabel();

		ImageIcon image = new ImageIcon("lsv.png");

		factImage = new ImageIcon("facts/" + Facts.getFactsImage().get(random));

		Image scaleImage = factImage.getImage().getScaledInstance(530, 250, Image.SCALE_DEFAULT);

		ImageIcon finalImage = new ImageIcon(scaleImage);

		fImage.setBounds(25, 170, 530, 300);

		button = new JButton("MONTRER UN AUTRE FAIT");
		button.setBounds(25, 480, 530, 40);
		button.setFont(new Font("Verdana", Font.PLAIN, 15));
		button.addActionListener(new GUI());
		button.setForeground(new Color(r, g, b));

		panel.setLayout(null);

		intro.setBounds(25, 20, 500, 25);
		intro.setText("Saviez-vous que ?");
		intro.setForeground(Color.gray);
		intro.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));

		fact.setBounds(25, 60, 500, 120);
		fact.setText("<html><p>" + Facts.getFactsText().get(random) + "<p><html>");
		fImage.setIcon(finalImage);
		fact.setForeground(Color.white);
		fact.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		fact.setIconTextGap(100);

		frame.setTitle("Le Saviez-vous ?");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);

		panel.add(intro);
		panel.add(fact);
		panel.add(fImage);
		panel.add(button);
		frame.add(panel);

		frame.setIconImage(image.getImage());
		panel.setBackground(new Color(r, g, b));
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		random = (int) (Math.random() * (Facts.getFactsText().size()));
		r = (int) (Math.random() * 255);
		g = (int) (Math.random() * 255);
		b = (int) (Math.random() * 255);
		
		fact.setText("<html><p>" + Facts.getFactsText().get(random) + "<p><html>");
		button.setForeground(new Color(r, g, b));
		panel.setBackground(new Color(r, g, b));
		factImage = new ImageIcon("facts/" + Facts.getFactsImage().get(random));
		Image scaleImage = factImage.getImage().getScaledInstance(530, 250, Image.SCALE_DEFAULT);

		ImageIcon finalImage = new ImageIcon(scaleImage);
		fImage.setIcon(finalImage);
	}

}
