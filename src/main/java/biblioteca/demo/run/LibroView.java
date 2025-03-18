package biblioteca.demo.run;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class LibroView {

	public JFrame frmLibro;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	
	public LibroView() {
		initialize();
	}
	private void initialize () {
		frmLibro = new JFrame();
		
		JButton btnNewButton = new JButton("ISBN");
		btnNewButton.setBounds(14, 7, 73, 31);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnTitulo = new JButton("TITULO");
		btnTitulo.setBounds(209, 7, 95, 31);
		btnTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnTitulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBounds(7, 45, 420, 46);
		
		textField_2 = new JTextField();
		textField_2.setBounds(7, 150, 188, 20);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(209, 150, 218, 20);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(7, 177, 188, 20);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(209, 177, 218, 20);
		textField_5.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(7, 204, 188, 20);
		textField.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(209, 204, 218, 20);
		textField_6.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("ALTA");
		btnNewButton_1.setBounds(30, 231, 57, 23);
		
		JButton btnNewButton_1_1 = new JButton("BAJA");
		btnNewButton_1_1.setBounds(115, 231, 57, 23);
		
		JButton btnNewButton_1_2 = new JButton("MODIFICACION");
		btnNewButton_1_2.setBounds(318, 231, 109, 23);
		frmLibro.getContentPane().setLayout(null);
		frmLibro.getContentPane().add(btnNewButton);
		frmLibro.getContentPane().add(btnTitulo);
		frmLibro.getContentPane().add(panel);
		
		JButton btnNewButton_2 = new JButton("AÑADIR");
		btnNewButton_2.setBounds(7, 120, 71, 23);
		frmLibro.getContentPane().add(btnNewButton_2);
		frmLibro.getContentPane().add(textField_2);
		frmLibro.getContentPane().add(textField_3);
		frmLibro.getContentPane().add(textField_4);
		frmLibro.getContentPane().add(textField_5);
		frmLibro.getContentPane().add(textField);
		frmLibro.getContentPane().add(textField_6);
		frmLibro.getContentPane().add(btnNewButton_1);
		frmLibro.getContentPane().add(btnNewButton_1_1);
		frmLibro.getContentPane().add(btnNewButton_1_2);
	}
	public Window getFrame() {
		// TODO Auto-generated method stub
		return null;
	}
}