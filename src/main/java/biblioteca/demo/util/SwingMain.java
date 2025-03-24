package biblioteca.demo.util;

import biblioteca.demo.run.BibliotecaController;
import biblioteca.demo.run.BibliotecaModel;
import biblioteca.demo.run.BibliotecaView;
import biblioteca.demo.run.LibroView;
import biblioteca.demo.run.PrestamoView;
import biblioteca.demo.run.SocioView;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;




public class SwingMain {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { //NOSONAR codigo autogenerado
			public void run() {
				try {
					SwingMain window = new SwingMain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace(); //NOSONAR codigo autogenerado
				}
			}
			
		});
	}
	/**
	 * Create the application.
	 */
	public SwingMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Main");
		frame.setBounds(0,0, 287, 185);
		frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("BIENVENIDO A LA BIBLIOTECA DE LUGONES");
		btnNewButton.addActionListener(new ActionListener() {
				
			public void actionPerformed(ActionEvent e) {
				BibliotecaController controller = new BibliotecaController();
				controller.setVistaModel(new BibliotecaView(controller), new BibliotecaModel());
			
				
				
				}
		}
		);
		frame.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		Database db=new Database();
		
		db.createDatabase(false);
		db.loadDatabase();
		
	}
	public JFrame getFrame() { return this.frame; }
}
	