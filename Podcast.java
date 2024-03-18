import java.time.LocalDate;
import java.util.ArrayList;

public class Podcast extends Media {
    LocalDate fechaEstreno;
    ArrayList<Temporada> temporadas = new ArrayList<>();
    public Podcast(String nombre, String autor, int calificacionEdad, LocalDate fechaAlta, boolean esContenidoPremium) {
        super(nombre, autor, calificacionEdad, fechaAlta, esContenidoPremium);
        this.fechaAlta = fechaAlta;
    }
   public Podcast(Podcast copia){
        super(copia.nombre, copia.autor, copia.calificacionEdad, copia.fechaAlta, copia.esContenidoPremium);
        this.fechaEstreno = copia.fechaEstreno;
    }
    public LocalDate getFechaEstreno(){
        return this.fechaEstreno;
    }
    public int getNumeroTemporada(){
        return temporadas.size();
    }

    public int getDuracion(){
        return 0;
    }
    public boolean añadirTemporada(LocalDate fechaEstreno, LocalDate fechaFinalizacion){
        return false;
    }
    public boolean eliminarTemporada(int n){
        return false;
    }
    public boolean añadirEpisodio(int nTemporada, Audible episodio){
        return false;
    }
    public boolean eliminarEpisodio(int nTemporada, String titulo){
        return false;
    }
    public boolean eliminarEpisodios(String expresionRegular){
        return false;
    }
    public Audible getEpisodio(int nTemporara, int posicion){
        return null;
    }
    public boolean setEpisodio(int nTemporada, int posicion, LocalDate fechaEmision, String titulo){
        return false;
    }
    public boolean votar(int nTemporada, int posicion, int voto){
        return false;
    }
    public boolean votar(int nTemporada, String titulo, int voto){
        return false;
    }
    public boolean setFechaEstreno(LocalDate fecha){
        return false;
    }
    public Temporada getCopiaTemporada(int nTemporada) {
        return null;
    }

    
    
}
