import java.util.Locale;

public class Formater {
    public static void main(String[] args) {

        int i = 3; // %d
        double f = Math.E; //%f
        String s = "yolo"; //%s

        System.out.printf("%20d",i);
        System.out.println();
        System.out.printf("%20s",s);
        System.out.println();
        System.out.printf("%f",f); //drukuje przecinek
        System.out.println();
        System.out.println(f); //drukuje kropke
        System.out.printf(new Locale("us"),"%f",f);


    }
}
