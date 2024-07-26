import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        String s= "Bom dia ";
        s = s.replace("dia", "Senhora");
        s = s.concat("!!!");
        s = s.toUpperCase();

        System.out.println(s);
        System.out.println("Leo".toUpperCase());
    }
}