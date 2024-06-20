import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if ( num1 <= num2 && num3 >= num1) {
            System.out.print(1);
         } else {
            System.out.print(0);
         }

         System.out.print(" ");

         if (num1 == num2 && num1 == num3) {
            System.out.print(1);
         } else {
            System.out.print(0);
         }
        // 여기에 코드를 작성해주세요.
    }
}