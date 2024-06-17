import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long h, w;

        h = sc.nextInt();
        w = sc.nextInt();

        double b = (10000*w)/(h*h);

        if( b >= 25) {
            System.out.printf("%.0f" + "\n" + "Obesity", b);
        }
        // 여기에 코드를 작성해주세요.
    }
}