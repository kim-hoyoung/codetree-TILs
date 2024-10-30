import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            int var, sum;
            sum = 0;

            for (int i = 0; i < 10; i++ ) {
                var = sc.nextInt(); 

                sum += var;

            }

            System.out.println(sum);

    }
}