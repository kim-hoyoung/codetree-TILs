import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m;

        m = sc.nextInt();

        if (m >= 3000) {
            System.out.print("book");
        } else if (m >= 1000) {
            System.out.print("mask");
        } else if (m >= 500) {
            System.out.print("pen");
        } else 
            System.out.println("no");
        // 여기에 코드를 작성해주세요.
    }
}