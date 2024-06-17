import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int n;

        Scanner sc =new Scanner(System.in);

        n = sc.nextInt();

        if ( n < 0) {
            System.out.println("ice");
        } else if (n >= 100) {
            System.out.println("vapor");
        } else
            System.out.println("water");
        // 여기에 코드를 작성해주세요.
    }
}