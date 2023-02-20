import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int pomieszczenie1dlugosc ;
        System.out.println("Podaj dlugosc pokoju numer1");
        pomieszczenie1dlugosc = klawiatura.nextInt();
        int pomieszczenie1szerokosc ;
        System.out.println("Podaj  szerokosc pokoju numer1");
        pomieszczenie1szerokosc = klawiatura.nextInt();

        int pomieszczenie2dlugosc ;
        System.out.println("Podaj dlugosc pokoju numer2");
        pomieszczenie2dlugosc = klawiatura.nextInt();
        int pomieszczenie2szerokosc ;
        System.out.println("Podaj szerokosc pokoju numer2");
        pomieszczenie2szerokosc = klawiatura.nextInt();

        int pomieszczenie3dlugosc ;
        System.out.println("Podaj dlugosc pokoju numer3");
        pomieszczenie3dlugosc = klawiatura.nextInt();
        int pomieszczenie3szerokosc ;
        System.out.println("Podaj szerokosc pokoju numer3");
        pomieszczenie3szerokosc = klawiatura.nextInt();

        int pomieszczenie4dlugosc ;
        System.out.println("Podaj dlugosc pokoju numer4");
        pomieszczenie4dlugosc = klawiatura.nextInt();
        int pomieszczenie4szerokosc ;
        System.out.println("Podaj szerokosc pokoju numer4");
        pomieszczenie4szerokosc = klawiatura.nextInt();
        int obliczaniepowierzchni = (pomieszczenie1dlugosc * pomieszczenie1szerokosc)+(pomieszczenie2dlugosc*pomieszczenie2szerokosc)
                +(pomieszczenie3dlugosc*pomieszczenie3szerokosc)+(pomieszczenie4dlugosc*pomieszczenie4szerokosc);
        double powierzchcniana1osobe = obliczaniepowierzchni/4.0;
        System.out.println("Powierzchnia pomieszczenia 1 wynosi: "+pomieszczenie1dlugosc*pomieszczenie1szerokosc);
        System.out.println("Powierzchnia pomieszczenia 2 wynosi: "+pomieszczenie2dlugosc*pomieszczenie2szerokosc);
        System.out.println("Powierzchnia pomieszczenia 3 wynosi: "+pomieszczenie3dlugosc*pomieszczenie3szerokosc);
        System.out.println("Powierzchnia pomieszczenia 4 wynosi: "+pomieszczenie4dlugosc*pomieszczenie4szerokosc);
        System.out.print("Powierzchnia całkowita:"+ obliczaniepowierzchni);
        System.out.println("Powierzchnia przypadajaca na 1 osobe"+powierzchcniana1osobe);
    }
}
