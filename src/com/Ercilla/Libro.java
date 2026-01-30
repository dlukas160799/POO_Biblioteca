package com.Ercilla;

public class Libro {
    protected String autor;
    protected String titulo;
    protected Genero genero;


    public Libro(String autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = tiulo;
        this.genero = genero;
    }

    public abstract String getDescripcion();

    public void mostrarInfo(){
        System.out.println("Titulo "+titulo);
        System.out.printl("Autor "+autor);
        System.out.println("Genero"+genero);
        System.out.println(getDescripcion())
}
}
