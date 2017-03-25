package examen2;

import java.util.ArrayList;

public class Playlists {

    private String nombre;
    private ArrayList<Canciones> canciones = new ArrayList();

    public Playlists() {
    }

    public Playlists(String nombre, ArrayList<Canciones> canciones) {
        this.nombre = nombre;
        this.canciones = canciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Canciones> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
