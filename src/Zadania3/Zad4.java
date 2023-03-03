package Zadania3;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj swoje imie");
        String imie = klawiatura.nextLine();

        for(int i=0 ;i<10; i++){
            System.out.println(i+""+imie);
        }
    }
}
