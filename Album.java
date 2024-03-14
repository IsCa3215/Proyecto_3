import java.util.ArrayList;
import java.time.LocalDate;

public class Album extends Media {
    String descripcion;
    TipoAlbum tipo;
    LocalDate fechaLanzamiento;
    ArrayList<Audible> pistas = new ArrayList<Audible>();
    int votosPositivos;
    int votosNegativos;

    // Constructor
    public Album(String nombre, String autor, int calificacionEdad, LocalDate fechaAlta, boolean esContenidoPremium,
            String descripcion, TipoAlbum tipo, LocalDate fechaLanzamiento, ArrayList<Audible> pistas) {
        super(nombre, autor, calificacionEdad, fechaAlta, esContenidoPremium);
        if (!comprobarDescripcion(descripcion)) {
            throw new IllegalArgumentException("La descripción sobrepasa el límite de 200 caracteres");
        }

        this.descripcion = descripcion;
        this.tipo = tipo;
        this.fechaLanzamiento = fechaLanzamiento;
        this.pistas = pistas;
    }

    // Constructor de copia
    public Album(Album otroAlbum) {
        this(otroAlbum.getNombre(), otroAlbum.getAutor(), otroAlbum.getCalificacionEdad(),
                otroAlbum.getFechaAlta(), otroAlbum.esContenidoPremium(), otroAlbum.getDescripcion(),
                otroAlbum.getTipo(), otroAlbum.getFechaLanzamiento(), new ArrayList<Audible>(otroAlbum.getPistas()));
    }

    // Método para obtener la descripción
    public String getDescripcion() {
        return descripcion;
    }

    // Método para establecer la descripción
    public void setDescripcion(String descripcion) {
        if (!comprobarDescripcion(descripcion)) {
            throw new IllegalArgumentException("La descripción sobrepasa el límite de 200 caracteres");
        }
        this.descripcion = descripcion;
    }

    // Método para obtener el tipo
    public TipoAlbum getTipo() {
        return tipo;
    }

    // Método para establecer el tipo
    public void setTipo(TipoAlbum tipo) {
        this.tipo = tipo;
    }

    // Método para obtener la fecha de lanzamiento
    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    // Método para establecer la fecha de lanzamiento
    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    // Método para obtener la duración total del álbum en segundos
    public int duracionTotal() {
        int res = 0;
        for (Audible pista : pistas) {
            res += pista.getDuracion();
        }
        return res;
    }

    // Método para obtener el número de canciones del álbum
    public int numeroCanciones() {
        return pistas.size();
    }

    // Método para obtener una canción del álbum por índice
    public Audible getCancion(int indice) {
        if (indice >= 0 && indice < pistas.size()) {
            return pistas.get(indice);
        } else {
            return null;
        }
    }

    // Método para agregar un voto positivo o negativo al álbum
    public void meGusta(boolean like) {
        if (like) {
            votosPositivos++;
        } else {
            votosNegativos++;
        }
    }

    // Método para comprobar la descripción
    private boolean comprobarDescripcion(String desc) {
        return desc.length() <= 200;
    }

    // Método toString() sobrescrito
    @Override
    public String toString() {
        return "[Album] \n" + "descripcion: " + descripcion + "\n" + "tipo: " + tipo + "\n" + "fechaLanzamiento: "
                + fechaLanzamiento + "\n" + "votosPositivos: " + votosPositivos + "\n" + "votosNegativos: "
                + votosNegativos + "\n" + "pistas: " + pistas + "\n" + "duración del album: " + duracionTotal();
    }
}
