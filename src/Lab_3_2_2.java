public class Lab_3_2_2 extends Parameters {

        public static void main(String[] args) {
            Lab_3_2_2 l = new Lab_3_2_2();
            l.height = 170;
            l.weight = 70;
            l.depth = 40;

            showParameters(l);

        }

        static void showParameters(Lab_3_2_2 l){
            System.out.println();
            System.out.println(l.height);
            System.out.println(l.weight);
            System.out.println(l.depth);
        }


}
