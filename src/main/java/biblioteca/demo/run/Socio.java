package biblioteca.demo.run;

import java.util.ArrayList;
import java.util.List;

public class Socio {
	
	    private String nombre;
	    private String numeroSocio;
	    private List<String> librosPrestados;

	    // Constructor
	    public Socio(String nombre, String numeroSocio) {
	        this.nombre = nombre;
	        this.numeroSocio = numeroSocio;
	        this.librosPrestados = new ArrayList<>();
	    }

	    // Métodos getter y setter
	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getNumeroSocio() {
	        return numeroSocio;
	    }

	    public void setNumeroSocio(String numeroSocio) {
	        this.numeroSocio = numeroSocio;
	    }

	    public List<String> getLibrosPrestados() {
	        return librosPrestados;
	    }

	    // Método para agregar un libro prestado
	    public void agregarLibroPrestado(String libro) {
	        librosPrestados.add(libro);
	    }

	    // Método para devolver un libro
	    public void devolverLibro(String libro) {
	        librosPrestados.remove(libro);
	    }

	    // Método para mostrar los libros prestados
	    public void mostrarLibrosPrestados() {
	        if (librosPrestados.isEmpty()) {
	            System.out.println("No tienes libros prestados.");
	        } else {
	            System.out.println("Libros prestados por " + nombre + ":");
	            for (String libro : librosPrestados) {
	                System.out.println(libro);
	            }
	        }
	    }
	}

