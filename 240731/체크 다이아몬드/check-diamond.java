import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int totalRows = 2 * n - 1;
        int middle = n - 1; // 중앙 줄의 인덱스 (0부터 시작)

        for (int i = 0; i < totalRows; i++) {
            int numStars = i <= middle ? 2 * i + 1 : 2 * (totalRows - i - 1) + 1;
            int numSpaces = (totalRows - numStars) / 2;

            // 앞쪽 공백 출력
            for (int j = 0; j < numSpaces; j++) {
                System.out.print(" ");
            }

            // '*'와 공백 출력
            for (int j = 0; j < numStars; j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // 다음 줄로 이동
            System.out.println();
        }


    }
}