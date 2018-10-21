import java.text.DecimalFormat;

public class Binary {
    public static void main(String[] args) {

//        int i = 123;
//        System.out.println("dziesętny: " +i );
//        System.out.println("binarny: " + Integer.toBinaryString(i));
//        System.out.println("ósemkowy: " + Integer.toOctalString(i));
//        System.out.println("szestnastkowy: " + Integer.toHexString(i));

        int a = 6;
        int b = 5;
        // iloczyn bitowy '&': tylko 1 i 1 = 1
        // suma bitowa '|': tylko 0 i 0 = 0
        // ^ xor: tylko 1 i 0 = 1
        // ~ not - negacja bitowa: dla 00110011 dostajemy 11001100, najbardziej zewnetrzny znak odpowiada za znak liczby
        // >> przesniecie bitowe w prawo
        // << przesniecie bitowe w lewo
//        int c = a & b;
//        int c = a | b;
        int c = a ^ b;

      /*  System.out.printf("%10s\n",Integer.toBinaryString(a));
        System.out.printf("%10s\n",Integer.toBinaryString(b));
        System.out.printf("\n%10s\n",Integer.toBinaryString(a&b));
        System.out.printf("%10s\n",a&b);*/
        show(a, b, c);
        System.out.println("negacja b: "+ (~b));
        System.out.println("przesuniecie w prawo b o 1: "+ (b>>1));
        System.out.println("przesuniecie w lewo b o 1: "+ (b<<1));

//        System.out.println(calculate(a,b,c));

    }

    static void show(int a, int b, int c) {
        System.out.println("operacja: " + a + " ^ " + b + " = " + c);
        System.out.printf("%10s\n", Integer.toBinaryString(a));
        System.out.printf("%10s\n", Integer.toBinaryString(b));
        System.out.printf("\n%10s\n", Integer.toBinaryString(c));
        System.out.printf("%10s\n", c);

    }
    static int calculate(int a, int b, int c){
        return a&b;
    }

}
