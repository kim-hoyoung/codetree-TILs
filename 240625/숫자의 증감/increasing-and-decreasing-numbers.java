import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        int n = sc.nextInt();


        if(c.equals("A")) {
            for(int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
        }
        if(c.equals("D")) {
            for(int i = n; n >= 1; i--) {
                n--;
                System.out.print(i + " ");
            }
        }
        // 여기에 코드를 작성해주세요.
    }
}