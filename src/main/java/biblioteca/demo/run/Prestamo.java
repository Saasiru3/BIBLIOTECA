package biblioteca.demo.run;

public class Prestamo {
	
	private int isbn; //asociada a clave primaria en la tabla de base de datos
	private String titulo;
	private String autor;
	private int edicion;
	private boolean disponible; //nuevo atrivuto para controlar si el libro esta disponible
	
	//Constructor
	public Libro(int isbn, String titulo, String autor, int edicion) {
		this.isbn = isbn;
		this.titulo = titulo;
        this.autor = autor;
        this.edicion = edicion;
        this.disponible = true; // por defecto, los libros están disponibles
	}
		//Metodos getter y setter
	
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // Método para prestar el libro
    public void prestarLibro() {
        if (disponible) {
            disponible = false; // el libro ya no está disponible
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + titulo + "' no está disponible para préstamo.");
        }
    }

    // Método para devolver el libro
    public void devolverLibro() {
        if (!disponible) {
            disponible = true; // el libro vuelve a estar disponible
            System.out.println("El libro '" + titulo + "' ha sido devuelto.");
        } else {
            System.out.println("El libro '" + titulo + "' no estaba prestado.");
        }
    }

    // Método para mostrar la información del libro
    public void mostrarInfo() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Edición: " + edicion);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }

    public static void main(String[] args) {
        // Crear un libro de ejemplo
        Libro libro1 = new Libro(123456, "Universo",1 );

        // Mostrar la información del libro
        libro1.mostrarInfo();

        // Intentar prestar el libro
        libro1.prestarLibro();
        
        // Intentar devolver el libro
        libro1.devolverLibro();
        
        // Mostrar la información nuevamente
        libro1.mostrarInfo();
    }
}
