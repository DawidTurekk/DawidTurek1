package Zadania4;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj predkosc pojazdu w km/h");
        double predkosc = klawiatura.nextInt();
        System.out.println("Podaj liczbe godzin podrozy");
        int godziny = klawiatura.nextInt();

         double odleglosc =0;

        for (int i=1; i<=godziny; i++){
            odleglosc = predkosc+odleglosc;

            System.out.println("Dojechales o godzinie"+odleglosc);
        }

}}
