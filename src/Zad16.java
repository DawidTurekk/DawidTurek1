import java.util.Scanner;

public class Zad16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj nazwę ulubionego miasta:");
        String miasto = klawiatura.nextLine();


        String wielkieLitery = miasto.toUpperCase();
        int liczbaZnakow = miasto.length();
        String maleLitery = miasto.toLowerCase();
        char pierwszyZnak = miasto.charAt(0);

        System.out.println(
                "Liczba znaków w nazwie miasta: " + liczbaZnakow + "\n" +
                        "Nazwa miasta zapisaną wielkimi literami: " + wielkieLitery + "\n" +
                        "Nazwa miasta zapisaną małymi literami: " + maleLitery + "\n" +
                        "Pierwszy znak nazwy miasta: " + pierwszyZnak);

    }
}
