import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n, area;

        n = sc.nextInt();

        area = n*n;

        System.out.print(area);

        if (area < 5) {
            System.out.print("\n" +"tiny");
        }
        
    }
}