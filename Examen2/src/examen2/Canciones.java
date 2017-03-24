package examen2;

public class Canciones {

    private String Nombre, artista, genero;
    private int duracion;

    public Canciones() {
    }

    public Canciones(String Nombre, String artista, String genero, int duracion) {
        this.Nombre = Nombre;
        this.artista = artista;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return Nombre;
    }
}
