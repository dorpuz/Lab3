public class Casting {
    public static void main(String[] args) {

        double d = 4.45;
        short s = 8;
        int i;

        i = s;
        System.out.println(i);

        Employee emp = new Employee();
        VicePresident vp = new VicePresident();

        emp = vp; //niejawna konwersja, dozwolone
        // bo typ Employee zawiera wszystko co klasa potomna

        //vp = emp; niekompatybilnosc,mozemy wymusic jawnie rzutujac
        vp = (VicePresident) emp; // część informacji może być niepełna

        Float f1 = 4.23F;
        Float f2 = 2.34F;

        System.out.println(Math.min(f1,f2));

    }
        // rzutowac mozemy o ile zachodzi dziedziczenie
}

class Employee {}
class VicePresident extends Employee{}

