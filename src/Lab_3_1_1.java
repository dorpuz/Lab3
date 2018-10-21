public class Lab_3_1_1 {
    public static void main(String[] args) {
        double capital = 14000;
        double firstYear = 1.4 * capital;
        double secondYear = firstYear - 1500;
        double thirdYear = 1.12 * secondYear;
        double zysk = thirdYear - capital;

        System.out.printf("Po 3 latach inwestycja jest warta %.2f,",thirdYear);
        System.out.printf(" co oznacza zysk w kwocie %.2f.",zysk);
    }
}
