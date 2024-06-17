import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double vision;

        vision = sc.nextFloat();

        if (vision >= 1.0) {
            System.out.println("High");
        } else if (vision >= 0.5) {
            System.out.println("Middle");
        } else
            System.out.println("Low");
        // 여기에 코드를 작성해주세요.
    }
}