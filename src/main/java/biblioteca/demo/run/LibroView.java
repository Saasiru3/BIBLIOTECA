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
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class LibroView extends JFrame { //corregido

	public JFrame frmLibro;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	
	public LibroView() {
		initialize();
	}
	private void initialize () {
		frmLibro = new JFrame();
		frmLibro.getContentPane().setBackground(new Color(57, 198, 166));
		frmLibro.setBounds(0, 0, 500, 500); 
		frmLibro.getContentPane().setLayout(new MigLayout("", "[grow][][grow][][][][][]", "[][][][][][grow][]"));
		
		JLabel lblNewLabel = new JLabel("GESTION DE LIBROS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmLibro.getContentPane().add(lblNewLabel, "cell 3 0");
		
		JLabel lblNewLabel_1 = new JLabel("ISBN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmLibro.getContentPane().add(lblNewLabel_1, "cell 0 1,alignx left");
		
		textField = new JTextField();
		frmLibro.getContentPane().add(textField, "cell 2 1,growx");
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Titulo");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmLibro.getContentPane().add(lblNewLabel_2, "cell 0 2,alignx left");
		
		textField_1 = new JTextField();
		frmLibro.getContentPane().add(textField_1, "cell 2 2 6 1,growx");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Autor");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmLibro.getContentPane().add(lblNewLabel_3, "cell 0 3,alignx left");
		
		textField_2 = new JTextField();
		frmLibro.getContentPane().add(textField_2, "cell 2 3 6 1,growx");
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Año Edicion");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmLibro.getContentPane().add(lblNewLabel_4, "cell 0 4,alignx left");
		
		JScrollPane scrollPane = new JScrollPane();
		frmLibro.getContentPane().add(scrollPane, "cell 0 5 8 1,grow");
		
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
				{null},
			},
			new String[] {
				"New column"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("ALTA");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frmLibro.getContentPane().add(btnNewButton, "cell 0 6");
		
		JButton btnNewButton_1 = new JButton("BAJA");
		frmLibro.getContentPane().add(btnNewButton_1, "cell 2 6");
		
		JButton btnNewButton_2 = new JButton("MODIFICAR");
		frmLibro.getContentPane().add(btnNewButton_2, "cell 4 6");
			
		setTitle("Gestion de Libros");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);//
		
				
		frmLibro.setVisible(true); //para hacer ventana visible
	}
	public void setVisible(boolean b) {
		
	}
}