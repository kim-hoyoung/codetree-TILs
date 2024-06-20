import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double eye1 = sc.nextDouble();
        double eye2 = sc.nextDouble();

        if(eye1 >= 1.0 && eye2 >= 1.0) {
            System.out.println("High");
        } else if (eye1 >= 0.5 && eye2 >= 0.5) {
            System.out.println("Middle");
        } else 
        System.out.println("Low");

        
        // 여기에 코드를 작성해주세요.
    }
}