package Examen;

public class Libro
{
    String titulo;
    String autor;
    String ISBN;
    Boolean prestado;
}

public Libro (String título, String autor, String ISBN, Boolean prestado)
{
	super();
	this.titulo = titulo;
	this.autor = autor;
	ISBN = ISBN;
	this.prestado = prestado;
}