public class FamilyMember {

    static String surname = "Nowak"; /*zmienna statyczna = dla klasy*/
    String name;
    int age;

    public static void main(String[] args) {
        FamilyMember dad = new FamilyMember();
        dad.age = 27;
        dad.name = "Jan";

        FamilyMember mum = new FamilyMember();
        mum.age = 25;
        mum.name = "Agata";

        FamilyMember.surname = "Kowalski";

        System.out.println("Tata: " + dad.name + " " + dad.surname + " " + dad.age); /*niepoprawnie*/
        System.out.println("Mama: " + mum.name + " " + FamilyMember.surname + " " + mum.age);

        System.out.println(Math.max(dad.age,mum.age));

        int i = 698329;
        String str = String.valueOf(i);
        System.out.println(str.charAt(5));

    }
}
