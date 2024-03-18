import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Temporada {
    LocalDate fechaEstreno;
    LocalDate fechaFin;
    ArrayList<Audible> episodios = new ArrayList<Audible>();

    public Temporada(LocalDate fechaEstreno, LocalDate fechaFin){
        if (fechaEstreno.isBefore(fechaFin)) {
            throw new IllegalArgumentException("La fecha de finalización no puede ser anterior a la de estreno.");
        }
        this.fechaEstreno = fechaEstreno;
        this.fechaFin = fechaFin;
    }

    public void setFechaEstreno(LocalDate fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaEstreno() {
        return fechaEstreno;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }
    public int getDuracion(){
        Audible pista = null;
        int res = pista.getDuracion();
        return res;
        
    }
    public boolean añadirEpisodio(Audible episodio){
        boolean res = false;
        if (!episodios.contains(episodio)) {
            LocalDate fechaEmisionEpisodio = episodio.getFechaLanzamiento();
            if (fechaEstreno.isBefore(fechaEstreno) || fechaEmisionEpisodio.isAfter(fechaFin)) {
                res = false;
            } else {
                episodios.add(episodio);
                res = true;
            }
        }
        return res;
    }
    public boolean eliminarEpisodio(String titulo){
        boolean res = false;
        if (episodios.equals(titulo)) {
            res = true;
        }
        return res;
    }
    
    public int eliminarEpisodios(String expresionRegular){
        episodios.remove(expresionRegular);
        return 1;
    }
    public Audible getEpisodio(int posicion) {
        return episodios.get(posicion);
    }
    

}
