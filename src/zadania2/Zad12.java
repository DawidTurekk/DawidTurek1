package zadania2;

import java.util.Scanner;

public class Zad12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Napisz powietrze, woda albo stal");
        String wybór = klawiatura.nextLine();
        System.out.println("Podaj odleglosc");
      double odleglosc = klawiatura.nextDouble();
      double czas ;

        switch(wybór){
            case "powietrze":{
                czas = odleglosc / 343;
                System.out.println("Czas potrzebny do przebycia w powietrzu wynosi "+ czas);
            } break;
            case "woda":{
                czas = odleglosc / 1490;
                System.out.println("Czas potrzebny do przebycia w wodzie wynosi "+czas);
            } break;
            case "Stal":{
                czas = odleglosc / 5100;
                System.out.println("Czas potrzebny do przebycia w stali wynosi "+czas);
            }  break;
            default:
                System.out.println("Podales bledne dane ");
        }

    }
}
