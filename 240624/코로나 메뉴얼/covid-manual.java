import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String st = sc.next();
        int temp = sc.nextInt();

        String st2 = sc.next();
        int temp2 = sc.nextInt();

        String st3 = sc.next();
        int temp3 = sc.nextInt();

        int A = 0;

        if (st.equals("Y") && temp >= 37) {
            ++A;
        }
         if (st2.equals("Y") && temp2 >= 37) {
            ++A;
        }
         if (st3.equals("Y") && temp3 >= 37) {
            ++A;
        }

        if ( A >= 2 ) {
            System.out.println("E");
        } else {
            System.out.println("N");
        }
    }
}