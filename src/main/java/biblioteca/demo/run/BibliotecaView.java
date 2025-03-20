package biblioteca.demo.run;

import javax.swing.JFrame;		//importa la clase Jframe de Swing, para crear ventana

import javax.swing.JLabel;		//Importa la clase JLabel, que se usa para etiquetas

import net.miginfocom.swing.MigLayout;

import javax.swing.JButton;		// Importar la clase JButton, para crear botones en la interface
import java.awt.event.ActionListener;	//importa clase para manejar eventos generados por los botones cuando son presionados
import java.awt.event.ActionEvent;		// lo mismo del anterior
import java.awt.Color;					//importa la Clase color en este caso de los texto de botones
import java.awt.Window;			//Importar la clase Window, para la ventana de la aplicacion

public class BibliotecaView {	// es la clase principal define la vista de la biblioteca

	protected JFrame frmBiblioteca;	//es un campo protegido de la ventana principal
	private BibliotecaController controlador;
	
	public BibliotecaView(BibliotecaController controlador) {	// Es el constructor, que llama al método initialize()
		initialize(controlador);
	}
	private void initialize (BibliotecaController controller) {		//Es el metodo para configurar la ventana y sus componentes
		
		frmBiblioteca = new JFrame();
		frmBiblioteca.getContentPane().setLayout(new MigLayout("","[grow]", "[][][grow][][grow][]"));
		frmBiblioteca.setBounds(0, 0, 500, 500);
		this.controlador = controller; //aquí tengo vinculada la vista con el controlador que creo en el swinMain
		
		JButton btnSocios = new JButton("Gestion Socios\r\n");//Crea el boton
		btnSocios.setBounds(99, 23, 184, 44);				// crea tamaño y posicion
		btnSocios.setForeground(new Color(0, 0, 255));	// define color texto
		btnSocios.addActionListener(new ActionListener() { // es un escuchador cuando apretamos el boton
			public void actionPerformed(ActionEvent e) {
				SocioView gestionSocios = new SocioView();// esta vacio, lo que significa que no hace nada cuando se pulsa el boton
			}
		});
		frmBiblioteca.getContentPane().setLayout(null); //
		frmBiblioteca.getContentPane().add(btnSocios);
		
		JButton btnNewButton_1 = new JButton("Gestion de Libros");
		btnNewButton_1.setBounds(99, 106, 184, 44);
		btnNewButton_1.setForeground(new Color(0, 0, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibroView gestionLibros = new LibroView();
			}
		});
		frmBiblioteca.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Gestion de Prestamos");
		btnNewButton_2.setBounds(99, 182, 184, 56);
		btnNewButton_2.setForeground(new Color(0, 0, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrestamoView gestionPrestamos = new PrestamoView();
			}
		});
		frmBiblioteca.getContentPane().add(btnNewButton_2);
		
		frmBiblioteca.setVisible(true);
	}
	public JFrame getFrame() {
		// TODO Auto-generated method stub
		return this.frmBiblioteca;
	}
	
}
