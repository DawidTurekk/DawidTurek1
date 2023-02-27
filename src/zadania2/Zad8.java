package zadania2;

import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj liczbe zakupionych pakietów: ");
        int pakiety = klawiatura.nextInt();

        double cena_pakiet = pakiety*99;


        if(pakiety >= 100){
            double cena_za = cena_pakiet * 0.50;
            double cena_koncowa = cena_pakiet - cena_za;
            System.out.println("Kwota zakupu po rabacie 50%: "+cena_koncowa+"zl");
        }
        else if(pakiety >= 50 && pakiety <= 99){
            double cena_za = cena_pakiet * 0.40;
            double cena_koncowa = cena_pakiet - cena_za;
            System.out.println("Kwota zakupu po rabacie 40% "+cena_koncowa+"zl");
        }
        else if(pakiety >= 20 && pakiety <= 49){
            double cena_za = cena_pakiet * 0.30;
            double cena_koncowa = cena_pakiet - cena_za;
            System.out.println("Kwota zakupu po rabacie 30% "+cena_koncowa+"zl");
        }
        else if(pakiety >= 10 && pakiety <= 19){
            double cena_za = cena_pakiet * 0.20;
            double cena_koncowa = cena_pakiet - cena_za;

            System.out.println("Kwota zakupu po rabacie "+cena_koncowa+"zl");
        }
        else{
            System.out.println("Kupiles za malo aby dostac rabat");
        }

    }
    }

