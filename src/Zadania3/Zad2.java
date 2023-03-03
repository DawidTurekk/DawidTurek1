package Zadania3;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println(" Wypisz litery T, t, N lub n ");
        String litera = klawiatura.nextLine();
        while(!litera.equalsIgnoreCase("t") && !litera.equalsIgnoreCase("n")) {

            System.out.println("Podales inna litere");
            litera = klawiatura.nextLine();
        }
        System.out.println("Podales dobra litere"+ litera);
    }

}
