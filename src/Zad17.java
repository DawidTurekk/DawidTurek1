import java.util.Scanner;

public class Zad17 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.printf("Wprowadź cenę posiłku: ");
        double cenaPosilku = klawiatura.nextDouble();

        double podatek = 0.0675;
        double cenaPodatku = cenaPosilku * podatek;
        double napiwek = 0.20;
        double cenaNapiwku = (cenaPosilku + cenaPodatku) * napiwek;

        double lacznaKwota = cenaPosilku + cenaPodatku + cenaNapiwku;

        System.out.println(
                "Cena posiłku wynosi: " + cenaPosilku + "\n" +
                        "Wartość podatku wynosi: " + cenaPodatku + "\n" +
                        "Wysokość napiwku wynosi: " + cenaNapiwku + "\n" +
                        "Łączna kwota wynosi: " + lacznaKwota);
    }
}
