package zadania2;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj dzien: ");
        int dzien = klawiatura.nextInt();
        System.out.println("Podaj miesiac: ");
        int miesiac = klawiatura.nextInt();
        System.out.println("Podaj dwie ostatnie cyfry roku: ");
        int rok = klawiatura.nextInt();

        int data = (dzien * miesiac) ;

        if(data == rok){
            System.out.println("Rok jest magiczny");
        }
        else{
            System.out.println("Rok nie jest magiczny");
        }
    }
}

