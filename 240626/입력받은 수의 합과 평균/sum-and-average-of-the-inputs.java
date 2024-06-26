import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        double avg = 0;
        int sum = 0;

        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
        int c = sc.nextInt();
            sum += c;
            count++;
        }
        System.out.printf("%d %.1f", sum,(double)sum/count);

    }
}