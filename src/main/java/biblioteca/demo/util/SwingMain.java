package biblioteca.demo.util;
import biblioteca.demo.run.*;
		
import java.awt.EventQueue;
import javax.swing.JFrame;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import biblioteca.demo.run.*;
import java.awt.BorderLayout;


/**
 * Punto de entrada principal que incluye botones para la ejecucion de las pantallas 
 * de las aplicaciones de ejemplo
 * y acciones de inicializacion de la base de datos.
 * No sigue MVC pues es solamente temporal para que durante el desarrollo se tenga posibilidad
 * de realizar acciones de inicializacion
 */
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
					
					//// Crear tres ventanas adicionales
					window.crearventanas(3); // Cambié el número a 3 ventanas
						
					} catch (Exception e) {
					e.printStackTrace(); //NOSONAR codigo autogenerado
				}
			}
		});
	}

	protected void crearventanas(int i) {
			// TODO Auto-generated method stub
		//Introduzco implementación para abrir ventanas
		int j;
		for (int j1 = 0; j1< i; j1++) {
			JFrame nuevaVentana = new JFrame("Ventana" + (j1+i));
			nuevaVentana.setSize (300,200);
			nuevaVentana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			nuevaVentana.setVisible(true);
			
		}
		
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
		frame.setBounds(0, 0, 287, 185);
		frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("BIENVENIDO A SOOPER ONLINE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //esto es lo que crea el boton, se puede instalar en propietier shows events/
				BibliotecaView biblioteca = new BibliotecaView();	}
		});
		frame.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		Database db=new Database(); //creo la base de datos de prueba
		
		db.createDatabase(false); //le paso el valor falso porque considero que no esta creada aun
		db.loadDatabase(); //cargo datos de prueba
		
	}
		
	public JFrame getFrame() { return this.frame; }
	
}
