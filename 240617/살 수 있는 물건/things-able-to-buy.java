import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int money;

        money = sc.nextInt();

        if ( money == 3000) {
            System.out.println("book");
        } else if (money == 1000) {
            System.out.println("mask");
        } else
            System.out.println("no");
        // 여기에 코드를 작성해주세요.
    }
}