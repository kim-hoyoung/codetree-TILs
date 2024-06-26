import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tcount = 0;
        int fcount = 0;

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            if(n%3 == 0) {
                tcount++;
            } 
            if (n%5==0) {
                fcount++;
            }
        }
        System.out.print(tcount + " " + fcount);
        // 여기에 코드를 작성해주세요.
    }
}