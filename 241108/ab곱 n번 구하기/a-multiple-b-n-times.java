import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        int sum = 1;
        for (int i = 0; i < cnt; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for (int j = a; j <= b; j++) {
                sum *= j;
            }

            System.out.println(sum);
            sum = 1;
        }
    }
}