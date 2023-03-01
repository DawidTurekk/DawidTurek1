package zadania2;

import java.util.Scanner;

public class Zad15 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj ilosc czekow");
        int iloscczekow = klawiatura.nextInt();

        if (iloscczekow<20){
            double cena  = 10+(iloscczekow*0.010);
            System.out.println("Cena za czek wynosi"+ cena);
        } else if(iloscczekow >= 20 && iloscczekow <=39){
            double cena = 10+(iloscczekow*0.08);
            System.out.println("Cena za czek wynosi "+cena);

        } else if( iloscczekow >=40 && iloscczekow <=59){
            double cena = 10+(iloscczekow*0.06);
            System.out.println("Cena za czek wynosi"+cena);
        } else if ( iloscczekow >=60){
            double cena = 10+(iloscczekow*0.04);
            System.out.println("Cena za czek wynos"+cena);
        }

    }
}
