import java.time.LocalDate;

public abstract class Media {

  String nombre;
  String autor;
  int calificacionEdad;
  LocalDate fechaAlta;
  boolean esContenidoPremium;

  public Media(
    String nombre,
    String autor,
    int calificacionEdad,
    LocalDate fechaAlta,
    boolean esContenidoPremium
  ) {
    if (calificacionEdad > 18 || calificacionEdad < 0) {
      throw new IllegalArgumentException("No se ha introducido un valor reconocible");
    }
    this.nombre = nombre;
    this.autor = autor;
    this.calificacionEdad = calificacionEdad;
    this.fechaAlta = fechaAlta;
    this.esContenidoPremium = esContenidoPremium;
  }

  // public Media(String autor2, int calificacionEdad2, LocalDate fechaAlta2, String nombre2) {
    
  // }

  //GETTERS
  public String getNombre() {
    return nombre;
  }

  public String getAutor() {
    return autor;
  }

  public int getCalificacionEdad() {
    return calificacionEdad;
  }

  public LocalDate getFechaAlta() {
    return fechaAlta;
  }

  public boolean isEsContenidoPremium() {
    return esContenidoPremium;
  }

  //SETTERS
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public void setCalificacionEdad(int calificacionEdad) {
    this.calificacionEdad = calificacionEdad;
  }

  public void setFechaAlta(LocalDate fechaAlta) {
    this.fechaAlta = fechaAlta;
  }

  public void setEsContenidoPremium(boolean esContenidoPremium) {
    this.esContenidoPremium = esContenidoPremium;
  }

  @Override
  public String toString() {
    return "Media [nombre=" + nombre + ", autor=" + autor + ", calificacionEdad=" + calificacionEdad + ", fechaAlta="
        + fechaAlta + ", esContenidoPremium=" + esContenidoPremium + "]";
  }
}
