import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        n = sc.nextInt();

        if (n >= 80) {
            System.out.println("pass");

        } else {
            System.out.println((80-n) + " more score");
        }
        // 여기에 코드를 작성해주세요.
    }
}