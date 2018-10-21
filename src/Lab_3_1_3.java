
import java.util.Scanner;

public class Lab_3_1_3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int i = reader.nextInt();
        show(i);
    }

    static void show(int i){
        System.out.println(i + " binarnie: " + Integer.toBinaryString(i));
        System.out.println(i + " ósemkowo: " + Integer.toOctalString(i));
        System.out.println(i + " szesmastkowo: " + Integer.toHexString(i));
    }
}
