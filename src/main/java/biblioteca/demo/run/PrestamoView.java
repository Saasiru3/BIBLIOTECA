package biblioteca.demo.run;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PrestamoView extends JFrame {

	
	public JFrame frmPrestamo;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	
	public PrestamoView() {
		initialize();
	}
	private void initialize () {
		frmPrestamo = new JFrame();
		frmPrestamo.setBackground(new Color(6, 204, 140));
		frmPrestamo.getContentPane().setForeground(new Color(0, 128, 64));
		frmPrestamo.setBounds(0, 0, 500, 500);
		frmPrestamo.getContentPane().setLayout(new MigLayout("", "[grow][grow][][][][grow][][][]", "[][][][][][grow][][][]"));
		
		JLabel lblNewLabel = new JLabel("GESTION DE PRESTAMOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmPrestamo.getContentPane().add(lblNewLabel, "cell 4 0");
		
		JLabel lblNewLabel_1 = new JLabel("Num Socio");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmPrestamo.getContentPane().add(lblNewLabel_1, "cell 0 1,alignx left");
		
		textField = new JTextField();
		frmPrestamo.getContentPane().add(textField, "cell 1 1 3 1,growx");
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ISBN");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmPrestamo.getContentPane().add(lblNewLabel_2, "cell 0 2,alignx left");
		
		textField_1 = new JTextField();
		frmPrestamo.getContentPane().add(textField_1, "cell 1 2 3 1,growx");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Titulo");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmPrestamo.getContentPane().add(lblNewLabel_3, "cell 0 3,alignx left");
		
		textField_2 = new JTextField();
		frmPrestamo.getContentPane().add(textField_2, "cell 1 3 5 1,growx");
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Fecha Inicio");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmPrestamo.getContentPane().add(lblNewLabel_4, "cell 0 4,alignx right");
		
		textField_3 = new JTextField();
		frmPrestamo.getContentPane().add(textField_3, "cell 1 4,growx");
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Fecha Final");
		frmPrestamo.getContentPane().add(lblNewLabel_5, "cell 4 4,alignx trailing");
		
		textField_4 = new JTextField();
		frmPrestamo.getContentPane().add(textField_4, "cell 6 4,growx");
		textField_4.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		frmPrestamo.getContentPane().add(scrollPane, "cell 0 5 9 2,grow");
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
			},
			new String[] {
				"New column"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("PRESTAMO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmPrestamo.getContentPane().add(btnNewButton, "cell 0 7");
		
		JButton btnNewButton_1 = new JButton("DEVOLUCION");
		frmPrestamo.getContentPane().add(btnNewButton_1, "cell 4 7,alignx right");
		
		frmPrestamo.setVisible(true);
	}
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
}