package zadania2;

import java.util.Scanner;

public class Zad14 {
    public static void main(String[] args) {

        System.out.println("Wybierz pakiet A, B lub C");
        Scanner klawiatura = new Scanner(System.in);
        String wybor = klawiatura.nextLine();
        System.out.println("Podaj liczbe rozmow w minutach");
        int rozmowa = klawiatura.nextInt();

        double cena;

        switch (wybor) {
            case "A": {
                if (rozmowa < 450) {
                    System.out.println("Cena pakietu za miesiac wynosi 39,99");
                } else {
                    cena = 39.99 + (rozmowa - 450) * 0.45;
                    System.out.println("Cena po dodatkoiwych minutach" + cena);

                }
                break;
            }
            case "B": {
                if (rozmowa < 900) {
                    System.out.println("Cena pakietu wynosi 59.99");
                } else {
                    cena = 59.99 + (rozmowa - 900) * 0.40;
                    System.out.println("Cena po przekroczeniu minut" + cena);
                }
                break;
            }
            case "C": {
                System.out.println("Cena pakietu za miesiac wynosi 69.99");
            }
            break;
            default:{
                System.out.println("Podales nie prawidlowe informacje");
            }

        }
    }
}



