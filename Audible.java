
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Audible extends Media {

  String productora;
  String[] participantes;
  int duracion;
  Estilo categoria;
  LocalDate fechaLanzamiento;
  ArrayList<Integer> votos;

  public Audible(
    String nombre,
    String autor,
    int calificacionEdad,
    LocalDate fechaAlta,
    boolean esContenidoPremium,
    String productora,
    String[] participantes,
    int duracion,
    Estilo categoria
  ) {
    super(nombre, autor, calificacionEdad, fechaAlta, esContenidoPremium);
    this.productora = productora;
    this.participantes = participantes;
    this.duracion = duracion;
    this.categoria = categoria;
    
  }
  public Audible(Audible copia){
    super(copia.getNombre(), copia.getAutor(), copia.getCalificacionEdad(), copia.getFechaAlta(), copia.isEsContenidoPremium());
    this.productora = copia.productora;
    this.participantes = copia.participantes;
    this.duracion = copia.duracion;
    this.categoria = copia.categoria;
  }

@Override
public String toString() {
    return "Audible [productora=" + productora + ", participantes=" + Arrays.toString(participantes) + ", duracion="
            + duracion + ", fechaLanzamiento=" + fechaLanzamiento + ", votos=" + votos + "]";
}

public void setProductora(String productora) {
  this.productora = productora;
}

public void setParticipantes(String[] participantes) {
  this.participantes = participantes;
}

public void setDuracion(int duracion) {
  this.duracion = duracion;
}

public void setCategoria(Estilo categoria) {
  this.categoria = categoria;
}

public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
  this.fechaLanzamiento = fechaLanzamiento;
}
public boolean votar(int voto){
  if (voto < 0 || voto > 10) {
    throw new IllegalArgumentException("El valor en el parámetro votar no es válido");
  }
  this.votos.add(0, voto);
  return true;
}
}
