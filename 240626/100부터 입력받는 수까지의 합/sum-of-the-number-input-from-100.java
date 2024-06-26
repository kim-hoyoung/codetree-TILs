import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sumVal = 0;

        int n = sc.nextInt();

        for(int i = n; i <= 100; i++) {
            sumVal += i;
        }
        System.out.print(sumVal);
        // 여기에 코드를 작성해주세요.
    }
}