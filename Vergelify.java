public class Vergelify {
    public static void main(String[] args) {
        Audible a = new Audible("paliatela", "Mondongo", 18,null , true, "El notas", args, 0, null);
        a.votar(4);
        System.out.println(a);
        }
}
