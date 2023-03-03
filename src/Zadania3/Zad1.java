package Zadania3;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj liczbe z przedzialu od 10 do 24");
        int liczba = klawiatura.nextInt();
        while(liczba<10 || liczba>24) {

            System.out.println("Podales zla liczbe");
            liczba = klawiatura.nextInt();
        }
        System.out.println("Podales dobra liczbe");
}}
