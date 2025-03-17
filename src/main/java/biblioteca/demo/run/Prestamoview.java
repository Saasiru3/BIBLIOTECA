package biblioteca.demo.run;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Prestamoview {

	protected JFrame frmBiblioteca;
	private JTextField textField;
	private JTextField textField_1;
	
	public Prestamoview() {
		initialize();
	}
	private void initialize () {
		frmBiblioteca = new JFrame();
		frmBiblioteca.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(7, 28, 145, 20);
		frmBiblioteca.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ISBN");
		lblNewLabel.setBounds(162, 26, 35, 20);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frmBiblioteca.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(7, 71, 145, 20);
		frmBiblioteca.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Num.Socio");
		lblNewLabel_1.setBounds(158, 69, 77, 20);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frmBiblioteca.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Prestar");
		btnNewButton.setBounds(55, 179, 99, 37);
		btnNewButton.setForeground(new Color(0, 0, 255));
		frmBiblioteca.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Devolver");
		btnNewButton_1.setBounds(289, 179, 86, 37);
		btnNewButton_1.setForeground(new Color(0, 0, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frmBiblioteca.getContentPane().add(btnNewButton_1);
	}
}