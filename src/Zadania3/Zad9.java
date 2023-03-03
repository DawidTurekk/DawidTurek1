package Zadania3;

import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int suma;
        String odpowiedz;
        int liczba1;
        int liczba2;
        do{
            System.out.println("Wprowadz pierwsza liczbe");
            liczba1 = klawiatura.nextInt();
            System.out.println("Podaj druga liczbe");
            liczba2 = klawiatura.nextInt();
            suma = liczba1 + liczba2;
            System.out.println("Suma wynosi"+suma);
            System.out.println("Czy chcesz wykonac kolejna operacje?");
            odpowiedz = klawiatura.nextLine();
            odpowiedz = klawiatura.nextLine();


        } while (odpowiedz.equalsIgnoreCase("nie"));
        {
            System.out.println("Koniec");
        }
    }
}
