package biblioteca.demo.run;

public class Libro {



	private int isbn; //asociada a clave primaria en la tabla de 08
	private String titulo;
	private String autor;
	private int edicion;
	
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() { //devuelve String cadena de caracteres
								// el parentesis son los parmetros que siempre tiene que estar
		return autor;
	}
	public void setAutor(String autor) { //
		this.autor = autor;
	}
	public int getEdicion() { //el get devuelve un entero de edicion y al ser publico se puede llamar de fuera de la clase
		return edicion;			//al definir el metodo me tiene que devolver un metodo porque el atributo edicion esta definido como entero
	}							//los metodos por minusculas y la separacion de dos palabara con mayusculas
								//return devuelve el resultado al metodo
	
	public void setEdicion(int edicion) {//funcion vacia, el setde la funcion pide parametros
										//la poner void no hace falta poner return
		this.edicion = edicion; //asigna al atributo edicion el valor que le paso como argumento en la llamada al mentodo
	}
	public void mostrarInfo() {
		// TODO Auto-generated method stub
		
	}
	public void prestarLibro() {
		// TODO Auto-generated method stub
		
	}
	public void devolverLibro() {
		// TODO Auto-generated method stub
		
	}
	
	}
	