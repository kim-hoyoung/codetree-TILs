import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age1 = sc.nextInt();
        String s1 = sc.next();

        int age2 = sc.nextInt();
        String s2 = sc.next();

        if (age1 >= 19 || age2 >= 19) {
            if (s1.equals("M") || s2.equals("M")) {
                System.out.println(1);
            } else if (s1.equals("W") && s2.equals("W")) {
                System.out.println(0);
            } else {
                System.out.println(0);
            }
        }
    }
}