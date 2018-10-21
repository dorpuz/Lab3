public class InstanceOf {
    public static void main(String[] args) {

        String str1, str2;
        str1 = str2 = "jakiś tekst";

        String name =  str1.getClass().getName();
        System.out.println(name);

        Object i = 3;
        boolean check1 = i instanceof String;
        System.out.println(check1);

    }
}
