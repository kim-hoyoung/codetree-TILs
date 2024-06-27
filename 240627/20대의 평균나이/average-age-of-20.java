import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while(true) {
            int age = sc.nextInt();
            if(age < 20 || age > 29) {
                break;
            }
            else
                count++;
            sum += age;

        }
        System.out.printf("%.2f",(double)sum/count);



    }
}