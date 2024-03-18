import java.util.ArrayList;
import java.util.Collection;
import java.time.LocalDate;

public class Album extends Media {
    String descripcion;
    TipoAlbum tipo;
    LocalDate fechaLanzamiento;
    ArrayList<Audible> pistas = new ArrayList<>();
    int votosPositivos;
    int votosNegativos;

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

    public Album(Album otroAlbum) {
        super(otroAlbum.getNombre(), otroAlbum.getAutor(), otroAlbum.getCalificacionEdad(),
                otroAlbum.getFechaAlta(), otroAlbum.isEsContenidoPremium());
        if (!comprobarDescripcion(descripcion)) {
            throw new IllegalArgumentException("La descripción sobrepasa el límite de 200 caracteres");
        }
        this.descripcion = otroAlbum.getDescripcion();
        this.tipo = otroAlbum.getTipo();
        this.fechaLanzamiento = otroAlbum.getFechaLanzamiento();
        this.pistas = new ArrayList<>();
        for (Audible pista : otroAlbum.pistas) {
            this.pistas.add(new Audible(pista));
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (!comprobarDescripcion(descripcion)) {
            throw new IllegalArgumentException("La descripción sobrepasa el límite de 200 caracteres");
        }
        this.descripcion = descripcion;
    }

    public TipoAlbum getTipo() {
        return tipo;
    }

    public void setTipo(TipoAlbum tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int duracionTotal() {
        int res = 0;
        for (Audible pista : pistas) {
            res += pista.getDuracion();
        }
        return res;
    }

    public int numeroCanciones() {
        return pistas.size();
    }

    public Audible getCancion(int indice) {
        Audible res = null;
        if (indice >= 0 && indice < pistas.size()) {
            res = pistas.get(indice);
        } else {
            res = null;
        }
        return res;
    }

    public void meGusta(boolean like) {
        if (like) {
            votosPositivos++;
        } else {
            votosNegativos++;
        }
    }

    private boolean comprobarDescripcion(String desc) {
        return desc.length() <= 200;
    }

    @Override
    public String toString() {
        return "[Album] \n" + "descripcion: " + descripcion + "\n" + "tipo: " + tipo + "\n" + "fechaLanzamiento: "
                + fechaLanzamiento + "\n" + "votosPositivos: " + votosPositivos + "\n" + "votosNegativos: "
                + votosNegativos + "\n" + "pistas: " + pistas + "\n" + "duración del album: " + duracionTotal();
    }
}
