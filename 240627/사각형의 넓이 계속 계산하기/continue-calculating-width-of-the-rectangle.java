import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            int w = sc.nextInt();
            int l = sc.nextInt();
            String str = sc.next();
            if (str.equals("C")) {
                System.out.println(w * l);
                break;
            }else {
                System.out.println(w * l);
            }
        }
    }
}