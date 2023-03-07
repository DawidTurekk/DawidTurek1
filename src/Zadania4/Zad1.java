package Zadania4;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj liczbe");
        int liczba = klawiatura.nextInt();
        int suma = 0;

        for(int i =1; i<=liczba; i++){
        suma = suma + i;
        System.out.println(suma);


    }
        System.out.println("Suma wynosi "+ suma);
} }
