import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();

        for (int i = 0; i < r; i++) {
            int n = sc.nextInt();

            if ( n%2==1 && n%3==0) {
                System.out.println(n); 
            }
             
        }
    }
}