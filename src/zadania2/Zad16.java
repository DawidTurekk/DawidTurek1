package zadania2;

import java.util.Scanner;

public class Zad16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int liczbaksiazek;
        double iloscpunktow;
        System.out.println("Podaj ilosc kupionych  ksiazek");
        liczbaksiazek = klawiatura.nextInt();

        if (liczbaksiazek ==0){
            System.out.println("Liczba otrzymanych punktow wynosi 0");
        } else if (liczbaksiazek ==1){
            System.out.println("Liczba otrzymanych punktow wynosi 5");
        } else if (liczbaksiazek == 2){
            System.out.println("Liczba otrzymanych punktow wynosi 15");
        } else if(liczbaksiazek == 3){
            System.out.println("Liczba otrzymanych punktow wynosi 30");
        } else if(liczbaksiazek >=4){
            System.out.println("Liczba otrzymanych punktow wynosi 60");
        }

    }
}
