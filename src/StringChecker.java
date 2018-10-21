public class StringChecker {
    public static void main(String[] args) {

        String str = "Lannister zawsze spłaca swoje długi.";

        System.out.println("Tekst to: " + str);
        System.out.println("Długość tekstu: "+ str.length());
        System.out.println("Znak na pozycji 6. " + str.charAt(0));
        System.out.println("Fragment od znaku 10 do 16: " + str.substring(10,17));
        System.out.println("Indeks pierwszej litery 't': " + str.indexOf('t'));
        System.out.println("Indeks pierwszego podtekstu \"długi\": "+ str.indexOf("długi"));
        System.out.println("Wyswietl wielkimi literami: " + str.toUpperCase());

    }
}
