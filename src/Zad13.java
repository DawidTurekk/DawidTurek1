import java.util.Scanner;

public class Zad13 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int kalorieJednegoCiasteczka = 300 / 4;
        System.out.println("Podaj liczbę zjedzonych ciasteczek:");
        int liczbaZjedzonychCiastek = klawiatura.nextInt();
        int liczbaKalorii = liczbaZjedzonychCiastek* kalorieJednegoCiasteczka;
        System.out.println("Liczba kalorii po zjedzeniu " + liczbaZjedzonychCiastek + " wynosi: " + liczbaKalorii);
    }
}
