package Zadania3;

import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

            int suma = 0;
            for(int i=0; i<10; i++){
                System.out.println("Napisz liczbe");
                int liczba = klawiatura.nextInt();

                suma = suma + liczba;
                System.out.println("Bieżąca suma  wynosi"+suma);
            }
            System.out.println("Koniec");
    }
}
