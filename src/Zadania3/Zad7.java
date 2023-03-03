package Zadania3;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int suma =0;
        for(int i=0; i<7; i++){
            System.out.println("Podaj liczbe");
            int liczba = klawiatura.nextInt();
            suma = suma + liczba;
        }
        System.out.println("Suma liczb wynosi "+suma);
    }
}
