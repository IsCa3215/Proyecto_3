import java.time.LocalDate;
import java.util.ArrayList;

public class Album extends Media{
    String descripcion;
    TipoAlbum tipo;
    LocalDate fechaLanzamiento;
    ArrayList<Audible> pistas = new ArrayList<Audible>();
    int votosPositivos;
    int votosNegativos;
    public Album(String nombre, String autor, int calificacionEdad, LocalDate fechaAlta, boolean esContenidoPremium, String descripcion, TipoAlbum tipo, LocalDate fechaLanzamiento, ArrayList<Audible> pistas){
        super(nombre, autor, calificacionEdad, fechaAlta,esContenidoPremium );
        if (!comprobarDescripcion(descripcion)) {
            throw new IllegalArgumentException("La descripción sobrepasa el limite de 200 caracteres");
        }

        this.descripcion = descripcion;
        this.tipo = tipo;
        this.fechaLanzamiento = fechaLanzamiento;
        this.pistas = pistas;
        
        

    }

    public int duracionTotal(){
        int res = 0;
        for (int i = 0; i < pistas.size(); i++) {
            int x = pistas.get(i).getDuracion();
            res = res+=x;
            
        }
        return res;
        
    }
    
    @Override
    public String toString() {
        return "[Album] "+ "\n" + "descripcion:" + descripcion + "\n" + " tipo:" + tipo + "\n" + ", fechaLanzamiento:" + fechaLanzamiento + "\n"
                + ", votosPositivos:" + votosPositivos + "\n" + ", votosNegativos:" + votosNegativos + "\n"
                + "\n"+ "pistas:" + pistas + "\n" + " duración del album: "+duracionTotal();
    }

    public void meGusta(boolean like){
        if(like){
          votosPositivos = 1;
        }else if (!like) {
          votosNegativos = 1;
        }
        
      }
    public boolean comprobarDescripcion(String desc){
        boolean comprobar = false;
        if (desc.length()>200) {
            comprobar = false;
        } else {
            comprobar = true;
        }
        return comprobar;
    }
}
