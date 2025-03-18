package biblioteca.demo.run;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;

public class SocioView {

	public JFrame frmSocio;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JLabel lblNewLabel_3;
	
	public SocioView() {
		initialize();
	}
	private void initialize () {
		frmSocio = new JFrame();
		frmSocio.getContentPane().setLayout(new MigLayout("", "[89px][76px][89px][77px][89px,grow]", "[14px][83px][][20px][20px][20px][23px]"));
		
		JLabel lblNewLabel = new JLabel("NOMBRE");
		frmSocio.getContentPane().add(lblNewLabel, "cell 0 0,alignx left,aligny top");
		
		JLabel lblNewLabel_1 = new JLabel("NUM Socio");
		frmSocio.getContentPane().add(lblNewLabel_1, "cell 2 0,alignx left,aligny top");
		
		JLabel lblNewLabel_2 = new JLabel("categ");
		frmSocio.getContentPane().add(lblNewLabel_2, "cell 4 0,alignx center,aligny top");
		
		JPanel panel = new JPanel();
		frmSocio.getContentPane().add(panel, "cell 0 1 5 1,grow");
		
		lblNewLabel_3 = new JLabel("AÑADIR");
		frmSocio.getContentPane().add(lblNewLabel_3, "cell 0 2");
		
		textField = new JTextField();
		frmSocio.getContentPane().add(textField, "cell 0 3 2 1,growx,aligny top");
		textField.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		frmSocio.getContentPane().add(textField_3, "cell 2 3,growx,aligny top");
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		frmSocio.getContentPane().add(textField_6, "cell 4 3,growx");
		
		textField_1 = new JTextField();
		frmSocio.getContentPane().add(textField_1, "cell 0 4 2 1,growx,aligny top");
		textField_1.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		frmSocio.getContentPane().add(textField_4, "cell 2 4,growx,aligny top");
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		frmSocio.getContentPane().add(textField_7, "cell 4 4,growx");
		
		textField_2 = new JTextField();
		frmSocio.getContentPane().add(textField_2, "cell 0 5 2 1,growx,aligny top");
		textField_2.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		frmSocio.getContentPane().add(textField_5, "cell 2 5,growx,aligny top");
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		frmSocio.getContentPane().add(textField_8, "cell 4 5,growx");
		
		JButton btnNewButton = new JButton("New button");
		frmSocio.getContentPane().add(btnNewButton, "cell 0 6,alignx left,aligny top");
		
		JButton btnNewButton_1 = new JButton("New button");
		frmSocio.getContentPane().add(btnNewButton_1, "cell 2 6,alignx left,aligny top");
		
		JButton btnNewButton_2 = new JButton("New button");
		frmSocio.getContentPane().add(btnNewButton_2, "cell 4 6,alignx left,aligny top");
	}
}