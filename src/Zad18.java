public class Zad18 {
    public static void main(String[] args) {
        double iloscAkcji = 600;
        double cenaAkcji = 21.77;
        double prowizja = 0.02;

        double kwotaBezProwizji = iloscAkcji * cenaAkcji;
        double kwotaProwizji = kwotaBezProwizji * prowizja;
        double lacznaKwota = kwotaBezProwizji + kwotaProwizji;

        System.out.println("Kwota zapłacona za akcje bez prowizji: " + kwotaBezProwizji);
        System.out.println("Wysokość prowizji: " + kwotaProwizji);
        System.out.println("Łączna kwota: " + lacznaKwota);
    }
}
