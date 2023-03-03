package Zadania3;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Napisz tak lui nie");
        String slowo = klawiatura.nextLine();

        while (slowo.equalsIgnoreCase("Tak") && slowo.equalsIgnoreCase("Nie")) {
            System.out.println("Napisales zle slowo");
            slowo = klawiatura.nextLine();
        }
        System.out.println("Napisales dobre slowo"+slowo);
    }
}
