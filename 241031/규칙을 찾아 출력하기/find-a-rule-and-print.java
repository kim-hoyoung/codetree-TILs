import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 첫 번째와 마지막 줄은 모든 칸에 별을 출력
                if (i == 0 || i == n - 1) {
                    System.out.print("* ");
                }
                // 중간 줄에서는 특정 규칙에 따라 별과 공백 출력
                else {
                    if (j == 0 || j == n - 1 || j < i) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}