import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        int cnt = 0;

        for (int i = start; i <= end; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    count++;
                }
                if (count == 3 && j == i) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }
}