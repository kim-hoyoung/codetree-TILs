import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (true) {
            if(count ==3 ){
                break;
            }
            int num = sc.nextInt();

                if (num % 2 != 0) {
                }
                else {
                    count++;
                    System.out.println(num/2);
                }
        }
    }
}