import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();
        int max = sc.nextInt();

        int count = max/min;
        int fixNum = max;

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= count+1; j++) {
                System.out.print(fixNum + " * " + i + " = " + (fixNum*i));
                if (max == min) {
                    count = 0;
                } else if (j <= count ) {
                    System.out.print(" / ");
                }
                if (fixNum > min) {
                    fixNum = fixNum-2;
                }
            }
            fixNum = max;
            System.out.println();
        }
    }
}