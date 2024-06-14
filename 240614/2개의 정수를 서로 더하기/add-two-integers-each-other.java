import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        a = a+b;
        b = b+a;

        System.out.print(a + " " + b);
        // 여기에 코드를 작성해주세요.
    }
}