import java.util.Scanner;

public class Zad14 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj ocenę z pierwszego testu:");
        double ocena1 = klawiatura.nextInt();
        System.out.println("Podaj ocenę z drugiego testu:");
        double ocena2 = klawiatura.nextInt();
        System.out.println("Podaj ocenę z trzeciego testu:");
        double ocena3 = klawiatura.nextInt();

        double srednia = (ocena1 + ocena2 + ocena3) / 3;

        System.out.println("Ocena z pierwszego testu to: " + ocena1);
        System.out.println("Ocena z drugiego testu to: " + ocena2);
        System.out.println("Ocena z trzeciego testu to: " + ocena3);
        System.out.println("średnia wynosi"+srednia);


    }
}
