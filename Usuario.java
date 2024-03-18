import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private LocalDate fechaRegistro;
    private LocalDate fechaUltimoAcceso;
    private boolean estaActivo;
    protected ArrayList<Media> listaReproduccion = new ArrayList<>();

    public Usuario(String nombre, LocalDate fechaRegistro){
        this.nombre = nombre;
        this.fechaRegistro = fechaRegistro;
        this.estaActivo = true;
    }
    public Usuario(Usuario copia){
        this.nombre = copia.nombre;
        this.fechaRegistro = copia.fechaRegistro;
    }
    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", fechaRegistro=" + fechaRegistro + ", fechaUltimoAcceso="
                + fechaUltimoAcceso + ", estaActivo=" + estaActivo + ", listaReproduccion=" + listaReproduccion + "]";
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public LocalDate getFechaUltimoAcceso() {
        return fechaUltimoAcceso;
    }
    public void setFechaUltimoAcceso(LocalDate fechaUltimoAcceso) {
        this.fechaUltimoAcceso = fechaUltimoAcceso;
    }
    public boolean isEstaActivo() {
        return estaActivo;
    }
    public void setEstaActivo(boolean estaActivo) {
        this.estaActivo = estaActivo;
    }
    public int duracionListaReproduccion(int posicion){
        return 0;
    }
    public Media getElementoListaReproduccion(int posicion){
        Media res = null;
        if (listaReproduccion.get(posicion) != null) {
            res = listaReproduccion.get(posicion);
        }
        return res;
    }
    public int getTamañoListaReproduccion(int posicion){
        return listaReproduccion.size();
    }

    public boolean añadir(Media elemento){
        boolean res = false;
        if (listaReproduccion.add(elemento)) {
            res = true;
        }
        return res;
    }
    public boolean eliminar(int posicion) {
        boolean res = false;
        if (listaReproduccion.remove(posicion) != null) {
            res = true;
        }
        return res;
    }
    
}
