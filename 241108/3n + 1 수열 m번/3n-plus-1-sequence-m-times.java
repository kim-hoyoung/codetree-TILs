import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int m = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = n; n > 1; j--) {
                cnt++;
                if( n % 2 == 1) {
                    n = (3 * n) + 1;
                } else
                    n = n / 2;
            }
            System.out.println(cnt);
        }
    }
}