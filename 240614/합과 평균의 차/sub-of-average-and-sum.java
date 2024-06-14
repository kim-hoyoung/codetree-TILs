import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a, b, c, sum, avg;
       

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        sum = a+b+c;
        avg = sum/3;

        
        System.out.print(sum + "\n" + avg + "\n" + (sum-avg));



    }
}