package biblioteca.demo.util;

import biblioteca.demo.run.BibliotecaView;
import biblioteca.demo.run.LibroView;
import biblioteca.demo.run.Prestamoview;
import biblioteca.demo.run.SocioView;


import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;




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
					window.crearventanas(1); // 
						
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
		for (int j1 = 0; j1 < i; j1++) {
			JFrame nuevaVentana = new JFrame("Ventana" + (j1 + 1));
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
		frame.setBounds(0, 0, 469, 329);
		frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("BIENVENIDOS AL GESTOR DE LA BIBLIOTECA DE LUGONES");
		btnNewButton.setBounds(63, 89, 315, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ENTRAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				frame.setVisible(false);
				
				abrirVentanaPrestamo();
			
			}
		});
		
		btnNewButton_1.setBounds(164,158,89,23);
		frame.getContentPane().add(btnNewButton_1);
	}
		 private void abrirVentanaPrestamo() {
		        Prestamoview prestamoView = new Prestamoview();
		        ((Window) Prestamoview.frmPrestamo).setVisible(true);

		        // Después de que la ventana de préstamo se haya mostrado, redirigimos a la ventana de libros
		        prestamoView.frmPrestamo().addWindowListener(new java.awt.event.WindowAdapter() {
		            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		                abrirVentanaLibro();
		            }
		        });
		    }

		    private void abrirVentanaLibro() {
		        LibroView libroView = new LibroView();
		        libroView.frmLibro.setVisible(true);

		        // Después de que la ventana de libros se haya mostrado, redirigimos a la ventana de socios
		        libroView.getFrame().addWindowListener(new java.awt.event.WindowAdapter() {
		            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		                abrirVentanaSocio();
		            }
		        });
		    }

		    private void abrirVentanaSocio() {
		        SocioView socioView = new SocioView();
		        socioView.frmSocio.setVisible(true);
		    }

		    public JFrame getFrame() {
		        return this.frame;
		    }
	}