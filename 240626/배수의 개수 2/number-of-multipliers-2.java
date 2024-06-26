import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;

        for (int i = 0; i < 10; i++) {
            int odd = sc.nextInt();
            if(odd%2 ==1) {
                count++;
            }
        } System.out.print(count);
        // 여기에 코드를 작성해주세요.
    }
}