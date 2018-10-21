public class Equals {
    public static void main(String[] args) {

        String str1, str2;
        str1 = new String("To jest jakiś tekst");
        str2 = new String("To jest jakiś tekst");

        if(str1.equals(str2)){
            System.out.println("oke");
        }
        // == porownuje referencje a nie obiekt
        if(str1 == str2){
            System.out.println("ok=");

            A a = new A();
            B b = new B();

            if(a.equals(b)){
                System.out.println("a = b");
            }
        }

    }
}
class A{}
class B{}