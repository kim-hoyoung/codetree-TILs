import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n = sc.nextInt();

        // 2*n+1칸의 정사각형에서 i, j에 짝수가 들어가면 *을 출력합니다.
        for(int i = 0; i < 2 * n + 1; i++) {
            for(int j = 0; j < 2 * n + 1; j++) {
                if(i % 2 == 0 || j % 2 == 0) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}