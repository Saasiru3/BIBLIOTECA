package biblioteca.demo.run;

import javax.swing.JFrame;		//importa la clase Jframe de Swing, para crear ventana

import javax.swing.JLabel;		//Importa la clase JLabel, que se usa para etiquetas

import net.miginfocom.swing.MigLayout;

import javax.swing.JButton;		// Importar la clase JButton, para crear botones en la interface
import java.awt.event.ActionListener;	//importa clase para manejar eventos generados por los botones cuando son presionados
import java.awt.event.ActionEvent;		// lo mismo del anterior
import java.awt.Color;					//importa la Clase color en este caso de los texto de botones
import java.awt.Window;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;			//Importar la clase Window, para la ventana de la aplicacion

public class BibliotecaView {	// es la clase principal define la vista de la biblioteca

	protected JFrame frmBiblioteca;	//es un campo protegido de la ventana principal determina el alcance de la variable
	
	private BibliotecaController controlador; //interacion entre la vista y la logica de negocio de la aplicacion
	
	public BibliotecaView(BibliotecaController controlador) {	// Es el constructor, que llama al método initialize()
		initialize(controlador);
	}
	private void initialize (BibliotecaController controller) {		//Es el metodo para configurar la ventana y sus componentes
		frmBiblioteca = new JFrame(); //aquí se esta creando un nueva instancia de la clase JFrame, que es el contenedor principal
		frmBiblioteca.getContentPane().setForeground(new Color(0, 128, 255));
		frmBiblioteca.setBounds(0, 0, 500, 500); // configuracion de las ventana, PARA QUE SE VEA COMPLETA
		this.controlador = controller;
		
		JButton btnSocios = new JButton("Gestion Socios\r\n");
		btnSocios.setBounds(210, 40, 264, 44);
		btnSocios.setForeground(new Color(0, 0, 255));	// define color texto
		btnSocios.addActionListener(new ActionListener() { // es un escuchador cuando apretamos el boton
			public void actionPerformed(ActionEvent e) { //es cuando apretamos el boton
				
				
				SocioView gestionSocios = new SocioView();// esta vacio, lo que significa que no hace nada cuando se pulsa el boton
	            gestionSocios.setVisible(true); //Mostrar ventana gestion de socios	
			}	
			
		});
		frmBiblioteca.getContentPane().setLayout(null);
		
		frmBiblioteca.getContentPane().add(btnSocios); //Objeto JFrame + metodo de la clase JFrame + agrega un boton que esta siendo agregado a la ventana
		
		JButton btnNewButton_1 = new JButton("Gestion de Libros");
		btnNewButton_1.setBounds(270, 134, 204, 50);
		btnNewButton_1.setForeground(new Color(0, 0, 255)); //Cambia el color de texto del boton
		btnNewButton_1.addActionListener(new ActionListener() {// cuando se apreta el boton se ejecuta el método actionPerformed
			public void actionPerformed(ActionEvent e) { //Este metodo ejecuta cuando pulsamos el boton
				
				LibroView gestionLibros = new LibroView(); //Relaciona con una nueva instancia a la clase libroView
				gestionLibros.setVisible(true);
			}
		});
		frmBiblioteca.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Gestion de Prestamos");
		btnNewButton_2.setBounds(294, 240, 180, 50);
		btnNewButton_2.setForeground(new Color(0, 0, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PrestamoView gestionPrestamos = new PrestamoView();
				gestionPrestamos.setVisible(true);
			}
		});
		frmBiblioteca.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(new Color(0, 128, 255));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\LAUIR\\git\\Logo Sergiocolor.jpg"));
		lblNewLabel.setBounds(-117, 95, 464, 439);
		frmBiblioteca.getContentPane().add(lblNewLabel);
		
       
	}
	public JFrame getFrame() {
		// TODO Auto-generated method stub
		return this.frmBiblioteca;
	}
}
