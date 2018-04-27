

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Ventana extends JFrame {

	public static final int ANCHO = 900;
	public static final int ALTO = 400;

	public Ventana() {

		PanelMenu panel1 = new PanelMenu();
		this.add(panel1);

		// this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setTitle("Encryption String");
		this.setSize(ANCHO, ALTO);
		panel1.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
