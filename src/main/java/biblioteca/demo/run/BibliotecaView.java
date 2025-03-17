package biblioteca.demo.run;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class BibliotecaView {

	protected JFrame frmBiblioteca;
	
	public BibliotecaView() {
		initialize();
	}
	private void initialize () {
		frmBiblioteca = new JFrame();
		
		JButton btnSocios = new JButton("Gestion Socios\r\n");
		btnSocios.setBounds(99, 23, 184, 44);
		btnSocios.setForeground(new Color(0, 0, 255));
		btnSocios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frmBiblioteca.getContentPane().setLayout(null);
		frmBiblioteca.getContentPane().add(btnSocios);
		
		JButton btnNewButton_1 = new JButton("Gestion de Libros");
		btnNewButton_1.setBounds(99, 106, 184, 44);
		btnNewButton_1.setForeground(new Color(0, 0, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frmBiblioteca.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Gestion de Prestamos");
		btnNewButton_2.setBounds(99, 182, 184, 56);
		btnNewButton_2.setForeground(new Color(0, 0, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frmBiblioteca.getContentPane().add(btnNewButton_2);
	}
}
