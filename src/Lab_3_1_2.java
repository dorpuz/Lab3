public class Lab_3_1_2 {
    public static void main(String[] args) {
        int dzielna = 10;
        int dzielnik = 3;
        int wynik = division(dzielna, dzielnik);
        int reszta = remainder(dzielna,dzielnik);

        System.out.println(dzielna + " : " + dzielnik + " wynosi " + wynik + " reszty\t" + reszta);
    }

    static int division (int dzielna, int dzielnik){
        return dzielna/dzielnik;
    }
    static int remainder (int dzielna, int dzielnik){
        return dzielna%dzielnik;
    }


}
