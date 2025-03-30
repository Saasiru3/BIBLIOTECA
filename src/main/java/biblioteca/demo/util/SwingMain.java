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
import javax.swing.ImageIcon;




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
		frame.setBounds(0,0, 450, 300);
		frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("BIENVENIDO A LA BIBLIOTECA DE LUGONES");
		btnNewButton.setBounds(73, 11, 273, 84);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //la accion cuando apretamos el boton		
				BibliotecaController controller = new BibliotecaController();
				BibliotecaView vista = new BibliotecaView(controller);
				BibliotecaModel modelo = new BibliotecaModel ();
				
				controller.setVistaModel(new BibliotecaView(controller), new BibliotecaModel());
			// intento asociar el boton Gestion libros
				
			
				
			}
		}
		);
		frame.getContentPane().setLayout(null);
			
				
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\LAUIR\\git\\63f70f6a8f204_360_202!.jpg"));
		lblNewLabel.setBounds(32, 11, 697, 285);
		frame.getContentPane().add(lblNewLabel);
		
		Database db=new Database();//creo la base de datos de prueba
		
		db.createDatabase(false); //le paso valor falso porque no esta creada aun
		db.loadDatabase(); //Cargo los datos de prueba
		
	}
	public JFrame getFrame() { return this.frame; } //es un getter de un objeto JFrame
													//metodo cuando quieres acceder a atributos de una clase de manera controlada y segura
}
	