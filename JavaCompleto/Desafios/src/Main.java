import javax.lang.model.type.IntersectionType;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Digite o 1° valor:");
        String firstValue = scanner.nextLine().replace(",",".");
        System.out.println("Digite o 2° valor:");
        String secondValue = scanner.nextLine().replace(",",".");;
        System.out.println("Digite o 3° valor:");
        String ThirthValue = scanner.nextLine().replace(",",".");;

        double media = (Double.parseDouble(firstValue) + Double.parseDouble(secondValue) + Double.parseDouble(ThirthValue))/3;
        System.out.println(media);

        scanner.close();
    }
}