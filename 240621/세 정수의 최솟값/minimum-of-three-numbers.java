import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int min1 = (num2 >= num1 && num1 <= num3) ? 1 : 0;
        int min2 = (num1 >= num2 && num2 <= num3) ? 1 : 0;
        int min3 = (num1 >= num3 && num3 <= num2) ? 1 : 0;
            if(min1 == 1) {
                System.out.print(num1);
            } else if (min2 == 1) {
                System.out.print(num2);
            } else if (min3 == 1) {
                System.out.print(num3);
            }         
    }
}