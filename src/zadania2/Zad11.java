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
    }

}
