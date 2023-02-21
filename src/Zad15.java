import java.util.Scanner;

public class Zad15 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj cenę detaliczną płytki:");
        double cenaDetaliczna = klawiatura.nextDouble();
        double marza = 0.4;

        double zysk = cenaDetaliczna * marza;
        System.out.println("Zysk sprzedajacego wynosi:" + zysk);
    }
}
