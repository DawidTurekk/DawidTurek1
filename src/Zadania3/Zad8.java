package Zadania3;

import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int product =0;
        while(product<100){
            System.out.println("Podaj liczbe");
            int liczba = klawiatura.nextInt();
            product = liczba*10;
        }
        System.out.println("To już jest koniec ");
    }
}
