package biblioteca.demo.run;

public class BibliotecaController {
	
	private BibliotecaModel model;
	private BibliotecaView view;
	
public void setVistaModel(BibliotecaView v, BibliotecaModel m) {
	this.model = m;
	this.view = v;
	//inicializacion de la vista
	this.view.getFrame().setVisible(true);
}
}
