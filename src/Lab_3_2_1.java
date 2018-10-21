import java.util.StringTokenizer;

public class Lab_3_2_1 {
    public static void main(String[] args) {

        String data = "03/07/1994";

        StringTokenizer st = new StringTokenizer(data, "/");

        String day = st.nextToken();
        String month = st.nextToken();
        String year = st.nextToken();

        System.out.println(day);
        System.out.println(month);
        System.out.println(year);

    }
}
