import java.time.LocalDate;
import java.util.ArrayList;

public class Album extends Media{
    String descripcion;
    TipoAlbum tipo;
    LocalDate fechaLanzamiento;
    ArrayList<Audible> pistas;
    int votosPositivos;
    int votosNegativos;
    public Album(String descripcion, TipoAlbum tipo, LocalDate fechaLanzamiento, ArrayList<Audible> ){
        super(descripcion, descripcion, votosNegativos, fechaLanzamiento, esContenidoPremium);
    }
}
