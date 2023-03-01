package zadania2;

import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj nazwisko pierwszego biegacza");
        String biegacz1 = klawiatura.nextLine();
        System.out.println("Podaj nazwisko drugiego biegacza");
        String biegacz2 = klawiatura.nextLine();
        System.out.println("Podaj nazwisko trzeciego biegacza");
        String biegacz3 = klawiatura.nextLine();

        System.out.println("Podaj czas dotarcia na mete pierwszego biegacza");
        int meta1 = klawiatura.nextInt();
        System.out.println("Podaj czas dotarcia na mete drugiego biegacza");
        int meta2 = klawiatura.nextInt();
        System.out.println("Podaj czas dotarcia na mete trzeciego  biegacza");
        int meta3 = klawiatura.nextInt();

        if (meta1 < meta2 && meta1 < meta3) {
            System.out.println("Pierwsze miejsce zajmuje" + biegacz1);
            if (meta2 < meta3) {
                System.out.println("Drugie miejsce zajmuje " + biegacz2);
                System.out.println("Trzecie miejsce zajmuje " + biegacz3);
            } else if (meta3 < meta2) {
                System.out.println("Drugie miejsce zajmuje" + biegacz3);
                System.out.println("Trzecie miejsce zajmuje" + biegacz2);
            }
        }
        else if (meta2 < meta1 && meta2 < meta3) {
            System.out.println("Pierwsze miejsce zajmuje" + biegacz2);
            if (meta1 < meta3) {
                System.out.println("Drugie miejsce zajmuje" + biegacz1);
                System.out.println("Trzecie miejsce zajmuje "+biegacz3);
            } else if (meta3 < meta1) {
                System.out.println("Drugie miejsce zajmuje" + biegacz3);
                System.out.println("Trzecie miejsce zajmuje" + biegacz1);
            }
        }
       else if ( meta3<meta2 && meta3<meta1) {
            System.out.println("Pierwsze miejsce zajmuje" + biegacz3);
            if (meta2 < meta1) {
                System.out.println("Drugie miejsce zajmuje" + biegacz2);
                System.out.println("Trzecie  miejsce zajmuje" + biegacz1);
            } else if (meta1 < meta2) {
                System.out.println("Drugie miejsce zajmuje " + biegacz1);
                System.out.println("Trzecie  miejsce zajmuje " + biegacz2);
            }
        }
    }
}