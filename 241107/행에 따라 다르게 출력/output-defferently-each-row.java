import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for ( int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    count = count+1;
                    System.out.print(count + " ");
                }
                else if(i % 2 == 1) {
                    count = count+2;
                    System.out.print(count + " ");
                }

            }
            System.out.println();
        }
    }
}