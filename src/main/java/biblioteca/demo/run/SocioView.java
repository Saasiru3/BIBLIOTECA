package biblioteca.demo.run;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SocioView extends JFrame {
	
	

	public JFrame frmSocio;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel lblGestionDeSocios;
	
	public SocioView() {
		initialize();
	}
	private void initialize () {
		frmSocio = new JFrame();
		frmSocio.setBounds(0, 0, 500, 500); //configura la ventana, PARA QUE SE VEA COMPLETA
		frmSocio.getContentPane().setLayout(new MigLayout("", "[71px][348px,grow]", "[][20px][14px][][grow][][]"));
		
		lblGestionDeSocios = new JLabel("GESTION DE SOCIOS");
		frmSocio.getContentPane().add(lblGestionDeSocios, "cell 1 0");
		
		lblNewLabel = new JLabel("Num Socio");
		frmSocio.getContentPane().add(lblNewLabel, "cell 0 1,alignx left,aligny center");
		
		textField = new JTextField();
		frmSocio.getContentPane().add(textField, "cell 1 1,growx,aligny top");
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Nombre Socio");
		frmSocio.getContentPane().add(lblNewLabel_1, "cell 0 2,alignx left,aligny top");
		
		textField_1 = new JTextField();
		frmSocio.getContentPane().add(textField_1, "cell 1 2,growx");
		textField_1.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Categoria");
		frmSocio.getContentPane().add(lblNewLabel_2, "cell 0 3,alignx left");
		
		textField_2 = new JTextField();
		frmSocio.getContentPane().add(textField_2, "cell 1 3,growx");
		textField_2.setColumns(10);
		
		btnNewButton_1 = new JButton("BAJA");
		frmSocio.getContentPane().add(btnNewButton_1, "flowx,cell 0 4");
		
		btnNewButton = new JButton("ALTA");
		frmSocio.getContentPane().add(btnNewButton, "cell 0 4,alignx left,aligny baseline");
		
		scrollPane = new JScrollPane();
		frmSocio.getContentPane().add(scrollPane, "cell 1 4,grow");
		
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
			},
			new String[] {
				"New column"
			}
		));
		scrollPane.setViewportView(table);
		
		btnNewButton_2 = new JButton("MODIFICAR");
		frmSocio.getContentPane().add(btnNewButton_2, "cell 0 5");
		
		setTitle("Gestion de Socios");
		setSize(500,400); //Ajusta el tamaño de la ventana
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Cierra la ventan cuando haces clic en la X
		setLocationRelativeTo(null);//centra la ventana en la pantalla
		
		frmSocio.setVisible(true);
	}
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}