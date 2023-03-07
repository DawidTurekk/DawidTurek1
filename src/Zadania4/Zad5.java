package Zadania4;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj lanyuch znakow");
        String lancuch = klawiatura.nextLine();
        System.out.println("Wprowadz litere ktora chcesz policzyc");
        char litera= klawiatura.nextLine().charAt(0);
        int policz=0;
        for(int i=0; i<lancuch.length();i++){
            if(lancuch.charAt(i)==litera){
                policz++;
            }
        }
        System.out.println("Litera wystepujaca w twoim ciagu znakow pojaiwa sie " +policz+ "  razy");
    }
}
