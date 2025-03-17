package biblioteca.demo.run;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class BibliotecaView {

	protected JFrame frmBiblioteca;
	
	public BibliotecaView() {
		initialize();
	}
	private void initialize () {
		frmBiblioteca = new JFrame();
		frmBiblioteca.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BIBLIOTECA LUGONES");
		lblNewLabel.setBounds(168, 11, 114, 14);
		frmBiblioteca.getContentPane().add(lblNewLabel);
	}
}
