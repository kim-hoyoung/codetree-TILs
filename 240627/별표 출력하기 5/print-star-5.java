import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int z = 0;
        for (int j = 0; j < n; j++) {

            for (int i = 0; i < (n-z); i++) {
                for(int c = n-z; c > 0 ; c--){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            z++;
            System.out.println();
            }
        }
    }