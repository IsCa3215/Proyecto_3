import java.time.LocalDate;
import java.util.ArrayList;
public class Vergelify {
    public static void main(String[] args) {
        Media f;
        ArrayList<Audible> pistas = new ArrayList<Audible>();
        pistas.add(new Audible("polopos", "AVICII", 18, LocalDate.now(), false, "pinchis", args, 12, null, LocalDate.now()));
        pistas.add(new Audible("paliatela", "Mondongo", 18,LocalDate.now(), true, "El notas", args, 4, null, LocalDate.now()));
        
        
        Album a = new Album("alo","se", 12, LocalDate.now(), false, "a", TipoAlbum.MUSICAL, LocalDate.now(), pistas);
        a.meGusta(true);
        pistas.get(1).votar(1);
        a.duracionTotal();
        System.out.println(a);
        }
}
