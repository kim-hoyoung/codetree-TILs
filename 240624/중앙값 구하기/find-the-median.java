import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b || a > c) {
            if ( c >= b ) 
                System.out.println(a);
            else
                System.out.println(c);

        }
        else { 
            if( b > c && a >= c) {
                System.out.println(b);
            }
    }
}
}