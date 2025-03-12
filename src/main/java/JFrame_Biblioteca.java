import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JEditorPane;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JComboBox;

public class JFrame_Biblioteca extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIdUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame_Biblioteca frame = new JFrame_Biblioteca();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrame_Biblioteca() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 708, 411);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Yu Gothic Light", Font.PLAIN, 18));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(10, 11, 672, 37);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("BIBLIOTECA LUGONES");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		lblNewLabel.setForeground(SystemColor.desktop);
		panel.add(lblNewLabel);
		
		txtIdUsuario = new JTextField();
		txtIdUsuario.setText("ID USUARIO");
		txtIdUsuario.setBounds(10, 77, 75, 37);
		contentPane.add(txtIdUsuario);
		txtIdUsuario.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(134, 66, 101, 110);
		contentPane.add(comboBox);
	}
}
