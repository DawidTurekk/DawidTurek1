package zadania2;

import java.util.Scanner;

public class Zad18 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
         String restauracja1 = "Luksusowe burgery u Jarka";
         String restauracja2 = "Pizzeria przy Dworcowej";
         String restuaracja3 = "Kawiarnia na Rogu";
         String restauracja4 = "Wloskie Specjaly";
         String restauracja5 = "Kuchania u Szefa";

        String odp1, odp2,odp3;

       System.out.println("Czy ktos z osob jest na diecie wegetarianskiej?");
        odp1 = klawiatura.nextLine();
        System.out.println("Czy ktoras z osob jest na diecie weganskiej?");
        odp2 = klawiatura.nextLine();
        System.out.println("Czy ktoras z osob jest na diecie bezglutenowej");
        odp3 = klawiatura.nextLine();

        if(odp1.equalsIgnoreCase("Tak")) {
            if (odp2.equalsIgnoreCase("Tak")) {
                if (odp3.equalsIgnoreCase("Tak")) {
                    System.out.println(restuaracja3);
                    System.out.println(restauracja5);
                } else {
                    System.out.println(restuaracja3);
                    System.out.println(restauracja5);
                }
            } else {
                if (odp3.equalsIgnoreCase("Tak")) {
                    System.out.println(restauracja2);
                    System.out.println(restuaracja3);
                    System.out.println(restauracja5);
                } else {
                    System.out.println(restauracja2);
                    System.out.println(restuaracja3);
                    System.out.println(restauracja4);
                    System.out.println(restauracja5);
                }
            }
        }else{
            if (odp2.equalsIgnoreCase("Tak")){
                if(odp3.equalsIgnoreCase("Tak")){
                    System.out.println(restuaracja3);
                    System.out.println(restauracja5);
                } else {
                    System.out.println(restuaracja3);
                    System.out.println(restauracja5);
                }
            } else{
                if (odp3.equalsIgnoreCase("Tak")){
                    System.out.println(restauracja2);
                    System.out.println(restuaracja3);
                    System.out.println(restauracja5);
                } else {
                    System.out.println(restauracja1);
                    System.out.println(restauracja2);
                    System.out.println(restuaracja3);
                    System.out.println(restauracja4);
                    System.out.println(restauracja5);
                }
            }
            }
        }
    }

