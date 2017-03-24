package examen2;

import java.util.ArrayList;

public class Usuarios {

    private String nombre, username, password;
    private int edad;
    private ArrayList<Object> playlists = new ArrayList();
    private ArrayList<Canciones> favoritos = new ArrayList();

    public Usuarios() {
    }

    public Usuarios(String nombre, String username, String password, int edad) {
        this.nombre = nombre;
        this.username = username;
        this.password = password;
        this.edad = edad;
    }

    public ArrayList<Object> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<Object> playlists) {
        this.playlists = playlists;
    }

    public ArrayList<Canciones> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(ArrayList<Canciones> favoritos) {
        this.favoritos = favoritos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return username;
    }
}
