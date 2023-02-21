import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj wartosc kupowanego produktu");
        double cenaProduktu = klawiatura.nextDouble();

        double podatekStanowy = 0.04;
        double podatekLokalny = 0.02;

        double kwotaPodatkustanowego = cenaProduktu * podatekStanowy;
        double kwotaPodatkulokalnego = cenaProduktu * podatekLokalny;

        double lacznaCena= cenaProduktu +kwotaPodatkustanowego +kwotaPodatkulokalnego;

        System.out.println("Podatek stanowy wynosi" +kwotaPodatkustanowego);
        System.out.println("Kwota podatku lokalnego wynosi"+kwotaPodatkulokalnego);
        System.out.println("Suma wartosci produktu"+lacznaCena);

    }
}
