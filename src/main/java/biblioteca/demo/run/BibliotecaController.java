package biblioteca.demo.run;

import java.util.List;

public class BibliotecaController {
	
	private BibliotecaModel model;
	private BibliotecaView view;
	
public void setVistaModel(BibliotecaView v, BibliotecaModel m) {
	this.model = m;
	this.view = v;
	//inicializacion de la vista
	this.view.getFrame().setVisible(true);}


public void AniadirGestionLibros(int i) {
	//metodo para rellenar la tabla de articulos y pedidos
	int j;
	
	List<Object[]> lista=model.AniadirGestionLibros(i);
	for (j=0; i<lista.size();j++) {
		view.AniadirGestionLibros (lista.get(j));
	}
}}
