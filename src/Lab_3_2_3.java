public class Lab_3_2_3 extends CountingObcjets {
    public static void main(String[] args) {
        System.out.println(counter);

        Lab_3_2_3 c1 = new Lab_3_2_3();
        Lab_3_2_3 c2 = new Lab_3_2_3();
        System.out.println(counter);
    }
}

class CountingObcjets{
    static int counter;

    public CountingObcjets(){
        counter++;
    }
}
