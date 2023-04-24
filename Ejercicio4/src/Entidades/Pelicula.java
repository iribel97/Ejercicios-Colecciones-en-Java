/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author irina
 */
public class Pelicula {
    /*
    *tendremos una clase Pelicula con el título, director y duración de la película (en horas).
    */
    private String title;
    private String director;
    private int movieTime;

    public Pelicula() {
    }

    public Pelicula(String title, String director, int movieTime) {
        this.title = title;
        this.director = director;
        this.movieTime = movieTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(int movieTime) {
        this.movieTime = movieTime;
    }
    
    
    
}
