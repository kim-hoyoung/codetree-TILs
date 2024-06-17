import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score, pass;


        score = sc.nextInt();


        pass = score == 100 ? 0 : 1;

        if (pass == 0) {
            System.out.print("pass");
        } else {
            System.out.print("failure");
        }


        // 여기에 코드를 작성해주세요.
    }
}