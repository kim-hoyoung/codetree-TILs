import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int[] arr = new int[4]; // 각 학생의 4개의 점수를 저장할 배열
            int sum = 0;

            for (int j = 0; j < 4; j++) {
                arr[j] = sc.nextInt(); // j를 사용해 각 점수를 배열에 저장
                sum += arr[j];
            }
            int avg = sum / 4;

            if (avg >= 60) {
                System.out.println("pass");
                count++;
            } else {
                System.out.println("fail");
            }
        }
        System.out.println(count); // 통과한 학생 수 출력
    }
}