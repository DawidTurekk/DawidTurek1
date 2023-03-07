package Zadania4;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj czas pracy ");
        int czas = klawiatura.nextInt();
        if (czas<=0){
                System.out.println("Wpisz poprawne dane");
                return;
        }
        double suma= 0 ;
        double suma1=0;


        double pensja = 0.01;
        for (int i = 1; i <= 2; i++) {
            double siano = pensja * i;
            System.out.println("Dzisiejszego dnia zarobiles" + siano + "\n");
            suma += siano;
         }
                for ( int i = 3; i<=czas; i++) {
                    double pensja1 = 0.02*(i-2);
                  double   siano =+ pensja1 * 2;
                    System.out.println("Dzisiejszego dnia zarobiles" + siano+"\n");
                    suma1 += siano;
                }
        double sumaC= suma+suma1;
        System.out.println("Suma" + sumaC+"\n");



    }}
