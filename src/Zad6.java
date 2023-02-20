public class Zad6 {
    public static void main(String[] args) {
        int pomieszczenie1 = 3*4;
        int pomieszczenie2 = 3*4;
        int pomieszczenie3 = 2*3;
        int pomieszczenie4 = 2*2;
        int obliczaniepowierzchni = pomieszczenie1 + pomieszczenie2 + pomieszczenie3 + pomieszczenie4;
        double powierzchcniana1osobe = obliczaniepowierzchni/4.0;
        System.out.println("Powierzchnia pomieszczenia 1 wynosi: "+pomieszczenie1);
        System.out.println("Powierzchnia pomieszczenia 2 wynosi: "+pomieszczenie2);
        System.out.println("Powierzchnia pomieszczenia 3 wynosi: "+pomieszczenie3);
        System.out.println("Powierzchnia pomieszczenia 4 wynosi: "+pomieszczenie4);
        System.out.print("Powierzchnia całkowita:"+ obliczaniepowierzchni);
        System.out.println("Powierzchnia przypadajaca na 1 osobe"+powierzchcniana1osobe);

    }
}
