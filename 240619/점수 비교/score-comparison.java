import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int AM, AE, BM, BE;

       AM = sc.nextInt();
       AE = sc.nextInt();
       
       BM = sc.nextInt();
       BE = sc.nextInt();

       if (AM > BM && AE > BE) {
        System.out.println(1);
       } else 
        System.out.println(0);
    }
}